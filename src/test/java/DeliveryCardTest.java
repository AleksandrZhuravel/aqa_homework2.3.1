import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DeliveryCardTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String firstDate = LocalDate.now().plusDays(4).format(formatter);
    String secondDate = LocalDate.now().plusDays(5).format(formatter);

    @Test
    @DisplayName("Should show confirmation message if date rescheduled")
    public void positiveRescheduledDateRequest() {
        open("http://localhost:9999");
        LoginPage.login();
        $("[data-test-id = date] input").setValue(firstDate);
        $("[data-test-id = city] input").click();
        $("[data-test-id = agreement]").click();
        $(By.className("button__content")).click();
        $("[data-test-id = date] input").sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        $("[data-test-id = date] input").setValue(secondDate);
        $(By.className("button__content")).click();
        SelenideElement blockReplanNot = $("[data-test-id = replan-notification]");
        blockReplanNot.$(By.className("button")).click();
        SelenideElement blockSuccessNot = $("[data-test-id = success-notification]");
        blockSuccessNot.$(By.className("notification__content")).shouldHave(exactText("Встреча успешно запланирована на " + secondDate));
    }
}
