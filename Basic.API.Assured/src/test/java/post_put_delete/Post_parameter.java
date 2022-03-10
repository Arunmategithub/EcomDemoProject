package post_put_delete;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post_parameter {
	@Test
	  public void PUT_using_jason() {
		  
		  JSONObject body = new JSONObject();
		  body.put("email", "johncarterA20@Gmail.com");
		  body.put("password", "john@123");
		  body.put("response", "User Exists");
		
		  
		    given()
			  		.baseUri("https://automationexercise.com/api").
			  		contentType(ContentType.JSON).
			  		body(body.toString()).
			  	when()
			  		.put("/verifyLogin").
			  	then()
			  		.statusCode(200);
		    System.out.println("User Exists");
	  }
}
