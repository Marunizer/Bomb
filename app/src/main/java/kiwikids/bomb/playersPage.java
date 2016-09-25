package kiwikids.bomb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

public class playersPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_page);
    }

    public void num2(View v) {
        Intent goToMovies = new Intent(playersPage.this, selectionPage.class);
        //Bundle extras = new Bundle();
       // extras.putInt("StringVariableName", 2);
        goToMovies.putExtra("numOfPlayers",2);
        startActivity(goToMovies);
    }

    public void num3(View v) {
        Intent goToMovies = new Intent(playersPage.this, selectionPage.class);
        goToMovies.putExtra("numOfPlayers",3);
        startActivity(goToMovies);
    }

    public void num4(View v) {
        Intent goToMovies = new Intent(playersPage.this, selectionPage.class);
        goToMovies.putExtra("numOfPlayers",4);
        startActivity(goToMovies);
    }

    public void num5(View v) {
        Intent goToMovies = new Intent(playersPage.this, selectionPage.class);
        goToMovies.putExtra("numOfPlayers",5);
        startActivity(goToMovies);
    }
}