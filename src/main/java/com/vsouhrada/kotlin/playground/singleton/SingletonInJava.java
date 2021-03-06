package com.vsouhrada.kotlin.playground.singleton;

/**
 * @author vsouhrada
 */
public class SingletonInJava {

    private static SingletonInJava INSTANCE;

    public static SingletonInJava getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonInJava();
        }

        return INSTANCE;
    }

}
