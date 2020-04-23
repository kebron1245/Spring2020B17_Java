package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {

        String[] wildAnimals = {"Lion", "Tiger", "Leopard", "Jaguar", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String[][] zoo = {wildAnimals, birds};

        String kfc = zoo[1][3];
        System.out.println(kfc);
        System.out.println("=============================================");

        for (String eachBirds : zoo[1]) {
            if (eachBirds.equals("Chicken")) {
                continue;
            }
            System.out.println(eachBirds);
        }
        System.out.println("=================================================");
        for(String eachWild : zoo[0]){
           if(eachWild.contains("Tiger")){
               continue;
            }
            System.out.println(eachWild);
        }





    }

}