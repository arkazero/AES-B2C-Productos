
package com.dto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para productos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ciudadEspectaculo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="descripcionEspectaculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="espectaculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pathImagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoEspectaculo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tipoHospedaje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tipoTransporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */

/**
*         &lt;element name="fechaEspectaculo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
*         &lt;element name="fechaLlegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
*         &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
*/

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "productos")
@XmlType(name = "productos", propOrder = {
    "id",
    "ciudadEspectaculo",
    "descripcionEspectaculo",
    "espectaculo",
    "fechaEspectaculo",
    "fechaLlegada",
    "fechaSalida",
    "pathImagen",
    "tipoEspectaculo",
    "tipoHospedaje",
    "tipoTransporte"
})

//"fechaEspectaculo",
//"fechaLlegada",
//"fechaSalida",
public class Productos {
	
	
	protected String id;
    protected String ciudadEspectaculo;
    protected String descripcionEspectaculo;
    protected String espectaculo;
    protected String fechaEspectaculo;
    protected String fechaLlegada;
    protected String fechaSalida;
    protected String pathImagen;
    protected String tipoEspectaculo;
    protected String tipoHospedaje;
    protected String tipoTransporte;
    
    
    
	public String getFechaEspectaculo() {
		return fechaEspectaculo;
	}
	public void setFechaEspectaculo(String fechaEspectaculo) {
		this.fechaEspectaculo = fechaEspectaculo;
	}
	public String getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCiudadEspectaculo() {
		return ciudadEspectaculo;
	}
	public void setCiudadEspectaculo(String ciudadEspectaculo) {
		this.ciudadEspectaculo = ciudadEspectaculo;
	}
	public String getDescripcionEspectaculo() {
		return descripcionEspectaculo;
	}
	public void setDescripcionEspectaculo(String descripcionEspectaculo) {
		this.descripcionEspectaculo = descripcionEspectaculo;
	}
	public String getEspectaculo() {
		return espectaculo;
	}
	public void setEspectaculo(String espectaculo) {
		this.espectaculo = espectaculo;
	}
	public String getPathImagen() {
		return pathImagen;
	}
	public void setPathImagen(String pathImagen) {
		this.pathImagen = pathImagen;
	}
	public String getTipoEspectaculo() {
		return tipoEspectaculo;
	}
	public void setTipoEspectaculo(String tipoEspectaculo) {
		this.tipoEspectaculo = tipoEspectaculo;
	}
	public String getTipoHospedaje() {
		return tipoHospedaje;
	}
	public void setTipoHospedaje(String tipoHospedaje) {
		this.tipoHospedaje = tipoHospedaje;
	}
	public String getTipoTransporte() {
		return tipoTransporte;
	}
	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

    

}
