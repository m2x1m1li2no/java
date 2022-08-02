package exercises789.inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class WriterClass {
    public void write() {
        String sentence = "Has logrado escribir en el archivo.";

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Maxi\\Desktop\\Java\\javaFile.txt");
            for (int i = 0; i < sentence.length(); i++){
                fileWriter.write(sentence.charAt(i));
            }
            fileWriter.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
