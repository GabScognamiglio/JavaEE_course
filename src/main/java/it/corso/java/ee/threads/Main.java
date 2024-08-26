package it.corso.java.ee.threads;

public class Main {
    public static void main(String[] args) {
//        EsempioThread et = new EsempioThread();
//        et.start();
//
//        Thread t = new Thread(new EsempioRunnable());
//        t.start();


        //ESEMPIO MULTITHREADING
        EsempioThread et1 = new EsempioThread();
        et1.setName("Thread1");

        EsempioThread et2 = new EsempioThread();
        et2.setName("Thread2");

        EsempioThread et3 = new EsempioThread();
        et3.setName("Thread3");
        et3.setPriority(10);

        et1.start();
        et2.start();
        et3.start(); 

    }
}
