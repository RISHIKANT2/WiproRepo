package com.java.practice1;

public class Android_11 {

    int version;
    int core;

    public void features() {
        System.out.println("This is android_11 feature");
    }

    public void make_call() {
        System.out.println("Calling");
    }

    static class Android_12 extends Android_11 {
        
        public void features() {
            System.out.println("This is android_12 feature");
        }

        public void heySiri() {
            System.out.println("Yes Sir, Siri here, how can I help you");
        }
    }

    static class Android_13 extends Android_12 {
        
        public void features() {
            System.out.println("This is android_13 feature");
        }
    }

    public static void main(String[] args) {
        Android_11 outer = new Android_11();
        Android_13 obj = new Android_13();

        obj.features();
        obj.make_call();
        obj.heySiri();
    }
}