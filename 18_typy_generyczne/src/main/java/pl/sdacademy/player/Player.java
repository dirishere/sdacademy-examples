package pl.sdacademy.player;

public interface Player<M extends Monster> {
  void attack(M enemy);
}
