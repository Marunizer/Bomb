package kiwikids.bomb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class actingPage extends AppCompatActivity {

    public static final String IMDB = "http://www.imdb.com/xml/find?json=1&nr=1&nm=on&q=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acting_page);


        //EditText text = (EditText) findViewById(R.id.actSelection);
        //String userInput = text.getText().toString();

    }

    public void trueOrFalse(View v) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try {
            URL url = new URL(IMDB);
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream stream = connection.getInputStream();

            reader = new BufferedReader((new InputStreamReader(stream)));

            StringBuffer buffer = new StringBuffer();

            String line = "";//******************************
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "");//**********************
            }

            //   movieData.setText(buffer.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null)
                connection.disconnect();
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //if (callclass = true)
        //{
        Intent correctAnswer = new Intent(getApplicationContext(), moviePage.class);

        startActivity(correctAnswer);
        //}

        //else
        //{
        //Intent wrongAnswer = new Intent(getApplicationContext(), scorePage.class);
        //startActivity(wrongAnswer);
    }
}
