package it.corso.java.ee.threads;

public class Main {
    public static void main(String[] args) {
        EsempioThread et = new EsempioThread();

        et.start();


        Thread t = new Thread(new EsempioRunnable());

        t.start();
    }
}
