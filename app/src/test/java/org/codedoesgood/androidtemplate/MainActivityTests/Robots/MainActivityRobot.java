package org.codedoesgood.androidtemplate.MainActivityTests.Robots;

import android.app.Activity;

import android.widget.TextView;

import org.codedoesgood.androidtemplate.R;

 /**
  * The robot class should contain high-level actions that a standard QA team member
  * would perform. It should contain logic for how a value or an action would be taken,
  * but not specific values.
 */
public class MainActivityRobot {

     private Activity activity;

     public MainActivityRobot(Activity testActivity){
         activity = testActivity;
     }

     public boolean verifyHelloWordIsVisible(String textToCheck){
         TextView view = (TextView) activity.findViewById(R.id.sampleTextView);
         return view.getText().equals(textToCheck);
     }
}
