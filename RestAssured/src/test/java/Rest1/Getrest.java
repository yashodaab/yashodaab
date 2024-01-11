package Rest1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getrest {

	public Getrest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI="https://reqres.in";
RequestSpecification Req = RestAssured.given();
Response res = Req.request(Method.GET,"/api/users/2");
System.out.println(res.asString());
System.out.println(res.getStatusCode());
System.out.println(res.getStatusLine());
System.out.println(res.getContentType());


	}

}
