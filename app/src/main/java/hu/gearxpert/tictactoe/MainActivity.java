package hu.gearxpert.tictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int actualPlayer = 1;
    int onClockCounter = 0;
    String value1 = "";
    String value2 = "";
    String value3 = "";
    String value4 = "";
    String value5 = "";
    String value6 = "";
    String value7 = "";
    String value8 = "";
    String value9 = "";
    String nyertes = "";


    TextView choosedBox1; //létrehozzuk az objektumot, de még nem tud paramétert felvenni, mivel nem futott le az onCreate
    TextView choosedBox2;
    TextView choosedBox3;
    TextView choosedBox4;
    TextView choosedBox5;
    TextView choosedBox6;
    TextView choosedBox7;
    TextView choosedBox8;
    TextView choosedBox9;

    TextView statusChange;

    TextView displayWhoIsNext;

    /**
     * Elmentjük az összes értéket, amit pl. a képernyő elforgatása után vissza akarunk tölteni
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("value1", value1);
        outState.putString("value2", value2);
        outState.putString("value3", value3);
        outState.putString("value4", value4);
        outState.putString("value5", value5);
        outState.putString("value6", value6);
        outState.putString("value7", value7);
        outState.putString("value8", value8);
        outState.putString("value9", value9);
        outState.putInt("actualPlayer", actualPlayer);
        outState.putString("nyertes", nyertes);
        outState.putInt("onClockCounter", onClockCounter);


        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choosedBox1 = (TextView) findViewById(R.id.box1);  //itt adunk neki paramétert: keresse meg az adott boxot
        choosedBox2 = (TextView) findViewById(R.id.box2);
        choosedBox3 = (TextView) findViewById(R.id.box3);
        choosedBox4 = (TextView) findViewById(R.id.box4);
        choosedBox5 = (TextView) findViewById(R.id.box5);
        choosedBox6 = (TextView) findViewById(R.id.box6);
        choosedBox7 = (TextView) findViewById(R.id.box7);
        choosedBox8 = (TextView) findViewById(R.id.box8);
        choosedBox9 = (TextView) findViewById(R.id.box9);
        statusChange = (TextView) findViewById(R.id.status);
        displayWhoIsNext = (TextView) findViewById(R.id.whosTurn);

        //visszatöltjük az adatokat pl. elforgatás után
        if (savedInstanceState != null) {
            value1 = savedInstanceState.getString("value1");
            value2 = savedInstanceState.getString("value2");
            value3 = savedInstanceState.getString("value3");
            value4 = savedInstanceState.getString("value4");
            value5 = savedInstanceState.getString("value5");
            value6 = savedInstanceState.getString("value6");
            value7 = savedInstanceState.getString("value7");
            value8 = savedInstanceState.getString("value8");
            value9 = savedInstanceState.getString("value9");
            actualPlayer = savedInstanceState.getInt("actualPlayer");
            nyertes = savedInstanceState.getString("nyertes");
            onClockCounter = savedInstanceState.getInt("onClockCounter");

            choosedBox1.setText(value1);
            choosedBox2.setText(value2);
            choosedBox3.setText(value3);
            choosedBox4.setText(value4);
            choosedBox5.setText(value5);
            choosedBox6.setText(value6);
            choosedBox7.setText(value7);
            choosedBox8.setText(value8);
            choosedBox9.setText(value9);
            whoIsNext();
            status();
            winner();
        }
    }

    public void status () {

        if (nyertes == "X") {
            statusChange.setText("The winner is Player1");
            displayWhoIsNext.setText("Game over!");
        }

        if (nyertes == "O") {
            statusChange.setText("The winner is Player2");
            displayWhoIsNext.setText("Game over!");
        }

        if (onClockCounter == 9 && nyertes == "") {
            statusChange.setText("Draw!" );
            displayWhoIsNext.setText("Game over!");
        }
    }

    public void whoIsNext () {
            displayWhoIsNext.setText("Player" + actualPlayer + " turn");
    }

    public void box1 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box1); //Itt adom meg az adattípust, és hogy melyik boxot keresem

        if (choosedBox.getText().length() == 0 && nyertes == "") { // csak akkor változtatunk értéket, ha a tartalom hossza 0 (hogy ne írja felül) ÉS még nincs nyertes
                if (actualPlayer == 1){
                    choosedBox.setText("X"); //Itt már nem kell megadni újra az adattípust és a boxot, mert fentebb már megadtuk
                    actualPlayer = 2;
                    onClockCounter = onClockCounter + 1;
                    value1 = "X";
                    whoIsNext();
                    winner();
                    status();

                }//if 2
                else {
                    choosedBox.setText("O");
                    actualPlayer = 1;
                    onClockCounter = onClockCounter + 1;
                    value1 = "O";
                    whoIsNext();
                    winner();
                    status();
                }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit. Nem is fontos ilyenkor kiírni.
        }
    }

    public void box2 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box2);

        if (choosedBox.getText().length() == 0 && nyertes == "") {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value2 = "X";
                whoIsNext();
                winner();
                status();
            }//if 2
            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value2 = "O";
                whoIsNext();
                winner();
                status();
            }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit
        }
    }

    public void box3 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box3);

        if (choosedBox.getText().length() == 0 && nyertes == "") {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value3 = "X";
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value3 = "O";
                whoIsNext();
                winner();
                status();
            }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit
        }
    }

    public void box4 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box4);

        if (choosedBox.getText().length() == 0 && nyertes == "") {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value4 = "X";
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value4 = "O";
                whoIsNext();
                winner();
                status();
            }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit
        }
    }

    public void box5 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box5);

        if (choosedBox.getText().length() == 0 && nyertes == "") {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value5 = "X";
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value5 = "O";
                whoIsNext();
                winner();
                status();
            }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit
        }
    }

    public void box6 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box6);

        if (choosedBox.getText().length() == 0 && nyertes == "") {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value6 = "X";
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value6 = "O";
                whoIsNext();
                winner();
                status();
            }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit
        }
    }

    public void box7 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box7);

        if (choosedBox.getText().length() == 0 && nyertes == "") {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value7 = "X";
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value7 = "O";
                whoIsNext();
                winner();
                status();
            }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit
        }
    }

    public void box8 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box8);

        if (choosedBox.getText().length() == 0 && nyertes == "")
        {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value8 = "X";
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value8 = "O";
                whoIsNext();
                winner();
                status();
            }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit
        }
    }

    public void box9 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box9);

        if (choosedBox.getText().length() == 0 && nyertes == "") {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value9 = "X";
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value9 = "O";
                whoIsNext();
                winner();
                status();
            }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit
        }
    }

    /**
     * Megvizsgájuk nyert-e már valaki? Egy ideiglenes _return értékbe tesszük bele a @value értékét, a végén ez lesz a visszaadott return érték. Ez épül be a nyertes változóba.
     */

    public void winner() {
        String _return = "";
        if (value1 == value2 && value2 == value3 && value1 != "") {
            _return =  value1;
            choosedBox1.setTextColor(Color.MAGENTA);
            choosedBox2.setTextColor(Color.MAGENTA);
            choosedBox3.setTextColor(Color.MAGENTA);
        }
        if (value4 == value5 && value5 == value6 && value4 != "") {
            _return =  value4;
            choosedBox4.setTextColor(Color.MAGENTA);
            choosedBox5.setTextColor(Color.MAGENTA);
            choosedBox6.setTextColor(Color.MAGENTA);
        }
        if (value7 == value8 && value8 == value9 && value7 != "") {
            _return =  value7;
            choosedBox7.setTextColor(Color.MAGENTA);
            choosedBox8.setTextColor(Color.MAGENTA);
            choosedBox9.setTextColor(Color.MAGENTA);
        }
        if (value1 == value4 && value4 == value7 && value1 != "") {
            _return =  value1;
            choosedBox1.setTextColor(Color.MAGENTA);
            choosedBox4.setTextColor(Color.MAGENTA);
            choosedBox7.setTextColor(Color.MAGENTA);
        }
        if (value2 == value5 && value5 == value8 && value2 != "") {
            _return =  value2;
            choosedBox2.setTextColor(Color.MAGENTA);
            choosedBox5.setTextColor(Color.MAGENTA);
            choosedBox8.setTextColor(Color.MAGENTA);
        }
        if (value3 == value6 && value6 == value9 && value3 != "") {
            _return =  value3;
            choosedBox3.setTextColor(Color.MAGENTA);
            choosedBox6.setTextColor(Color.MAGENTA);
            choosedBox9.setTextColor(Color.MAGENTA);
        }
        if (value1 == value5 && value5 == value9 && value1 != "") {
            _return =  value1;
            choosedBox1.setTextColor(Color.MAGENTA);
            choosedBox5.setTextColor(Color.MAGENTA);
            choosedBox9.setTextColor(Color.MAGENTA);
        }
        if (value3 == value5 && value5 == value7 && value3 != "") {
            _return =  value3;
            choosedBox3.setTextColor(Color.MAGENTA);
            choosedBox5.setTextColor(Color.MAGENTA);
            choosedBox7.setTextColor(Color.MAGENTA);
        }
        nyertes = _return;
    }

    /**
     * Start new game = reset
     * Mivel azonos TexTView adattípus mind, nem kell mindegyiknél újra megadni, hogy az TextView
     */

    public void newGame (View view) {

        choosedBox1.setText("");
        choosedBox2.setText("");
        choosedBox3.setText("");
        choosedBox4.setText("");
        choosedBox5.setText("");
        choosedBox6.setText("");
        choosedBox7.setText("");
        choosedBox8.setText("");
        choosedBox9.setText("");
        choosedBox1.setTextColor(Color.WHITE);
        choosedBox2.setTextColor(Color.WHITE);
        choosedBox3.setTextColor(Color.WHITE);;
        choosedBox4.setTextColor(Color.WHITE);
        choosedBox5.setTextColor(Color.WHITE);
        choosedBox6.setTextColor(Color.WHITE);
        choosedBox7.setTextColor(Color.WHITE);
        choosedBox8.setTextColor(Color.WHITE);
        choosedBox9.setTextColor(Color.WHITE);
        onClockCounter = 0;
        actualPlayer = 1;
        statusChange.setText("");
        displayWhoIsNext.setText("Player1 turn");
        value1 = "";
        value2 = "";
        value3 = "";
        value4 = "";
        value5 = "";
        value6 = "";
        value7 = "";
        value8 = "";
        value9 = "";
        nyertes = "";
    }
}
