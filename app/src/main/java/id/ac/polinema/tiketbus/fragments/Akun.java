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

    EditText inuser,inpass;
    Button btnlgn;
    public Akun() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_akun, container, false);
        inuser  = view.findViewById(R.id.inpass);
        inpass  = view.findViewById(R.id.inpass);
        btnlgn = view.findViewById(R.id.btnlgn);



        btnlgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = inuser.getText().toString();
                String pass =  inpass.getText().toString();
                if (user_name.equals("admin")&&pass.equals("admin")){
                    Toast.makeText(getActivity(),"Username dan Password benar Anda berhasil Login",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getActivity(),"Username dan Pssword tidak sesuai Anda gagal Login",Toast.LENGTH_SHORT).show();
                }
            }


        });
        return view;
    }



}


