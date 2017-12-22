package com.example.android.packageextention;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by SAMO on 12/15/2017.
 */

public class ext extends Activity{
//giga bytes field



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.ext);
    }

    public void request (View view){

        String[] TO = {"islam.baioumy.ext@nokia.com , mmahdy@telecomaxgroup.com , atawfeek@telecomaxgroup.com , helsebaie@telecomaxgroup.com"};

        EditText txt =  findViewById(R.id.edit);
        String giga = txt.getText().toString();

        CheckBox data = findViewById(R.id.data);
        boolean datax = data.isChecked();

        CheckBox test_box = findViewById(R.id.test_number);
        boolean test_button = test_box.isChecked();

        CheckBox personaly = findViewById(R.id.personal_number);
        boolean per = personaly.isChecked();

        CheckBox voda = findViewById(R.id.vodafone);
        boolean vodax = voda.isChecked();

        CheckBox etisalat = findViewById(R.id.etisalat);
        boolean etix = etisalat.isChecked();

        String number = getNumbers(datax , test_button ,per , vodax , etix);

String finalForm = getForm(number , giga);

        Intent mail = new Intent(Intent.ACTION_SENDTO);
        mail.setData(Uri.parse("mailto:")); // only email apps should handle this
        mail.putExtra(Intent.EXTRA_EMAIL, TO); // String[] addresses
     //mail.putExtra(Intent.EXTRA_EMAIL, "islam.baioumy.ext@nokia.com , mmahdy@telecomaxgroup.com , atawfeek@telecomaxgroup.com , helsebaie@telecomaxgroup.com");
        mail.putExtra(Intent.EXTRA_SUBJECT, "Package extention" );
        mail.putExtra(Intent.EXTRA_TEXT, finalForm );
        if (mail.resolveActivity(getPackageManager()) != null) {
            startActivity(mail);
        }

    }

    private String getNumbers(boolean datax  , boolean test_button  ,boolean per, boolean vodax , boolean etix ){
        String no = "no added number";

        if (datax){
            no= "01285209848";
        }

        if (per){
            no = "01281112585";
        }

        if (test_button){
            no= "01206607035";
        }

        if (vodax){
            no= "01093931801";
        }

        if (etix){
            no= "01129939413";
        }

        return no;

    }

    private String getForm(String number , String giga){
        String form = "Package extention needed for this number (" + giga + " GB)" + "\n" + number ;
        return form;

    }


}


