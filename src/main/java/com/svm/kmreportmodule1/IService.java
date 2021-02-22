/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.svm.kmreportmodule1;

import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author jeevanantham
 */
public interface IService {

    @Path("/ping")
    @GET
    @Produces({"application/json"})
    public Map pingPong();
}
