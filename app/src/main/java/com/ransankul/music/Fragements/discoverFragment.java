package com.ransankul.music.Fragements;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ransankul.music.Activities.MainActivity;
import com.ransankul.music.databinding.FragmentDiscoverBinding;


public class discoverFragment extends Fragment {

    FragmentDiscoverBinding binding;
    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDiscoverBinding.inflate(inflater, container, false);

        ((MainActivity)getActivity()).setDrawerUnlocked();
        return binding.getRoot();
    }
}