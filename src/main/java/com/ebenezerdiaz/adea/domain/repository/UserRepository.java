package com.ebenezerdiaz.adea.domain.repository;

import com.ebenezerdiaz.adea.domain.dto.User;
import javassist.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.Optional;

public interface UserRepository {

    public Optional<User> getUser(String login);

    public boolean validateUpdatedDate(String login) throws ChangeSetPersister.NotFoundException, NotFoundException;

    public boolean existsUser(String login);

    public User save(User user);

    public void delete(String login);

}
