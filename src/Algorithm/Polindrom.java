package Algorithm;

public class Polindrom {

    public static boolean isPolindrom(String word) {

        boolean res = false;

        char[] array = word.toCharArray();

        for(int i = 0; i < array.length/2; i++ ) {

            if(array[i] !=array[array.length-1-i]) {

                res = false;
                return res;

            }
        }
        res = true;
        return res;


    }
}
