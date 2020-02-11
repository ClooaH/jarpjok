import javax.swing.*;
import java.net.URL;
import java.util.Scanner;

public class URLReader {
    public static void main(String[] args) {
        String url = JOptionPane.showInputDialog(null, "Where it is?","The Ultimate Textbrowser",JOptionPane.QUESTION_MESSAGE);
        try {
            URL resource = new URL(url);
            Scanner urlScanner = new Scanner(resource.openStream());
            while (urlScanner.hasNext()) {
                System.out.println(urlScanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
