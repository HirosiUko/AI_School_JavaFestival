/*
Problem #31
num1, num2, op (+, -, *, /) 를 매개변수로 받아
num1과 num2를 op에 맞게 연산한 결과값을
반환해주는 cal 메소드를 작성하세요.
*/
public class Problem31 {
    public static double cal(int num1, int num2, String op)
    {
        double result = 0;
        switch (op)
        {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / (double)num2;
                break;
            default:
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(cal(50,15,"*"));
    }
}
