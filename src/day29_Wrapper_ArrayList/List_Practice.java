package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class List_Practice {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
                    shoppingList.add(  "Milk");     //size:1
                    shoppingList.add(  "Coffee");  //size:2
                    shoppingList.add(  "Bread");    //size:3
        System.out.println(shoppingList);

        for(int i = 0; i< shoppingList.size(); i++){ //0,1,2
            System.out.println(shoppingList.get(i));

        }
        System.out.println("==============================================");

        for(String each :shoppingList){
            System.out.println(each);
        }
        int lastIndex = shoppingList.size()-1;
             System.out.println(lastIndex);
    }
}
