/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.svm.kmreportmodule1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

/**
 *
 * @author jeevanantham
 */
@Stateless
@Path("/service")
public class Service implements Serializable, IService {

    @Override
    public Map pingPong() {
        Map response=new HashMap();
        response.put("status", "pong");
        response.put("time", System.currentTimeMillis());
        return response;
    }

}
