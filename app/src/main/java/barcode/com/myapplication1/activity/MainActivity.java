package barcode.com.myapplication1.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import barcode.com.myapplication1.R;

public class MainActivity extends AppCompatActivity {

    EditText etusername,etpassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername = (EditText) findViewById(R.id.etusername);
        etpassword = (EditText) findViewById(R.id.etpassword);

        btnLogin = (Button) findViewById(R.id.btnLogin);


        //TODO Check if s is null or not;


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etusername.getText().toString();
                String password = etpassword.getText().toString();

                if(name.trim().length() > 0 && password.trim().length() > 0){
                    //TODO start an intent
                    Intent intent = new Intent(MainActivity.this, Second.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Fields empty",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
