
package com.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.cxf.jaxrs.ext.xml.XMLName;


/**
 * <p>Clase Java para ProductoMI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProductoMI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EstadoProducto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MensajeEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "productoRS")
@XmlType(name = "productoRS", propOrder = {
    "codigoProducto",
    "estadoProducto",
    "mensajeEstado",
    "nombreProducto"
})
public class ProductoRS {

    @XmlElement(name = "CodigoProducto")
    protected Integer codigoProducto;
    @XmlElement(name = "EstadoProducto")
    protected Integer estadoProducto;
    @XmlElement(name = "MensajeEstado")    
    protected String mensajeEstado;
    @XmlElement(name = "NombreProducto")    
    protected String nombreProducto;
    
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Integer getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(Integer codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public Integer getEstadoProducto() {
		return estadoProducto;
	}
	public void setEstadoProducto(Integer estadoProducto) {
		this.estadoProducto = estadoProducto;
	}
	public String getMensajeEstado() {
		return mensajeEstado;
	}
	public void setMensajeEstado(String mensajeEstado) {
		this.mensajeEstado = mensajeEstado;
	}
      
	
    	
}