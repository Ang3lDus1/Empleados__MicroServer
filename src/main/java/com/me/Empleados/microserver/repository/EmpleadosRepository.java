package com.me.Empleados.microserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.Empleados.microserver.entity.Empleados;


public interface EmpleadosRepository extends MongoRepository<Empleados, String> {

}
