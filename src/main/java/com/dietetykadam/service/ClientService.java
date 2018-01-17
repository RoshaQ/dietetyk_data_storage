package com.dietetykadam.service;

import java.util.List;

import com.dietetykadam.exception.IncorrectParamterException;
import com.dietetykadam.persistence.entity.ClientEntity;

public interface ClientService {

	ClientEntity addClient(ClientEntity client);
	
	void deleteClient(ClientEntity client);
	
	ClientEntity updateClient(ClientEntity client);
	
	List<ClientEntity> findAllClients();
	
	ClientEntity findClient(Long clientId) throws IncorrectParamterException;
	
}
