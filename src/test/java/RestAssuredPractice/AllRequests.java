package RestAssuredPractice;

import org.testng.annotations.Test;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class AllRequests {
	
	int id;
	
    @Test(priority=1)
	void getUsers()
	{
    	given()
    	
		.when() // https://reqres.in/api/users?page=2
		 .get("https://reqres.in/api/users?page=2")
		 
		.then()
		 .statusCode(200)
		 .body("page",equalTo(2))
		 .log().all();
		 
	}
    
    @Test(priority=2)
    void postUser()
    {
    	HashMap<String, String> hm= new HashMap<String, String>();
    	hm.put("name","Peddireddy");
    	hm.put("job","engineer");
    	
    	
    	id=given()
    	.contentType("application/json")
    	.body(hm)
    	
    	.when() //https://reqres.in/api/users
    	.post("https://reqres.in/api/users")
    	.jsonPath().getInt("id")
    	
    	
    	
    	
    	/*.then()
    	  .statusCode(201)
    	  .log().all()
    	*/
    
   ; }
    
    @Test(priority=3,dependsOnMethods={"postUser"})
    void updateuser()
    {
    	HashMap<String, String> hm= new HashMap<String, String>();
    	hm.put("name","Annapureddy");
    	hm.put("job","Test engineer");
    	
    	given()
    	.contentType("application/json")
    	.body(hm)
    	
    	.when() //https://reqres.in/api/users
    	  .put("https://reqres.in/api/users/"+id)
    	
    	.then()
  	     .statusCode(200)
  	     .log().all()
    	
   ; }
    
    
    @Test(priority=4,dependsOnMethods= {"updateuser"})
    void delete()
    {
    	
    	given()
    	.when()
    	 .delete("https://reqres.in/api/users/"+id)
    	.then()
    	  .statusCode(204)
    	  .log().all()
    	
    	
    	
    	
    ;}

}
	
