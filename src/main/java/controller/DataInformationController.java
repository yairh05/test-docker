package controller;

import dto.UserInformationResponseDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestResponse;
import service.ProcessUserInformation;


@Path("/user")
public class DataInformationController {

    @Inject
    ProcessUserInformation processUserInformation;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public RestResponse<UserInformationResponseDTO> getIdentification(@QueryParam("identification") String identification,
                                                                      @QueryParam("documentType") String documentType
    ) {

        return RestResponse.ResponseBuilder.ok(
                processUserInformation.getUserInformation(identification, documentType))
                .type(MediaType.APPLICATION_JSON)
                .build() ;

    }
}


