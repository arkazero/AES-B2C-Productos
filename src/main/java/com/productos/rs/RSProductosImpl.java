package com.productos.rs;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import com.dto.ProductoRS;



public class RSProductosImpl implements RSProductos {
	
	public ProductoRS listarProductoCodigo(UriInfo uri) {
			
		ProductoRS responsePro = new ProductoRS();
		
		MultivaluedMap<String, ?> paramMap = uri.getPathParameters();
		String id = (String) paramMap.getFirst("id");
		String estado = (String) paramMap.getFirst("estado");
	    String descripcion = (String) paramMap.getFirst("descripcion");
	    
		responsePro.setEstadoProducto(Integer.parseInt(estado));
		responsePro.setCodigoProducto(Integer.parseInt(id));				
		responsePro.setMensajeEstado(descripcion);
		
		return responsePro;
		
	
	}

	@Override
	public ProductoRS listarProductoDescripcion(UriInfo uri) {
		ProductoRS responsePro = new ProductoRS();
		
		MultivaluedMap<String, ?> paramMap = uri.getPathParameters();
		String id = (String) paramMap.getFirst("codigo");
		String nombre = (String) paramMap.getFirst("nombre");
	    
		responsePro.setCodigoProducto(Integer.parseInt(id));
		responsePro.setNombreProducto(nombre);
		
		return responsePro;
	}

	@Override
	public ProductoRS listarProductoNombre(UriInfo uri) {
		ProductoRS responsePro = new ProductoRS();
		

		MultivaluedMap<String, ?> paramMap = uri.getPathParameters();
		String id = (String) paramMap.getFirst("codigo");
		String nombre = (String) paramMap.getFirst("nombre");
	    
		responsePro.setCodigoProducto(Integer.parseInt(id));
		responsePro.setNombreProducto(nombre);
		
		return responsePro;
	}

}
