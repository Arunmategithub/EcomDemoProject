package post_put_delete;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PUT_request_Using_JSON {
	@Test
	  public void PUT_using_jason() {
		  
		  JSONObject body = new JSONObject();
		  body.put("name", "arun");
		  body.put("salary", "100000");
		  body.put("age", "28");
		
		  
		    given()
			  		.baseUri("http://dummy.restapiexample.com/api/v1").
			  		contentType(ContentType.JSON).
			  		body(body.toString()).
			  	when()
			  		.put("/update/24").
			  	then()
			  		.statusCode(200);
	  }
}
