package hu.gearxpert.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int actualPlayer = 1;
    int onClockCounter = 0;
    int value1 = 0;
    int value2 = 0;
    int value3 = 0;
    int value4 = 0;
    int value5 = 0;
    int value6 = 0;
    int value7 = 0;
    int value8 = 0;
    int value9 = 0;
    int nyertes = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void status () {

        if (nyertes == 1) {
            TextView winner = (TextView) findViewById(R.id.status);
            winner.setText("The winner is Player1");

            TextView displayWhoIsNext = (TextView) findViewById(R.id.whosTurn);
            displayWhoIsNext.setText("Game over!");
        }

        if (nyertes == 2) {
            TextView winner = (TextView) findViewById(R.id.status);
            winner.setText("The winner is Player2");

            TextView displayWhoIsNext = (TextView) findViewById(R.id.whosTurn);
            displayWhoIsNext.setText("Game over!");
        }

        if (onClockCounter == 9) {
            TextView statusChange = (TextView) findViewById(R.id.status);
            statusChange.setText("Draw!" );

            TextView displayWhoIsNext = (TextView) findViewById(R.id.whosTurn);
            displayWhoIsNext.setText("Game over!");
        }
    }

    public void whoIsNext () {
            TextView displayWhoIsNext = (TextView) findViewById(R.id.whosTurn);
            displayWhoIsNext.setText("Player" + actualPlayer + " turn");
    }

    public void box1 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box1); //Itt adom meg az adattípust, és hogy melyik boxot keresem

        if (choosedBox.getText().length() == 0 && nyertes == 0) { // csak akkor változtatunk értéket, ha a tartalom hossza 0 (hogy ne írja felül) ÉS még nincs nyertes
                if (actualPlayer == 1){
                    choosedBox.setText("X"); //Itt már nem kell megadni újra az adattípust és a boxot, mert fentebb már megadtuk
                    actualPlayer = 2;
                    onClockCounter = onClockCounter + 1;
                    value1 = 1;
                    whoIsNext();
                    winner();
                    status();
                }//if 2
                else {
                    choosedBox.setText("O");
                    actualPlayer = 1;
                    onClockCounter = onClockCounter + 1;
                    value1 = 2;
                    whoIsNext();
                    winner();
                    status();;
                }//else

        }//if 1

        else {
            //ha üres akkor nem csinálunk semmit. Nem is fontos ilyenkor kiírni.
        }
    }

    public void box2 (View view) {

        TextView choosedBox = (TextView) findViewById(R.id.box2);

        if (choosedBox.getText().length() == 0 && nyertes == 0) {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value2 = 1;
                whoIsNext();
                winner();
                status();
            }//if 2
            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value2 = 2;
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

        if (choosedBox.getText().length() == 0 && nyertes == 0) {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value3 = 1;
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value3 = 2;
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

        if (choosedBox.getText().length() == 0 && nyertes == 0) {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value4 = 1;
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value4 = 2;
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

        if (choosedBox.getText().length() == 0 && nyertes == 0) {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value5 = 1;
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value5 = 2;
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

        if (choosedBox.getText().length() == 0 && nyertes == 0) {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value6 = 1;
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value6 = 2;
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

        if (choosedBox.getText().length() == 0 && nyertes == 0) {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value7 = 1;
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value7 = 2;
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

        if (choosedBox.getText().length() == 0 && nyertes == 0)
        {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value8 = 1;
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value8 = 2;
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

        if (choosedBox.getText().length() == 0 && nyertes == 0) {
            if (actualPlayer == 1){
                choosedBox.setText("X");
                actualPlayer = 2;
                onClockCounter = onClockCounter + 1;
                value9 = 1;
                whoIsNext();
                winner();
                status();
            }//if 2

            else {
                choosedBox.setText("O");
                actualPlayer = 1;
                onClockCounter = onClockCounter + 1;
                value9 = 2;
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
        int _return = 0;
        if (value1 == value2 && value2 == value3 && value1 != 0) {
            _return =  value1;
        }
        if (value4 == value5 && value5 == value6 && value4 != 0) {
            _return =  value4;
        }
        if (value7 == value8 && value8 == value9 && value7 != 0) {
            _return =  value7;
        }
        if (value1 == value4 && value4 == value7 && value1 != 0) {
            _return =  value1;
        }
        if (value2 == value5 && value5 == value8 && value2 != 0) {
            _return =  value2;
        }
        if (value3 == value6 && value6 == value9 && value3 != 0) {
            _return =  value3;
        }
        if (value1 == value5 && value5 == value9 && value1 != 0) {
            _return =  value1;
        }
        if (value3 == value5 && value5 == value7 && value3 != 0) {
            _return =  value3;
        }
        nyertes = _return;
    }

    /**
     * Start new game = reset
     * Mivel azonos TexTView adattípus mind, nem kell mindegyiknél újra megadni, hogy az TextView
     */

    public void newGame (View view) {
        TextView choosedBox = (TextView) findViewById(R.id.box1);
        choosedBox.setText("");

        choosedBox = (TextView) findViewById(R.id.box2);
        choosedBox.setText("");

        choosedBox = (TextView) findViewById(R.id.box3);
        choosedBox.setText("");

        choosedBox = (TextView) findViewById(R.id.box4);
        choosedBox.setText("");

        choosedBox = (TextView) findViewById(R.id.box5);
        choosedBox.setText("");

        choosedBox = (TextView) findViewById(R.id.box6);
        choosedBox.setText("");

        choosedBox = (TextView) findViewById(R.id.box7);
        choosedBox.setText("");

        choosedBox = (TextView) findViewById(R.id.box8);
        choosedBox.setText("");

        choosedBox = (TextView) findViewById(R.id.box9);
        choosedBox.setText("");

        onClockCounter = 0;

        actualPlayer = 1;

        TextView status = (TextView) findViewById(R.id.status);
        status.setText("");

        TextView whoIsNext = (TextView) findViewById(R.id.whosTurn);
        whoIsNext.setText("Player1 turn");

        value1 = 0;
        value2 = 0;
        value3 = 0;
        value4 = 0;
        value5 = 0;
        value6 = 0;
        value7 = 0;
        value8 = 0;
        value9 = 0;

        nyertes = 0;

    }
}
