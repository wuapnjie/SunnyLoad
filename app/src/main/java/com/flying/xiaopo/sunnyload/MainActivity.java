package com.flying.xiaopo.sunnyload;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SunnyLoad mSunnyLoad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSunnyLoad = (SunnyLoad) findViewById(R.id.sunnyload);
//        mSunnyLoad.setColorAndPaintWidth(Color.RED, 50f);

//        mSunnyLoad.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
//            @Override
//            public boolean onPreDraw() {
//                mSunnyLoad.setMaxRaius(mSunnyLoad.getWidth()/2);
//                return true;
//            }
//        });
    }


    private void startAnim() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator angel_animator = ObjectAnimator.ofFloat(mSunnyLoad, "startAngel", 0, 810);
        angel_animator.setDuration(3000);
        ObjectAnimator radius_animator = ObjectAnimator.ofFloat(mSunnyLoad, "radius", 0, mSunnyLoad.getWidth() / 3);
        radius_animator.setDuration(3000);
        animatorSet.playTogether(angel_animator, radius_animator);
        animatorSet.start();
    }
}
