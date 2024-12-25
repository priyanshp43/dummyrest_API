package com.restapiexample.dummy.requests;

import com.restapiexample.dummy.model.DummyRestPojo;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateEmployeeData {

    @Test
    public void updateUserinfo() {


        DummyRestPojo dummyRestPojo = new DummyRestPojo();

        dummyRestPojo.setName("Urvi P");
        dummyRestPojo.setSalary(50000);
        dummyRestPojo.setAge(28);
        dummyRestPojo.setImage(" ");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .pathParam("age", 7266)
                .when()
                .body(dummyRestPojo)
                .put("/{age}");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}


