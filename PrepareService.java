import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PrepareService", targetNamespace = "default", wsdlLocation = "http://localhost:8080/services?wsdl")
public class PrepareService
    extends Service
{

    private final static URL PREPARESERVICE_WSDL_LOCATION;
    private final static WebServiceException PREPARESERVICE_EXCEPTION;
    private final static QName PREPARESERVICE_QNAME = new QName("default", "PrepareService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/services?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PREPARESERVICE_WSDL_LOCATION = url;
        PREPARESERVICE_EXCEPTION = e;
    }

    public PrepareService() {
        super(__getWsdlLocation(), PREPARESERVICE_QNAME);
    }

    public PrepareService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PREPARESERVICE_QNAME, features);
    }

    public PrepareService(URL wsdlLocation) {
        super(wsdlLocation, PREPARESERVICE_QNAME);
    }

    public PrepareService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PREPARESERVICE_QNAME, features);
    }

    public PrepareService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PrepareService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Prepare
     */
    @WebEndpoint(name = "PreparePort")
    public Prepare getPreparePort() {
        return super.getPort(new QName("default", "PreparePort"), Prepare.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Prepare
     */
    @WebEndpoint(name = "PreparePort")
    public Prepare getPreparePort(WebServiceFeature... features) {
        return super.getPort(new QName("default", "PreparePort"), Prepare.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PREPARESERVICE_EXCEPTION!= null) {
            throw PREPARESERVICE_EXCEPTION;
        }
        return PREPARESERVICE_WSDL_LOCATION;
    }

}
