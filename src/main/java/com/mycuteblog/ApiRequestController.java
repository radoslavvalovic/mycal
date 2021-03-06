package com.mycuteblog;

import com.mycuteblog.model.ApiRequest;
import com.mycuteblog.repository.ApiRequestRepository;
import com.mycuteblog.service.ApiRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@RestController
@EnableAutoConfiguration
public class ApiRequestController {

    @Autowired
    private ApiRequestService apiRequestService;
//    @Autowired
//    private ApiRequestRepository apiRequestRepository;

    private static final Logger logger = LoggerFactory.getLogger(ApiRequestController.class);

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getHome() {
        logger.info("Api request received");

        Map<String, String> response = new HashMap<String, String>();
        try {
            ApiRequest apiRequest = new ApiRequest(new Date());
            apiRequestService.createApiRequest(apiRequest);
//            apiRequestRepository.save(apiRequest);
            logger.info("ApiRequest.toString" + apiRequest.toString());
            response.put("status", "success");
            logger.info(apiRequestService.toString());
            logger.info("Info z getApiRequest" + apiRequestService.getApiRequest(1L).toString());
        } catch (Exception e) {
            logger.error("Error occurred while trying to process api request", e);
            response.put("status", "fail");
        }
        return response;
    }
}
