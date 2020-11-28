
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PathParamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String getToDOURL= "https://apichallenges.herokuapp.com/todos/{id}" ;
		//String getToDOURL= "https://apichallenges.herokuapp.com/todos/122" ;
		int id = 122 ;
		
		Response specificToDo =given()
		.contentType(ContentType.JSON)
		.pathParam("id",id)
		.get(getToDOURL)
		.then()
		.statusCode(200)
		.extract()
		.response();
		specificToDo.prettyPrint();   
		
		//POST a To Do with doneStatus = True 
		String getToDos ="https://apichallenges.herokuapp.com/todos";
		String postReqBody = "{\r\n" + 
				"  \"title\": \"Rest Assured POST Demo \",\r\n" + 
				"  \"doneStatus\": true,\r\n" + 
				"  \"description\": \"ommodo consequat. Du\"\r\n" + 
				"}" ;
		
		given().
			contentType(ContentType.JSON).
			body(postReqBody).
		when().
			post(getToDos).
		then().
			statusCode(201);
		
		/*
		// QUERY PARAM
		//String getToDos ="https://apichallenges.herokuapp.com/todos";
		Response queryResponse = given()
		.contentType(ContentType.JSON)
		.queryParam("doneStatus",true)
		.get(getToDos)
		.then()
		.statusCode(200)
		.extract()
		.response();
		queryResponse.prettyPrint();   */
		
		
		
		
		

	}

}
