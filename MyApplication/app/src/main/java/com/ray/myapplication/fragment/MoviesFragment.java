package com.ray.myapplication.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ray.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment
{

    public MoviesFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false);
    }

    @Override
    public void onResume()
    {
        super.onResume();
        //Set title of this fragment
        if (getActivity() != null)
        {
            getActivity().setTitle("Movies");
        }
    }
}