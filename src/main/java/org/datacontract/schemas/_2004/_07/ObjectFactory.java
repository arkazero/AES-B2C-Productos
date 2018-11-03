
package org.datacontract.schemas._2004._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Productos_QNAME = new QName("", "Productos");
    private final static QName _ProductoResultado_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ProductoResultado");
    private final static QName _ProductoError_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ProductoError");
    private final static QName _ProductoMI_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ProductoMI");
    private final static QName _ArrayOfProductos_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfProductos");
    private final static QName _ProductoFiltro_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ProductoFiltro");
    private final static QName _ProductoErrorCodigoError_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CodigoError");
    private final static QName _ProductoErrorMensajeError_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MensajeError");
    private final static QName _ProductoFiltroNombreProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "NombreProducto");
    private final static QName _ProductoMIMensajeEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MensajeEstado");
    private final static QName _ProductoResultadoObjectProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ObjectProducto");
    private final static QName _ProductoResultadoObjectProductoError_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ObjectProductoError");
    private final static QName _ProductoResultadoProductoMinimo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ProductoMinimo");
    private final static QName _ProductoResultadoListarProductoCodigo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "listarProductoCodigo");
    private final static QName _ProductosDescripcionEspectaculo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "descripcionEspectaculo");
    private final static QName _ProductosEspectaculo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "espectaculo");
    private final static QName _ProductosPathImagen_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "pathImagen");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Productos }
     * 
     */
    public Productos createProductos() {
        return new Productos();
    }

    /**
     * Create an instance of {@link ProductoResultado }
     * 
     */
    public ProductoResultado createProductoResultado() {
        return new ProductoResultado();
    }

    /**
     * Create an instance of {@link ProductoMI }
     * 
     */
    public ProductoMI createProductoMI() {
        return new ProductoMI();
    }

    /**
     * Create an instance of {@link ProductoFiltro }
     * 
     */
    public ProductoFiltro createProductoFiltro() {
        return new ProductoFiltro();
    }

    /**
     * Create an instance of {@link ProductoError }
     * 
     */
    public ProductoError createProductoError() {
        return new ProductoError();
    }

    /**
     * Create an instance of {@link ArrayOfProductos }
     * 
     */
    public ArrayOfProductos createArrayOfProductos() {
        return new ArrayOfProductos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Productos")
    public JAXBElement<Productos> createProductos(Productos value) {
        return new JAXBElement<Productos>(_Productos_QNAME, Productos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ProductoResultado")
    public JAXBElement<ProductoResultado> createProductoResultado(ProductoResultado value) {
        return new JAXBElement<ProductoResultado>(_ProductoResultado_QNAME, ProductoResultado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ProductoError")
    public JAXBElement<ProductoError> createProductoError(ProductoError value) {
        return new JAXBElement<ProductoError>(_ProductoError_QNAME, ProductoError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoMI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ProductoMI")
    public JAXBElement<ProductoMI> createProductoMI(ProductoMI value) {
        return new JAXBElement<ProductoMI>(_ProductoMI_QNAME, ProductoMI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfProductos")
    public JAXBElement<ArrayOfProductos> createArrayOfProductos(ArrayOfProductos value) {
        return new JAXBElement<ArrayOfProductos>(_ArrayOfProductos_QNAME, ArrayOfProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ProductoFiltro")
    public JAXBElement<ProductoFiltro> createProductoFiltro(ProductoFiltro value) {
        return new JAXBElement<ProductoFiltro>(_ProductoFiltro_QNAME, ProductoFiltro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CodigoError", scope = ProductoError.class)
    public JAXBElement<String> createProductoErrorCodigoError(String value) {
        return new JAXBElement<String>(_ProductoErrorCodigoError_QNAME, String.class, ProductoError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MensajeError", scope = ProductoError.class)
    public JAXBElement<String> createProductoErrorMensajeError(String value) {
        return new JAXBElement<String>(_ProductoErrorMensajeError_QNAME, String.class, ProductoError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "NombreProducto", scope = ProductoFiltro.class)
    public JAXBElement<String> createProductoFiltroNombreProducto(String value) {
        return new JAXBElement<String>(_ProductoFiltroNombreProducto_QNAME, String.class, ProductoFiltro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MensajeEstado", scope = ProductoMI.class)
    public JAXBElement<String> createProductoMIMensajeEstado(String value) {
        return new JAXBElement<String>(_ProductoMIMensajeEstado_QNAME, String.class, ProductoMI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ObjectProducto", scope = ProductoResultado.class)
    public JAXBElement<Productos> createProductoResultadoObjectProducto(Productos value) {
        return new JAXBElement<Productos>(_ProductoResultadoObjectProducto_QNAME, Productos.class, ProductoResultado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ObjectProductoError", scope = ProductoResultado.class)
    public JAXBElement<ProductoError> createProductoResultadoObjectProductoError(ProductoError value) {
        return new JAXBElement<ProductoError>(_ProductoResultadoObjectProductoError_QNAME, ProductoError.class, ProductoResultado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoMI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ProductoMinimo", scope = ProductoResultado.class)
    public JAXBElement<ProductoMI> createProductoResultadoProductoMinimo(ProductoMI value) {
        return new JAXBElement<ProductoMI>(_ProductoResultadoProductoMinimo_QNAME, ProductoMI.class, ProductoResultado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "listarProductoCodigo", scope = ProductoResultado.class)
    public JAXBElement<ArrayOfProductos> createProductoResultadoListarProductoCodigo(ArrayOfProductos value) {
        return new JAXBElement<ArrayOfProductos>(_ProductoResultadoListarProductoCodigo_QNAME, ArrayOfProductos.class, ProductoResultado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "descripcionEspectaculo", scope = Productos.class)
    public JAXBElement<String> createProductosDescripcionEspectaculo(String value) {
        return new JAXBElement<String>(_ProductosDescripcionEspectaculo_QNAME, String.class, Productos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "espectaculo", scope = Productos.class)
    public JAXBElement<String> createProductosEspectaculo(String value) {
        return new JAXBElement<String>(_ProductosEspectaculo_QNAME, String.class, Productos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "pathImagen", scope = Productos.class)
    public JAXBElement<String> createProductosPathImagen(String value) {
        return new JAXBElement<String>(_ProductosPathImagen_QNAME, String.class, Productos.class, value);
    }

}
