package request_Parameters;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.Cookie;

public class Sending_Cookies {
	@Test
	  public void Sending_cookies() {
		 
		  given()
		  		.baseUri("https://api.openweathermap.org/data/2.5")
		  		.queryParam("q", "London,uk")
		  		.queryParam("appid", "cc4f5603265d4b52cf4113cd1db8307b")
		  		.queryParam("mode", "xml")
		  		.cookie("user", "alfa", "beta", "gamma").
		   when()											
			  		.get("/weather"). 
	    	then()
			  		.log().all() 
			  		.statusCode(200);
	  }
	@Test
	  public void Sending_cookies_By_Builder() {
		 Cookie cookie = new Cookie.Builder("user","alfa").setSecured(true).setComment("test cookie").build();
		  given()
		  		.baseUri("https://api.openweathermap.org/data/2.5")
		  		.queryParam("q", "London,uk")
		  		.queryParam("appid", "cc4f5603265d4b52cf4113cd1db8307b")
		  		.queryParam("mode", "xml")
		  		.cookie(cookie).
		   when()											
			  		.get("/weather"). 
	    	then()
			  		.log().all() 
			  		.statusCode(200);
	  }
}
