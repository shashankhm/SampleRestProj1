package com.sh.RestProj.controllers;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestRestEndpointControllerTest {


    @InjectMocks  // No additional Import needed. Looks like coming from spring boot test
    private TestRestEndpointController testRestEndpointController;

    //@Mock
    // Any feilds

    @Test
    public void testGetMsg(){


        //Mockito.when.then
    }
}
