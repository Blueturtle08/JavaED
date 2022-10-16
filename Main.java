import java.util.Scanner;
  
public class Main {
  public static void main(String[] args) {
    int num;
    int[] arr = new int[100];
    Scanner sc = new Scanner(System.in);

    System.out.print("숫자를 입력하세요 : ");
      
    num = sc.nextInt();

    for(int i = 0;i < num; i++)
      {
        arr[i] = i + 1;
        System.out.println(arr[i]);
      }
  }
}