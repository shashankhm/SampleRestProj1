package com.sh.RestProj.controllers;


import com.sh.RestProj.pojo.PostMessage;
import com.sh.RestProj.pojo.SuccessResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class TestRestEndpointController {

    @Value("${testkey1}")
    private String testkey1;

    @Value("${testkey2}")
    private String testkey2;

    @GetMapping(value = "/getMessage")
    public String getTestMessage(){

        return testkey1 + " - "+ testkey2;
    }

    @PostMapping(value = "/postMessage/{from}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity postMsg(@RequestBody PostMessage postMessage, @PathVariable (value = "from") String sender){ // @PathVariable, @RequestHeader
        // Advantage of using Reponse Entity over some structure.
        SuccessResponse resp = null;  // some back end call
        return ResponseEntity.status(HttpStatus.CREATED).body(resp);
    }


}
