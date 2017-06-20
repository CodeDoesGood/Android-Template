package org.codedoesgood.androidtemplate.UtilityTests.Tests;

import android.content.Context;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.codedoesgood.androidtemplate.MainActivity;
import org.codedoesgood.androidtemplate.R;
import org.codedoesgood.androidtemplate.UtilityTests.Robots.DateTimeFormatRobot;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Calendar;

import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class DateTimeFormatTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void pastDateFormat(){
        Context context = mActivityRule.getActivity().getApplicationContext();
        DateTimeFormatRobot robot = new DateTimeFormatRobot();
        String pastYear = "2014";
        assertTrue(robot.verifyDateFormat(context, 1395028800000L, pastYear));
    }

    @Test
    public void futureDateFormat(){
        Context context = mActivityRule.getActivity().getApplicationContext();
        DateTimeFormatRobot robot = new DateTimeFormatRobot();
        String futureYear = "2029";
        assertTrue(robot.verifyDateFormat(context, 1868414400000L, futureYear));
    }

    @Test
    public void yesterdayFormat(){
        Context context = mActivityRule.getActivity().getApplicationContext();
        DateTimeFormatRobot robot = new DateTimeFormatRobot();
        String expectedValue = getTestCaseExpectedValue(context, R.string.date_format_util_yesterday);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        assertTrue(robot.verifyDateFormat(context, cal.getTimeInMillis(), expectedValue));
    }

    @Test
    public void todayFormat(){
        Context context = mActivityRule.getActivity().getApplicationContext();
        DateTimeFormatRobot robot = new DateTimeFormatRobot();
        String expectedValue = getTestCaseExpectedValue(context, R.string.date_format_util_today);
        Calendar cal = Calendar.getInstance();
        assertTrue(robot.verifyDateFormat(context, cal.getTimeInMillis(), expectedValue));
    }

    @Test
    public void tomorrowFormat(){
        Context context = mActivityRule.getActivity().getApplicationContext();
        DateTimeFormatRobot robot = new DateTimeFormatRobot();
        String expectedValue = getTestCaseExpectedValue(context, R.string.date_format_util_tomorrow);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        assertTrue(robot.verifyDateFormat(context, cal.getTimeInMillis(), expectedValue));
    }

    private String getTestCaseExpectedValue(Context context, int resourceID){
        String expectedValue = context.getResources().getString(resourceID);
        String[] valueArray = expectedValue.split(" ");
        return valueArray[0];
    }

}
