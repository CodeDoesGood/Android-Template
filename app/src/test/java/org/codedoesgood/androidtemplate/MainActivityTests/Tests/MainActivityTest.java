package org.codedoesgood.androidtemplate.MainActivityTests.Tests;

import android.app.Activity;

import org.codedoesgood.androidtemplate.BuildConfig;
import org.codedoesgood.androidtemplate.MainActivity;
import org.codedoesgood.androidtemplate.MainActivityTests.Robots.MainActivityRobot;

import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static junit.framework.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

    private MainActivityRobot robot;
    @Before
    public void setup() {
        Activity mainActivity = Robolectric.setupActivity(MainActivity.class);
        robot = new MainActivityRobot(mainActivity);
    }

    @Test
    public void isDefaultLayoutLoaded(){
        assertTrue(robot.verifyHelloWordIsVisible("Hello World!"));
    }
}
