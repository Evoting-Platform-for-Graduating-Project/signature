package org.evoting.api;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;
import org.evoting.domain.test.Response;

@Controller("/hello")
public class HelloController {

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Secured("isAnonymous()")
    public Response index() {
        return Response.builder()
                .message("Hello World")
                .build();
    }

}
