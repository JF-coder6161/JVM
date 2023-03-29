package com.jf.jvm.classloader;

import sun.awt.HKSCS;
import sun.net.spi.nameservice.dns.DNSNameService;

public class T002_ClassLoaderLevel {
    public static void main(String[] args) {

        System.out.println(String.class.getClassLoader()); // null
        System.out.println(HKSCS.class.getClassLoader()); // null
        System.out.println(DNSNameService.class.getClassLoader()); // sun.misc.Launcher$ExtClassLoader@7d4991ad
        System.out.println(T002_ClassLoaderLevel.class.getClassLoader()); //sun.misc.Launcher$AppClassLoader@18b4aac2

        System.out.println(DNSNameService.class.getClassLoader().getClass().getClassLoader()); // null
        System.out.println(T002_ClassLoaderLevel.class.getClassLoader().getClass().getClassLoader()); // null

    }
}
