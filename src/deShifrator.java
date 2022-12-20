import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class deShifrator {

    static void getDeshifr() {

        try (BufferedReader reader = new BufferedReader(new FileReader("cipher.txt"))) {
            Cipher cipher = new Cipher();
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                char[] cipherNext = line.toCharArray();
                for (int i = 0; cipherNext.length > i; i++) {
                    cipherNext[i] = (char) (cipherNext[i] - cipher.keyDechiphr);
                    stringBuilder.append(cipherNext[i]);
                }
                System.out.println("Ваше расшифрованное послание: " + stringBuilder);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
