package problems;

public class Problem2 {
    public static void main(String[] args) {
    }

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
}
