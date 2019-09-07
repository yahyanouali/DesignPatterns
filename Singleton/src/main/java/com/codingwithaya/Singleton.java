package com.codingwithaya;

public class Singleton {

    /*
     This is a requirement for creating a Singleton since a public
     constructor would mean anyone could access it and start
     creating new instances.
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    /*
    Q: Why we are using an inner class that hold an instance of
    the singleton and not using a simple static field that hold
    a singleton instance ?

    A: Because if we use a simple static field, the instance will
    be created at class loading and not when the getInstance() method
    get called by someone
    */
    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

}
