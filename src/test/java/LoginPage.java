import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static String cityOne = DataGenerator.cityGenerator();
    private static String phoneOne = DataGenerator.phoneGenerator();
    private static String nameOne = DataGenerator.nameGenerator();
    private static String firstDateOne = DataGenerator.firstDateGenerator();
    private static String secondDateOne = DataGenerator.secondDateGenerator();

    public static void getCity() {
        $("[data-test-id = city] input").setValue(cityOne);
    }

    public static void cleanDateEntryField() {
        $("[data-test-id = date] input").sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
    }

    public static void getName() {
        $("[data-test-id = name] input").setValue(nameOne);

    }

    public static void getPhone() {
        $("[data-test-id = phone] input").setValue(phoneOne);

    }

    public static void getFirstDate() {
        $("[data-test-id = date] input").setValue(firstDateOne);
    }

    public static void getSecondDate() {
        $("[data-test-id = date] input").setValue(secondDateOne);
    }

    public static void correctiveClick() {
        $("[data-test-id = city] input").click();
    }

    public static void agreementChekboxClick() {
        $("[data-test-id = agreement]").click();
    }

    public static void plannigDateButtonClick() {
        $(By.className("button__content")).click();
    }

    public static void replannigDateButtonClick() {
        SelenideElement blockReplanNot = $("[data-test-id = replan-notification]");
        blockReplanNot.$(By.className("button")).click();
    }

    public static void checkSuccessRescheduledDateRequest() {
        SelenideElement blockSuccessNot = $("[data-test-id = success-notification]");
        blockSuccessNot.$(By.className("notification__content")).shouldHave(exactText("Встреча успешно запланирована на " + secondDateOne));
    }
}
