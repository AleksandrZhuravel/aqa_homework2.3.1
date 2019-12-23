import com.github.javafaker.Faker;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DataGenerator {


    public static String cityGenerator() {
        Faker faker;
        faker = new Faker(new Locale("ru"));
        String city = faker.address().city();
        return city;
    }

    public static String nameGenerator() {
        Faker faker;
        faker = new Faker(new Locale("ru"));
        String name = faker.name().fullName();
        return name;
    }

    public static String phoneGenerator() {
        Faker faker;
        faker = new Faker(new Locale("ru"));
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }

    public static String firstDateGenerator() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String firstDate = LocalDate.now().plusDays(4).format(formatter);
        return firstDate;
    }

    public static String secondDateGenerator() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String secondDate = LocalDate.now().plusDays(5).format(formatter);
        return secondDate;
    }
}
