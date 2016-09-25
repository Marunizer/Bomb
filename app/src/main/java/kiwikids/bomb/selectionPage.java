package kiwikids.bomb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class selectionPage extends AppCompatActivity {

   // Intent mIntent = getIntent();
    //int numOfPlayers = mIntent.getIntExtra("numOfPlayers",0);
    int numOfPlayers;
    int turn = 1;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_page);

        Intent mIntent = getIntent();
        Bundle bundle = mIntent.getExtras();
        numOfPlayers = bundle.getInt("numOfPlayers");


        TextView myTextView = (TextView) findViewById(R.id.playerVar);
        myTextView.setText("Player " + turn + ": ");
    }

    public void movieActivity(View v) {
        Intent goToMovies = new Intent(getApplicationContext(), moviePage.class);
        turn++;
        startActivity(goToMovies);
    }

    public void actActivity(View v) {
        Intent goToActing = new Intent(getApplicationContext(), actingPage.class);
        turn++;
        startActivity(goToActing);
    }
}