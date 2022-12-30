// Define a Thread1 class that extends the Thread class
class Thread1 extends Thread {
  // Override the run method
  @Override
  public void run() {
    // Print a message 4000 times
    for (int i = 0; i < 4000; i++) {
      System.out.println("This is thread one");
    }
  }
}

// Define a Thread2 class that extends the Thread class
class Thread2 extends Thread {
  // Override the run method
  @Override
  public void run() {
    // Print a message 4000 times
    for (int i = 0; i < 4000; i++) {
      System.out.println("This is thread two");
    }
  }
}

public class Thread_using_ThreadClass {
  public static void main(String[] args) {
    // Create Thread1 and Thread2 objects
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();
    // Start both threads
    t1.start();
    t2.start();
  }
}
