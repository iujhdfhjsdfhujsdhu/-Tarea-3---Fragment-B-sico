package com.example.tarea3_fragmentbsico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);

        // Referencia al TextView
        textView = view.findViewById(R.id.textViewFragment);

        // Obtener texto del Bundle y actualizar el TextView
        if (getArguments() != null) {
            String receivedText = getArguments().getString("textKey");
            textView.setText(receivedText);
        }

        return view;
    }
}
