package edu.eci.arep.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * MyThread
 */
public class MyThread implements Runnable{
    private static final String HEROKU_URL = "https://fast-fjord-28141.herokuapp.com";
    public void run() {
        try{
            URL url = new URL(HEROKU_URL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                // System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    
}