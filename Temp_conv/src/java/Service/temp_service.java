/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lenovo
 */
@WebService(serviceName = "temp_service")
public class temp_service {

    
    @WebMethod(operationName = "F_to_C")
    public Double F_to_C(@WebParam(name = "f") double f) {
        //TODO write your implementation code here:
        Double c=(f-32)*1.8;
        return c;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "C_to_F")
    public Double C_to_F(@WebParam(name = "c") double c) {
        //TODO write your implementation code here:
        Double f=(c*1.8)+32;
        return f;
    }
}
