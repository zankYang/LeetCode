import java.lang.reflect.Array;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "IVXLCDM";
        int[] romanValue = {1,5,10,50,100,500,1000};
        String number = "IIM";
        String[] numberSplit = number.split(""); 
        int valor = 0;
        for (int i = 0; i < number.length(); i++) {
            if (i==) {
                
            }
            if (roman.indexOf(numberSplit[i])>roman.indexOf(numberSplit[i+1])) {
                valor += romanValue[roman.indexOf(numberSplit[i])];
            }else

        }
    }
}
