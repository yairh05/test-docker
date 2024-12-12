package dto;

public class UserInformationResponseDTO {


    private String identification ;
    private String documentType;

    public String getIdentification() {
        return identification;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
}

