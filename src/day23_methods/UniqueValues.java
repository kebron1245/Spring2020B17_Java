package day23_methods;

public class UniqueValues {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C",};

        for (int j = 0; j < arr.length; j++) {        //last step

            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {      //1st step
                if (arr[i].equals(arr[j])) {
                    count2++;
                }
            }
                if (count2 == 1) {
                    System.out.println(arr[j]);
                }
            }

        System.out.println("====================================");
            for (String each2 : arr) {              //2nd step

                int count = 0;
                for (String each : arr) {          /*1st step*/
                    if (each.equals(each2)) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.println(each2);
                }

            }
        }
    }

