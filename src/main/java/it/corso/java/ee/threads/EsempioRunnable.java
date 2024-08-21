package it.corso.java.ee.threads;

public class EsempioRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Sono un runnable thread");
    }
}
