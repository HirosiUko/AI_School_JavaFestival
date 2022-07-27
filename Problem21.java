import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Problem #21

입력받은 수의 약수를 구하시오
#️⃣ 하기 코드는 아래에서 가져옴. https://woodadada16.tistory.com/24
*/
public class Problem21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sqrt = (int) Math.sqrt(n); // 100의 제곱근은 10
        ArrayList<Integer> arr = new ArrayList<>(); // 약수 받을 ArrayList

        for(int i = 1; i <= sqrt; i++){
            if(n % i == 0){ // 약수 중 작은 수 저장
                arr.add(i);
                if(n / i != i){ // 약수 중 큰 수 저장
                    arr.add(n / i);
                }
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
