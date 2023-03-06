public class RunThreads implements Runnable {
  public static void main(String[] args) {
    /* Make one Runnable instance. */
    RunThreads runner = new RunThreads();
    /*
     * Make two threads, with the same Runnable (the same job)
     */
    Thread alpha = new Thread(runner);
    Thread beta = new Thread(runner);
    /* Name the threads. */
    alpha.setName("Alpha thread");
    beta.setName("Beta thread");
    alpha.start();

    beta.start();

  }

  /*
   * Each thread will run through this loop, printing its name each time.
   */
  public void run() {
    for (int i = 0; i < 25; i++) {
      String threadName = Thread.currentThread().getName();
      System.out.println(threadName + " is running");
    }
  }
}