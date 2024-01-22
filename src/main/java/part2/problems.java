package part2;

import java.util.HashMap;

public class problems {
//Problem 1
    public static int[] addToTarget(int[] nums, int target){
        int[] arr = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    if (i!=j) {
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }
                }
            }
        }
        return arr;
    }
    //Problem 2
    public static boolean palindrome(int x){
        String xString = String.valueOf(x);
        int beginning = 0;
        int end = xString.length()-1;
        while(beginning<end){
            if(xString.charAt(beginning)!=xString.charAt(end)){
                return false;
            }
            beginning++;
            end--;
        }
        return true;
    }
    //Problem 3
    public static String prefix(String[] arr){
        if (arr.length == 0){
            return "";
        }
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++){
            int j = 0;
            while (j < prefix.length() && j < arr[i].length() && prefix.charAt(j) == arr[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);
            if (prefix.equals("")) {
                break;
            }
        }
        return prefix;
    }
    //Problem 4
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
    //Problem 5
    public static boolean isValid(String s){
        int numOpen = 0;
        for (char x : s.toCharArray()){
            if (x == '(' || x == '{' || x == '[') {
                numOpen++;
            } else {
                numOpen--;
                if (numOpen < 0) {
                    return false;
                }
                char whatOpens = whatOpensFun(x);
                if (whatOpens == 'F'){
                    return false;
                }
                if (numOpen > 0 && whatOpens != s.charAt(numOpen-1)){
                    return false;
                }
            }
        }
        return numOpen == 0;
    }

    private static char whatOpensFun(char closingBracket){
        return switch (closingBracket){
            case ')' -> '(';
            case '}' -> '{';
            case ']' -> '[';
            default -> 'F';
        };
    }
    //Problem 6
    //Cannot seem to figure out and short on time.
    //Problem 7
    public static int[] increment(int[] digits){
        digits[digits.length-1]++;
        for (int i = digits.length-1; i > 0; i--) {
            if (digits[i] >= 10) {
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        if (digits[0] >= 10){
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            arr[1] = digits[0]-10;
            System.arraycopy(digits, 1, arr, 2, digits.length-1);
            return arr;
        }
        return digits;
    }
}

