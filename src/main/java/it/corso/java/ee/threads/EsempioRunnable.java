package it.corso.java.ee.threads;

public class EsempioRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Sono un runnable thread");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
