package ru.ncedu.horstmann.interfacesandlabdaexpressions;

/**
 * This class Greeter
 * Exercises 9
 * Implement a class Greeter that implements Runnable and whose run method
 * prints n copies of "Hello, " + target, where n and target are set in the constructor.
 * Construct two instances with different messages and execute them concurrently in two threads.
 * @version 1.0, 5 Jan 2021
 * @author Vladislav Semenovykh
 */
public class Greeter implements Runnable{
    private int n;
    private String target;
    private Thread thread;

    /**
     * Constructor - creating a new instance with specific values
     * @param n
     * @param target
     */
    public Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i=0; i<n; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }

    /**
     * Method print n message
     */
    public void repeatMessage() {
        Runnable r = () -> {
            for (int i = 0; i < n; i++) {
                System.out.println(i + " Hello, " + target);
            }
        };
        new Thread(r).start();
    }
}
