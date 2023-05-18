package RestAssuredPractice;

import org.testng.annotations.Test;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class PostMethods {
	
	// 1) Using Hasmap Methods
	// 2) Using org.json
	// 3) Using POJO Class--> Plain Old Java Object
	// 4) Using an external Json Files.
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	void HashMethod()
	{
		HashMap hm = new HashMap();
		hm.put("Name","Peddireddy");
		hm.put("location","banglore");
		hm.put("phone","123456");
		String arr[] = {"c","c++"};
		hm.put("courses",arr);
		
		given()
		 .contentType("application/json")
		 .body(hm)
		.when()
		  .post("http://localhost:3000/students")
		.then()
		 .statusCode(201)
		 .body("Name",equalTo("Peddireddy"))
		 .body("location",equalTo("banglore"))
		 .body("phone",equalTo("123456"))
		 .body("courses[0]",equalTo("c"))
		 .body("courses[1]",equalTo("c++"))
		 .log().all()
	;}

}
