package com.fred.data.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.fred.data.service.api.PersonService;

@FeignClient(value = "data-service",path="data-service")
public interface PersonServiceClient extends PersonService {

}
