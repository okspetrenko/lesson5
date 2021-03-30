package lesson5;

public class Main2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Fibonacci(n));
    }
    public static boolean Fibonacci(int n) {
        int number1 = 0;
        int number2 = 1;
        do {
            int saveNumber1 = number1;
            number1 = number2;
            number2 = saveNumber1 + number2;
        }
        while (number2 < n);

        if (number2 == n)
            return true;
        else
            return false;

    }

}
