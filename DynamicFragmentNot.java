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

public class DynamicFragmentNot extends Fragment {
    private FragCListner listner;
    private EditText editText;
    private Button button;

    public interface FragCListner{
        void onInputCSelect(CharSequence input);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.dynamicfragmentnot, container, false);
        editText = v.findViewById(R.id.ed2);
        button = v.findViewById(R.id.b2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                CharSequence input = editText.getText();
                listner.onInputCSelect(input);
            }
        });
        return v;
    }

    public void updateEditText(CharSequence newText){
        editText.setText(newText);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView txtView = view.findViewById(R.id.txt2);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragCListner){
            listner = (FragCListner) context;
        } else{
            throw new RuntimeException(context.toString()
                    + "must implement FragCListner");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listner = null;
    }
}
