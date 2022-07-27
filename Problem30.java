import java.util.*;

/*
Problem #30

정수 N을 입력받아
N * N 배열에 다음과 같이 숫자를 저장하고 출력하시오
input 5
1   2  3  4  5
10  9  8  7  6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25

*/
public class Problem30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=1; i < n*n+1; i++) array.add(i);
        for(int i=0; i < n; i++){
            List<Integer> ele = array.subList(i*n, (i+1)*n);
            if(i%2 != 0) {
                Collections.reverse(ele);
            }
            for (Integer e : ele) {
                System.out.print(e + "\t");
            }
            System.out.println();
        }
    }
}
