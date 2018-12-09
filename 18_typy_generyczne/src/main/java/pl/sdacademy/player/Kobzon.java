package pl.sdacademy.player;

public class Kobzon implements Monster {

  @Override
  public void takeDmg(int damage) {
    System.out.println(String.format("I'm hungry! Waiting for more damage! Ignore %d damage.", damage));
  }
}
