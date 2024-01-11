package yashoda;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class rest {

	public static void main(String[] args) 
	{
				RestAssured.baseURI="https://reqres.in";
				given().get("api/users?page=2").then().
				assertThat().statusCode(200).and().contentType(ContentType.JSON);
				System.out.println("done");

			}
	}


