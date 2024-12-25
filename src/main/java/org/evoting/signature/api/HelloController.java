package org.evoting.signature.api;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import org.evoting.signature.domain.test.Response;

@Controller("/hello")
public class HelloController {

    @Get()
    @Produces(MediaType.APPLICATION_JSON)
    @Secured(SecurityRule.IS_ANONYMOUS)
    public Response index() {
        return Response.builder()
                .message("Hello World")
                .build();
    }

}
