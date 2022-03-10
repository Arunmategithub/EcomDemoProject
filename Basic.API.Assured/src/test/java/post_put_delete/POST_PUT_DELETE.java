package post_put_delete;

import org.json.JSONObject;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.specification.Argument;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.List;

public class POST_PUT_DELETE {
  @Test
  public void POST() {
	  File file = new File("Resource.Data/create_employee.json");
	  
	int id =  given()
	  		.baseUri("http://dummy.restapiexample.com/api/v1").
	  		contentType(ContentType.JSON).
	  		body(file).
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
