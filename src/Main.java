import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String simvol = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя .,””:-!? ";
        Scanner system = new Scanner(System.in);
        System.out.println("Введите текст, который хотите зашифровать");
        String textForCoding = system.nextLine();
        List<String> textGoCoding = Arrays.asList(textForCoding.split(""));
        List<String> alfavit = Arrays.asList(simvol.split(""));
        if (alfavit.containsAll(textGoCoding)) {
             System.out.println("Принял, пишу!");
              try (FileWriter writer = new FileWriter("text.txt")) {
             writer.write(textForCoding);
            }
        } else {
            System.out.println("Принимаем текст только на кириллице и использовать: .,””:-!? символы");
            System.exit(0);
        }
        System.out.println("Введите ключ:");
        Cipher.getShifr();
        System.out.println("______________________________________________________________________________");
        deShifrator.getDeshifr();
    }
}

