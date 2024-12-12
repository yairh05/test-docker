package service;

import client.PersonClient;
import client.TokenClient;
import dto.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Locale;

@ApplicationScoped
public class ProcessUserInformation {

    @Inject
    @RestClient
    TokenClient tokenClient;

    @Inject
    @RestClient
    PersonClient personClient;


    private String getResponseToken() {
        TokenRequestDTO tokenRequestDTO = buildTokenRequestDTO();
        TokenResponseDTO tokenResponseDTO = tokenClient.getByUsernameAndPassword(tokenRequestDTO);
        return tokenResponseDTO.getAccessToken();
    }
    private TokenRequestDTO buildTokenRequestDTO() {
        TokenRequestDTO tokenRequestDTO = new TokenRequestDTO();
        tokenRequestDTO.setGrantType("password");
        tokenRequestDTO.setUsername("CO11VG60AMPAPPMP");
        tokenRequestDTO.setPassword("E7Qgsj3GVKCHVxt3rukBg");
        tokenRequestDTO.setAuthorization("Basic elhkMFBtY0RZX2FRMjdnTG5ydFRZQTFqVFVrYTo2a1JITWQ2cm54M3FKRE83T3ZLZmh0cVQwdVlh");
        return  tokenRequestDTO;
    }

    public PersonResponseDTO getResponsePerson(String identification, String documentType, String token)
    {
         return personClient.getInfoFromUser( identification, documentType,
                buildRequestPersonDTO(token));
    }

    public UserInformationResponseDTO getUserInformation(String identification, String documentType) {
        UserInformationResponseDTO saveIdentification = new UserInformationResponseDTO();
        String token = getResponseToken();
        PersonResponseDTO responsePerson = getResponsePerson(identification,documentType.toUpperCase(Locale.getDefault()), token);
        List<PersonResponseDTO.PersonData.Identifier> document = responsePerson.getData().getFirst().getIdentifier();
        for (PersonResponseDTO.PersonData.Identifier identifier : document) {
            if(identifier.getType().equalsIgnoreCase("NUMERO_IDENTIFICACION")) {
                saveIdentification.setIdentification(identifier.getValue());
            }
            else if(identifier.getType().equalsIgnoreCase("TIPO_IDENTIFICACION")) {
                saveIdentification.setDocumentType(identifier.getValue());
            }
        }
        return saveIdentification;
    }



    private PersonRequestDTO buildRequestPersonDTO (String token){
        PersonRequestDTO buildObject = new PersonRequestDTO();
        buildObject.setAuthorization("Bearer "+ token);
        buildObject.setIdPeticion("UREAF19ISAFG987");
        buildObject.setIdTerminal("10.251.107.195");
        buildObject.setUsuario("userBukeala");
        buildObject.setFechaPeticion("2021-01-16T15:00:00");
        buildObject.setFuncionNegocio("Servicios Medicos");
        buildObject.setCodAplicacion( "SIE000000069");
        buildObject.setTipoConsulta("1");
        return buildObject;
    }

}
