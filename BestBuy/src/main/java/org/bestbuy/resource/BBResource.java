package org.bestbuy.resource;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bestbuy.controller.BBController;

@Path("/checkout")
@Produces(MediaType.APPLICATION_JSON)
public class BBResource {
	
	BBController resourcehandler = new BBController();
	
	@GET
	public String test() {
		return "Please begin scanning your cart.";
	}

	
	@GET
	@Path("/pup")
	public Map<Character, Double> GetAllPerUnitPrice(){
		return resourcehandler.GetUnitPrice();
	}
	
	
	@GET
	@Path("/vp")
	public Map<Character, Double> GetAllVolumePrice(){
		return resourcehandler.GetVolumePrice();
	}
	
	
	@GET
	@Path("/{scancode}")
	public String ScanCart(@PathParam("scancode") String code) {
		return "Overall price of your cart is $"+ resourcehandler.CartPrice(code) + 
				".\nNumber of Products : "+ code.length();	
	}

}