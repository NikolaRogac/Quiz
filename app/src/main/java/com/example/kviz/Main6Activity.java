package com.example.kviz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity
{
    TextView title6;
    String [] answers5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        title6 = (TextView) findViewById(R.id.tvtitle6);

        answers5 = new String[] {"MILOS CRNJANSKI","IVO ANDRIC","MESA SELIMOVIC"};
        AlertDialog.Builder ansBuilder = new AlertDialog.Builder(Main6Activity.this);
        ansBuilder.setTitle("-Ko je jedini srpski Nobelovac?");
        ansBuilder.setSingleChoiceItems(answers5, -1, new DialogInterface.OnClickListener()
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
                Intent i = new Intent(getApplicationContext(),Main7Activity.class);
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
