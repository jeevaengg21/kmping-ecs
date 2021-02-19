/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.svm.kmreportmodule1;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

/**
 *
 * @author jeevanantham
 */
@Stateless
@Path("/service")
public class Service implements Serializable, IService {

    public String pingPong() {
        return "{\"status\":\"pong\"}";
    }

}
