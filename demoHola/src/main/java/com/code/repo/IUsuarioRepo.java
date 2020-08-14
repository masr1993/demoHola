package com.code.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.model.Usuario;

@Repository
public interface IUsuarioRepo extends CrudRepository<Usuario, Integer>{

}
