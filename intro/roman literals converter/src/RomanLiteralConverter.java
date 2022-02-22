import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;

public class RomanLiteralConverter {
    public static void main(String[] args) {

    }

    public static String integerToRoman(int num) {



        HashMap<Integer, String> figures = new HashMap();
        figures.put(1000,"M");
        figures.put(900,"CM");
        figures.put(500,"D");
        figures.put(400,"CD");
        figures.put(100,"C");
        figures.put(90,"XC");
        figures.put(50,"L");
        figures.put(40,"XL");
        figures.put(10,"X");
        figures.put(9,"IX");
        figures.put(5,"V");
        figures.put(4,"IV");
        figures.put(1,"I");
        TreeMap<Integer, String> sorted = new TreeMap<>(Collections.reverseOrder());
        StringBuilder roman = new StringBuilder();
        sorted.putAll(figures);
        for (int key: sorted.keySet()
             ) {
            while(num >= key) {
                num -= key;
                roman.append(figures.get(key));
            }
        }
        return roman.toString();
    }
    public static int  romanToInteger(String roman){
        roman = roman.toUpperCase(Locale.ROOT);
        HashMap<Character,Integer> figures = new HashMap<>();
        figures.put('I',1);
        figures.put('V',5);
        figures.put('X',10);
        figures.put('L',50);
        figures.put('C',100);
        figures.put('D',500);
        figures.put('M',1000);

        int result=0;

        for(int i=0;i<roman.length();i++)
        {
            char ch = roman.charAt(i);

            if(i>0 && figures.get(ch) > figures.get(roman.charAt(i-1)))
            {
                result += figures.get(ch) - 2*figures.get(roman.charAt(i-1));
            }

            // Case 2: just add the corresponding number to result.
            else
                result += figures.get(ch);
        }

        return result;

    }
    public static String addition(String roman1,String roman2){
        int sum = romanToInteger(roman1) + romanToInteger(roman2);
        return integerToRoman(sum);

    }
    public static String subtraction(String roman1,String roman2){
        int difference = romanToInteger(roman1) - romanToInteger(roman2);
        return integerToRoman(difference);
    }
    public static String multiplication(String roman1,String roman2){
        int product = romanToInteger(roman1) * romanToInteger(roman2);
        return integerToRoman(product);
    }
    public static String division(String roman1,String roman2){
        int quotient = romanToInteger(roman1)/ romanToInteger(roman2);
        return integerToRoman(quotient);
    }
}
