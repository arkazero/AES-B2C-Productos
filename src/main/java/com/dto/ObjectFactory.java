package com.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
	
	private final static QName _CrearCliente_QNAME = new QName("", "productoRS");
	
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
}
