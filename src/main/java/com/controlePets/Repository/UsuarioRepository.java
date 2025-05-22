package com.controlePets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controlePets.Entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}