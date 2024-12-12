package client;

import dto.PersonRequestDTO;
import dto.PersonResponseDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/osi/api/user/userManagement/patient/v1.0.0/basicData")
@RegisterRestClient(configKey="extensions-api")
public interface PersonClient {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    PersonResponseDTO getInfoFromUser(@QueryParam("identificationNumber")
                                      String identificationNumber,
                                      @QueryParam("identificationType")
                                      String identificationType,
                                      @BeanParam PersonRequestDTO requestPersonDTO);

}
