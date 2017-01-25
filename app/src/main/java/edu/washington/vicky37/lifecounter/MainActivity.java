package edu.washington.vicky37.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int player1Counter=20;
    public int player2Counter=20;
    public int player3Counter=20;
    public int player4Counter=20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Counter();
    }

    public void Counter(){
        final Button player1Add = (Button)findViewById(R.id.player1button1);
        player1Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player1Counter++;
                final TextView player1=(TextView) findViewById(R.id.player1LifeTotal);
                player1.setText("Life Total:" + player1Counter);
            }
        });

        final Button player1Minus = (Button)findViewById(R.id.player1button2);
        player1Minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player1Counter--;
                final TextView player1=(TextView) findViewById(R.id.player1LifeTotal);
                player1.setText("Life Total:" + player1Counter);
                gameOver(player1Counter, "1");
            }
        });

        final Button player1AddFive = (Button)findViewById(R.id.player1button3);
        player1AddFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player1Counter=player1Counter+5;
                final TextView player1=(TextView) findViewById(R.id.player1LifeTotal);
                player1.setText("Life Total:" + player1Counter);
            }
        });

        final Button player1MinusFive = (Button)findViewById(R.id.player1button4);
        player1MinusFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player1Counter=player1Counter-5;
                final TextView player1=(TextView) findViewById(R.id.player1LifeTotal);
                player1.setText("Life Total:" + player1Counter);
                gameOver(player1Counter, "1");
            }
        });

        final Button player2Add = (Button)findViewById(R.id.player2button1);
        player2Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player2Counter++;
                final TextView player2=(TextView) findViewById(R.id.player2LifeTotal);
                player2.setText("Life Total:" + player2Counter);
            }
        });

        final Button player2Minus = (Button)findViewById(R.id.player2button2);
        player2Minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player2Counter--;
                final TextView player2=(TextView) findViewById(R.id.player2LifeTotal);
                player2.setText("Life Total:" + player2Counter);
                gameOver(player2Counter, "2");
            }
        });

        final Button player2AddFive = (Button)findViewById(R.id.player2button3);
        player2AddFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player2Counter=player2Counter+5;
                final TextView player2=(TextView) findViewById(R.id.player2LifeTotal);
                player2.setText("Life Total:" + player2Counter);
            }
        });

        final Button player2MinusFive = (Button)findViewById(R.id.player2button4);
        player2MinusFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player2Counter=player2Counter-5;
                final TextView player2=(TextView) findViewById(R.id.player2LifeTotal);
                player2.setText("Life Total:" + player2Counter);
                gameOver(player2Counter, "2");
            }
        });

        final Button player3Add = (Button)findViewById(R.id.player3button1);
        player3Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player3Counter++;
                final TextView player3=(TextView) findViewById(R.id.player3LifeTotal);
                player3.setText("Life Total:" + player3Counter);
            }
        });

        final Button player3Minus = (Button)findViewById(R.id.player3button2);
        player3Minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player3Counter--;
                final TextView player3=(TextView) findViewById(R.id.player3LifeTotal);
                player3.setText("Life Total:" + player3Counter);
                gameOver(player3Counter, "3");
            }
        });

        final Button player3AddFive = (Button)findViewById(R.id.player3button3);
        player3AddFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player3Counter=player3Counter+5;
                final TextView player3=(TextView) findViewById(R.id.player3LifeTotal);
                player3.setText("Life Total:" + player3Counter);
            }
        });

        final Button player3MinusFive = (Button)findViewById(R.id.player3button4);
        player3MinusFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player3Counter=player3Counter-5;
                final TextView player3=(TextView) findViewById(R.id.player3LifeTotal);
                player3.setText("Life Total:" + player3Counter);
                gameOver(player3Counter, "3");
            }
        });

        final Button player4Add = (Button)findViewById(R.id.player4button1);
        player4Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player4Counter++;
                final TextView player4=(TextView) findViewById(R.id.player4LifeTotal);
                player4.setText("Life Total:" + player4Counter);
            }
        });

        final Button player4Minus = (Button)findViewById(R.id.player4button2);
        player4Minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player4Counter--;
                final TextView player4=(TextView) findViewById(R.id.player4LifeTotal);
                player4.setText("Life Total:" + player4Counter);
                gameOver(player4Counter, "4");
            }
        });

        final Button player4AddFive = (Button)findViewById(R.id.player4button3);
        player4AddFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player4Counter=player4Counter+5;
                final TextView player4=(TextView) findViewById(R.id.player4LifeTotal);
                player4.setText("Life Total:" + player4Counter);
            }
        });

        final Button player4MinusFive = (Button)findViewById(R.id.player4button4);
        player4MinusFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                player4Counter=player4Counter-5;
                final TextView player4=(TextView) findViewById(R.id.player4LifeTotal);
                player4.setText("Life Total:" + player4Counter);
                gameOver(player4Counter, "4");
            }
        });


    }

    private void gameOver(int index, String msg) {
        final TextView alertLabel=(TextView) findViewById(R.id.alertLabel);
        if(index <= 0) {
            alertLabel.setText("Player " + msg + " LOSES!");
        } else {
            alertLabel.setText("");
        }
    }
}
