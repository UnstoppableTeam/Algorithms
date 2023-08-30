package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

//public class MyCallable implements Callable<String> {
//
//    @Override
//    public String call() throws Exception {
//        Thread.sleep(1000);
//        // возвращает имя потока, который выполняет callable таск
//        return Thread.currentThread().getName();
//    }
//
//    public static void main(String args[]){
//        //Получаем ExecutorService утилитного класса Executors с размером gпула потоков равному 10
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        //создаем список с Future, которые ассоциированы с Callable
//        List<Future<String>> list = new ArrayList<Future<String>>();
//        // создаем экземпляр MyCallable
//        Callable<String> callable = new MyCallable();
//        for(int i=0; i< 100; i++){
//            //сабмитим Callable таски, которые будут
//            //выполнены пулом потоков
//            Future<String> future = executor.submit(callable);
//            //добавляя Future в список,
//            //мы сможем получить результат выполнения
//            list.add(future);
//        }
//        for(Future<String> fut : list){
//            try {
//                // печатаем в консоль возвращенное значение Future
//                // будет задержка в 1 секунду, потому что Future.get()
//                // ждет пока таск закончит выполнение
//                System.out.println(new Date()+ "::" + fut.get());
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
//
//        executor.shutdown();
//    }
//
//}

//public class HeavyWorkRunnable implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("Начинаем обработку в отдельном потоке - " + Thread.currentThread().getName());
//        try {
//            Thread.sleep(1000);
//            // для примера будем выполнять обработку базы данных
//            doDBProcessing();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Заканчиваем обработку в отдельном потоке - " + Thread.currentThread().getName());
//    }
//
//    // метод псевдообработки базы данных
//    private void doDBProcessing() throws InterruptedException {
//        Thread.sleep(5000);
//    }
//
//}

//class Message {
//    // поле, с которым будут работать потоки через вызовы геттеров и сеттеров
//    private String msg;
//
//    public Message(String str){
//        this.msg=str;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String str) {
//        this.msg=str;
//    }
//
//}
//
//class Waiter implements Runnable{
//
//    private Message msg;
//
//    public Waiter(Message m){
//        this.msg = m;
//    }
//
//    @Override
//    public void run() {
//        String name = Thread.currentThread().getName();
//        synchronized (msg) {
//            try{
//                System.out.println(name + " ждем вызов метода notify: " + System.currentTimeMillis());
//                msg.wait();
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//            System.out.println(name + " был вызов метода notify: " + System.currentTimeMillis());
//            // обработаем наше сообщение
//            System.out.println(name + " : " + msg.getMsg());
//        }
//    }
//}
//
//class Notifier implements Runnable {
//
//    private Message msg;
//
//    public Notifier(Message msg) {
//        this.msg = msg;
//    }
//
//    @Override
//    public void run() {
//        String name = Thread.currentThread().getName();
//        System.out.println(name + " стартовал");
//        try {
//            Thread.sleep(1000);
//            synchronized (msg) {
//                msg.setMsg(name + " поток Notifier отработал");
//                msg.notify();
////                msg.notifyAll();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//public class WaitNotifyTest {
//
//    public static void main(String[] args) {
//        Message msg = new Message("обработать");
//        Waiter waiter = new Waiter(msg);
//        new Thread(waiter,"waiter").start();
//
//        Waiter waiter1 = new Waiter(msg);
//        new Thread(waiter1, "waiter1").start();
//
//        Notifier notifier = new Notifier(msg);
//        new Thread(notifier, "notifier").start();
//        System.out.println("Стартовали все потоки");
//    }
//
//}
//public class TestThread {
//    public static Object Lock1 = new Object();
//    public static Object Lock2 = new Object();
//
//    public static void main(String args[]) {
//        ThreadDemo1 T1 = new ThreadDemo1();
//        ThreadDemo2 T2 = new ThreadDemo2();
//        T1.start();
//        T2.start();
//    }
//
//    private static class ThreadDemo1 extends Thread {
//
//        public void run() {
//
//            synchronized (Lock1) {
//                System.out.println("Thread 1: Holding lock 1...");
//
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {}
//                System.out.println("Thread 1: Waiting for lock 2...");
//
//                synchronized (Lock2) {
//                    System.out.println("Thread 1: Holding lock 1 & 2...");
//                }
//            }
//        }
//    }
//
//    private static class ThreadDemo2 extends Thread {
//
//        public void run() {
//
//            synchronized (Lock1) {
//                System.out.println("Thread 2: Holding lock 2...");
//
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {}
//                System.out.println("Thread 2: Waiting for lock 1...");
//
//                synchronized (Lock2) {
//                    System.out.println("Thread 2: Holding lock 1 & 2...");
//                }
//            }
//        }
//    }
//}
public class Main  {



    public static void main(String args[]){

    }

}