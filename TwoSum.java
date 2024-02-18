/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;
        boolean encontro = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]+array[j]==target) {
                    System.out.println("los digitos son [" + i + "] y [" + j + "]" );
                    encontro = true;
                    break;
                }
            }
            if (encontro) {
                break;
            }
        }
    }
}