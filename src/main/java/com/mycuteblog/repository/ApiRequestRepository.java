package com.mycuteblog.repository;

import org.springframework.data.repository.CrudRepository;
import com.mycuteblog.model.ApiRequest;
import java.util.List;


public interface ApiRequestRepository //extends CrudRepository<ApiRequest, Long> 
{
    List<ApiRequest> findAllByName(String name);
}