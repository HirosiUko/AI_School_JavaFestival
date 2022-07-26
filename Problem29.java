import java.util.Scanner;

/*
Problem #29

10진수 정수를 입력받아
2진수로 변환해서 출력하시오

*/
public class Problem29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println();
    }
}
