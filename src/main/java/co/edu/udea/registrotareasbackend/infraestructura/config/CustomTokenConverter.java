package co.com.datacom.config;

import co.com.datacom.entity.Usuario;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.HashMap;
import java.util.Map;

public class CustomTokenConverter extends JwtAccessTokenConverter {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken,
            OAuth2Authentication authentication) {
        ObjectMapper mapper = new ObjectMapper();
        if(authentication.getOAuth2Request().getGrantType().equalsIgnoreCase("password")) {
        	Usuario authUser = (Usuario) authentication.getPrincipal();
            Map<String, Object> info = new HashMap<>();
            info.put("id", authUser.getId());
            info.put("name", "usuario name");
            String prueba="";
            try {
                 prueba = mapper.writeValueAsString(authUser.getRol());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            info.put("rol", authUser.getRol());
            ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
        } 
        accessToken = super.enhance(accessToken, authentication);
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(new HashMap<>());
        return accessToken;
    }
}
