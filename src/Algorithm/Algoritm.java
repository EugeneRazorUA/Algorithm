package Algorithm;

public class Algoritm {
    public void revers (String str) {
        char[] array = str.toCharArray();

        char storage;

        for(int i = 0; i <array.length/2; i++) {

            storage = array[i];

            array[i] = array[array.length -1-i];

            array[array.length -1-i] = storage;

        }

        String result =  new String(array);
        System.out.println(result);



    }


}
