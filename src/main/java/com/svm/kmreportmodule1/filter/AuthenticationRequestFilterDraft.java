/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.svm.kmreportmodule1.filter;

/**
 *
 * @author jeevanantham
 */
import java.io.IOException;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

//@Provider
//@PreMatching
public class AuthenticationRequestFilterDraft implements ContainerRequestFilter {

//
//    @Inject
//    HttpServletRequest httpRequest;
    @Override
    public void filter(ContainerRequestContext ctx) throws IOException {
//        System.out.println("Settting ContainerRequestContext ::");
//        System.out.println("ctx.getHeaders() :: " + ctx.getHeaders());
//        ctx.getHeaders().add("authorization_type", "session_token");
//        ctx.abortWith(Response.status(Status.FORBIDDEN).build());
    }
    
}
