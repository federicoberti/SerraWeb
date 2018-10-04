package ServerConfiguration;

import static spark.Spark.*;

public class ServerConfiguration {
	
	private int port = 8080;

	public ServerConfiguration() {
		port(this.port);
	}

	public ServerConfiguration(int port) {
		this.port=port;
		port(this.port);
	}
	
	public void start() {
		System.out.println("Server started at port "+this.port);
		System.out.println("UI loaded");
		staticFiles.location("/public");
		
		System.out.println("REST API activated");
		RestAPI rs = new RestAPI();
		rs.start();
	}
	
	public void stop() {
		stop();
	}
}
