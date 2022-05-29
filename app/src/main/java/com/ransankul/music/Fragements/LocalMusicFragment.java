package com.ransankul.music.Fragements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ransankul.music.databinding.FragmentLocalMusicBinding;


public class LocalMusicFragment extends Fragment {

    FragmentLocalMusicBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLocalMusicBinding.inflate(inflater, container, false);




        return binding.getRoot();
    }

}
