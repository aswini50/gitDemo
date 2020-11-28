import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AuthDemo401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String PostAuthUrl = "https://apichallenges.herokuapp.com/secret/token";
		String NoteUrl = "https://apichallenges.herokuapp.com/secret/note";
		//String token = "041d2519-a6a1-4c02-b7c7-c37e5ff1bd0c";
		//String token2="17bc5369-46ca-4441-8124-6f999c0bded3";
		String token3="041d2519-a6a1-4c02-b7c7-c37e5ff1bd0c" ;
	/*	
		
		given().
			contentType(ContentType.JSON).
			auth().preemptive().basic("admin", "password1").
		when().
			post(PostAuthUrl).
		then().
			statusCode(401) ; */
		
/*
		String token = given().
			contentType(ContentType.JSON).
			auth().preemptive().basic("admin", "password").
			header("X-CHALLENGER","1c7b2484-0d09-463d-9b5c-161339184e44").
		when().
			post(PostAuthUrl).
		then().
			statusCode(201).
			extract().
			header("X-AUTH-TOKEN");
		
		System.out.println("Token for Auth is :"+ token );
		
	*/
		
		Response note = given().
			header("X-CHALLENGER","1c7b2484-0d09-463d-9b5c-161339184e44").
			header("X-AUTH-TOKEN", token3).
		when().
			get(NoteUrl).
		then().
			statusCode(200).
			extract().
			response() ;
		
		note.prettyPrint(); 
		
	
		/*
		String noteRequestBody = "{\"note\":\"my note : I am testing POST operation with Binaifer \"}" ;
		Response note = given().
				header("X-CHALLENGER","1c7b2484-0d09-463d-9b5c-161339184e44").
				header("X-AUTH-TOKEN", token3 ).
			when().
				body(noteRequestBody).
				post(NoteUrl).
			then().
				statusCode(200).
				extract().
				response() ;
		
		note.prettyPrint();  
		*/
	}

}
