package Rest1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Jsonbody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification Req = RestAssured.given();
		Response res = Req.request(Method.GET,"/api/users?page=2");
		str=res.asString()
	}

}
