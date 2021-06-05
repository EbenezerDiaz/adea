package com.ebenezerdiaz.adea.persistence.crud;

import com.ebenezerdiaz.adea.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioCrudRepository extends JpaRepository<Usuario, String> {


}
