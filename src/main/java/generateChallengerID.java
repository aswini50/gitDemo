
import static io.restassured.RestAssured.given;

import org.apache.http.HttpStatus;

import io.restassured.http.ContentType;

public class generateChallengerID {
//Goal : To generate a GUID Session ID for all API Challenges
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 String challengerURI = "https://apichallenges.herokuapp.com/challenger";
 //spec (Req Spec) and (Res Spec)  --> Reusablity
 
	//Response challengerID 
	String xChallenger =  
			given()
				//.contentType(ContentType.JSON)
			.when()
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
	
}
