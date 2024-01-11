package PerformPostAction;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UsingRestassured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI="https://reqres.in/";
RequestSpecification req = RestAssured.given();
JSONObject obj = new JSONObject();
obj.put("name", "yeshoda");
obj.put("job", "TestEngineer");
req.contentType(ContentType.JSON);
req.body(obj.toJSONString());
Response res = req.request(Method.POST,"/api/users");
System.out.println(res.asString());
System.out.println(res.getStatusCode());

	}

}
