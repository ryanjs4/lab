import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab_3 {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static void main(String[] args) {
        String bigString = urlToString("http://erdani.com/tdpl/hamlet.txt");
        bigString = bigString.replace("\t", " ");
        bigString = bigString.replace("\n", " ");
        bigString = bigString.replace(",", " ");
        bigString = bigString.replace(".", " ");
        bigString = bigString.replace("[", " ");
        bigString = bigString.replace("]", " ");
        bigString = bigString.replace(";", " ");
        bigString = bigString.replace(":", " ");
        bigString = bigString.replace("?", " ");
        bigString = bigString.replace("-", " ");
        bigString = bigString.replace("(", " ");
        bigString = bigString.replace(")", " ");
        String[] words = bigString.split(" ");

        int count = 0;
        int empty = 0;
        for (int i = 0; i < words.length; i ++) {
            if (words[i].length() == 0) {
                continue;
            }
            //if (words[i].toLowerCase().equals("princes")) {
                //count++;
            //}
            count++;
            System.out.println(words[i]);
        }
        System.out.println(count);
    }
}
