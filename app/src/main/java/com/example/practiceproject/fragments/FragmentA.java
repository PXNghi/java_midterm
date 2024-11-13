package com.example.practiceproject.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.practiceproject.MainActivity;
import com.example.practiceproject.MyFragment;
import com.example.practiceproject.R;

public class FragmentA extends Fragment {
    Button btnCount;
    TextView countText;
    int count = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        btnCount = v.findViewById(R.id.btnCounter);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                MyFragment myFragmentScreen = (MyFragment) getActivity();
                myFragmentScreen.increaseValue(count);
            }
        });
        return v;
    }
}
