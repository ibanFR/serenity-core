package net.thucydides.samples;

import net.serenitybdd.junit5.SerenityAfterEachCallback;
import net.serenitybdd.junit5.SerenityBDD;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityAfterEachCallback.class)
@ExtendWith(SerenityJUnit5Extension.class)
@SerenityBDD
public class SampleTestScenario {
    
    @Steps
    public SampleNonWebSteps steps;
        
    @Test
    public void happy_day_scenario() {
        steps.stepThatSucceeds();
        steps.stepThatIsIgnored();
        steps.stepThatIsPending();
        steps.anotherStepThatSucceeds();
        steps.stepThatFails();
        steps.stepThatSucceeds();
    }

    @Test
    public void failing_scenario() {
        steps.stepThatFails();
        steps.stepThatSucceeds();
        steps.anotherStepThatSucceeds();
    }
}
