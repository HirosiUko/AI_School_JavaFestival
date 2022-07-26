import java.util.Scanner;

/*
Problem #26

수 n을 입력받아
1, 2, 4, 7, 11 과 같은 수열의
n번째 항까지 출력하시오

 */
public class Problem26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n 입력 : ");
        int n = in.nextInt();
        int sum = 1;
        for(int i = 1 ; i < n+1; i++){
            System.out.print(sum + " ");
            sum += i;
        }
    }
}
