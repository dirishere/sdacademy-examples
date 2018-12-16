package pl.sdacademy.thread;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationExample {
  public static void main(String[] args) throws InterruptedException {
    ProductCatalog catalog = new ProductCatalog(3);

    Thread thread0 = new Thread(()-> {
      catalog.addProduct("product 0");
    });
    thread0.start();

    Thread thread1 = new Thread(()-> {
      catalog.addProduct("product 1");
    });
    thread1.start();

    Thread thread2 = new Thread(()-> {
      catalog.addProduct("product 2");
    });
    thread2.start();

    thread0.join();
    thread1.join();
    thread2.join();

    catalog.removeProduct(2);
    catalog.removeProduct(1);

  }

  static class ProductCatalog{
    private List<String> products;
    private int maxSize;

    public ProductCatalog(int maxSize) {
      products = new ArrayList<>();
      this.maxSize = maxSize;
    }

    void addProduct(String newProduct){
      if(products.size() < maxSize) {
        products.add(newProduct);
      }
    }

    void removeProduct(int index){
      products.remove(index);
    }

  }
}
