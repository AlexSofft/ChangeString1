import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Sentence1 {
/**В каждом слове текста k-ю букву заменить заданным символом. Если k
 больше либо ровно длины слова, корректировку не выполнять*/
    private String text;

    public Sentence1(String text) {
        this.text = text;
    }

    public String[] getWords() {
        return text.split(" ");
    }

    public String[] getChars(String word) {
        return word.split("");
    }

    public Boolean checkChar(String wordChar) {
        Pattern pattern = Pattern.compile("(\\?|\\.|!|,)");
        return pattern.matcher(wordChar).find();
    }

    public void replaceChar(String newChar, int pos) {
        String[] words = getWords();
        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            //------new code
            int len = word.length();
            if (checkChar(word)) {
                len -= 1;
            }
            //-----
            if (len >= pos) {  // если нужно просто >
                String[] wordChars = getChars(word);
                wordChars[pos - 1] = newChar;
                words[i] = String.join("", wordChars);
            }

        }
        System.out.print(String.join(" ", words));
    }
}