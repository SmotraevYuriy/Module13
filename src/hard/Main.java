package hard;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("medium3In.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("medium3Out.txt"))) {
            List<String> words = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("[. ,]+");
                words.addAll(Arrays.asList(parts));
                Collections.reverse(words);
                for (String word : words) {
                    writer.write(word + " ");
                }
                writer.newLine();
                words.clear();
            }

            System.out.println("Преобразование завершено.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
