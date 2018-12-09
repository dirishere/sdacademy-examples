package pl.sdacademy.ownannotation;

@FirstAnnotation(length = 0)
public class TestClass {
  @FirstAnnotation(value="TEXT",length = 5)
  int test;

  @BenchmarkTime
  void test1() throws InterruptedException {
    Thread.sleep(1500);
  }

  @BenchmarkTime
  void test2() throws InterruptedException {
    Thread.sleep(2000);
  }

  void test3() throws InterruptedException {
    Thread.sleep(500);
  }
}
