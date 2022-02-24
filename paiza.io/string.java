import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // Your code here!

    String name = "いろは"; // nameにいろはを定義
    System.out.println(name);

    // 文字列の連結
    String word1 = "こんにちは";
    String word2 = "私はJavaです";
    String word3 = word1 + word2;
    System.out.println(word3);

    // 文字数表記
    System.out.println(word3.length());

    // 文字列の取り出し
    String word = "こんにちは。私はJavaです。";
    System.out.println(word.substring(6, 12));// 6-11列目を抜き出す
    System.out.println(word.substring(12)); // 12-末尾を抜き出す

    // 文字列の置き換え
    word = word.replace("Java", "shinya");
    System.out.println(word);

    // 文字列と数列の連結
    int a = 10;
    int b = 11;
    String question = a + "X" + b + "=?";// questionに一括で定義しておくと定義づけしたものを入れるだけなので下記の書式が分かりやすくなる
    System.out.println(question);
  }
}
