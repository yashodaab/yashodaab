package POJO1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runnerclass {

	public static void main(String[] args) 
	{
RestAssured.baseURI="https://reqres.in/";
RequestSpecification req = RestAssured.given();
Response res = req.request(Method.GET,"/api/users/2");

Single_user a1 = res.as(Single_user.class);
Support s = a1.getSupport();

System.out.println(s.getText());

Data d = a1.getData();
System.out.println(d.getFirst_name());

	
	
	}

}