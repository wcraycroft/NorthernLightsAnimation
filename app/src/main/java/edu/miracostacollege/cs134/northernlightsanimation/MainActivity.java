package edu.miracostacollege.cs134.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView lightsImageView;

    // AnimationDrawable is used for frame animations
    private AnimationDrawable frameAnim;

    // Animation used for tween animations
    private Animation rotateAnim;
    private Animation shakeAnim;
    private Animation customAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightsImageView = findViewById(R.id.lightsImageView);
    }

    // Method for the frame animation duration
    public void toggleFrameAnim(View v)
    {
        // Set reference to animation
        if (frameAnim == null) {
            lightsImageView.setBackgroundResource(R.drawable.frame_anim);
            frameAnim = (AnimationDrawable) lightsImageView.getBackground();
        }
        // If animation is running, stop it
        if (frameAnim.isRunning()) {
            frameAnim.stop();
        }
        // If stopped, start it
        else {
            frameAnim.start();
        }
    }

    //  Rotate animation button
    public void toggleRotateAnim(View v)
    {
        // Load animation from xml
        rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        lightsImageView.startAnimation(rotateAnim);
    }

    //  Shake animation button
    public void toggleShakeAnim(View v)
    {
        // Load animation from xml
        shakeAnim = AnimationUtils.loadAnimation(this, R.anim.shake_anim);
        lightsImageView.startAnimation(shakeAnim);
    }
}
