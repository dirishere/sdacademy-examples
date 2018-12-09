package pl.sdacademy.ownannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalTime;

public class BenchmarkProcessor {

  void benchmark(Object object) throws InvocationTargetException, IllegalAccessException {
    long time;
    Method[] methods = object.getClass().getDeclaredMethods(); //zwraca tablicę obiektów zwanych metodą
    for (Method method : methods) {
      if(method.isAnnotationPresent(BenchmarkTime.class)){
        time = System.currentTimeMillis();
        method.invoke(object);
        System.out.println(String.format("Method name %s takes %d ms to execute.",
                method.getName(), System.currentTimeMillis() - time));
      }
    }

  }
}
