package lippia.web.Listeners;

import org.openqa.selenium.WebDriver;

public interface DriverEventListenerValidation {

    void validate(Throwable throwable, WebDriver driver);
}