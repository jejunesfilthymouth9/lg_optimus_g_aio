/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkprograms.gaio.gui;

import com.darkprograms.gaio.adb.AdbManager;
import com.darkprograms.gaio.device.DeviceManager;
import com.darkprograms.gaio.recovery.RecoveryManager;
import com.darkprograms.gaio.root.RootManager;
import com.darkprograms.gaio.unlock.UnlockManager;
import com.darkprograms.gaio.util.Constants;

import javax.swing.*;
import java.awt.*;

/**
 * @author theshadow
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        loadAdbInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        phoneStatus = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rootStatus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buildNumber = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        softwareVersion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rootButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        unlockBootloaderButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        windowsDriver = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        rootSupported = new javax.swing.JLabel();
        installRecovery = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        restoreBoot = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        unlocked = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GAIO v" + Constants.GAIO_VERSION);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                deleteTmpFiles(evt);
            }
        });

        jLabel1.setText("GAIO v " + Constants.GAIO_VERSION);

        jLabel2.setText("Phone Information");

        jLabel3.setText("Phone Status:");

        phoneStatus.setText("Not Connected");

        jLabel4.setText("Phone Type:");

        phoneType.setText("                       ");

        jLabel5.setText("Root Status:");

        rootStatus.setText("                       ");

        jLabel6.setText("Build Number:");

        buildNumber.setText("                        ");

        jLabel8.setText("Software Version:");

        softwareVersion.setText("                        ");

        rootButton.setText("Root LG Optimus G");
        rootButton.setEnabled(false);
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Use this button to root a");

        jLabel9.setText("Sprint LG Optimus G");

        unlockBootloaderButton.setText("Unlock Bootloader");
        unlockBootloaderButton.setEnabled(false);
        unlockBootloaderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unlockBootloaderButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Use this to unlock bootloader. Must");

        jLabel11.setText("be rooted first.");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        windowsDriver.setText("Install Windows LG Driver");
        windowsDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowsDriverActionPerformed(evt);
            }
        });

        jLabel12.setText("Installs LG Driver (Requires Internet)");

        rootSupported.setForeground(buildNumber.getBackground());
        rootSupported.setText("This software version is supported and can be rooted");

        installRecovery.setText("Install Custom Recovery");
        installRecovery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installRecoveryActionPerformed(evt);
            }
        });

        jLabel13.setText("Installs TWRP/Clockword");

        jLabel14.setText("Requires Internet Connection");

        restoreBoot.setText("Restore Unlocked Stock boot.img");
        restoreBoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreBootActionPerformed(evt);
            }
        });

        jLabel15.setText("Requires Internet Connection and Unlock");

        jLabel16.setText("Requires Device Unlock");

        jLabel17.setText("Device Unlocked:");

        unlocked.setText("               ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(275, 275, 275)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(246, 246, 246)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(phoneStatus))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(buildNumber))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel17)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(unlocked)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(phoneType)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rootStatus))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(rootSupported)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel8)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(softwareVersion)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                                .addComponent(refreshButton))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel12)
                                                        .addComponent(windowsDriver)
                                                        .addComponent(restoreBoot)
                                                        .addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(installRecovery)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel10)
                                                        .addComponent(unlockBootloaderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel16))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(unlockBootloaderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(windowsDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(installRecovery))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(restoreBoot)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(phoneStatus)
                                        .addComponent(jLabel4)
                                        .addComponent(phoneType)
                                        .addComponent(jLabel5)
                                        .addComponent(rootStatus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(buildNumber)
                                        .addComponent(jLabel8)
                                        .addComponent(softwareVersion)
                                        .addComponent(refreshButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rootSupported)
                                        .addComponent(jLabel17)
                                        .addComponent(unlocked))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void rootButtonActionPerformed(java.awt.event.ActionEvent evt) {

        RootManager.getInstance().loadRootTools();

        int response = JOptionPane.showConfirmDialog(this, "<html>This will automatically root your device.<br>  " +
                "Do not turn off your device during the process. Press \"Ok\" to continue, or \"Cancel\" to cancel.</html>", "Root", JOptionPane.OK_CANCEL_OPTION);

        if (response == JOptionPane.OK_OPTION) {
            RootManager.getInstance().root();
        }

        //new Thread(RootManager.getInstance()).start();
    }

    private void unlockBootloaderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        UnlockManager.getInstance().loadUnlockTools();

        int response = JOptionPane.showConfirmDialog(this, "<html>This will automatically unlock your device.<br>" +
                "Your device MUST be rooted to continue.<br>" +
                "Do not turn off your device during the process. Press \"Ok\" to continue, or \"Cancel\" to cancel.</html>", "Unlock", JOptionPane.OK_CANCEL_OPTION);

        if (response == JOptionPane.OK_OPTION) {
            UnlockManager.getInstance().unlock();
        }

    }

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {
        loadAdbInfo();
    }

    private void windowsDriverActionPerformed(java.awt.event.ActionEvent evt) {
        if (RecoveryManager.getInstance().getRecoveries() == null) {
            JOptionPane.showMessageDialog(this, "Could not get LG Driver information. Are you connected to the Internet?", "Network Failure", JOptionPane.ERROR_MESSAGE);
        } else {
            int response = JOptionPane.showConfirmDialog(this, "<html>This will connect to the internet and download the LG Driver.<br>" +
                    "Would you like to download and install it?</html>", "Driver Install", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                DriverInstallGUI gui = new DriverInstallGUI(this, true);
                gui.setLocationRelativeTo(this);
                gui.setVisible(true);
            }
        }
    }

    private void deleteTmpFiles(java.awt.event.WindowEvent evt) {
        AdbManager.getInstance().adbKill();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        try {
            AdbManager.getInstance().deleteTempFiles();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void installRecoveryActionPerformed(java.awt.event.ActionEvent evt) {
        if (RecoveryManager.getInstance().getRecoveries() == null) {
            JOptionPane.showMessageDialog(this, "Could not get recovery information. Are you connected to the Internet?", "Network Failure", JOptionPane.ERROR_MESSAGE);
        } else {
            RecoverySelectorGUI gui = new RecoverySelectorGUI(this, true);
            gui.setLocationRelativeTo(this);
            gui.setVisible(true);
        }

    }

    private void restoreBootActionPerformed(java.awt.event.ActionEvent evt) {
        if (RecoveryManager.getInstance().getRecoveries() == null) {
            JOptionPane.showMessageDialog(this, "Could not get boot.img information. Are you connected to the Internet?", "Network Failure", JOptionPane.ERROR_MESSAGE);
        } else {
            int response = JOptionPane.showConfirmDialog(this, "<html>This will connect to the internet and download the stock unlocked boot.img<br>" +
                    "It is important you do not close this program or disconnect your phone.<br>" +
                    "Would you like to download and install it?</html>", "Boot Restore", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                RestoreInstallGUI gui = new RestoreInstallGUI(this, true);
                gui.setLocationRelativeTo(this);
                gui.setVisible(true);
            }
        }
    }


    private void loadAdbInfo() {
        DeviceManager deviceManager = DeviceManager.getInstance();

        if (deviceManager.isDeviceConnected()) {
            phoneStatus.setText("Connected");
            phoneStatus.setForeground(Color.green);
        } else {
            phoneStatus.setText("Not Connected");
            phoneStatus.setForeground(Color.red);

            phoneType.setText("");
            rootStatus.setText("");
            buildNumber.setText("");
            softwareVersion.setText("");
            unlocked.setText("");
            installRecovery.setEnabled(false);
            restoreBoot.setEnabled(false);
            rootButton.setEnabled(false);
            unlockBootloaderButton.setEnabled(false);
            rootSupported.setText("This software version is supported and can be rooted");
            rootSupported.setForeground(new java.awt.Color(238, 238, 238));

            return;
        }

        if (deviceManager.getDeviceType() != null && deviceManager.getDeviceType().equals(Constants.SUPPORTED_DEVICE)) {
            phoneType.setText("LG Optimus G (Sprint)");
            phoneType.setForeground(Color.green);
            rootButton.setEnabled(true);
        } else {
            phoneType.setText("Unsupported");
            phoneType.setForeground(Color.red);

            rootStatus.setText("");
            buildNumber.setText("");
            softwareVersion.setText("");
            unlocked.setText("");
            installRecovery.setEnabled(false);
            restoreBoot.setEnabled(false);
            rootButton.setEnabled(false);
            unlockBootloaderButton.setEnabled(false);
            rootSupported.setText("This software version is supported and can be rooted");
            rootSupported.setForeground(new java.awt.Color(238, 238, 238));

            return;
        }

        if (deviceManager.deviceHasRoot()) {
            rootStatus.setText("Rooted");
            rootStatus.setForeground(Color.green);
            unlockBootloaderButton.setEnabled(true);
            JOptionPane.showMessageDialog(this, "<html>Please accept the root prompt on your phone.<br>" +
                    "The program needs root in order to check if your device is unlocked.<br>" +
                    "It also needs root to install recoveries and boot images.</html>", "Superuser", JOptionPane.INFORMATION_MESSAGE);
        } else {
            rootStatus.setText("Not Rooted");
            rootStatus.setForeground(Color.red);
            unlockBootloaderButton.setEnabled(false);
        }

        if (deviceManager.isDeviceUnlocked()) {
            unlocked.setText("Unlocked");
            unlocked.setForeground(Color.green);
            installRecovery.setEnabled(true);
            restoreBoot.setEnabled(true);
        } else {
            unlocked.setText("Locked");
            unlocked.setForeground(Color.red);
            installRecovery.setEnabled(false);
            restoreBoot.setEnabled(false);
        }

        buildNumber.setText(deviceManager.getBuildNumber());
        softwareVersion.setText(deviceManager.getSoftwareVersion());

        if (deviceManager.isDeviceSoftwareSupported()) {
            rootSupported.setForeground(new java.awt.Color(51, 51, 51));
            rootSupported.setText(Constants.ROOT_SUPPORTED);
        } else {
            rootSupported.setForeground(new java.awt.Color(51, 51, 51));
            rootSupported.setText(Constants.ROOT_UNSUPPORTED);
            rootButton.setEnabled(false);
            unlockBootloaderButton.setEnabled(false);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel buildNumber;
    private javax.swing.JButton installRecovery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel phoneStatus;
    private javax.swing.JLabel phoneType;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton restoreBoot;
    private javax.swing.JButton rootButton;
    private javax.swing.JLabel rootStatus;
    private javax.swing.JLabel rootSupported;
    private javax.swing.JLabel softwareVersion;
    private javax.swing.JButton unlockBootloaderButton;
    private javax.swing.JLabel unlocked;
    private javax.swing.JButton windowsDriver;
    // End of variables declaration
}
