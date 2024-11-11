import java.io.FileWriter;
import java.io.IOException;

public class testfile1{
    public static void main(String [] args){
        try {
            FileWriter myWriter = new FileWriter("File1.txt");
            myWriter.write("First Write.");
            myWriter.close();
            System.out.println("Successful Write.");
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}