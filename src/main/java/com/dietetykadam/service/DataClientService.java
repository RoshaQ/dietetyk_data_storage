package com.dietetykadam.service;

import java.util.List;

import com.dietetykadam.exception.ClientException;
import com.dietetykadam.persistence.entity.ClientEntity;
import com.dietetykadam.persistence.entity.DataClientEntity;

public interface DataClientService {

	DataClientEntity addDataClient(DataClientEntity dataClient);
	
	DataClientEntity updateDataClient(DataClientEntity dataClient);
	
	void deleteDataClient(DataClientEntity dataClient);
	
	List<DataClientEntity> findAllDataClients();
	
	List<DataClientEntity> findAllDatasClient(ClientEntity client) throws ClientException;
	
	DataClientEntity findDataClient(Long dataClientId);
	
	
}
