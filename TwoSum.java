/**
 * TwoSum
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