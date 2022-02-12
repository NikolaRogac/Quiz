package com.example.kviz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity
{
    TextView title4;
    String [] answers3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        title4 = (TextView) findViewById(R.id.tvtitle4);

        answers3 = new String[] {"PLATON","SOKRAT","ARISTOTEL"};
        AlertDialog.Builder ansBuilder = new AlertDialog.Builder(Main4Activity.this);
        ansBuilder.setTitle("-Kako se zvao ucitelj Aleksandra Makedonskog?");
        ansBuilder.setSingleChoiceItems(answers3, -1, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            { }
        });
        ansBuilder.setPositiveButton("DALJE", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Intent i = new Intent(getApplicationContext(),Main5Activity.class);
                startActivity(i);
                dialog.dismiss();
                int selectedAns = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
                if (selectedAns==2){Main7Activity.corAnswers++;};
            }
        });

        ansBuilder.create();
        ansBuilder.show();

    }
}
