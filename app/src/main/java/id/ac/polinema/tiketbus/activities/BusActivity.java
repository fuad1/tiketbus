package id.ac.polinema.tiketbus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import id.ac.polinema.tiketbus.R;

public class BusActivity extends AppCompatActivity {
    public String judul;
    public String kategori;
    public String image;


    public BusActivity(String judul, String kategori, String image) {
        this.judul = judul;
        this.kategori = kategori;
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
    }
}
