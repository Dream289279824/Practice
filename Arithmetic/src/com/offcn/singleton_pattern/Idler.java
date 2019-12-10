package com.offcn.singleton_pattern;

public class Idler {

    public static Idler idler;

    private Idler(){}

    public static Idler getInstance(){
        if (null == idler) {
            synchronized (Idler.class) {
                if (null == idler) {
                    idler = new Idler();
                }
            }
        }
        return idler;
    }

}
