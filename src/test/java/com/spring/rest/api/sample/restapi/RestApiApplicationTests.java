package com.spring.rest.api.sample.restapi;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest
class RestApiApplicationTests {

    @Test
    void contextLoads() throws IOException {
        //Given
        HttpUriRequest request = new HttpGet( "http://localhost:8080/hello" );

        // When
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
        assertThat(httpResponse.getStatusLine().getStatusCode(),
                equalTo(HttpStatus.SC_OK));

    }

}
