package ServerinformationinRA;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import okhttp3.Headers;

public class andfetchdaresponsetime {
public static void main(String[]args)
{
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET,"/api/users/2");
	System.out.println(res.asString());
	 Headers hd = res.getHeaders();
	 System.out.println(hd);
	 String serv1 = res.getHeader("server");
	 System.out.println(serv1);
	 System.out.println(res.getTime());
	
}
}
