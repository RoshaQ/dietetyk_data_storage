package com.dietetykadam.persistence.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import com.dietetykadam.exception.ClientException;
import com.dietetykadam.persistence.common.NamedQueries;
import com.dietetykadam.persistence.dao.DataClientDao;
import com.dietetykadam.persistence.entity.ClientEntity;
import com.dietetykadam.persistence.entity.DataClientEntity;

public class DataClientDaoImpl extends AbstractDao<DataClientEntity, Long> implements DataClientDao {

	@Override
	public List<DataClientEntity> findAllDatasClient(ClientEntity client) throws ClientException {
		if (client == null) {
			throw new ClientException();
		}
		TypedQuery<DataClientEntity> query = entityManager.createNamedQuery(NamedQueries.FIND_ALL_DATES_CLIENT,
				DataClientEntity.class);
		query.setParameter("client", client);
		return query.getResultList();
	}
}
