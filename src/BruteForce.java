import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class BruteForce {
    public static void main(String[] args) throws IOException {
        String regex = "^[A-Я]([a-яА-ЯЁё\\s:\"!?()-]|[.,]\\s)*[.!?]$";
        String line;
        String lineBruteForce = null;
        char count = 1;
        char bruteForce = 0;
        int max = Integer.MAX_VALUE;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("cipher.txt"))) {
            while ((line = reader.readLine()) != null) {
                lineBruteForce = line;
            }

            while (count<max) {
                count++;
                if (Pattern.matches(regex, stringBuilder)) {
                    continue;
                }for (int i = 0; i < lineBruteForce.length(); i++) {
                    bruteForce = (char) (lineBruteForce.charAt(i) - count);
                    stringBuilder.append(bruteForce);
                }System.out.println(stringBuilder);
            }
        }

    }
}


