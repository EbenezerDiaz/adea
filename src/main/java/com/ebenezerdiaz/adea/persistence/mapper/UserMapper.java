package com.ebenezerdiaz.adea.persistence.mapper;

import com.ebenezerdiaz.adea.domain.dto.User;
import com.ebenezerdiaz.adea.persistence.entity.Usuario;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "login" , target = "login"),
            @Mapping(source = "password" , target = "password"),
            @Mapping(source = "nombre" , target = "name"),
            @Mapping(source = "cliente" , target = "custumer"),
            @Mapping(source = "email" , target = "email"),
            @Mapping(source = "fechaAlta" , target = "startDate"),
            @Mapping(source = "fechaBaja" , target = "finishDate"),
            @Mapping(source = "status" , target = "status"),
            @Mapping(source = "intentos" , target = "attempts"),
            @Mapping(source = "fechaRevocado" , target = "revokedDate"),
            @Mapping(source = "fechaVigencia" , target = "effectiveDate"),
            @Mapping(source = "noAcceso" , target = "noAccess"),
            @Mapping(source = "apellidoPaterno" , target = "lastName"),
            @Mapping(source = "apellidoMaterno" , target = "secondLastName"),
            @Mapping(source = "area" , target = "area"),
            @Mapping(source = "fechaModificacion" , target = "updatedDate")
    })
    User toUser(Usuario usuario);

    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(User user);
}
