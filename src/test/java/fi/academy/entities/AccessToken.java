package fi.academy.entities;

public class AccessToken {
    private String access_token;
    private String scope;
    private String expires_in;
    private String token_type;
    
    public AccessToken() {
    }
    
    public AccessToken(String access_token, String scope, String expires_in, String token_type) {
        this.access_token = access_token;
        this.scope = scope;
        this.expires_in = expires_in;
        this.token_type = token_type;
    }
    
    public String getAccess_token() {
        return access_token;
    }
    
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
    
    public String getScope() {
        return scope;
    }
    
    public void setScope(String scope) {
        this.scope = scope;
    }
    
    public String getExpires_in() {
        return expires_in;
    }
    
    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }
    
    public String getToken_type() {
        return token_type;
    }
    
    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }
}
