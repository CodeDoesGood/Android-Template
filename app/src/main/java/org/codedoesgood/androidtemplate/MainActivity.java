package org.codedoesgood.androidtemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Default launch activity for template
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
