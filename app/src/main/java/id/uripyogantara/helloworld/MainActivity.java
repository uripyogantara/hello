package id.uripyogantara.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvUrip;
    EditText etEmail,etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_login);
        tvUrip=(TextView)findViewById(R.id.tv_email);
        etEmail=(EditText)findViewById(R.id.et_email);
        etPassword=(EditText)findViewById(R.id.et_password);


        tvUrip.setText("Urip");
    }

    public void login(View view) {
        String email=etEmail.getText().toString();
//        String password=
        Toast.makeText(this, "Email anda adalah "+email, Toast.LENGTH_SHORT).show();
    }
}
