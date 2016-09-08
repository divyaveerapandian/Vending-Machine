package com.divya.vm.resource;

import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/")
public class Test {
 public void get(){
	 System.out.println("Hello World");
 }
}
