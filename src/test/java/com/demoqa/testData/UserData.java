package com.demoqa.testData;

import com.demoqa.utils.Month;
import com.github.javafaker.Faker;

import java.util.Locale;

public class UserData {
    private static final Faker faker = new Faker(new Locale("en"));

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String email = faker.internet().emailAddress();
    public static String number = faker.phoneNumber().subscriberNumber(10);
    public static String gender = "Male";
    public static String picture = "2.jpg";
    public static String hobby = "Sports";
    public static String subject = "English";
    public static String path = "src/test/resources/2.jpg";
    public static String address = faker.address().fullAddress();
    public static String state = "NCR";
    public static String city = "Delhi";
    public static String day = "07";
    public static String month = "September";
    public static String year = "1994";
    public static String date = day + " " + month + "," + year;




}
