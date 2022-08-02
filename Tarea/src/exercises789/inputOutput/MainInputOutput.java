package exercises789.inputOutput;
import java.io.IOException;

public class MainInputOutput {
    public static void main(String[] args) throws IOException {
        ReaderClass reading = new ReaderClass();

        WriterClass writing = new WriterClass();
        writing.write();

        reading.read();

    }
}