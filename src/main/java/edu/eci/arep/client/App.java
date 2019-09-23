package edu.eci.arep.client;

/**
 * Hello world!
 *
 */
public class App {
    private static final int threads = 5;
    private static final String HEROKU_URL = "";

    public static void main(String[] args) {
        Thread[] tList= new Thread[threads];
        for (int i = 0; i < threads; i++) {
            Thread t = new Thread(){
                public void run() {
                    this.readFromUrl();
                }
            }.start();
            tList[i]= t;
        }

        for (Thread t : tLThread) {
            t.join();
        }
    }

    public void readFromUrl() {
        URL url = new URL(HEROKU_URL);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
