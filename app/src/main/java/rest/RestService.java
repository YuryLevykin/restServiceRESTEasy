package rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/rest")
public class RestService {

    public static final String APP_JSON_CT = "application/json; charset=utf-8";

    private static final Logger logger = LoggerFactory.getLogger(RestService.class);

// curl -i -X POST -H "Content-Type: application/json" -d "{\"value\":\"value element\"}" http://restEasySample:9090/api/rest/method; echo
    @Produces({ APP_JSON_CT })
    @Consumes({ APP_JSON_CT })
    @Path("/method")
    @POST
    public Response restMethod(ValueElement ve) {
        logger.info("!!! --- restMethod ok -- {} - {} - {}", ve.value(), ve, ve.hashCode());
        logger.info("!!! --- 7 ---");
        return Response.ok(new ValueElement("rest method element")).build();
    }

}
