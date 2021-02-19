package com.sh.RestProj.atdd;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(initializers = AccptanceContextInitializr.class)
@ActiveProfiles(value = "test")
@DirtiesContext
public class AcceptanceStepDefinitions {

    @LocalServerPort
    int port;


    // inti

    // Given when then
}
