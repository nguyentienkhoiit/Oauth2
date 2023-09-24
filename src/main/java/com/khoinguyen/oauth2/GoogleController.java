package com.khoinguyen.oauth2;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
public class GoogleController {
    @GetMapping("/oauth2")
    public Map<String, Object> login(OAuth2AuthenticationToken oAuth2AuthenticationToken) {
        System.out.println("hello cac ban");
        return oAuth2AuthenticationToken.getPrincipal().getAttributes();
    }
}
