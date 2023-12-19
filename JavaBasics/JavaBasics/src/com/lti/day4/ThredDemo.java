package com.lti.day4;

class newTask implements Runnable {

    @Override
    public void run(){
        System.out.println("This is thred execution: "+ Thread.currentThread().getName());
    }

}

public class ThredDemo {
    public static void main(String[] args) {
        // Create Thread();
        Thread t = new Thread(new newTask());
        t.start();
        Thread t1 = new Thread(new newTask());
        t1.start();

        System.out.println("Main method executed by " + Thread.currentThread().getName());
    }
}
