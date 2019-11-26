package com.badboyh2o.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.badboyh2o.webservice.CommonService;

public class Client2 {

    public static void main(String[] args) throws MalformedURLException {
        
        URL wsdl = new URL("http://localhost:8080/services/CommonService?wsdl");
        QName qName = new QName("http://webservice.badboyh2o.com/", "CommonService");
        
        Service service = Service.create(wsdl, qName);
        CommonService port = service.getPort(CommonService.class);
        System.out.println(port.sayHello("123456789"));
    }
    
}
