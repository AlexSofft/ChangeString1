import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**В каждом слове текста k-ю букву заменить заданным символом. Если k
 больше длины слова, корректировку не выполнять*/
public class Sentence
{
    private String text;
    public Sentence(String text) {
        this.text = text;
    }
    public String[] getWords() {
        return text.split(" ");
    }
    public String[] getChars(String word) {
        return word.split("");
    }
    public Boolean checkChar(String wordChar) {
        return wordChar.matches("\\?|,|\\.|\\!");
}
    public void replaceChar(String newChar, int pos) {
        String[] words = getWords();
        for(int i = 0; i < words.length; i++) {

                String word = words[i];
                if (word.length() >= pos) {
                    String[] wordChars = getChars(word);
                    if (!checkChar(wordChars[pos-1])) {
                        wordChars[pos - 1] = newChar;
                    }
                    words[i] = String.join("", wordChars);
                }

        }
        System.out.print(String.join(" ", words));
    }
}





//    private ArrayList<String> sentsList = new ArrayList<String>();
//
//    public Sentence(String text) {
//        getSent(text);
//    }
//
//    public void getSent(String text) {
//        Pattern pattern = Pattern.compile("(\\?|\\.|!)\\s");
//        Matcher matcher = pattern.matcher(text);
//        int startPos = 0;
//        int endPos = 0;
//        while (matcher.find()) {
//            endPos = matcher.end();
//            String foundSent = text.substring(startPos, endPos);
//            sentsList.add(removeSymbols(foundSent));
//            startPos = endPos;
//        }
//        if (endPos < text.length()) {
//            String foundSent = text.substring(startPos);
//            sentsList.add(removeSymbols(foundSent));
//        }
//    }
//
//    public String removeSymbols(String sent) {
//        return sent.replaceAll("( |\\t){1,}", " ").trim();
//    }
//
//    public void changeChar(int num, String symb){
//        for ()
