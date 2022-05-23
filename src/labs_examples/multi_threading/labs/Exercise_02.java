package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
class DemonstrationSecond extends Thread{
    public DemonstrationSecond(String name) {
        super(name);
        super.start();
    }
    public DemonstrationSecond(){
        super("Second");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println("Running thread " + super.getName());
        } catch (InterruptedException e){
            System.out.println("Interrupted " + e);
        }
    }
}
class MainSecond{
    public static void main(String[] args) {
        DemonstrationSecond test1 = new DemonstrationSecond("First");
        test1.setPriority(1);
        DemonstrationSecond test2 = new DemonstrationSecond();
        test2.setPriority(10);
        test2.start();
    }
}