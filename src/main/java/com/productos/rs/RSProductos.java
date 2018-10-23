package com.productos.rs;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.dto.ProductoRS;

@Path("/")
@WebService
@Produces({"application/json","application/xml"})
public interface RSProductos {
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/listarProductoCodigo/{id}/{estado}/{descripcion}")
	public ProductoRS listarProductoCodigo (@Context UriInfo uri);

	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/listarProductoDescripcion/{codigo}/{nombre}")
	public ProductoRS listarProductoDescripcion (@Context UriInfo uri);
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/listarProductoNombre/{codigo}/{nombre}")
	public ProductoRS listarProductoNombre (@Context UriInfo uri);

}