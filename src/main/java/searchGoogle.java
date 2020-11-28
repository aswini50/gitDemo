
import static io.restassured.RestAssured.given;

import org.apache.http.HttpStatus;

import io.restassured.http.ContentType;

public class searchGoogle {
//Goal : To generate a GUID Session ID for all API Challenges
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 String challengerURI = "https://www.googleapis.com/fitness/v1/resourcePath?parameters";
		 
		 given()
	.contentType(ContentType.JSON)
	.get(challengerURI)
	.then() //Assertions 
	.statusCode(HttpStatus.SC_OK) 
	.extract() 		
    .response()
    .prettyPrint();
		 
			
}
	
}
