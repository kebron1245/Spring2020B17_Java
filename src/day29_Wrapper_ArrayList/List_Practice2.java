package day29_Wrapper_ArrayList;

import Resources.Library;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
          /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */
        ArrayList<Integer> score1 = new ArrayList<>();

        score1.add(9);
        score1.add(6);
        score1.add(10);
        score1.add(29);
        score1.add(18);


        int Maximum = score1.get(0);

        for (int i = 0; i < score1.size(); i++) {
            if (score1.get(i) > Maximum) {
                Maximum = score1.get(i);
            }
        }
        System.out.println(Maximum);
        System.out.println("=======================================");

        int maximum2 = Integer.MIN_VALUE;
        for (Integer each : score1) {
            if (each > maximum2) {
                maximum2 = each;
            }
        }
        System.out.println(maximum2);
        System.out.println("=============================================");

        ArrayList<Integer> score2 = new ArrayList<>();
        score2.add(12);
        score2.add(15);
        score2.add(12);

        int maximum3 = Library.max(score2);      // method called to solve
        System.out.println(maximum3);


    }
            public static int max(ArrayList<Integer>score) {
        int Maximum = score.get(0);

        for (int i = 0; i < score.size(); i++) {
            if (score.get(i) > Maximum) {
                Maximum = score.get(i);
            }
        }
        return Maximum;
    }
}