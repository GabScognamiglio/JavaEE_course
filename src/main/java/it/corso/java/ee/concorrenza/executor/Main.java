package it.corso.java.ee.concorrenza.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Main m = new Main();

        m.esempioExecurtor();

    }

    public void esempioExecurtor() throws InterruptedException, ExecutionException {
        List<Callable<String>> siti = new ArrayList<Callable<String>>();

        siti.add(new GetSitePageExecutor("http://www.google.it"));

        ExecutorService ex = Executors.newSingleThreadExecutor();
        List<Future<String>> out = ex.invokeAll(siti);

        for (Future<String> future : out){
            System.out.println(future.get());
        }

        ex.shutdown();
    }

}
