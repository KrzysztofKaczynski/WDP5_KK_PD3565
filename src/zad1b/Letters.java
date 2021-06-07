package zad1b;

import java.util.ArrayList;

public class Letters {
    private ArrayList<Thread> threads;

    public Letters(String toCall) {
        this.threads = new ArrayList<Thread>();

        for(int i = 0; i < toCall.length(); i++) {
            char threadLetter = toCall.charAt(i);

            threads.add(new Thread("Thread " + threadLetter) {
                public void run() {
                    while(true) {
                        try {
                            Thread.sleep(1000);
                            System.out.print(threadLetter);
                        } catch(InterruptedException exception) {
                            break;
                        }
                    }
                }
            });
        }
    }

    public ArrayList<Thread> getThreads() {
        return this.threads;
    }
}
