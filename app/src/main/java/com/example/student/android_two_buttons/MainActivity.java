package com.example.student.android_two_buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int player2count=0;
    private TextView p2_player_count;
    private int playercount=0;
    private TextView p1_player_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p2_player_count = (TextView)findViewById(R.id.count_number) ; p1_player_count = (TextView)findViewById(R.id.count_number);

    }


    public void show_player2_number(View view) {
    player2count++;
    if (p1_player_count !=null)
        p1_player_count.setText(Integer.toString(playercount));

    }

    public void show_player_number(View view) {
    playercount++;
    if (p2_player_count!=null)
        p2_player_count.setText(Integer.toString(player2count));
    }

}
