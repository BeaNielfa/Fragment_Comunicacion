package com.example.fragment_comunicacion;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ControlesFragment extends Fragment {

    private OnControlesFragmentListener mListener;

    public ControlesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_controles, container, false);
        Button btnColor = (Button) view.findViewById(R.id.btnColor);
        Button btnTexto = (Button) view.findViewById(R.id.btnTexto);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cuando pulse el boton color
                mListener.botonColorClicked("Rojo");
            }
        });

        btnTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cuando pulse el boton texto
                mListener.botonTextoClicked("Hola usuario");
            }
        });
        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnControlesFragmentListener) {
            mListener = (OnControlesFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


}
