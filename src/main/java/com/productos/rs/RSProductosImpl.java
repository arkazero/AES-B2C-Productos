package com.productos.rs;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import com.dto.ProductoRS;
import com.dto.Productos;




public class RSProductosImpl implements RSProductos {
	
	public ProductoRS listarProductoCodigo(UriInfo uri) {
			
		ProductoRS responsePro = new ProductoRS();
		
		MultivaluedMap<String, ?> paramMap = uri.getPathParameters();
		String id = (String) paramMap.getFirst("id");
		
	    
		
		responsePro.setCodigoProducto(Integer.parseInt(id));				
		
		return responsePro;
		
	
	}

	@Override
	public ProductoRS listarProductoDescripcion(UriInfo uri) {
		ProductoRS responsePro = new ProductoRS();
		
		MultivaluedMap<String, ?> paramMap = uri.getPathParameters();
		String nombre = (String) paramMap.getFirst("nombre");
	    
		responsePro.setNombreProducto(nombre);
		
		return responsePro;
	}

	@Override
	public ProductoRS listarProductoNombre(UriInfo uri) {
		ProductoRS responsePro = new ProductoRS();
		

		MultivaluedMap<String, ?> paramMap = uri.getPathParameters();
		String nombre = (String) paramMap.getFirst("nombre");
	    
		responsePro.setNombreProducto(nombre);
		
		return responsePro;
	}

	@Override
	public Productos crearProductoNuevo(Productos productoNuevo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoRS eliminarProductoCodigo(UriInfo uri) {
		
		ProductoRS responsePro = new ProductoRS();
		
		MultivaluedMap<String, ?> paramMap = uri.getPathParameters();
		String id = (String) paramMap.getFirst("id");
				
		responsePro.setCodigoProducto(Integer.parseInt(id));				
		
		return responsePro;
	}

	@Override
	public Boolean rankingProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos modificarProducto(Productos productoMod) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
