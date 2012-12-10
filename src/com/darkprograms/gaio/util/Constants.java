package com.darkprograms.gaio.util;

/**
 * Created with IntelliJ IDEA.
 * User: theshadow
 * Date: 12/9/12
 * Time: 3:35 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Constants {

    public static String RESOURCES_DIR_NAME = "resources";
    public static String GAIO_DIR_NAME = "gaio";
    public static String[] RESOURCES_ADB_ARRAY = {"adb", "adb.exe", "AdbWinApi.dll", "AdbWinUsbApi.dll"};

    public static String RESOURCES_ROOT_NAME = RESOURCES_DIR_NAME + "/root";
    public static String RESOURCES_ROOT_STUFF = "stuff";
    public static String[] RESOURCES_ROOT_RUN_ME = {"RunMe.sh", "RunMe.bat"};
    public static String ROOT_DIR_NAME = "root";
    public static String[] RESOURCES_ROOT_ARRAY = {"adb", "adb.exe", "AdbWinApi.dll", "AdbWinUsbApi.dll", "busybox", "busybox.exe",
            "checklt30.bat", "fakebackup.ab", "ric", "rootkittablet.tar.gz", "RootMe.tar", "script1.sh", "su", "Superuser.apk", "tabletS.ab", "Term.apk",};

    public static String RESOURCES_UNLOCK_NAME = RESOURCES_DIR_NAME + "/unlock";
    public static String UNLOCK_DIR_NAME = "unlock";
    public static String[] RESOURCES_UNLOCK_ARRAY = {"adb", "adb.exe", "AdbWinApi.dll", "AdbWinUsbApi.dll", "busybox",
            "fastboot.exe", "freegee-sprint.tar", "freegee.bat", "freegee.sh"};

    public static String BUILD_PROP_COMMMAND = "cat /system/build.prop";

    public static String SUPPORTED_DEVICE = "geehrc4g_spr_us";
    public static String RO_DEVICE_NAME = "ro.product.name";

    public static String RO_DISPLAY_ID = "ro.build.display.id";

    public static String RO_VERSION_INC = "ro.build.version.incremental";

    public static String LG_DRIVER_URL = "http://www.lg.com/us/support-mobile/lg-LS970";


}