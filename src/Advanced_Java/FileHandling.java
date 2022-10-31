package Advanced_Java;
import java.io.File;
public class FileHandling {
    public static void main(String[] args) {
        File myfile = new File("FileHandling");
        try{
            myfile.createNewFile();
        }
        catch(Exception e){
            System.out.println("Unable to create the request");
            e.printStackTrace();
        }
    }
}
