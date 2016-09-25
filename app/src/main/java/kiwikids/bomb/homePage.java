package kiwikids.bomb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void nextActivity(View v)
    {
        Intent goToNextActivity = new Intent(getApplicationContext(), playersPage.class);
        startActivity(goToNextActivity);
    }

}
