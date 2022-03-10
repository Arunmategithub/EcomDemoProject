package post_put_delete;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Delete_request {
	@Test
	  public void DELETE_using_jason() {
		  
		   String msg = given()
			  		.baseUri("http://dummy.restapiexample.com/api/v1").
			  		contentType(ContentType.JSON).
			  	when()
			  		.delete("/delete/1").
			  	then()
			  		.statusCode(200)
			  		.extract().path("message");
		   System.out.println(msg);
	  }
}
