// FROM ROMAN TO INTEGER
import java.util.Map;
import java.util.HashMap;

class RomanToInt {

    private static final Map<Character,
            Integer> roman = new HashMap<Character,
            Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};


    private static int romanToInt(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            if (i != n - 1 && roman.get(s.charAt(i)) <
                    roman.get(s.charAt(i + 1))) {
                sum += roman.get(s.charAt(i + 1)) -
                        roman.get(s.charAt(i));
                i++;
            } else {
                sum += roman.get(s.charAt(i));
            }
        }
        return sum;
    }
}

    // FROM INTEGER TO ROMANS
    class GFG {
        // Function to calculate roman equivalent
        static String intToRoman(int num) {
            // storing roman values of digits from 0-9
            // when placed at different places
            String m[] = {"", "M", "MM", "MMM"};
            String c[] = {"", "C", "CC", "CCC", "CD",
                    "D", "DC", "DCC", "DCCC", "CM"};
            String x[] = {"", "X", "XX", "XXX", "XL",
                    "L", "LX", "LXX", "LXXX", "XC"};
            String i[] = {"", "I", "II", "III", "IV",
                    "V", "VI", "VII", "VIII", "IX"};

            // Converting to roman
            String thousands = m[num / 1000];
            String hundreds = c[(num % 1000) / 100];
            String tens = x[(num % 100) / 10];
            String ones = i[num % 10];

            String ans = thousands + hundreds + tens + ones;

            return ans;
        }
    }