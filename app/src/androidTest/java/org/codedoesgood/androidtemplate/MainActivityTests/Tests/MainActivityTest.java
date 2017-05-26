package org.codedoesgood.androidtemplate.MainActivityTests.Tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.codedoesgood.androidtemplate.MainActivity;
import org.codedoesgood.androidtemplate.MainActivityTests.Robots.MainActivityRobot;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void isDefaultLayoutLoaded(){
        MainActivityRobot activityRobot = new MainActivityRobot();
        activityRobot.verifyTextIsVisible("Hello World!");
    }
}
