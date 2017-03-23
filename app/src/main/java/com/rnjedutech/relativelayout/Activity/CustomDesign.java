package com.rnjedutech.relativelayout.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.rnjedutech.relativelayout.R;

/**
 * Created by hrsikeshbrahmbhatt on 2017-03-21.
 */

public class CustomDesign extends AppCompatActivity {

    int[] images = {R.drawable.chat, R.drawable.add, R.drawable.activity, R.drawable.like, R.drawable.coffee, R.drawable.friendnews, R.drawable.blacklist, R.drawable.cinema};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams relativePrams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        relativeLayout.setLayoutParams(relativePrams);
        setContentView(relativeLayout);



        ImageView imageView = new ImageView(this);
        RelativeLayout.LayoutParams imageViewParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);


        //imageView.setX();

        imageView.setLayoutParams(imageViewParams)  ;
        imageView.getLayoutParams().height = 200;
        imageView.getLayoutParams().width = 200;
        //imageViewParams.addRule(RelativeLayout.CENTER_IN_PARENT);
         imageView.setX(100);
         imageView.setY(150);
        imageView.setImageResource(R.drawable.coffee);
        relativeLayout.addView(imageView);

    }
}
