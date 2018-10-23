
package org.datacontract.schemas._2004._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProductoResultado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProductoResultado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectProducto" type="{http://schemas.datacontract.org/2004/07/}Productos" minOccurs="0"/&gt;
 *         &lt;element name="ObjectProductoError" type="{http://schemas.datacontract.org/2004/07/}ProductoError" minOccurs="0"/&gt;
 *         &lt;element name="ProductoMinimo" type="{http://schemas.datacontract.org/2004/07/}ProductoMI" minOccurs="0"/&gt;
 *         &lt;element name="listarProductoCodigo" type="{http://schemas.datacontract.org/2004/07/}ArrayOfProductos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductoResultado", propOrder = {
    "objectProducto",
    "objectProductoError",
    "productoMinimo",
    "listarProductoCodigo"
})
public class ProductoResultado {

    @XmlElementRef(name = "ObjectProducto", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<Productos> objectProducto;
    @XmlElementRef(name = "ObjectProductoError", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductoError> objectProductoError;
    @XmlElementRef(name = "ProductoMinimo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductoMI> productoMinimo;
    @XmlElementRef(name = "listarProductoCodigo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductos> listarProductoCodigo;

    /**
     * Obtiene el valor de la propiedad objectProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Productos }{@code >}
     *     
     */
    public JAXBElement<Productos> getObjectProducto() {
        return objectProducto;
    }

    /**
     * Define el valor de la propiedad objectProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Productos }{@code >}
     *     
     */
    public void setObjectProducto(JAXBElement<Productos> value) {
        this.objectProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad objectProductoError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductoError }{@code >}
     *     
     */
    public JAXBElement<ProductoError> getObjectProductoError() {
        return objectProductoError;
    }

    /**
     * Define el valor de la propiedad objectProductoError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductoError }{@code >}
     *     
     */
    public void setObjectProductoError(JAXBElement<ProductoError> value) {
        this.objectProductoError = value;
    }

    /**
     * Obtiene el valor de la propiedad productoMinimo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductoMI }{@code >}
     *     
     */
    public JAXBElement<ProductoMI> getProductoMinimo() {
        return productoMinimo;
    }

    /**
     * Define el valor de la propiedad productoMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductoMI }{@code >}
     *     
     */
    public void setProductoMinimo(JAXBElement<ProductoMI> value) {
        this.productoMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad listarProductoCodigo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductos }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductos> getListarProductoCodigo() {
        return listarProductoCodigo;
    }

    /**
     * Define el valor de la propiedad listarProductoCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductos }{@code >}
     *     
     */
    public void setListarProductoCodigo(JAXBElement<ArrayOfProductos> value) {
        this.listarProductoCodigo = value;
    }

}
