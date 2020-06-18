import java.util.*;

public class Ex1_3 {

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner scnr = new Scanner(System.in);
        String input = scnr.next();
        int result = 0;
        for (int i = 0; i < input.length(); i++) { //(character ASCII value - 48) * 10 ^ (length - index)
            int temp = 0;
            //PT -- check to make sure you have a digit first. -2
            //      if (input.charAt(i) >= '0 && input.charAt(i) <= '9')
            temp += input.charAt(i) - 48;
            result += temp * (int)Math.pow(10, input.length() - 1 - i);
        }
        System.out.print(result);
    }
}
