package com.frost.registrationpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String V_NAME = "com.frost.registrationpage.V_NAME";
    public static final String V_EMAIL = "com.frost.registrationpage.V_EMAIL";
    public static final String V_PASS = "com.frost.registrationpage.V_PASS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, VerifyMessageActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.et_Fname);
        EditText editText2 = (EditText) findViewById(R.id.et_EmailSU);
        EditText editText3 = (EditText) findViewById(R.id.et_PassSU);

        String vname = editText1.getText().toString();
        String vemail = editText2.getText().toString();
        String vpass = editText3.getText().toString();

        intent.putExtra(V_NAME, vname);
        intent.putExtra(V_EMAIL, vemail);
        intent.putExtra(V_PASS, vpass);

        startActivity(intent);

    }
}