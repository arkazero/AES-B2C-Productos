
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.ProductoFiltro;
import org.datacontract.schemas._2004._07.ProductoMI;
import org.datacontract.schemas._2004._07.ProductoResultado;
import org.datacontract.schemas._2004._07.Productos;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _ModificarProductoValue_QNAME = new QName("http://tempuri.org/", "value");
    private final static QName _ModificarProductoResponseModificarProductoResult_QNAME = new QName("http://tempuri.org/", "modificarProductoResult");
    private final static QName _CrearProductoResponseCrearProductoResult_QNAME = new QName("http://tempuri.org/", "crearProductoResult");
    private final static QName _EliminarProductoObjProResultado_QNAME = new QName("http://tempuri.org/", "ObjProResultado");
    private final static QName _EliminarProductoResponseEliminarProductoResult_QNAME = new QName("http://tempuri.org/", "eliminarProductoResult");
    private final static QName _ListarProductoCodigoResponseListarProductoCodigoResult_QNAME = new QName("http://tempuri.org/", "listarProductoCodigoResult");
    private final static QName _ListarProductoNombreResponseListarProductoNombreResult_QNAME = new QName("http://tempuri.org/", "listarProductoNombreResult");
    private final static QName _ListarProductoDescripcionResponseListarProductoDescripcionResult_QNAME = new QName("http://tempuri.org/", "listarProductoDescripcionResult");
    private final static QName _RankingProductoResponseRankingProductoResult_QNAME = new QName("http://tempuri.org/", "rankingProductoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModificarProducto }
     * 
     */
    public ModificarProducto createModificarProducto() {
        return new ModificarProducto();
    }

    /**
     * Create an instance of {@link ModificarProductoResponse }
     * 
     */
    public ModificarProductoResponse createModificarProductoResponse() {
        return new ModificarProductoResponse();
    }

    /**
     * Create an instance of {@link CrearProducto }
     * 
     */
    public CrearProducto createCrearProducto() {
        return new CrearProducto();
    }

    /**
     * Create an instance of {@link CrearProductoResponse }
     * 
     */
    public CrearProductoResponse createCrearProductoResponse() {
        return new CrearProductoResponse();
    }

    /**
     * Create an instance of {@link EliminarProducto }
     * 
     */
    public EliminarProducto createEliminarProducto() {
        return new EliminarProducto();
    }

    /**
     * Create an instance of {@link EliminarProductoResponse }
     * 
     */
    public EliminarProductoResponse createEliminarProductoResponse() {
        return new EliminarProductoResponse();
    }

    /**
     * Create an instance of {@link ListarProductoCodigo }
     * 
     */
    public ListarProductoCodigo createListarProductoCodigo() {
        return new ListarProductoCodigo();
    }

    /**
     * Create an instance of {@link ListarProductoCodigoResponse }
     * 
     */
    public ListarProductoCodigoResponse createListarProductoCodigoResponse() {
        return new ListarProductoCodigoResponse();
    }

    /**
     * Create an instance of {@link ListarProductoNombre }
     * 
     */
    public ListarProductoNombre createListarProductoNombre() {
        return new ListarProductoNombre();
    }

    /**
     * Create an instance of {@link ListarProductoNombreResponse }
     * 
     */
    public ListarProductoNombreResponse createListarProductoNombreResponse() {
        return new ListarProductoNombreResponse();
    }

    /**
     * Create an instance of {@link ListarProductoDescripcion }
     * 
     */
    public ListarProductoDescripcion createListarProductoDescripcion() {
        return new ListarProductoDescripcion();
    }

    /**
     * Create an instance of {@link ListarProductoDescripcionResponse }
     * 
     */
    public ListarProductoDescripcionResponse createListarProductoDescripcionResponse() {
        return new ListarProductoDescripcionResponse();
    }

    /**
     * Create an instance of {@link RankingProducto }
     * 
     */
    public RankingProducto createRankingProducto() {
        return new RankingProducto();
    }

    /**
     * Create an instance of {@link RankingProductoResponse }
     * 
     */
    public RankingProductoResponse createRankingProductoResponse() {
        return new RankingProductoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = ModificarProducto.class)
    public JAXBElement<Productos> createModificarProductoValue(Productos value) {
        return new JAXBElement<Productos>(_ModificarProductoValue_QNAME, Productos.class, ModificarProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "modificarProductoResult", scope = ModificarProductoResponse.class)
    public JAXBElement<ProductoResultado> createModificarProductoResponseModificarProductoResult(ProductoResultado value) {
        return new JAXBElement<ProductoResultado>(_ModificarProductoResponseModificarProductoResult_QNAME, ProductoResultado.class, ModificarProductoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = CrearProducto.class)
    public JAXBElement<Productos> createCrearProductoValue(Productos value) {
        return new JAXBElement<Productos>(_ModificarProductoValue_QNAME, Productos.class, CrearProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "crearProductoResult", scope = CrearProductoResponse.class)
    public JAXBElement<ProductoResultado> createCrearProductoResponseCrearProductoResult(ProductoResultado value) {
        return new JAXBElement<ProductoResultado>(_CrearProductoResponseCrearProductoResult_QNAME, ProductoResultado.class, CrearProductoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoMI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObjProResultado", scope = EliminarProducto.class)
    public JAXBElement<ProductoMI> createEliminarProductoObjProResultado(ProductoMI value) {
        return new JAXBElement<ProductoMI>(_EliminarProductoObjProResultado_QNAME, ProductoMI.class, EliminarProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eliminarProductoResult", scope = EliminarProductoResponse.class)
    public JAXBElement<ProductoResultado> createEliminarProductoResponseEliminarProductoResult(ProductoResultado value) {
        return new JAXBElement<ProductoResultado>(_EliminarProductoResponseEliminarProductoResult_QNAME, ProductoResultado.class, EliminarProductoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoMI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObjProResultado", scope = ListarProductoCodigo.class)
    public JAXBElement<ProductoMI> createListarProductoCodigoObjProResultado(ProductoMI value) {
        return new JAXBElement<ProductoMI>(_EliminarProductoObjProResultado_QNAME, ProductoMI.class, ListarProductoCodigo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarProductoCodigoResult", scope = ListarProductoCodigoResponse.class)
    public JAXBElement<ProductoResultado> createListarProductoCodigoResponseListarProductoCodigoResult(ProductoResultado value) {
        return new JAXBElement<ProductoResultado>(_ListarProductoCodigoResponseListarProductoCodigoResult_QNAME, ProductoResultado.class, ListarProductoCodigoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObjProResultado", scope = ListarProductoNombre.class)
    public JAXBElement<ProductoFiltro> createListarProductoNombreObjProResultado(ProductoFiltro value) {
        return new JAXBElement<ProductoFiltro>(_EliminarProductoObjProResultado_QNAME, ProductoFiltro.class, ListarProductoNombre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarProductoNombreResult", scope = ListarProductoNombreResponse.class)
    public JAXBElement<ProductoResultado> createListarProductoNombreResponseListarProductoNombreResult(ProductoResultado value) {
        return new JAXBElement<ProductoResultado>(_ListarProductoNombreResponseListarProductoNombreResult_QNAME, ProductoResultado.class, ListarProductoNombreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = ListarProductoDescripcion.class)
    public JAXBElement<Productos> createListarProductoDescripcionValue(Productos value) {
        return new JAXBElement<Productos>(_ModificarProductoValue_QNAME, Productos.class, ListarProductoDescripcion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarProductoDescripcionResult", scope = ListarProductoDescripcionResponse.class)
    public JAXBElement<Productos> createListarProductoDescripcionResponseListarProductoDescripcionResult(Productos value) {
        return new JAXBElement<Productos>(_ListarProductoDescripcionResponseListarProductoDescripcionResult_QNAME, Productos.class, ListarProductoDescripcionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = RankingProducto.class)
    public JAXBElement<Productos> createRankingProductoValue(Productos value) {
        return new JAXBElement<Productos>(_ModificarProductoValue_QNAME, Productos.class, RankingProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rankingProductoResult", scope = RankingProductoResponse.class)
    public JAXBElement<Productos> createRankingProductoResponseRankingProductoResult(Productos value) {
        return new JAXBElement<Productos>(_RankingProductoResponseRankingProductoResult_QNAME, Productos.class, RankingProductoResponse.class, value);
    }

}
