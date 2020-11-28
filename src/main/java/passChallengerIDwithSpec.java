import static io.restassured.RestAssured.given;

import org.apache.http.HttpStatus;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class passChallengerIDwithSpec {
	//public main().. --> No Main Method Here 
	
	static String xChallengerID = "536072b2-4973-4a60-b683-d59db05fa936b" ;
	static String getToDoURL= "https://apichallenges.herokuapp.com/todos";

final static RequestSpecification reqSpec = new RequestSpecBuilder().
					build().
					contentType(ContentType.JSON).header("X-CHALLENGER",xChallengerID)
					;

final static ResponseSpecification respSpec= new ResponseSpecBuilder().
build().statusCode(HttpStatus.SC_OK);
/*body("RestResponse.result.name",equalTo("India"),
	 "RestResponse.result.alpha2_code",equalTo("IN"),
	 "RestResponse.result.alpha3_code",equalTo("IND"));*/
   
	public static void passChallengerIDMethod(){
		
		Response toDoList =  
				given()
					//.contentType(ContentType.JSON)
					//.header()
					.spec(reqSpec)
				.when()
					.get(getToDoURL)
				.then() //Assertions 
					//.statusCode(HttpStatus.SC_OK) 
					.assertThat()
					.spec(respSpec)
					.extract() 		
			    .response();
			
				toDoList.prettyPrint();
				System.out.println(toDoList.getHeaders());
					}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passChallengerIDMethod();
			}

}
