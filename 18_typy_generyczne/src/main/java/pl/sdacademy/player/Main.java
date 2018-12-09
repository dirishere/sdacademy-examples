package pl.sdacademy.player;

public class Main {
  public static void main(String[] args) {
    Player<Monster> player1 = new DefaultPlayer<>();
    Monster monster1 = new DefaultMonster();
    Monster kobzon1 = new Kobzon();

    player1.attack(monster1);
    player1.attack(kobzon1);
  }
}
