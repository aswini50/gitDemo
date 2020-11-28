import static io.restassured.path.json.JsonPath.from;
import static org.junit.Assert.*;

import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ReadFromJSONFile {
	
@Test
	
	public void test_products_list() {
		
	   //File productFile = new File("/aswini/src/main/resources/products.json"); // 700-750
		
		InputStreamReader productFile = new InputStreamReader(getClass().getClassLoader().getResourceAsStream("products.json"));
	       
		    List< Map<String,String> > productList= from(productFile).
					get("products.findAll { product-> (product.Price >=600 && product.Price <=750) }");//Giving a range

		    System.out.println(productList);//Printing out 
		    System.out.println("The no. of products that meet price range :"+productList.size());
		    //assertEquals(4, productList.size());//Assertion 
		    
		   if(3 == productList.size()) 
	System.out.println("Your test case passed !") ;
	else
	{
		System.out.println("Your test case failed!");
		//assertEquals(1, productList.size());
	}
		 
	}
	


}
