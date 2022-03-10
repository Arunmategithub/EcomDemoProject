package post_put_delete;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class POST_request_using_JSON {

	  @Test
	  public void Post_using_jason() {
		  
		  JSONObject body = new JSONObject();
		  body.put("name", "test");
		  body.put("salary", "123");
		  body.put("age", "23");
		
		  
		  int id =  given()
			  		.baseUri("http://dummy.restapiexample.com/api/v1").
			  		contentType(ContentType.JSON).
			  		body(body.toString()).
			  	when()
			  		.post("/create").
			  	then()
			  		.statusCode(200).
			  		body(
			  			"data.name", equalTo("test"))
			  		.extract().path("data.id")	;
			  				
			System.out.println(id);
	  }
	  
}
