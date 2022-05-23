package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
class Demonstration implements Runnable{
    Thread thread;
    String name;

    public Demonstration() {
        this.thread = new Thread(this);
        thread.start();
    }

    public Demonstration(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println("Currently in thread ");
        } catch (InterruptedException e){
            System.out.println("Interrupted " + e);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Demonstration demonstration1 = new Demonstration();
        Runnable demonstration2 = new Demonstration("second");
        Thread thread = new Thread(demonstration2);
        thread.start();
    }
}