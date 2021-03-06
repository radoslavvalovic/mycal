package com.mycuteblog.dao.impl;

import com.mycuteblog.dao.ApiRequestDao;
import com.mycuteblog.model.ApiRequest;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ApiRequestDaoImpl implements ApiRequestDao{
	@PersistenceContext
	private EntityManager entityManager;

	public void create(ApiRequest apiRequest) {
		entityManager.persist(apiRequest);
	}

	public void update(ApiRequest apiRequest) {
		entityManager.merge(apiRequest);
	}

	public ApiRequest getApiRequestById(long id) {
		return entityManager.find(ApiRequest.class, id);
	}

	public void delete(long id) {
		ApiRequest apiRequest = getApiRequestById(id);
		if (apiRequest != null) {
			entityManager.remove(apiRequest);
		}
	}
}