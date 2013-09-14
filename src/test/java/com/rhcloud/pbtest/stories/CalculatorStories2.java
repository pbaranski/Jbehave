package com.rhcloud.pbtest.stories;


import com.rhcloud.pbtest.steps.AddTwoNumbersSteps;
import com.rhcloud.pbtest.steps.DeductToNumbersSteps;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.List;

import static org.jbehave.core.reporters.Format.*;

public class CalculatorStories2 extends JUnitStory {

    @Override
    public Configuration configuration() {
        return super.configuration()
                .useStoryReporterBuilder(
                        new StoryReporterBuilder()
                                .withDefaultFormats()
                                .withFormats(CONSOLE, TXT, XML));
    }


    public List<CandidateSteps> candidateSteps() {
        return new InstanceStepsFactory(configuration(), new AddTwoNumbersSteps(), new DeductToNumbersSteps())
                .createCandidateSteps();
    }

}