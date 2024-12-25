package com.restapiexample.dummy.requests;

import com.restapiexample.dummy.model.DummyRestPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateEmployeeData extends TestBase {

    @Test
    public void createEmployee() {

        DummyRestPojo dummyRestPojo = new DummyRestPojo();

        dummyRestPojo.setName("Urvi P");
        dummyRestPojo.setSalary(50000);
        dummyRestPojo.setAge(27);
        dummyRestPojo.setImage(" ");

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .when()
                .body(dummyRestPojo)
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}


