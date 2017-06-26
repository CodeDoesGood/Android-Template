package org.codedoesgood.androidtemplate.UtilityTests.Robots;


import android.content.Context;

import org.codedoesgood.androidtemplate.Utilities.DateTimeFormatUtil;

/**
 * Robot for all tests concerning the DateTimeFormatUtil class
 */
public class DateTimeFormatRobot {

    /**
     * Use to verify that the <b>dateInMillis</b> is properly converted and the formatted date
     * contains the <b>expectedValue</b>
     */
    public boolean verifyDateFormat(Context context, long dateInMillis, String expectedValue){
        String dateFormatted = DateTimeFormatUtil.dateFormatedForLocale(context, dateInMillis);
        return dateFormatted.contains(expectedValue);
    }
}
