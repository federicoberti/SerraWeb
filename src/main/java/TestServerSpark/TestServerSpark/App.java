package TestServerSpark.TestServerSpark;

import ServerConfiguration.ServerConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		ServerConfiguration server = new ServerConfiguration(8080);
    		server.start();
        System.out.println( "Hello World!" );
    }
}
