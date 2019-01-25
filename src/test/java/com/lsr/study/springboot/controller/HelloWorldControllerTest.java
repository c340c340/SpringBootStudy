package com.lsr.study.springboot.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * HelloWorldController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>һ�� 25, 2019</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {
    private MockMvc mvc;

    @Before
    public void before() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: index()
     */
    @Test
    public void testIndex() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }


} 
