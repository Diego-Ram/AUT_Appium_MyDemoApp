package starter.utils;

import net.datafaker.Faker;

import java.util.Locale;
import java.util.Calendar;

public class DataFakeGenerate {

    final Faker faker = new Faker(Locale.ENGLISH);

    public static DataFakeGenerate generateTo() {
        return new DataFakeGenerate();
    }
    public static String fullName() {
        String fullName = generateTo().faker.eldenRing().npc();
        return fullName;
    }
    public static String address1(){
        String address1 = generateTo().faker.address().fullAddress();
        return  address1;
    }
    public static String address2(){
        String address2 = generateTo().faker.address().secondaryAddress();
        return  address2;
    }
    public static String city(){
        String city = generateTo().faker.address().cityName();
        return  city;
    }
    public static String state(){
        String state = generateTo().faker.address().state();
        return  state;
    }
    public static String zipcode(){
        String zipcode = generateTo().faker.address().zipCode();
        return  zipcode;
    }

    public static String country(){
        String country = generateTo().faker.address().country();
        return  country;
    }
    public static int card(){
        int card = generateTo().faker.number().numberBetween(1000000000,1999999999);
        return card;
    }
    public static int expDate(){
        int expDate = generateTo().faker.number().numberBetween(125,140);
        return  expDate;
    }
    public static long securityCode(){
        long securityCode = generateTo().faker.number().numberBetween(100, 999);
        return  securityCode;
    }
    public static String emailRandom(){
        String emailRandom = generateTo().faker.company().name() + "@test.com";
        return  emailRandom;
    }
    public static String passRandom(){
        String passRandom = generateTo().faker.beer().name();
        return passRandom;
    }

}