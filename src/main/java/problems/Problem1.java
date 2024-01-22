package problems;

public class Problem1 {
    public static void main(String[] args){
    }
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
}
