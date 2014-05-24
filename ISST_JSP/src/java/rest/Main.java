package rest;

import java.net.URI;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class Main {
	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		UriBuilder builder = UriBuilder
				.fromPath("http://localhost:8080/isst/receta");
		URI uri = builder.clone().queryParam("pacienteID", "bliblelbe")
				.build();

		WebTarget r = client.target(uri);
		System.out.println("URI: " + uri);

		Recetas recetas = r.request(MediaType.APPLICATION_JSON_TYPE).get(
				Recetas.class);
		
		
		System.out.println(recetas);
	}
	
	public void getRecetas(String pacienteId){
		Client client = ClientBuilder.newClient();
		UriBuilder builder = UriBuilder
				.fromPath("http://localhost:8080/isst/receta");
		URI uri = builder.clone().queryParam("pacienteID", pacienteId)
				.build();

		WebTarget r = client.target(uri);
		System.out.println("URI: " + uri);

		Recetas recetas = r.request(MediaType.APPLICATION_JSON_TYPE).get(
				Recetas.class);
		
		
		System.out.println(recetas);
	}

	public void postReceta(String pacienteId){
		Client client = ClientBuilder.newClient();
		UriBuilder builder = UriBuilder
				.fromPath("http://localhost:8080/isst/receta");
		URI uri = builder.clone().queryParam("pacienteID", pacienteId)
				.build();

		WebTarget r = client.target(uri);
		System.out.println("URI: " + uri);

		Recetas recetas = r.request(MediaType.APPLICATION_JSON_TYPE).get(
				Recetas.class);
		
		
		System.out.println(recetas);
	}
	
}