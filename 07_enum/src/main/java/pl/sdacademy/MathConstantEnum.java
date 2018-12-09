package pl.sdacademy;

public enum MathConstantEnum {
  PI(3.14),
  E(2.72),
  C(300000000),
  G(9.81);

  private double value;

  MathConstantEnum(double value){
    this.value = value;
  }

  public double getValue(){
    return value;
  }
}
