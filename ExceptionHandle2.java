import java.io.IOException;

public class ExceptionHandle2 {
    public static void main(String []x) throws Exception{//compile time exception.
        //throws keyword is use to report java exception
        System.out.println("a");
        throw  new IOException();//throw is use to exception class throwing the object
    }
}
