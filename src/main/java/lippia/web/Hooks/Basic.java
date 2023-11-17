package lippia.web.Hooks;
import com.crowdar.driver.DriverManager;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lippia.web.Listeners.DriverValidatorListener;
public class Basic {

    @Before( order = 0 )
    public void beforeScenario( Scenario scenario ) {
        DriverManager.getDriverInstance().register( new DriverValidatorListener() );
    }
    @After
    public void afterScenario(){
        DriverManager.dismissCurrentDriver();
    }
}
