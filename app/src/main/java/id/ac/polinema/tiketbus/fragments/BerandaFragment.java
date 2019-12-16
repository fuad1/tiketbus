package id.ac.polinema.tiketbus.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import id.ac.polinema.tiketbus.R;
import id.ac.polinema.tiketbus.activities.BusActivity;

public class BerandaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view  = inflater.inflate(R.layout.fragment_beranda, container, false);

        Button submit = (Button) view.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), BusActivity.class );
                startActivity(in);
            }
        });

        return view;
    }

}
