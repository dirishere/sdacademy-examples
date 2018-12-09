package pl.sdacademy.ownannotation;

import java.lang.reflect.InvocationTargetException;

public class Main {
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    TestClass test = new TestClass();
    BenchmarkProcessor benchmarkProc = new BenchmarkProcessor();

    benchmarkProc.benchmark(test);

  }
}
