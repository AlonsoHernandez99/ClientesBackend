package com.clientes.backend.app.models.service;

import java.util.List;

import com.clientes.backend.app.models.entity.Cliente;


public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findById(Integer id);
	
	public void delete(Cliente cliente);

}
