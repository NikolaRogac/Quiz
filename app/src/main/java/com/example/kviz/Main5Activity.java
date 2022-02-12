package com.example.kviz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity
{
    TextView title5;
    String [] answers4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        title5 = (TextView) findViewById(R.id.tvtitle5);

        answers4 = new String[] {"FEDERER","DJOKOVIC","NADAL"};
        AlertDialog.Builder ansBuilder = new AlertDialog.Builder(Main5Activity.this);
        ansBuilder.setTitle("-Koji teniser je 2011.godine osvojio Vimbldon?");
        ansBuilder.setSingleChoiceItems(answers4, -1, new DialogInterface.OnClickListener()
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
                Intent i = new Intent(getApplicationContext(),Main6Activity.class);
                startActivity(i);
                dialog.dismiss();
                int selectedAns = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
                if (selectedAns==1){Main7Activity.corAnswers++;};
            }
        });

        ansBuilder.create();
        ansBuilder.show();
    }
}
