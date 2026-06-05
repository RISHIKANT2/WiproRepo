//package com.java.threads;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class VThreads {
//
//    public static void main(String[] args) {
//
//        // Single virtual thread
//        Runnable task = () -> System.out.println(
//                "Hello, thread is working! -> " +
//                Thread.currentThread());
//
//        Thread vt = Thread.ofVirtual().start(task);
//
//        try {
//            vt.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Multiple virtual threads
//        for (int i = 1; i <= 10; i++) {
//
//            int threadNumber = i; // effectively final
//
//            Thread.ofVirtual().start(() -> {
//                System.out.println(
//                        "New virtual thread created: "
//                                + threadNumber
//                                + " -> "
//                                + Thread.currentThread());
//            });
//        }
//
//        // Virtual Thread Executor
//        try (ExecutorService service =
//                     Executors.newVirtualThreadPerTaskExecutor()) {
//
//            for (int i = 1; i <= 5; i++) {
//
//                int taskId = i;
//
//                service.submit(() -> {
//                    System.out.println(
//                            "Executor Task "
//                                    + taskId
//                                    + " running on "
//                                    + Thread.currentThread());
//                });
//            }
//        }
//
//        System.out.println("Main Thread Finished.");
//    }
//}