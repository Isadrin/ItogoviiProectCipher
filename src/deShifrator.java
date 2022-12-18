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
                char[] ciperNext = line.toCharArray();
                for (int i = 0; ciperNext.length > i; i++) {
                    ciperNext[i] = (char) (ciperNext[i] - cipher.keyDechiphr);
                    stringBuilder.append(ciperNext[i]);
                }
                System.out.println("Ваше расшифрованное послание: " + stringBuilder);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
