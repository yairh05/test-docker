package dto;

import jakarta.ws.rs.DefaultValue;
import org.jboss.resteasy.reactive.RestHeader;

public class PersonRequestDTO {

    @RestHeader (value = "Authorization")
    private String authorization;

    @RestHeader (value = "IdPeticion")
    @DefaultValue("UREAF19ISAFG987")
    private String idPeticion;


    @RestHeader (value = "IdTerminal")
    @DefaultValue("10.251.107.195")
    private String idTerminal;


    @RestHeader (value = "Usuario")
    @DefaultValue("userBukeala")
    private String usuario;


    @RestHeader (value = "FechaPeticion")
    @DefaultValue("2021-01-16T15:00:00")
    private String fechaPeticion;


    @RestHeader (value = "funcionNegocio")
    @DefaultValue("Servicios Medicos")
    private String funcionNegocio;


    @RestHeader (value = "codAplicacion")
    @DefaultValue("SIE000000069")
    private String codAplicacion;


    @RestHeader (value = "tipoConsulta")
    @DefaultValue("1")
    private String tipoConsulta;

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getIdPeticion() {
        return idPeticion;
    }

    public void setIdPeticion(String idPeticion) {
        this.idPeticion = idPeticion;
    }

    public String getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(String idTerminal) {
        this.idTerminal = idTerminal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechaPeticion() {
        return fechaPeticion;
    }

    public void setFechaPeticion(String fechaPeticion) {
        this.fechaPeticion = fechaPeticion;
    }

    public String getFuncionNegocio() {
        return funcionNegocio;
    }

    public void setFuncionNegocio(String funcionNegocio) {
        this.funcionNegocio = funcionNegocio;
    }

    public String getCodAplicacion() {
        return codAplicacion;
    }

    public void setCodAplicacion(String codAplicacion) {
        this.codAplicacion = codAplicacion;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
}
