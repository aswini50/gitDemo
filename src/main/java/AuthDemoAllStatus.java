import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AuthDemoAllStatus {

	 public static void main(String[] args){
		 
		String PostAuthUrl = "https://apichallenges.herokuapp.com/secret/token";
		//String NoteUrl = "https://apichallenges.herokuapp.com/secret/note"; 
		
		String Token =given().
			contentType(ContentType.JSON).
			header("X-Challenger","6b306772-33f3-41db-b33c-80322f281b95").
			auth().preemptive().basic("admin", "password").
		when().
			post(PostAuthUrl).
		then().
			statusCode(201).
			extract().
			header("X-Auth-Token") ;

		 System.out.println("Token value is :" + Token );
	
	 }	
}
