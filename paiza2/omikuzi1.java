import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // Your code here!
    Random rnd = new Random();
    int score = rnd.nextInt(100);
    if (score >= 90) {
      System.out.println("当たり");
    } else {
      System.out.println("ハズレ");
    }
  }
}
