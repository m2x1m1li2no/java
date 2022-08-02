package exercises789.inputOutput;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderClass {

    public void read() {
        try {
            FileReader readFile = new FileReader("C:\\Users\\Maxi\\Desktop\\Java\\javaFile.txt");
            int r = 0;

            while (r != -1){
                r = readFile.read();
                char l = (char)r;
                System.out.print(l);
            }
            readFile.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
