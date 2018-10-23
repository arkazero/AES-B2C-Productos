
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ProductoFiltro;


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
 *         &lt;element name="ObjProResultado" type="{http://schemas.datacontract.org/2004/07/}ProductoFiltro" minOccurs="0"/&gt;
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
    "objProResultado"
})
@XmlRootElement(name = "listarProductoNombre")
public class ListarProductoNombre {

    @XmlElementRef(name = "ObjProResultado", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductoFiltro> objProResultado;

    /**
     * Obtiene el valor de la propiedad objProResultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductoFiltro }{@code >}
     *     
     */
    public JAXBElement<ProductoFiltro> getObjProResultado() {
        return objProResultado;
    }

    /**
     * Define el valor de la propiedad objProResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductoFiltro }{@code >}
     *     
     */
    public void setObjProResultado(JAXBElement<ProductoFiltro> value) {
        this.objProResultado = value;
    }

}
