package id.ac.polinema.tiketbus.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.ac.polinema.tiketbus.R;
import id.ac.polinema.tiketbus.fragments.Akun;
import id.ac.polinema.tiketbus.fragments.BantuanFragment;
import id.ac.polinema.tiketbus.fragments.BerandaFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new BerandaFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.BerandaFragment:
                fragment = new BerandaFragment();
                break;
            case R.id.BantuanFragment:
                fragment = new BantuanFragment();
                break;
            case R.id.akun:
                fragment = new Akun();
                break;
        }
        return loadFragment(fragment);
    }



    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
