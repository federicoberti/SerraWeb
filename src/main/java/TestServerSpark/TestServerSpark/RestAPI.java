package TestServerSpark.TestServerSpark;

import static spark.Spark.*;

public class RestAPI {
	
	public RestAPI() {
		
	}

	public void start() {
		staticFiles.location("/public");
		get("/ciao", (req, res) -> "BellaZio");
	}
	

}
