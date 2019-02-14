package io.weli.enpoint.echo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.validation.constraints.NotEmpty;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Component
public class Get {

    @Autowired
    ServletContext context;

    @GET
    @Path("/context")
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return context.getInitParameter("foo");
    }

}
