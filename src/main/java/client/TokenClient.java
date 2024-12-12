package client;

import dto.TokenRequestDTO;
import dto.TokenResponseDTO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.BeanParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/token")
@RegisterRestClient(configKey="extensions-api")
public interface TokenClient {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    TokenResponseDTO getByUsernameAndPassword (@BeanParam TokenRequestDTO tokenRequestDTO);


}