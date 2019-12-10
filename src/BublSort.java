public class BublSort {

    public static void bublSort(int[] array) {

        boolean isSort = false;
        int count = 0;

        while(isSort == false) {

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i + 1] < array[i]) {

                    int storage = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = storage;
                    count = count + 1;


                }

            }

            if (count > 0) {
                isSort = false;
                count = 0;
            } else isSort = true;
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }



    }
}
