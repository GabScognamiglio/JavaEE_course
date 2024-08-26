package it.corso.java.ee.concorrenza.forkjoin;

import it.corso.java.ee.InputStreamToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.RecursiveTask;

public class GetSitePageFork extends RecursiveTask {
    private String url;

    public GetSitePageFork(String url) {
        this.url = url;
    }

    @Override
    protected String compute() {

        try {
            URL u = new URL(url);
            URLConnection con = u.openConnection();
            InputStream is = con.getInputStream();

            return InputStreamToString.convert(is);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
