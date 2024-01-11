package POJO1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET, "/api/users/2");
		Single_users a1 = res.as(Single_users.class);
		Support s = a1.getSupport();
		System.out.println(s.getText());
		Data d = a1.getData();
		System.out.println(d.getFirst_name());

	}

}
