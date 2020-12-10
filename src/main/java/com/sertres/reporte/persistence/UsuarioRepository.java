package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.User;
import com.sertres.reporte.domain.repository.UserRepository;
import com.sertres.reporte.persistence.crud.UsuarioCrudRepository;
import com.sertres.reporte.persistence.entity.Usuario;
import com.sertres.reporte.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository implements UserRepository {

    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
        return mapper.toUsers(usuarios);
    }

    @Override
    public List<User> getByUserId(int userId) {
        List<Usuario> usuarios = usuarioCrudRepository.findByIdUsuario(userId);
        return mapper.toUsers(usuarios);
    }

    @Override
    public List<User> getByAccessLevel(int AccessLevel) {
        List<Usuario> usuarioLevel = usuarioCrudRepository.findByIdUsuario(AccessLevel);
        return mapper.toUsers(usuarioLevel);
    }

    @Override
    public User save(User user) {
        Usuario usuarioS = mapper.toUsuario(user);
        return mapper.toUser(usuarioCrudRepository.save(usuarioS));
    }

    @Override
    public void delete(int userId) {
        usuarioCrudRepository.deleteById(userId);
    }
}
