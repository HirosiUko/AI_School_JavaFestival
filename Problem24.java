import java.util.ArrayList;
import java.util.Scanner;

/*
Problem #24

소인수 분해를 해주는 프로그램을 작성하시오

<!----- 출력 모양 ---------!>
소인수분해 할 수를 입력하세요. : 20
20 = 2*2*5
*/
public class Problem24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // BackJoon 11653번 문제.
        for(int i=2; i*i < num+1; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
                num /= i;
                i--;
            }
        }
        System.out.print(num + " ");
    }
}
// Test input : 2147483647 (메르센 소수)
// Test input : 9991 --> 97,103
