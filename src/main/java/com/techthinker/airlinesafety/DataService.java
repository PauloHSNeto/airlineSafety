package com.techthinker.airlinesafety;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DataService {
	
	private final String URL_DATA ="https://raw.githubusercontent.com/fivethirtyeight/data/master/airline-safety/airline-safety.csv";

	
	
	
	
	
	
	
	public void fetchData() throws IOException, InterruptedException 
	{
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(URI.create(URL_DATA)).build();
		HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
		
		StringReader csvReader = new StringReader(response.body());
		
	}
	
}
