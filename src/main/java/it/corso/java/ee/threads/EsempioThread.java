package it.corso.java.ee.threads;

public class EsempioThread extends Thread{
    @Override
    public void run() {
        System.out.println("Sono un thread");
    }
}
