import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // Your code here!
    // データーの変換(拡大変換)
    // [表現力の低い変数を表現力が高い変数に入れ込むこと]
    double doubleA = 1234.567; // double型(小数点)
    int intA = 12345;
    doubleA = intA; // doubleAにintAを入れ込む
    System.out.println(doubleA);

    // キャスト変換
    // [拡大変換の逆。入りきらない部分の削除を許可することによってエラーを回避委する]
    double doubleB = 1234.567; // double型(小数点)
    int intB = 12345;
    intB = (int) doubleB; // doubleBをキャスト変換する(int)
    System.out.println(intB);

  }
}
