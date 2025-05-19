package step.definitions;

import io.cucumber.java.Scenario;
import org.junit.Before;

public class DemoGetcall {
    public DemoGetcall() {

        @Before
        public void before(Scenario scenario){
            this.scenario= scenario;
        }
        Given("^Get all post \"([^\"]*)\"$", (String arg0) -> {
        });
    }
}
