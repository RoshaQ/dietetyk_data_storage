package com.dietetykadam.persistence.dao;

import java.util.List;

import com.dietetykadam.exception.ClientException;
import com.dietetykadam.persistence.entity.ClientEntity;
import com.dietetykadam.persistence.entity.DataClientEntity;

public interface DataClientDao extends Dao<DataClientEntity, Long>{

	public List<DataClientEntity> findAllDatasClient(ClientEntity client) throws ClientException;
}
