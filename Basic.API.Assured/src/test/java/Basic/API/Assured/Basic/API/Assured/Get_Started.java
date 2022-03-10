package Basic.API.Assured.Basic.API.Assured;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get_Started {
  @Test
  public void Simple_get_request() {
	  
	  given()
	  		.baseUri("https://restcountries.com/v3.1").
	  when()
	  	   .get("/all").
	  then()
	       .statusCode(200);
  }
  
  @Test
  public void Detailed_get_request() {
	  // Validate JASON Response
	  
	  given().
	  		baseUri("https://restcountries.com/v2").
	  when().
	  		get("/alpha/col").
	  then()
	  		.statusCode(200)
	  		.body(
	  				"name", equalTo("Colombia"),
	  				"alpha3Code", equalTo("COL"),
	  				"capital", equalTo("Bogotá"),
	  				"altSpellings", hasItem("Republic of Colombia"),
	  				"currencies[0].name", equalTo("Colombian peso"),
	  				"languages[0].nativeName", equalTo("Español")	
	  				);
  					}
					

  @Test
  public void Validating_xml_response() {
	  given()
	  			.baseUri("https://api.openweathermap.org/data/2.5").
	  			queryParam("q", "London,uk").
				queryParam("appid","cc4f5603265d4b52cf4113cd1db8307b").
				queryParam("mode", "xml").
	  when()
	  		.get("/weather").
	  	then()
	  		.statusCode(200).
	  		body(
	  			"current.city.@name",equalTo("London"),
	  			"current.city.country", equalTo("GB")
	  				);

  }
   @Test
   public void Extract_Response_data() {
	   // Extract Response Data
	   Response res =  given().
			   				baseUri("https://restcountries.com/v2").
			   		when().
			 	  		   get("/alpha/col").
			 	     then().
			 	     		extract().response();
	   				System.out.println(res.asString());
   }
   
   @Test
   public void Extract_Single_value_From_Response() {
	  String pressure = given()
			.baseUri("https://api.openweathermap.org/data/2.5").
			queryParam("q", "London,uk").
		queryParam("appid","cc4f5603265d4b52cf4113cd1db8307b").
		queryParam("mode", "xml").
when()
		.get("/weather").
	then()
		.statusCode(200).
		body(
			"current.city.@name",equalTo("London"),
			"current.city.country", equalTo("GB")
				).
		extract().path("current.pressure.@value");
	   System.out.println(pressure);
	   
   }
   
   @Test
   public void Verifying_Status_Line() {
	   given().
	   		baseUri("https://restcountries.com/v2").
	   	when().
	   		get("/alpha/col").
	   	then().
	   		statusLine("HTTP/1.1 200 OK");
   }
}