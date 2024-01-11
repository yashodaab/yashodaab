package JSON;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class passthroughjsonbodyfetchthebody {

	public static void main(String[] args) {
RestAssured.baseURI="https://reqres.in/";
RequestSpecification req = RestAssured.given();
Response res = req.request(Method.GET,"/api/users?page=2");
String str = res.asString();
JsonPath jp = new JsonPath(str);
String f_n = jp.get("data[0].first_name");
System.out.println(f_n);
String url = jp.get("support.url");
System.out.println(url);

	
	}

}
