package id.ac.polinema.tiketbus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.tiketbus.R;

public class BusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);


    }

    public void sydney(View view) {
        Intent intent = new Intent(this, KursiActivity.class);
        startActivity(intent);
    }

    public void Suburjaya(View view) {
        Intent intent = new Intent(this, KursiActivity.class);
        startActivity(intent);
    }
}
