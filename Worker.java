import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Worker", targetNamespace = "default")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Worker {


    /**
     * 
     */
    @WebMethod
    @Action(input = "default/Worker/runRequest", output = "default/Worker/runResponse")
    public void run();

    /**
     * 
     * @return
     *     returns wsclient.Vector
     */
    @WebMethod
    @WebResult(name = "PrimeVector", partName = "PrimeVector")
    @Action(input = "default/Worker/getPrimesVecRequest", output = "default/Worker/getPrimesVecResponse")
    public Vector getPrimesVec();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "primesString", partName = "primesString")
    @Action(input = "default/Worker/getPrimesStringRequest", output = "default/Worker/getPrimesStringResponse")
    public String getPrimesString();

    /**
     * 
     * @return
     *     returns wsclient.IntArray
     */
    @WebMethod
    @WebResult(name = "primesArray", partName = "primesArray")
    @Action(input = "default/Worker/getPrimesArrayRequest", output = "default/Worker/getPrimesArrayResponse")
    public IntArray getPrimesArray();

    /**
     * 
     * @param n
     */
    @WebMethod
    @Action(input = "default/Worker/setNRequest", output = "default/Worker/setNResponse")
    public void setN(
        @WebParam(name = "n", partName = "n")
        int n);

}