package com.capgemini;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hi")
public class HelloWorldService 
{
  
@GET
@Produces("text/html")
 public Student getInfo() 
{
Student s=new Student();
s.setId(11);
s.setName("ajay");
return s;
        }
  }