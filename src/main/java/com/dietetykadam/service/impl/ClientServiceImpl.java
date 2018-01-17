package com.dietetykadam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dietetykadam.exception.IncorrectParamterException;
import com.dietetykadam.persistence.dao.ClientDao;
import com.dietetykadam.persistence.entity.ClientEntity;
import com.dietetykadam.service.ClientService;

public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientRepository;
	
	
	@Override
	@Transactional(readOnly = false)
	public ClientEntity addClient(ClientEntity client) {
		return clientRepository.save(client);
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteClient(ClientEntity client) {
		clientRepository.delete(client);
	}

	@Override
	@Transactional(readOnly = false)
	public ClientEntity updateClient(ClientEntity client) {
		return clientRepository.update(client);
	}

	@Override
	public List<ClientEntity> findAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public ClientEntity findClient(Long clientId) throws IncorrectParamterException {
		if(clientId == null || clientId < 0){
			throw new IncorrectParamterException();
		}
		return clientRepository.findOne(clientId);
	}	
}
