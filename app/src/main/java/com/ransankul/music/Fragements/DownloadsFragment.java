package com.ransankul.music.Fragements;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ransankul.music.databinding.FragmentDownloadsBinding;


public class DownloadsFragment extends Fragment {

    FragmentDownloadsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding = FragmentDownloadsBinding.inflate(inflater , container, false);



        return binding.getRoot();
    }
}