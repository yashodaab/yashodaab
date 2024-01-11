package Rest1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getrest1 {

	public getrest1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res=req.request(Method.GET,"/api/users/2");
		res.prettyPrint();

	}

}
