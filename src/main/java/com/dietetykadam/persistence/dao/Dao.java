package com.dietetykadam.persistence.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T, ID extends Serializable> {

	public T save(T entity);
	
	public T getOne(ID id);
	
	public T findOne(ID id);
	
	public List<T> findAll();
	
	public T update(T entity);
	
	public void delete(T entity);
	
	public void deleteAll();
	
	public T searchById(ID id);
}
 