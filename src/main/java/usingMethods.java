	/*1. I want to extract a particular element and print it out.
	2. How to get the size of the Response Object?
	3. I want to verify if todos[0].id = 65
	*/

	import static io.restassured.RestAssured.given;

	import java.util.List;

	import org.apache.http.HttpStatus;

	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	
	
	public class usingMethods {


		public static void main(String[] args) {

			String xChallengerID = "536072b2-4973-4a60-b683-d59db05fa936b";

			String getToDoURL = "https://apichallenges.herokuapp.com/todos";

			Response response = given().contentType(ContentType.JSON).get(getToDoURL).then().statusCode(HttpStatus.SC_OK)
					.extract().response();

			System.out.println("=======Complete Response=============");
			response.prettyPrint();

			// Get Status Code
			System.out.println("=======Response Time in Seconds=============");
			System.out.println((double) response.getTime()/1000);

			// Get Status Code
			System.out.println("=======Response Status Code=============");
			System.out.println(response.getStatusCode());

			System.out.println("=======Response Status Line=============");
			System.out.println(response.statusLine());

			// Get Response headers
			System.out.println("=======Response Headers=============");
			System.out.println(response.getHeaders());

			// Get first challenger ID
			System.out.println("=======Get 1 Challenger ID=============");
			String firstChallengerID = response.getBody().jsonPath().get("todos[0].id").toString();
			// TODO: Put if condition to verify the ID
			System.out.println(firstChallengerID);

			// Get All challenger IDs
			System.out.println("=======All Challenger IDs=============");
			List idList = response.getBody().jsonPath().getList("todos.id");
			System.out.println(idList);

			// Number of ToDo List in the response
			System.out.println("========Number of TODOs in the response =============");
			System.out.println(idList.size());

	                // int sizeList = idList.size();

		}

	}


