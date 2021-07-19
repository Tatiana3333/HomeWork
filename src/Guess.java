import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Guess {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String selectedWord = words[(int)Math.floor(Math.random()*words.length)];

        System.out.println("Выберите одно из слов:");
        System.out.println(Arrays.toString(words));
        String myGuess;
        StringBuilder lettersInPlace;
        do {
            System.out.println("Как вы думаете, какое слово загадано?");
            myGuess = myScanner.nextLine();
            if (Objects.equals(myGuess, selectedWord)) {
                System.out.println("Правильно!");

            } else {
                lettersInPlace = new StringBuilder("###############");
                int shortestWordLenght;
                if (selectedWord.length()<myGuess.length()) {
                    shortestWordLenght = selectedWord.length();
                } else {
                    shortestWordLenght = myGuess.length();
                }
                for (int i=0;i<shortestWordLenght;i++){
                    if (myGuess.charAt(i)== selectedWord.charAt(i)) {
                        lettersInPlace.setCharAt(i,myGuess.charAt(i));
                    }
                }
                System.out.println("Вы не угадали(");
                System.out.println(lettersInPlace);
                System.out.println("Попробуйте еще раз!");
            }
        } while (!Objects.equals(myGuess, selectedWord));
    }
}

