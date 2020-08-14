package com.code.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.model.Persona;

@Repository
public interface IPersonaRepo extends CrudRepository<Persona, Integer>{

}
