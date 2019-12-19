package id.ac.polinema.tiketbus.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.polinema.tiketbus.R;
import id.ac.polinema.tiketbus.activities.BusActivity;
import id.ac.polinema.tiketbus.activities.MainActivity;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Akun  extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view  = inflater.inflate(R.layout.fragment_akun, container, false);

        Button btnlgt = (Button) view.findViewById(R.id.btnlgt);
        btnlgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), MainActivity.class );
                startActivity(in);
            }
        });
        return view;
    }

}
