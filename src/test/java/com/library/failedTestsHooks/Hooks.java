package com.library.failedTestsHooks;

import com.library.utilities.BrowserUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setupScenario() throws Exception {
        System.out.println("it starts recording");
        BrowserUtils.startRecording();
    }

    @After
    public void teardownScenario() throws Exception {
        BrowserUtils.stopRecording();
        System.out.println("it stops recording");
    }


}
