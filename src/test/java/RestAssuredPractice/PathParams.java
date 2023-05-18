package RestAssuredPractice;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class PathParams {
	
	//https://reqres.in/api/users?page=2
	
	
	@Test()
	void testQuery()
	{
		given()
		 .pathParam("mypath","users")
		 .queryParam("page",2)
		 .queryParam("id",5)
		 
		
		
		.when()
		  .get("https://reqres.in/api/{mypath}")
		
		
		
		.then()
		 .statusCode(200)
		 .log().all()
		
		
		
	;}
	
	@Test()
	void Cookie()
	{
		Response res = given()
			
		
		
		.when()
			.get("https://reqres.in/api/");
			//single cookie information
			String cookie  = res.getCookie("AEC");
			System.out.println(cookie);
//		.then()
//			.log().all()
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	;}
	
	
	
}
