package com.example.kviz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity
{
    TextView title7;
    TextView stats;
    TextView result;
    public static int corAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        title7 = (TextView) findViewById(R.id.tvtitle7);
        stats  = (TextView) findViewById(R.id.tvstats);
        result = (TextView) findViewById(R.id.tvres);

        switch (corAnswers)
        {
            case 0:
                stats.setText("ODGOVORILI STE TACNO NA 0/5 PITANJA I TIME DOBILI OCENU 1");
                result.setText("POSTIGLI STE LOS REZULTAT!");
                break;
            case 1:
                stats.setText("ODGOVORILI STE TACNO NA 1/5 PITANJA I TIME DOBILI OCENU 1");
                result.setText("POSTIGLI STE LOS REZULTAT!");
                break;
            case 2:
                stats.setText("ODGOVORILI STE TACNO NA 2/5 PITANJA I TIME DOBILI OCENU 2");
                result.setText("POSTIGLI STE SLAB REZULTAT!");
                break;
            case 3:
                stats.setText("ODGOVORILI STE TACNO NA 3/5 PITANJA I TIME DOBILI OCENU 3");
                result.setText("POSTIGLI STE SOLIDAN REZULTAT!");
                break;
            case 4:
                stats.setText("ODGOVORILI STE TACNO NA 4/5 PITANJA I TIME DOBILI OCENU 4");
                result.setText("POSTIGLI STE VRLO DOBAR REZULTAT!");
                break;
            case 5:
                stats.setText("ODGOVORILI STE TACNO NA 5/5 PITANJA I TIME DOBILI OCENU 5");
                result.setText("POSTIGLI STE ODLICAN REZULTAT!");
                break;
        }
    }
}
