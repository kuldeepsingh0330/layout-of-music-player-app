package com.ransankul.music.Fragements;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ransankul.music.Activities.MainActivity;
import com.ransankul.music.databinding.FragmentProfileBinding;

public class profileFragment extends Fragment {


    FragmentProfileBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);

        ((MainActivity)getActivity()).setDrawerLocked();



        return binding.getRoot();
    }


}