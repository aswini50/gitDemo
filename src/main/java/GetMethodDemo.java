import static io.restassured.RestAssured.given;

import org.apache.http.HttpStatus;

//import org.apache.http.HttpStatus;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetMethodDemo {


	
	public static void main(String args[]) {
	System.out.println("Inside Main Method");
	//1. Set the URL or End point in a variable	
	String getURL = "https://apichallenges.herokuapp.com/todos" ; 
	//2. Perform a GET Operation
	 Response getAll =given()
	.contentType(ContentType.JSON)
	.when()
	.get(getURL)
	.then() //Assertions : 3. Validations to ensure Expected Result matches Actual Results
	.statusCode(HttpStatus.SC_OK)
	.extract()
	.response();
	 getAll.prettyPrint();
	 System.out.println("Exiting Main Method");
}
	
}
