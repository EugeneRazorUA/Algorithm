package Algorithm;

public class TwoSum {

    public static void sum(int[] array, int target){

        for (int i = 0; i < array.length-1; i++){
            for (int j = i+1; j < array.length; j++){

                if (array[i] + array[j] == target){
                    System.out.println(i + " " + j);
                }
            }
        }



    }
}
