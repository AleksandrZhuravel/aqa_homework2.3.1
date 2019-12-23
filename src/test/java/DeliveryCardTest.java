
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
}
