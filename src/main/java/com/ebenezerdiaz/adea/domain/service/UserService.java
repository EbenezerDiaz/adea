package com.ebenezerdiaz.adea.domain.service;

import com.ebenezerdiaz.adea.domain.dto.User;
import com.ebenezerdiaz.adea.domain.repository.UserRepository;
import com.ebenezerdiaz.adea.persistence.entity.Usuario;
import com.ebenezerdiaz.adea.persistence.utils.FechasUtils;
import com.ebenezerdiaz.adea.persistence.utils.PasswordUtils;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean login(User user) throws NoSuchAlgorithmException {

        boolean loginSussefull = true;

        User userLogin = getUser(user.getLogin()).get();

        loginSussefull = PasswordUtils.matcherPassword(user.getPassword(), userLogin.getPassword());

        loginSussefull = FechasUtils.isExpiredDate(userLogin.getUpdatedDate());

        return loginSussefull;
    }

    public Optional<User> getUser(String login){
        return userRepository.getUser(login);
    }


    public boolean validateUpdatedDate(String login) throws NotFoundException, ChangeSetPersister.NotFoundException {
        return userRepository.validateUpdatedDate(login);
    }

    public boolean existsUser(String login){
        return userRepository.existsUser(login);
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public boolean delete(String login){

        return getUser(login).map(user -> {
            userRepository.delete(login);
            return true;
        }).orElse(false);
    }


}
