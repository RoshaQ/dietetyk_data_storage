package com.dietetykadam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dietetykadam.exception.ClientException;
import com.dietetykadam.persistence.dao.DataClientDao;
import com.dietetykadam.persistence.entity.ClientEntity;
import com.dietetykadam.persistence.entity.DataClientEntity;
import com.dietetykadam.service.DataClientService;

public class DataClientServiceImpl implements DataClientService{

	@Autowired
	DataClientDao dataClientRepository;

	@Override
	public DataClientEntity addDataClient(DataClientEntity dataClient) {
		return dataClientRepository.save(dataClient);
	}

	@Override
	public DataClientEntity updateDataClient(DataClientEntity dataClient) {
		return dataClientRepository.update(dataClient);
	}

	@Override
	public void deleteDataClient(DataClientEntity dataClient) {
		dataClientRepository.delete(dataClient);
	}

	@Override
	public List<DataClientEntity> findAllDataClients() {
		return dataClientRepository.findAll();
	}

	@Override
	public List<DataClientEntity> findAllDatasClient(ClientEntity client) throws ClientException {

		return null;
	}
	
	@Override
	public DataClientEntity findDataClient(Long dataClientId) {
		return dataClientRepository.findOne(dataClientId);
	}
	
}
