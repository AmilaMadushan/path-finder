package com.itshareplus.googlemapdemo;

import android.app.Activity;

/**
 * Created by Project PC on 7/24/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by chapa on 7/24/2016.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final ImageView vi = (ImageView) findViewById(R.id.splash_png);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotation);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);

        vi.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                vi.startAnimation(an2);
                finish();
                Intent i = new Intent(getBaseContext(),MapsActivity.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
