
package org.datacontract.schemas._2004._07;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Productos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Productos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ciudadEspectaculo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="descripcionEspectaculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="espectaculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaEspectaculo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaLlegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Productos", propOrder = {
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
public class Productos {

    @XmlElement(name = "Id")
    protected BigDecimal id;
    protected BigDecimal ciudadEspectaculo;
    @XmlElementRef(name = "descripcionEspectaculo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionEspectaculo;
    @XmlElementRef(name = "espectaculo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> espectaculo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEspectaculo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLlegada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaSalida;
    @XmlElementRef(name = "pathImagen", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pathImagen;
    protected BigDecimal tipoEspectaculo;
    protected BigDecimal tipoHospedaje;
    protected BigDecimal tipoTransporte;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadEspectaculo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCiudadEspectaculo() {
        return ciudadEspectaculo;
    }

    /**
     * Define el valor de la propiedad ciudadEspectaculo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCiudadEspectaculo(BigDecimal value) {
        this.ciudadEspectaculo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEspectaculo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionEspectaculo() {
        return descripcionEspectaculo;
    }

    /**
     * Define el valor de la propiedad descripcionEspectaculo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionEspectaculo(JAXBElement<String> value) {
        this.descripcionEspectaculo = value;
    }

    /**
     * Obtiene el valor de la propiedad espectaculo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEspectaculo() {
        return espectaculo;
    }

    /**
     * Define el valor de la propiedad espectaculo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEspectaculo(JAXBElement<String> value) {
        this.espectaculo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEspectaculo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEspectaculo() {
        return fechaEspectaculo;
    }

    /**
     * Define el valor de la propiedad fechaEspectaculo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEspectaculo(XMLGregorianCalendar value) {
        this.fechaEspectaculo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaLlegada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * Define el valor de la propiedad fechaLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaLlegada(XMLGregorianCalendar value) {
        this.fechaLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSalida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Define el valor de la propiedad fechaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaSalida(XMLGregorianCalendar value) {
        this.fechaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad pathImagen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPathImagen() {
        return pathImagen;
    }

    /**
     * Define el valor de la propiedad pathImagen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPathImagen(JAXBElement<String> value) {
        this.pathImagen = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEspectaculo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoEspectaculo() {
        return tipoEspectaculo;
    }

    /**
     * Define el valor de la propiedad tipoEspectaculo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoEspectaculo(BigDecimal value) {
        this.tipoEspectaculo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoHospedaje.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoHospedaje() {
        return tipoHospedaje;
    }

    /**
     * Define el valor de la propiedad tipoHospedaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoHospedaje(BigDecimal value) {
        this.tipoHospedaje = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransporte.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoTransporte() {
        return tipoTransporte;
    }

    /**
     * Define el valor de la propiedad tipoTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoTransporte(BigDecimal value) {
        this.tipoTransporte = value;
    }

}
