package com.example.demo;



import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.bo.Student;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
@SpringBootTest(classes = DemoApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@LocalServerPort
    private int port;
 
    @Autowired
    private TestRestTemplate restTemplate;
 
   
    @Test
    public void testAllStudents() 
    {
        assertTrue(
                this.restTemplate
                    .getForObject("http://localhost:" + port + "/students", Student[].class)
                    .length != 0);
    }
    @Test
    void contextLoads() {
    }

}
