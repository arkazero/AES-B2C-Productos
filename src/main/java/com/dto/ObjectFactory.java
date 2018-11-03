package com.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
	
	private final static QName _CrearCliente_QNAME = new QName("", "productoRS");
	private final static QName _CrearClienteNuevo_QNAME = new QName("", "productos");
	
	public ObjectFactory() {
	}
	
	/**
     * Create an instance of {@link OrdenInfo }
     * 
     */
    public ProductoRS createProductoRS() {
        return new ProductoRS();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productoRS")
    public JAXBElement<ProductoRS> createProductoRS(ProductoRS value) {
        return new JAXBElement<ProductoRS>(_CrearCliente_QNAME, ProductoRS.class, null, value);
    }
    
    /**
     * Create an instance of {@link OrdenInfo }
     * 
     */
    public Productos createProductos() {
        return new Productos();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link createProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productos")
    public JAXBElement<Productos> createCrearProductos(Productos value) {
        return new JAXBElement<Productos>(_CrearClienteNuevo_QNAME, Productos.class, null, value);
    }
}
