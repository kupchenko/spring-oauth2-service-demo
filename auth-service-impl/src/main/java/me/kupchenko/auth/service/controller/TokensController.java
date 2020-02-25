package me.kupchenko.auth.service.controller;

import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/tokens")
public class TokensController {

    private TokenStore tokenStore;

    @GetMapping("/client/{id}")
    public List<String> getTokens(@PathVariable String id) {
        Collection<OAuth2AccessToken> tokens = tokenStore.findTokensByClientId(id);
        return Optional.ofNullable(tokens)
                .orElse(Collections.emptyList())
                .stream().map(OAuth2AccessToken::getValue)
                .collect(Collectors.toList());
    }
}