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
@WebService(name = "Prepare", targetNamespace = "default")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface Prepare {


    /**
     *
     * @param nPrimes
     * @return
     *     returns wsclient.Vector
     */
    @WebMethod
    @WebResult(name = "PrimeVector", partName = "PrimeVector")
    @Action(input = "default/Prepare/newWorkerRequest", output = "default/Prepare/newWorkerResponse")
    public Vector newWorker(
            @WebParam(name = "nPrimes", partName = "nPrimes")
                    int nPrimes);

    /**
     *
     * @param nPrimes
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "PrimeString", partName = "PrimeString")
    @Action(input = "default/Prepare/primesStringRequest", output = "default/Prepare/primesStringResponse")
    public String primesString(
            @WebParam(name = "nPrimes", partName = "nPrimes")
                    int nPrimes);

    /**
     *
     * @param nPrimes
     * @return
     *     returns wsclient.IntArray
     */
    @WebMethod
    @WebResult(name = "PrimeArray", partName = "PrimeArray")
    @Action(input = "default/Prepare/primesArrayRequest", output = "default/Prepare/primesArrayResponse")
    public IntArray primesArray(
            @WebParam(name = "nPrimes", partName = "nPrimes")
                    int nPrimes);

}
