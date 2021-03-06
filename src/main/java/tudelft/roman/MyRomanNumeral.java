package tudelft.roman;

import java.util.HashMap;

public class MyRomanNumeral {

    static HashMap<Character, Integer> digits = new HashMap<Character, Integer>();
    static {
        digits.put('I', 1);
        digits.put('V', 5);
        digits.put('X', 10);
        digits.put('L', 50);
        digits.put('C', 100);
        digits.put('D', 500);
        digits.put('M', 1000);
    }

    public int convert(String romanNumeral){
        int finalNumber = 0;
        int previousNumber = 0;

        for(int i = romanNumeral.length() - 1; i >= 0; i--){
            int currentNumber = digits.get(romanNumeral.charAt(i));
            if (currentNumber < previousNumber){
                finalNumber -= currentNumber;
            }
            else{
                finalNumber += currentNumber;
            }
            previousNumber = currentNumber;
        }
        return finalNumber;
        }
}
