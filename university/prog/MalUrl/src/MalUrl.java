import java.net.MalformedURLException;
import java.net.URL;
//import  java.net.
public class MalUrl {
    public static void main(String args[]){
        try {
            URL url = new URL("httssp://google.com");
            System.out.println("url Protocol : " + url.getProtocol());
        }catch (MalformedURLException e){
            System.out.println("Correct The Protocol"+e);
        }
    }
}

