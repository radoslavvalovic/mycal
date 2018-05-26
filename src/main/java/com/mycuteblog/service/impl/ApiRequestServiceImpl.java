package com.mycuteblog.service.impl;

import com.mycuteblog.dao.ApiRequestDao;
import com.mycuteblog.model.ApiRequest;
import com.mycuteblog.service.ApiRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApiRequestServiceImpl implements ApiRequestService {

    @Autowired
    private ApiRequestDao apiRequestDao;

    @Override
    public void createApiRequest(ApiRequest apiRequest) {
        apiRequestDao.create(apiRequest);
    }

	@Override
	public ApiRequest getApiRequest(Long id) {
		return apiRequestDao.getApiRequestById(id);
	}
    
//    @Override
//    public Person getApiRequest(Long id) {
//    	return personRepository.findOne(id);
//    }
}
