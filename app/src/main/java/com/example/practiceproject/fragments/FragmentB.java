package com.example.practiceproject.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.practiceproject.R;

public class FragmentB extends Fragment {
    TextView counterTextB;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, container, false);
        counterTextB = v.findViewById(R.id.counterX);
        return v;
    }

    public void setCount(int count) {
        counterTextB.setText("Count: " + count);
    }

    // Method 2
    public interface Counter {
        public void incrementValue(int count);
    }
}
