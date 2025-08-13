package basic;
class ReverseNumber {
  public static void main(String args[]) {
    int num = 234;
    int remainder, result = 0;
    while (num > 0) {
      remainder = num % 10;
      result = result * 10 + remainder;
      num = num / 10;
    }
    System.out.println("Reverse	number	is :" + result);
  }
}