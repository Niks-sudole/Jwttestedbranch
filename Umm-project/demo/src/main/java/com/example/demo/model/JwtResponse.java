package com.example.demo.model;

import lombok.Data;
import java.io.Serializable;

@Data
public class JwtResponse  implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}