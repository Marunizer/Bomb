package kiwikids.bomb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class scorePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);
    }


    public void selection(View v) {
        Intent i = new Intent(this, selectionPage.class);
        startActivity(i);
    }

}