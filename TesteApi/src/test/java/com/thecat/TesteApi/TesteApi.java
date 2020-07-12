package com.thecat.TesteApi;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class TesteApi {
	
	@Test
	public void cadastro() {
		String url = "https://api.thecatapi.com/v1/user/passwordlesssignup";
		String corpo = "{ \"email\": \"daniel.lucas@gmail.com\", \"appDescription\": \"Teste Curso Udemy4\" }";
		
		//Dado que informei os valores do body
		given().contentType("application/json").body(corpo).
		//Quando uso esse body em uma url
		when().post(url).
		//Então recebo o status Code
		then().statusCode(200);
		
		
	}

}
