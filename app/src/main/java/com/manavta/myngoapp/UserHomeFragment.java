package com.manavta.myngoapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class UserHomeFragment extends Fragment {

String strDescrtiption[] = {"Android","java",".net","PHP"};
int imgIntro[] = {R.drawable.ngo_1,R.drawable.ngo_2,R.drawable.ngo_3,R.drawable.ngo_5};
    private ArrayList<SliderItem> sliderItemArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home,container,false);
        SliderView sliderView = rootView.findViewById(R.id.imageSlider);
        sliderItemArrayList = new ArrayList<SliderItem>();
        for (int i = 0; strDescrtiption.length > i; i++) {
            SliderItem sliderItem = new SliderItem(strDescrtiption[i], imgIntro[i]);
            sliderItemArrayList.add(sliderItem);

        }
        SliderAdapterExample adapter = new SliderAdapterExample(getActivity(),sliderItemArrayList);

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }
}