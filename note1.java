import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // Your code here!

    // if文
    int score = 90; // scoreに90を代入
    // 以下80点以上は合格と表示
    if (score >= 80) {
      System.out.println("合格");
    }
    // if文（elce）
    int scoreA = 60; // scoreに90を代入
    // 以下80点以上は合格と表示
    if (scoreA >= 80) {
      System.out.println("合格");
      // そうでなければ不合格と表示
    } else {
      System.out.println("不合格");
    }
  }
}
