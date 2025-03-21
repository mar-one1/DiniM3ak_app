package com.example.notecook.Activity.OnBoarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.notecook.R;

import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;

public class OnBoardingFragmentB extends Fragment {

    public OnBoardingFragmentB() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_on_boarding_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Initialize UI elements and add listeners if needed
    }

    @Override
    public void onStart() {
        super.onStart();
        // Handle any operations that need to start when the fragment is visible
    }

    @Override
    public void onStop() {
        super.onStop();
        // Handle any operations that need to stop when the fragment is no longer visible
    }
}