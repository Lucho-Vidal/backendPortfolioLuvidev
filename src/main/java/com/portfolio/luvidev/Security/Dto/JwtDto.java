package com.portfolio.luvidev.Security.Dto;

/**
 *
 * @author lucho
 */
public class JwtDto {
    private String token;
    
    
    //Contructores
    public JwtDto(String token) {
        this.token = token;
       
    }

    public JwtDto() {
    }
    
    
    //Getter and Setter

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    } 
    
}
