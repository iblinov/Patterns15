package by.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ihar_Blinou on 7/17/2017.
 */
public class Main {
  public static void main(String[] args) {

//        String dirName = "text";
//        String filename = "students.txt";
//        Path path = FileSystems.getDefault().getPath(dirName, filename);
//
//        try {
//            String result = Files.lines(path).collect(Collectors.joining());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    //       ArrayList<String> list = new ArrayList<>();
    // ArrayList<int> b = new ArrayList<int>(); // ошибка компиляции
//        list.add("Java"); /* компилятор "знает" допустимый тип передаваемого значения */
//        list.add("JavaFX 2");
//        list.removeIf(o -> o.length()>5);
//        System.out.println(list);

    ArrayList<Order> orders = new ArrayList<Order>() {
      {
        add(new Order(231, 12.f));
        add(new Order(389, 2.9f));
        add(new Order(217, 1.7f));
      }
    };
    float bigAmount = 2.f;
    float percent = 0.85f;

    List<Order> res2 = new ArrayList<>();
    orders.stream()
            .filter(o -> o.getAmount() >= bigAmount)
            .map(o -> o.setAmount(o.getAmount() * percent))
            .forEach(res2::add);

    System.out.println(res2);
  }

}

class FindOrder {
  public List<Order> findBiggerAmountOrder(float bigAmount,
                                           List<Order> orders, int percent) {
    ArrayList<Order> bigPrices = new ArrayList<>();
    Iterator<Order> it = orders.iterator();
    while (it.hasNext()) {
      Order current = it.next();
      if (current.getAmount() >= bigAmount) {
        bigPrices.add(current);
        current.setAmount(current.getAmount() * percent);
      }
    }
    return bigPrices;
  }
}

class Order {
  private int orderId;
  private float amount;


  // поля и методы описания подробностей заказа
  public Order(int orderId, float amount) {
    this.orderId = orderId;
    this.amount = amount;
  }

  public int getOrderId() {
    return orderId;
  }

  public Order setAmount(float amount) {
    this.amount = amount;
    return this;
  }

  public float getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "Order [orderId =" + orderId + ", amount=" + amount + "]";
  }
}
