package com.example.dynamicfragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DynamicFragment extends Fragment {
    private FragListner listner;
    private EditText editText;
    private Button button;

    public interface FragListner{
        void onInputASelect(CharSequence input);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.dynamicfragment, container, false);
        editText = v.findViewById(R.id.ed);
        button = v.findViewById(R.id.b0);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                   CharSequence input = editText.getText();
                   listner.onInputASelect(input);
            }
        });
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // handle your fragment events here
        TextView txtView = view.findViewById(R.id.txt);

    }

    public void updateEditText(CharSequence newText){
        editText.setText(newText);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragListner){
            listner = (FragListner) context;
        } else{
            throw new RuntimeException(context.toString()
            + "must implement FragListner");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listner = null;
    }
}
