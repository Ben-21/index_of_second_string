package model;

public class SecondString {


    public int secondSymbol(String word, char letter) {

        StringBuilder sb = new StringBuilder(word);
        int firstIndex = word.indexOf(letter);
        int result = -1;


        if (firstIndex != -1) {
            sb.deleteCharAt(firstIndex);
            word = sb.toString();
        }
        int secondIndex = word.indexOf(letter);
        if (secondIndex != -1) {
            result = word.indexOf(letter) + 1;
        }


        return result;


    }


}
