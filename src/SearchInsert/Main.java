package SearchInsert;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            } else if (i == 0 && target < nums[i]) {
                index = 0;
                break;
            } else if (i == nums.length - 1 && target > nums[i]) {
                index = nums.length;
                break;
            } else if (i < nums.length - 1 && target > nums[i] && target < nums[i + 1]) {
                index = i + 1;
                break;
            }
        }

        System.out.println("A posição de inserção para " + target + " é: " + index);
    }
}
