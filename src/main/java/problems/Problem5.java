package problems;

public class Problem5 {
    public static void main(String[] args){
    }

    public static boolean complete(String s){
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
}
