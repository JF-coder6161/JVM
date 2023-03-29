package com.jf.jvm.classloader;

public class T003_ClassLoaderScope {
    public static void main(String[] args) {

        // Launcher 源码
        // BootStrap ClassLoader 加载路径
        String pathBoot = System.getProperty("sun.boot.class.path");
        System.out.println(pathBoot.replaceAll(";", System.lineSeparator()));

        // Extension ClassLoader 加载路径
        System.out.println("------------------------");
        String pathExt = System.getProperty("java.ext.dirs");
        System.out.println(pathExt.replaceAll(";", System.lineSeparator()));

        // App ClassLoader 加载路径
        System.out.println("------------------------");
        String pathApp = System.getProperty("java.class.path");
        System.out.println(pathApp.replaceAll(";", System.lineSeparator()));

/**
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\resources.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\rt.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\sunrsasign.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\jsse.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\jce.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\charsets.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\jfr.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\classes
 * ------------------------
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext
 * C:\WINDOWS\Sun\Java\lib\ext
 * ------------------------
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\charsets.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\access-bridge-64.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\cldrdata.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\dnsns.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\jaccess.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\localedata.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\nashorn.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\sunec.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\sunjce_provider.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\sunmscapi.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\sunpkcs11.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\ext\zipfs.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\jce.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\jfr.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\jsse.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\management-agent.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\resources.jar
 * C:\Users\18744\.jdks\temurin-1.8.0_322\jre\lib\rt.jar
 * F:\project\JVM\Learn\target\classes
 * D:\software\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar
 */


    }
}
