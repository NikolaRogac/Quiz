package com.example.kviz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    TextView title2;
    String [] answers;
    public static boolean correct;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        title2 = (TextView) findViewById(R.id.tvtitle2);

        answers = new String[] {"PHP","SQL","JAVA"};
        AlertDialog.Builder ansBuilder = new AlertDialog.Builder(Main2Activity.this);
        ansBuilder.setTitle("-Koji od navedenih programskih jezika je najkorisceniji danas?");
        ansBuilder.setSingleChoiceItems(answers, -1, new DialogInterface.OnClickListener()
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
                Intent i = new Intent(getApplicationContext(),Main3Activity.class);
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
