package PerformGetOperation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Restassured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI="https://reqres.in/";
RequestSpecification req = RestAssured.given();
Response res = req.request(Method.GET,"/api/users?page=2");
System.out.println(res.asString());
System.out.println(res.getStatusCode());
System.out.println(res.getStatusLine());
System.out.println(res.getContentType());
	}

}
