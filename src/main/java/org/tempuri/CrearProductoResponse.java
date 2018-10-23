
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ProductoResultado;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crearProductoResult" type="{http://schemas.datacontract.org/2004/07/}ProductoResultado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crearProductoResult"
})
@XmlRootElement(name = "crearProductoResponse")
public class CrearProductoResponse {

    @XmlElementRef(name = "crearProductoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductoResultado> crearProductoResult;

    /**
     * Obtiene el valor de la propiedad crearProductoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductoResultado }{@code >}
     *     
     */
    public JAXBElement<ProductoResultado> getCrearProductoResult() {
        return crearProductoResult;
    }

    /**
     * Define el valor de la propiedad crearProductoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductoResultado }{@code >}
     *     
     */
    public void setCrearProductoResult(JAXBElement<ProductoResultado> value) {
        this.crearProductoResult = value;
    }

}
