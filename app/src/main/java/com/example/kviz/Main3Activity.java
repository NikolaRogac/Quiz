package com.example.kviz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
    TextView title3;
    String [] answers2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        title3 = (TextView) findViewById(R.id.tvtitle3);

        answers2 = new String[] {"AZIJA","AFRIKA","EVROPA"};
        AlertDialog.Builder ansBuilder = new AlertDialog.Builder(Main3Activity.this);
        ansBuilder.setTitle("-Koji je najveci i najnaseleniji kontinent na svetu?");
        ansBuilder.setSingleChoiceItems(answers2, -1, new DialogInterface.OnClickListener()
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
                Intent i = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(i);
                dialog.dismiss();
                int selectedAns = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
                if (selectedAns==0){Main7Activity.corAnswers++;};
            }
        });

        ansBuilder.create();
        ansBuilder.show();
    }
}
