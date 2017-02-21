package hu.gearxpert.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StartingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
    }


    public void playersNameEntered (View view) {



        EditText player1Name = (EditText) findViewById(R.id.editBox_player1);
        String p1Name = player1Name.getText().toString();
        if (p1Name.length() == 0) {
            p1Name = "Player1";
        }

        EditText player2Name = (EditText) findViewById(R.id.editBox_player2);
        String p2Name = player2Name.getText().toString();
        if (p2Name.length() == 0) {
            p2Name = "Player2";
        }

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("p2name", p2Name);
        intent.putExtra("p1name", p1Name);
        startActivity(intent);
    }
}
