package com.example.cataract.fuelconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtxt1, edtxt2;
    String temp, em1, em2;

    Double math_val;
    Button btn1;
    Toast tst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button);
        edtxt1 = (EditText) findViewById(R.id.edittxt1);
        edtxt2 = (EditText) findViewById(R.id.edittxt2);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                em1 = edtxt1.getText().toString();
                em2 = edtxt2.getText().toString();
                if (em2.length() == 0 && em1.length() == 0) {
                    edtxt1.setError("At least one of the fields need to have a value!");
                    return;
                } if (em1.length() != 0 && em2.length() == 0) {
                    temp = edtxt1.getText().toString();
                    math_val = Double.parseDouble(temp);
                    math_val = math_val * 2.35;
                    edtxt2.setText(math_val.toString());
                } if (em1.length() == 0 && em2.length() != 0) {
                    temp = edtxt2.getText().toString();
                    math_val = Double.parseDouble(temp);
                    math_val = math_val * .42;
                    edtxt1.setText(math_val.toString());
                } if (em1.length() != 0 && em2.length() != 0){
                    temp = edtxt1.getText().toString();
                    math_val = Double.parseDouble(temp);
                    math_val = math_val * 2.35;
                    edtxt2.setText(math_val.toString());
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
