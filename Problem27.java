import java.util.ArrayList;
import java.util.Scanner;

/*
Problem #27

각 배열의 인덱스에 값을 입력받고
인덱스의 수만큼 별을 출력하시오

1번째 입력 : 3
2번째 입력 : 1
3번째 입력 : 2
4번째 입력 : 5
5번째 입력 : 4
3 : ***
1 : *
2 : **
5 : *****
4 : ****

*/
public class Problem27 {
    public static String print_star(int n){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            result.append("*");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1; i<6; i++)
        {
            System.out.print(i + "번째 입력 : ");
            nums.add(in.nextInt());
        }

        for (Integer num :
                nums) {
            System.out.format("%d : %s\n", num, print_star( num ));
        }

    }
}
