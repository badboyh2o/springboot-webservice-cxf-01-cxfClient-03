package com.badboyh2o.webservice.client;

import com.badboyh2o.webservice.CommonService;
import com.badboyh2o.webservice.CommonService_Service;

public class Client {

    public static void main(String[] args) {
        
        CommonService_Service jwsService = new CommonService_Service();
        
        CommonService  cs = jwsService.getCommonServiceImpPort();
        
        System.out.println("调webservice:"+cs.sayHello("badboyh2o"));
        
    }
}
