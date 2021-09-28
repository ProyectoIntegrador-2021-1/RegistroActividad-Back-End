package co.com.datacom.service.impl;

import co.com.datacom.entity.Usuario;
import co.com.datacom.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
      Usuario usuario = usuarioRepository.findOneByUsername(username);
      System.out.println("ssss"+usuario);
      return  usuario;
    }

}
