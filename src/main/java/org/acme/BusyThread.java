package org.acme;

public class BusyThread extends Thread {
    private double load;
    private long duration;

    public BusyThread(String name, double load, long duration) {
        super(name);
        this.load = load;
        this.duration = duration;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
            // Loop for the given duration
            while (System.currentTimeMillis() - startTime < duration) {
                // Every 100ms, sleep for the percentage of unladen time
                if (System.currentTimeMillis() % 100 == 0) {
                    try {
                        Thread.sleep((long) Math.floor((1 - load) * 100));
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
    }
}