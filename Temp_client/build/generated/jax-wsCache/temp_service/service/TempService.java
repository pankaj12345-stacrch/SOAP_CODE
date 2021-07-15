
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.1
 * 
 */
@WebService(name = "temp_service", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TempService {


    /**
     * 
     * @param f
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "F_to_C")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "F_to_C", targetNamespace = "http://Service/", className = "service.FToC")
    @ResponseWrapper(localName = "F_to_CResponse", targetNamespace = "http://Service/", className = "service.FToCResponse")
    public Double fToC(
        @WebParam(name = "f", targetNamespace = "")
        double f);

    /**
     * 
     * @param c
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "C_to_F")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "C_to_F", targetNamespace = "http://Service/", className = "service.CToF")
    @ResponseWrapper(localName = "C_to_FResponse", targetNamespace = "http://Service/", className = "service.CToFResponse")
    public Double cToF(
        @WebParam(name = "c", targetNamespace = "")
        double c);

}