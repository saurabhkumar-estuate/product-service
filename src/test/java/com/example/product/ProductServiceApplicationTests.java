package com.example.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.example.product.repository.ProductRepository;

@SpringBootTest(
	    properties = {
	        "spring.cloud.config.enabled=false",
	        "spring.autoconfigure.exclude=" +
	          "org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration," +
	          "org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration"
	    }
	)
	@ActiveProfiles("test")
	class ProductServiceApplicationTests {

	    @MockBean
	    private ProductRepository productRepository;

	    @Test
	    void contextLoads() {
	    }
	}
