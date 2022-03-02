package com.niit.userproductservice.proxy;

import com.niit.userproductservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="authentication-service",url="localhost:8085")
public interface UserProxy {
    @PostMapping("api/v2/cutomerData/register")
    public ResponseEntity<?> saveUser(@RequestBody Customer customer);
}//end of interface
