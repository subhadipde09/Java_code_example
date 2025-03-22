import java.io.IOException;

public class ExceptionHandle2 {
    public static void main(String []x) throws Exception{//compile time exception.
        System.out.println("a");
        throw  new IOException();
    }
}
