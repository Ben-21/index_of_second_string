package model;

public class SecondString {


    public int secondSymbol(String word, char letter) {

        //Init Stringbuilder for deleting letter
        //Init first index of letter
        //Init variable result
        StringBuilder sb = new StringBuilder(word);
        int firstIndex = word.indexOf(letter);
        int result = -1;

        //check if letter is in the word and delete if true
        if (firstIndex != -1) {
            sb.deleteCharAt(firstIndex);
            word = sb.toString();
        }
        //check if letter is still in the word and give back index + 1
        int secondIndex = word.indexOf(letter);
        if (secondIndex != -1) {
            result = word.indexOf(letter) + 1;
        }
        return result;
    }
}
