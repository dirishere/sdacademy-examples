package pl.sdacademy.clock;

public class ClockTest {
  public static void main(String[] args) throws InterruptedException {
    //LocalTime.now();
    Clock clock = new Clock();
    //Clock clock2 = new Clock(DateTimeFormatter.ofPattern();
    clock.startClock();
    Thread.sleep(6000);
    clock.stopClock();
  }

}
