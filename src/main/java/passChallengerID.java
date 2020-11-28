import static io.restassured.RestAssured.given;

import org.apache.http.HttpStatus;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class passChallengerID {
	
	public static void passChallengerIDMethod(){
		String xChallengerID = "536072b2-4973-4a60-b683-d59db05fa936b" ;
		String getToDoURL= "https://apichallenges.herokuapp.com/todos";
		Response toDoList =  given()
				.contentType(ContentType.JSON)
				.header("X-CHALLENGER",xChallengerID)
				.get(getToDoURL)
				.then() //Assertions 
				.statusCode(HttpStatus.SC_OK) 
				.extract() 		
			    .response();
		
/*	Response toDoList =  given().contentType(ContentType.JSON).header("X-CHALLENGER",xChallengerID).get(getToDoURL).then() //Assertions 
		.statusCode(HttpStatus.SC_OK) 
		.extract() 		
	    .response();*/
	
				//System.out.println(toDoList);
		
				toDoList.prettyPrint();
				System.out.println(toDoList.getHeaders());
				
				
				//System.out.println(toDoList.getBody().(type[]) collection.toArray(new type[collection.size()]));

				//String a = toDoList.toString() ;
				//System.out.println(a);
				
				
		


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			}

}
