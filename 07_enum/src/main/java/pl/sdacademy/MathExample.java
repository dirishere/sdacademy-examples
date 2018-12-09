package pl.sdacademy;

public class MathExample {
  public static void main(String[] args) {
    MathConstantEnum pi = MathConstantEnum.PI;
    System.out.println(pi.getValue());
    System.out.println(MathConstantEnum.PI.getValue());
  }
}
