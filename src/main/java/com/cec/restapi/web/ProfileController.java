/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cec.restapi.web;

import com.cec.restapi.domain.Profile;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {
	
	@RequestMapping(value="/profile", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Profile> findAllProfile(
			HttpServletRequest req, 
			HttpServletResponse res){

        List<Profile> profiles = new ArrayList<>();
        
        profiles.add(new Profile(1l,"test1@test.com", ""));
        profiles.add(new Profile(2l,"test2@test.com", ""));
                        
        return profiles;
		
	}
    
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello(
			HttpServletRequest req, 
			HttpServletResponse res){

        return "HELLO!";
		
	}    
    
}
