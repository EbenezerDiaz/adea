package com.ebenezerdiaz.adea.persistence;

import com.ebenezerdiaz.adea.domain.dto.User;
import com.ebenezerdiaz.adea.domain.repository.UserRepository;
import com.ebenezerdiaz.adea.persistence.crud.UsuarioCrudRepository;
import com.ebenezerdiaz.adea.persistence.entity.Usuario;
import com.ebenezerdiaz.adea.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Optional;
import java.util.function.Predicate;

@Repository
public class UsuarioRepository implements UserRepository {

    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Autowired
    private UserMapper mapper;


    @Override
    public Optional<User> getUser(String login){
        return usuarioCrudRepository.findById(login).map(usuario -> mapper.toUser(usuario));
    }

    @Override
    public boolean validateUpdatedDate(String login) throws ChangeSetPersister.NotFoundException {

        Predicate<Usuario> validateUpdatedDate = usuario -> (usuario.getFechaModificacion().toInstant().isAfter(Instant.now())) ? true : false;
        return validateUpdatedDate.test(usuarioCrudRepository.findById(login).orElseThrow(ChangeSetPersister.NotFoundException::new));
    }

    @Override
    public boolean existsUser(String login){
        return usuarioCrudRepository.existsById(login);
    }

    @Override
    public User save(User user){
        return mapper.toUser(usuarioCrudRepository.save(mapper.toUsuario(user)));
    }

    @Override
    public void delete(String login){
        usuarioCrudRepository.deleteById(login);
    }

}
