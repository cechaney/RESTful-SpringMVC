/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cec.restapi.domain;

import java.io.Serializable;

/**
 *
 * @author
 * x39538
 */

public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String email;
    private String password;
    
    public Profile(Long id, String email, String password){
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    
}
