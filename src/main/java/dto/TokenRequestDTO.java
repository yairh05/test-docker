package dto;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.FormParam;
import org.jboss.resteasy.reactive.RestHeader;

public class TokenRequestDTO

    {

    @FormParam("grant_type")
    @DefaultValue("password")
    private String grantType;

    @FormParam("username")
    @DefaultValue("CO11VG60AMPAPPMP")
    private String username;

    @FormParam("password")
    @DefaultValue("E7Qgsj3GVKCHVxt3rukBg")
    private String password;

    @RestHeader("Authorization")
    @DefaultValue("Basic elhkMFBtY0RZX2FRMjdnTG5ydFRZQTFqVFVrYTo2a1JITWQ2cm54M3FKRE83T3ZLZmh0cVQwdVlh")
    private String authorization;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

        public String getAuthorization() {
            return authorization;
        }

        public void setAuthorization(String authorization) {
            this.authorization = authorization;
        }
    }
