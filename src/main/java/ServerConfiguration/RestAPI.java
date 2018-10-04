package ServerConfiguration;

import static spark.Spark.*;

public class RestAPI {
	
	public RestAPI() {
		
	}

	public void start() {
		get("/ciao", (req, res) -> "BellaZio");
		get("/hello", (req, res) -> "Hello World");
	}
	

}
