package com.ransankul.music.Fragements;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ransankul.music.Activities.MainActivity;
import com.ransankul.music.R;
import com.ransankul.music.databinding.FragmentLibraryFragementBinding;


public class libraryFragement extends Fragment {

    FragmentLibraryFragementBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLibraryFragementBinding.inflate(inflater, container, false);

        ((MainActivity)getActivity()).setDrawerLocked();

        LocalMusicFragment localMusicFragment = new LocalMusicFragment();
        getChildFragmentManager().beginTransaction().replace(R.id.lineralayout,localMusicFragment).commit();

        binding.localmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
             transaction.replace(R.id.lineralayout,localMusicFragment);
             transaction.addToBackStack(null);
             transaction.commit();
            }
        });

        binding.downloads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             DownloadsFragment downloadsFragment = new DownloadsFragment();
             FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
             transaction.replace(R.id.lineralayout,downloadsFragment);
             transaction.addToBackStack(null);
             transaction.commit();
            }
        });

        return binding.getRoot();
    }

}