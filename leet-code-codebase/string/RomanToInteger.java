import java.util.*;

public class RomanToInteger {

    public static int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = value(s.charAt(i));

            // check next value if exists
            if (i + 1 < s.length()) {
                int next = value(s.charAt(i + 1));

                if (curr < next) {
                    total -= curr;
                } else {
                    total += curr;
                }
            } else {
                total += curr;
            }
        }
        return total;
    }

    // to get value
    public static int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }

    public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value in roman number");
		String str = sc.next();
		
		System.out.println(romanToInt(str));
		
    }
}
