package com.codingwithaya;

public class App {

    public static void main(String[] args) {
        // the only way to get instance of the Singleton class
        Singleton singleton = Singleton.getInstance();

        // using the instance
        singleton.sayHello("Yahya");
    }
}
