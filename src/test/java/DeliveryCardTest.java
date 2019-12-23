
import static com.codeborne.selenide.Selenide.*;

public class DeliveryCardTest {

    public void positiveRescheduledDateRequest() {
        open("http://localhost:9999");
        LoginPage.getCity();
        LoginPage.cleanDateEntryField();
        LoginPage.getFirstDate();
        LoginPage.correctiveClick();
        LoginPage.agreementChekboxClick();
        LoginPage.plannigDateButtonClick();
        LoginPage.cleanDateEntryField();
        LoginPage.getSecondDate();
        LoginPage.plannigDateButtonClick();
        LoginPage.replannigDateButtonClick();
        LoginPage.checkSuccessRescheduledDateRequest();
    }






    /*@Test
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
    }*/
}
