package Sample;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class rest1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		given().get("api/users?page=2").then().
		assertThat().statusCode(200).and().contentType(ContentType.JSON);
		System.out.println("done");

	}
}
