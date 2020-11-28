import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class DeleteRequestDemo {

	public static void delete(){
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		String postToDoURL ="https://apichallenges.herokuapp.com/todos/{id}";
		int id = 168;
		given()
		   .contentType(ContentType.JSON)
		   .pathParam("id",id)
		   .delete(postToDoURL)
		   .then()
		   .statusCode(200);
	}

}
