package pl.sdacademy.player;

public class DefaultMonster implements Monster {

  @Override
  public void takeDmg(int damage) {
    System.out.println(String.format("Monster takes %d damage.", damage));
  }
}
