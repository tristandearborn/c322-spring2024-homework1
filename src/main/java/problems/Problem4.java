package problems;

import java.util.HashMap;

public class Problem4 {
    public static void main(String[] args){
    }
    public static int romanToInteger(String roman){
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int num = romanValues.get(roman.charAt(roman.length()-1));
        for (int i = roman.length()-2; i >= 0; i--){
            if (romanValues.get(roman.charAt(i)) < romanValues.get(roman.charAt(i+1))){
                num -= romanValues.get(roman.charAt(i));
            }else{
                num += romanValues.get(roman.charAt(i));
            }
        }

        return num;
    }
}
