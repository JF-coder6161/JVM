package com.jf.jvm.classloader;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class T006_JFClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File f = new File("F:/exercise/", name.replace(".", "/").concat(".class"));
        try {
            FileInputStream fis = new FileInputStream(f);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int b = 0;

            while ((b = fis.read()) != -1) {
                baos.write(b);
            }

            byte[] bytes = baos.toByteArray();
            baos.close();
            fis.close();//可以写的更加严谨

            return defineClass(name, bytes, 0, bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.findClass(name); //throws ClassNotFoundException
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        T006_JFClassLoader l = new T006_JFClassLoader();
        Class clazz = l.loadClass("Hello");

        Method m = clazz.getMethod("sayHello");
        m.invoke(clazz.newInstance());

        System.out.println(clazz.getClassLoader()); // com.jf.jvm.classloader.T006_JFClassLoader@75b84c92
        System.out.println(clazz.getClassLoader().getParent()); //sun.misc.Launcher$AppClassLoader@18b4aac2


    }
}
