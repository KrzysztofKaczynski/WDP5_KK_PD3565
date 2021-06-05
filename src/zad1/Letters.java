package zad1;

import java.util.ArrayList;

/**
 * Created by Krzysztof Kaczynski on 20:45 - 05.06.2021.
 */
public class Letters implements Runnable {

    public ArrayList<Thread> threads = new ArrayList<Thread>();
    public ArrayList<String> znaki = new ArrayList<String>();
    private boolean isDone = false;

    public Letters(String string) {

        for (int i = 0; i < string.length(); i++) {
            String leter = string.substring(i, i + 1);
            znaki.add(leter);
            threads.add(new Thread(this, "Thread " + leter));

        }
    }

    public ArrayList<Thread> getThreads() {
        // TODO Auto-generated method stub
        return threads;
    }

    public void run() {

        while (!isDone) {
            threads.forEach(arg -> System.out.print(arg.getName().substring(7)));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public void done() {
        isDone = true;
    }
}