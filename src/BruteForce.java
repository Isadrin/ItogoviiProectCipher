import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class BruteForce {
    public static void bruteForce() throws IOException {
        String line;
        String text = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("cipher.txt"))) {
            while ((line = reader.readLine()) != null) {
                text = line;
            }
        }
        int key = 0;
        String s1;
        String regex = "^[A-Я]([a-яА-ЯЁё\\s:\"!?()-]|[.,]\\s)*[.!?]$";
        char[] simvol = new char[text.length()];
        do {
            key++;
            for (int i = 0; i < text.length(); i++) {
                simvol[i] = (char) ((int) text.charAt(i) - key);
            }
            s1 = String.copyValueOf(simvol);
        } while (!(Pattern.matches(regex, s1)));
        System.out.println("Расшифровал. Вак ключ: " + key);
        System.out.println(s1);
        boolean flag = Pattern.matches(regex, s1);
        System.out.println(flag);
    }
}

