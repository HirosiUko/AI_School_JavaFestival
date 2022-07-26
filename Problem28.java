import java.util.ArrayList;
import java.util.Random;

/*
Problem #28

중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오

*/
public class Problem28 {
    static ArrayList<Integer> num = new ArrayList<>();

    public static void main(String[] args) {
        for(int i=0; i<45; i++) num.add(i+1);

        for(int i=0; i<6; i++)
        {
            Random rand = new Random();
            int selected_idx = rand.nextInt(num.size());
            System.out.format("행운의 숫자 : %d\n",num.remove(selected_idx));
        }
    }
}
