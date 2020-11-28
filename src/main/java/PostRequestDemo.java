import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostRequestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String postToDoURL ="https://apichallenges.herokuapp.com/todos/{id}";
		int id = 168;
		/*String postReqBody = "{\n" +
				" \"title\": \"We are testing using Rest Assured \",\n" +
				" \"doneStatus\": true, \n "+
				" \"description\": \"m ad minim veniam, q\" \n " +
				" }" ;
		
		String a ="{\r\n" + 
				"  \"title\": \"nt in culpa qui offi\",\r\n" + 
				"  \"doneStatus\": true,\r\n" + 
				"  \"description\": \"m ad minim veniam, q\"\r\n" + 
				"}" */
		
		String postAmendBody = "{\r\n" + 
				"  \"title\": \"post request practise 1 \",\r\n" + 
				"  \"doneStatus\": false \r\n" + 
				"}" ;
		//System.out.println("Printing and checking :" + postReqBody);
		System.out.println("Printing and checking :" + postAmendBody) ;
		
	    Response respBody = given()
	   .contentType(ContentType.JSON)
	   .pathParam("id",id)
	   .body(postAmendBody)
	   .post(postToDoURL)
	   .then()
	   .statusCode(200)
	   .extract()
	   .response();
	    
	    respBody.prettyPrint();
	    
	    System.out.println("Program Ending");

	}

}
