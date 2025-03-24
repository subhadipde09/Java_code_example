import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileH1 {
    public static void main(String []x) throws IOException {
        File f1 = new File("a.text");
        f1.createNewFile();
        System.out.println(f1.exists());
        FileOutputStream h1 = new FileOutputStream(f1, true);
        String s1 = " SUBHADIP DE";
        char c1[] = s1.toCharArray();
        int i;
        for (i = 0; i < c1.length; i++) {
            h1.write(c1[i]);
        }
        h1.close();
    }
}
