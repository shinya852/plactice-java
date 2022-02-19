import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // Your code here!
    int a; // aの宣言
    a = 10; // aに10設定する
    System.out.println(a);

    // ↓宣言と代入1文で可能
    // int a = 10;
    // System.out.println(a);

    // 代入したデータ同士の計算
    int b = 12;
    int c = 15;
    System.out.println(a + b + c);

    // 右変数を左へ代入する方法
    int d = 15;
    d = d + c + 1;
    System.out.println(d);

    // 複合代入演算
    int x = 10;
    x *= 2; // 変数xに2を掛ける
    System.out.println(x);

    int y = 10;
    int z = 12;
    y++;
    z--;
    System.out.println(y);
    System.out.println(z);

  }
}