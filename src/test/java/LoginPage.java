import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static void login () {
        Faker faker;

        faker = new Faker(new Locale("ru"));
        String city = faker.address().city();
        String name = faker.name().fullName();
        String phone = faker.phoneNumber().phoneNumber();

        $("[data-test-id = city] input").setValue(city);
        $("[data-test-id = date] input").sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        $("[data-test-id = name] input").setValue(name);
        $("[data-test-id = phone] input").setValue(phone);
    }
}
