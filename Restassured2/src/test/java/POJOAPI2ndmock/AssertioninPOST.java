package POJOAPI2ndmock;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssertioninPOST {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.POST,"/api/users");
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getContentType());
	}

}
