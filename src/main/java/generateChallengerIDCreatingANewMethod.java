
import static io.restassured.RestAssured.given;

import org.apache.http.HttpStatus;

import io.restassured.http.ContentType;

public class generateChallengerIDCreatingANewMethod {
//Goal : To generate a GUID Session ID for all API Challenges
	
		public static void generateChallengerIDMethod(){
			
//This method will create a new challenger ID and print it out 
 String challengerURI = "https://apichallenges.herokuapp.com/challenger";
 
	//Response challengerID 
	String xChallenger =  given()
	.contentType(ContentType.JSON)
	.post(challengerURI)
	.then() //Assertions 
	.statusCode(HttpStatus.SC_CREATED) 
	.extract() 		
    .header("X-CHALLENGER");
	System.out.println(xChallenger);
	//.extract()
		//.response();
		//challengerID.prettyPrint();
}
	

public static void main(String[] args){
	generateChallengerIDMethod();
}
}