package problems;

public class Problem7 {
    public static void main(String[] args){
    }
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