package id.ac.polinema.tiketbus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.tiketbus.R;

public class CekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek);

    }


    public void tes(View view) {
        Intent intent = new Intent(this,CekActivity.class);
        startActivity(intent);
    }

    public void ts(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
