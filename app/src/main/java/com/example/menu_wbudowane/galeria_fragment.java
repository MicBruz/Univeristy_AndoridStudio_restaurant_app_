package com.example.menu_wbudowane;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link galeria_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class galeria_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.galeria_fragment, container, false);

        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        for (int i = 0; i < 10; i++) {
            ImageView localView = new ImageView(getActivity());
            localView.setLayoutParams(new ViewGroup.LayoutParams(200, 200));
            localView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int resID = getResources().getIdentifier("r" + i, "drawable", getActivity().getPackageName());
            localView.setImageResource(resID);
            localView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView localView = (ImageView) v;
                    imageView.setImageDrawable(localView.getDrawable());
                }
            });
            linearLayout.addView(localView);
        }
        return view;
    }
}