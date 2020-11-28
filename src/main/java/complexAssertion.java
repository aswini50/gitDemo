import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static io.restassured.path.json.JsonPath.from;


import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpStatus;
import org.hamcrest.Matcher;
import org.junit.Test;


import io.restassured.response.Response;
import junit.framework.TestCase;
import util.*;


public class complexAssertion extends TestCase{
/*
	//@Test
	public void test_all_countries() {
		 Response  countryResponse = get("http://localhost:8080/api/country/country/get/all");
			
			countryResponse.prettyPrint();// List and display the results of get ALL operation 
		 
			given().
			get(APIUtil.ALL_COUNTRY_URI).
			then().
			statusCode(HttpStatus.SC_OK).
			body("RestResponse.result.size()", equalTo(249))
		   .body("RestResponse.result[0].name",equalTo("Afghanistan"))
		   .body("RestResponse.result[-1].name",equalTo("Zimbabwe"))
		   .body("RestResponse.messages[0]",containsString("249"));
	}
	
	

	//@Test
	public void test_alpha2_code() {
		 given()
		.get(APIUtil.ISO2_COUNTRY_URI)
		.then()
		.statusCode(HttpStatus.SC_OK)
		.extract()
		.response()
		.prettyPrint();
	
	}
	
	//@Test
	public void test_alpha3_code(){
		given()
		.get(APIUtil.ISO3_COUNTRY_URI)
		.then()
		.statusCode(HttpStatus.SC_OK)
		.extract()
		.response()
		.prettyPrint();
	}
	
			
			
			given()
			.get()
			.then()
			.statusCode(HttpStatus.SC_OK)
			.extract()
			.response()
			.prettyPrint();*/
		
	
	
	//Read from a JSON file
	
	@Test
	
	public void test_products_list() {
		
	   //File productFile = new File("/aswini/src/main/resources/products.json"); // 700-750
		
InputStreamReader productFile = new InputStreamReader(getClass().getClassLoader().getResourceAsStream("products.json"));
	       
		
		    List< Map<String,String> > productList= from(productFile).get("products.findAll { product-> (product.Price >=700 && product.Price <=900) }");

		    		System.out.println(productList);
		    		System.out.println("No. of product items returned : "+ productList.size());
		    
		    assertEquals(10, productList.size());//Assertion 
		    
		   /*if(2 == productList.size()) 
	System.out.println("Your test case passed !") ;
	else
	{
		System.out.println("Your test case failed!");
		assertEquals(1, productList.size());*/
	}
		 
	}

	

