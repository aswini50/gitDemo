import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class getChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.EndPoint(URL)
		String challengesURL = "https://apichallenges.herokuapp.com/challenges" ;
		//2.get() Method
		//4.Save the response in a Response type variable
		Response challengesList = 
				given().
					//header("x-challenger",xyz)
				when().
					get(challengesURL).
				then().
					statusCode(200).
					extract(). //3.Extract the response
					response() ;
				
		//5.Print or  Display the response 
		//System.out.println(challengesList);
		challengesList.prettyPrint();
		

	}

}
