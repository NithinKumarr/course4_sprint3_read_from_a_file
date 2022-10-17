import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
static void Readpoemfromafile(String filename){
    try{
        FileInputStream fileInputStream=new FileInputStream(filename);
        int line=0;
        while((line=fileInputStream.read())!=-1){
            char data=(char) line;
            System.out.print(data);
        }
    }
    catch (IOException e) {
        System.out.println(e.getMessage());
        System.out.println("file not found");
    }
}

    public static void main(String[] args) throws IOException{
        Readpoemfromafile("C:\\Users\\nithi\\Desktop\\NIIT Home Work\\balled.txt");
    }
    }


