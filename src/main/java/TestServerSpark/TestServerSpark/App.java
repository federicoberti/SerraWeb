package TestServerSpark.TestServerSpark;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		RestAPI rs = new RestAPI();
    		rs.start();
    		get("/hello", (req, res) -> "Hello World");
        System.out.println( "Hello World!" );
    }
}
