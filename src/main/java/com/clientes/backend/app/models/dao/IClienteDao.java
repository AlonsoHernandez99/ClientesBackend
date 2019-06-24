package com.clientes.backend.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.clientes.backend.app.models.entity.Cliente;


public interface IClienteDao extends CrudRepository<Cliente, Integer>{

}
