package com.divya.vm.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divya.vm.entity.Item;
import com.divya.vm.service.ItemService;

@Component
@Path("items")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ItemResource {
	@Autowired
	private ItemService itemService;
	@GET
	public List<Item> getAllItems() {
		return itemService.getAll();
	}
	@POST
	public int addItem(Item item) {
		return itemService.addItem(item);
	}
	
}
