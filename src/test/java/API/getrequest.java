package API;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class getrequest
{
	public static void main(String[] args)
	{
		Response response=
		 given()
         .header("Content-Type", "application/json")
         .body("{\"userEmail\":\"anshika@gmail.com\","
                 + "\"userPassword\":\"Iamking@000\"}")

     .when()
         .post("https://rahulshettyacademy.com/api/ecom/auth/login");
		System.out.println(response.asString());
		String userid=response.jsonPath().getString("userId");
		String token=response.jsonPath().getString("token");
		String msg=response.jsonPath().getString("message");
		System.out.println(userid+msg);
     
 }


}
