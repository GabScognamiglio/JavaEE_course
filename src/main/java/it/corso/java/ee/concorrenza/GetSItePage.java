package it.corso.java.ee.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetSItePage extends Thread {
    private String url;
    private String content;

    public GetSItePage(String url) {
        super();
        this.url = url;
    }

    @Override
    public void run() {

        try {
            URL u = new URL(url);
            URLConnection con = u.openConnection();
            InputStream is = con.getInputStream();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
