package pl.sdacademy.clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
  private boolean working = true;

  void stopClock() {
    working = false;
  }

  void startClock() {
    new Thread(this::work).start();

  }

  private void work() {
    while (isWorking()) {
      try {
        Thread.sleep(1000);
        System.out.println(LocalTime.now().format(DateTimeFormatter.ISO_TIME));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private boolean isWorking() {
    return working;
  }

}
