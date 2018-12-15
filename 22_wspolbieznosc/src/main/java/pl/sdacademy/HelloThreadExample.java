package pl.sdacademy;

//proces to program; proces zakończy się kiedy zakończy się ostatni wątek danego procesu
//jeden proces ma (może mieć) wiele wątków

public class HelloThreadExample {
  public static void main(String[] args) {
    /** Tak było kiedyś:
     * new Thread(new Runnable() {
    @Override public void run() {

    }
    }).start(); //tworzenie nowego wątku; runnable - obiekt który wykona kod równolegle **/

    //new Thread(() -> System.out.println("Hello from another thread!")).start(); //to samo od javy 8

    NumberHolder number = new NumberHolder(0);

    Thread thread = new Thread(()->{
      try {
        Thread.sleep(5000);
        System.out.println("Hello from thread.");
        number.increment();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    thread.start();
    number.increment(); //nie bedzie 2, bo increment z try odpali się po 5000ms
    System.out.printf("Hello! Number test: %d\n", number.getNumber());
  }

  public static class NumberHolder {
    private int number;

    public NumberHolder(int number) {
      this.number = number;
    }

    public int getNumber(){
      return number;
    }

    public void increment(){
      number++;
    }

  }
}
