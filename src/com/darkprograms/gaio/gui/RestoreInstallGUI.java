/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkprograms.gaio.gui;

import com.darkprograms.gaio.network.NetworkUtil;
import com.darkprograms.gaio.restore.RestoreInstallThread;
import com.darkprograms.gaio.restore.RestoreManager;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * @author theshadow
 */
public class RestoreInstallGUI extends javax.swing.JDialog {

    /**
     * Creates new form RecoveryInstallGUI
     */
    public RestoreInstallGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadRestore();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        progress = new javax.swing.JProgressBar();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Restore Boot");
        setResizable(false);

        progress.setStringPainted(true);

        status.setText("Downloading...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(status)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addGap(5, 5, 5)
                                .addComponent(status))
        );

        pack();
    }// </editor-fold>

    private void loadRestore() {
        RestoreManager.getInstance().setComplete(false);
        RestoreManager.getInstance().setStatus("");
        new Thread(new RestoreInstallThread()).start();
        new Thread(new StatusHandlerThread()).start();
    }

    // Variables declaration - do not modify
    private javax.swing.JProgressBar progress;
    private javax.swing.JLabel status;
    // End of variables declaration

    private class StatusHandlerThread implements Runnable {

        public void run() {
            RestoreManager restoreManager = RestoreManager.getInstance();

            while (!restoreManager.isComplete()) {

                if (restoreManager.getStatus().contains("Downloading")) {
                    NetworkUtil networkUtil = NetworkUtil.getInstance();

                    while (networkUtil.getLength() == 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //wait
                    }

                    double totalKb = roundTwoDecimals((double) networkUtil.getLength() / 1024);
                    double downloaded = roundTwoDecimals((double) networkUtil.getDownloaded() / 1024);

                    status.setText("Downloading... " + downloaded + "/" + totalKb + " Kb");
                    progress.setValue(networkUtil.getPercentage(networkUtil.getDownloaded(), networkUtil.getLength()));
                } else {
                    status.setText(restoreManager.getStatus());
                    progress.setIndeterminate(true);
                }

            }
            JOptionPane.showMessageDialog(RestoreInstallGUI.this, "Boot.img restored!", "Boot Restore", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

    }

    double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }

}