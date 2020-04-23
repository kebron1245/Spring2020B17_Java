package day23_methods;

public class Methods {
    public static void main(String[] args) {


        printHello5();
        evenNumbers();

    }

    public static void printHello5() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
        public static void evenNumbers() {

            for (int x = 0; x <= 100; x++) {
                if(x%2==0){
                    System.out.print(x+" ");
                }else{
                    continue;
                }
            }

        }




    }

