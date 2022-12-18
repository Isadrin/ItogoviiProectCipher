import java.io.*;
import java.util.Scanner;

public class Cipher {
    Integer key;
   static Integer keyDechiphr;

    public static Integer getShifr() {

        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"))) {
            String line;
            Cipher cipher = new Cipher();
            Scanner scanner = new Scanner(System.in);
            cipher.key = scanner.nextInt();

            while ((line = reader.readLine()) != null) {
                char[] cipherNext = line.toCharArray();
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; cipherNext.length > i; i++) {
                    cipherNext[i] = (char) (cipherNext[i] + cipher.key);
                    stringBuilder.append(cipherNext[i]);
                    keyDechiphr = cipher.key;
                }
                String text = stringBuilder.toString();
                FileOutputStream fileOutputStream = new FileOutputStream("cipher.txt");
                fileOutputStream.write(text.getBytes());
                fileOutputStream.close();
                System.out.println("Ваше зашифрованное послание: " + stringBuilder);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return keyDechiphr;
    }
}
