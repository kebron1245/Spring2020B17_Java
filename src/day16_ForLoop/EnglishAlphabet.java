package day16_ForLoop;

public class EnglishAlphabet {
    public static void main(String[] args) {

        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");
        }

        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }

        for(char ch ='a'; ch<= 'z'; ch++){
            System.out.print(ch+" ");
        }

    }

}
