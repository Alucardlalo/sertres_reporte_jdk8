package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.User;
import com.sertres.reporte.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AccessLevelMapper.class})
public interface UserMapper {
    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "usuario", target = "user"),
            @Mapping(source = "nombreUsuario", target = "userName"),
            @Mapping(source = "clave", target = "pass"),
            @Mapping(source = "detallesUsuario", target = "userDetails"),
            @Mapping(source = "emailUsuario", target = "userMail"),
            @Mapping(source = "ultimoAcceso", target = "lastAccess"),
            @Mapping(source = "nivelAcceso",target = "accessLevel"),
            @Mapping(source = "nivelAccesoRel", target = "accessLevelRel")

    })
    User toUser(Usuario usuario);

    List<User> toUsers(List<Usuario> usuarioList);

    @InheritInverseConfiguration
    @Mapping(target = "nivelAccesoRel", ignore = true)
    Usuario toUsuario (User user);
}
