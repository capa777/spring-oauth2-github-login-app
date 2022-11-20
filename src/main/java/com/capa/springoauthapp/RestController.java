package com.capa.springoauthapp;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedHashMap;

@org.springframework.web.bind.annotation.RestController
public class RestController {

   @GetMapping("/api")
    public String get(){
      String n = ((LinkedHashMap) ((UsernamePasswordAuthenticationToken) ((OAuth2Authentication) ((SecurityContextImpl) SecurityContextHolder.getContext()).getAuthentication()).getUserAuthentication()).getDetails()).entrySet().toArray()[0].toString();
      String s = ((LinkedHashMap) ((UsernamePasswordAuthenticationToken) ((OAuth2Authentication) ((SecurityContextImpl) SecurityContextHolder.getContext()).getAuthentication()).getUserAuthentication()).getDetails()).entrySet().toArray()[5].toString();

      return "your github "  + n + " your github " + s;
   }
}
