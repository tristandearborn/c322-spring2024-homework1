package problems;

public class Problem3 {
    public static void main(String[] args){
    }
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
}

