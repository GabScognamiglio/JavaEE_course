package it.corso.java.ee.concorrenza.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
    Main m = new Main();

    m.esempioForkJoin();
    }

    private void esempioForkJoin() {
        ForkJoinPool f = new ForkJoinPool();

        System.out.println(f.invoke(new GetSitePageFork("http://www.google.it")));
        System.out.println(f.invoke(new GetSitePageFork("http://www.hdblog.it")));


    }
}
