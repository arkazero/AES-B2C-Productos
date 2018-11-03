package com.productos.rs;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.dto.ProductoRS;
import com.dto.Productos;


@Path("/")
@WebService
@Produces({"application/json","application/xml"})
public interface RSProductos {
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/listarProductoCodigo/{id}")
	public ProductoRS listarProductoCodigo (@Context UriInfo uri);

	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/listarProductoDescripcion/{nombre}")
	public ProductoRS listarProductoDescripcion (@Context UriInfo uri);
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/listarProductoNombre/{nombre}")
	public ProductoRS listarProductoNombre (@Context UriInfo uri);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
    @Path("/crearProductoNuevo") 
	public Productos crearProductoNuevo (Productos productoNuevo);
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
    @Path("/eliminarProductoCodigo/{id}") 
	public ProductoRS eliminarProductoCodigo (@Context UriInfo uri);
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/rankingProducto")
	public Boolean rankingProducto ();
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/modificarProducto") 
	public Productos modificarProducto (Productos productoMod);
	
}