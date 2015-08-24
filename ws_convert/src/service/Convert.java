package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//test jersey
@Path("/banque")
public class Convert {
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		return "test";	
	}

	@GET
	@Path("/conversion/{montant}")
	@Produces(MediaType.APPLICATION_JSON)
	public double conversion(@PathParam("montant")double mt){
		return 1.32*mt;
	}
	
	
	@GET
	@Path("/infos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getinfos(){
		List<String> liste = new ArrayList<>();
		liste.add("jeux videos");
		liste.add("autre jeu");
		liste.add("jeux videos");
		return liste;
	}
}

