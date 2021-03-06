
package com.routdata.zzfw.webservice.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-31T13:56:11.935+08:00
 * Generated source version: 2.6.0
 */

@WebFault(name = "BusinessException", targetNamespace = "http://service.webservice.zzfw.routdata.com/")
public class BusinessException_Exception extends Exception {
    
    private com.routdata.zzfw.webservice.service.BusinessException businessException;

    public BusinessException_Exception() {
        super();
    }
    
    public BusinessException_Exception(String message) {
        super(message);
    }
    
    public BusinessException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException_Exception(String message, com.routdata.zzfw.webservice.service.BusinessException businessException) {
        super(message);
        this.businessException = businessException;
    }

    public BusinessException_Exception(String message, com.routdata.zzfw.webservice.service.BusinessException businessException, Throwable cause) {
        super(message, cause);
        this.businessException = businessException;
    }

    public com.routdata.zzfw.webservice.service.BusinessException getFaultInfo() {
        return this.businessException;
    }
}
