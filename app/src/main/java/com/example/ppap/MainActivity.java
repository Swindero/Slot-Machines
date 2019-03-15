package com.example.ppap;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.logging.XMLFormatter;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,image14,image15;
    boolean i=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);

        //region imagini
        image1 = (ImageView) findViewById(R.id.imageView1);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image3 = (ImageView) findViewById(R.id.imageView3);
        image4 = (ImageView) findViewById(R.id.imageView4);
        image5 = (ImageView) findViewById(R.id.imageView5);
        image6 = (ImageView) findViewById(R.id.imageView6);
        image7 = (ImageView) findViewById(R.id.imageView7);
        image8 = (ImageView) findViewById(R.id.imageView8);
        image9 = (ImageView) findViewById(R.id.imageView9);
        image10 = (ImageView) findViewById(R.id.imageView10);
        image11 = (ImageView) findViewById(R.id.imageView11);
        image12 = (ImageView) findViewById(R.id.imageView12);
        image13 = (ImageView) findViewById(R.id.imageView13);
        image14 = (ImageView) findViewById(R.id.imageView14);
        image15 = (ImageView) findViewById(R.id.imageView15);
        //endregion

        //image1.setBackgroundResource(R.drawable.img1);
       // image2.setBackgroundResource(R.drawable.img2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Animation animation = AnimationUtils.loadAnimation( MainActivity.this, R.anim.translate);
                // image1.startAnimation(animation);
                // image2.startAnimation(animation);
                //Animator transAnimation= AnimatorInflater.loadAnimator(MainActivity.this,R.animator.move);
                // transAnimation.setDuration(3000);//set duration
                // transAnimation.start();//start animation
                // AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.property_animator);
                // set.setTarget(image1);
                // set.start();

                //region Definire animatie 1

                ObjectAnimator one1 = ObjectAnimator.ofFloat(image1,"translationY",-800,0);
                ObjectAnimator two1 = ObjectAnimator.ofFloat(image2,"translationY",-800,0);
                ObjectAnimator three1 = ObjectAnimator.ofFloat(image3,"translationY",-800,0);
                ObjectAnimator four1 = ObjectAnimator.ofFloat(image4,"translationY",-800,0);
                ObjectAnimator five1 = ObjectAnimator.ofFloat(image5,"translationY",-800,0);
                ObjectAnimator six1 = ObjectAnimator.ofFloat(image6,"translationY",-800,0);
                ObjectAnimator seven1 = ObjectAnimator.ofFloat(image7,"translationY",-800,0);
                ObjectAnimator eight1 = ObjectAnimator.ofFloat(image8,"translationY",-800,0);
                ObjectAnimator nine1 = ObjectAnimator.ofFloat(image9,"translationY",-800,0);
                ObjectAnimator ten1 = ObjectAnimator.ofFloat(image10,"translationY",-800,0);
                ObjectAnimator eleven1 = ObjectAnimator.ofFloat(image11,"translationY",-800,0);
                ObjectAnimator twelve1 = ObjectAnimator.ofFloat(image12,"translationY",-800,0);
                ObjectAnimator thirteen1 = ObjectAnimator.ofFloat(image13,"translationY",-800,0);
                ObjectAnimator fourteen1 = ObjectAnimator.ofFloat(image14,"translationY",-800,0);
                ObjectAnimator fifteen1 = ObjectAnimator.ofFloat(image15,"translationY",-800,0);
                one1.setDuration(1500);
                two1.setDuration(1500);
                three1.setDuration(1500);
                four1.setDuration(1500);
                five1.setDuration(1500);
                six1.setDuration(1500);
                seven1.setDuration(1500);
                eight1.setDuration(1500);
                nine1.setDuration(1500);
                ten1.setDuration(1500);
                eleven1.setDuration(1500);
                twelve1.setDuration(1500);
                thirteen1.setDuration(1500);
                fourteen1.setDuration(1500);
                fifteen1.setDuration(1500);

                //endregion

                //region Definire animatie 2

                ObjectAnimator one2 = ObjectAnimator.ofFloat(image1,"translationY",0,1600);
                ObjectAnimator two2 = ObjectAnimator.ofFloat(image2,"translationY",0,1600);
                ObjectAnimator three2 = ObjectAnimator.ofFloat(image3,"translationY",0,1600);
                ObjectAnimator four2 = ObjectAnimator.ofFloat(image4,"translationY",0,1600);
                ObjectAnimator five2 = ObjectAnimator.ofFloat(image5,"translationY",0,1600);
                ObjectAnimator six2 = ObjectAnimator.ofFloat(image6,"translationY",0,1600);
                ObjectAnimator seven2 = ObjectAnimator.ofFloat(image7,"translationY",0,1600);
                ObjectAnimator eight2 = ObjectAnimator.ofFloat(image8,"translationY",0,1600);
                ObjectAnimator nine2 = ObjectAnimator.ofFloat(image9,"translationY",0,1600);
                ObjectAnimator ten2 = ObjectAnimator.ofFloat(image10,"translationY",0,1600);
                ObjectAnimator eleven2 = ObjectAnimator.ofFloat(image11,"translationY",0,1600);
                ObjectAnimator twelve2 = ObjectAnimator.ofFloat(image12,"translationY",0,1600);
                ObjectAnimator thirteen2 = ObjectAnimator.ofFloat(image13,"translationY",0,1600);
                ObjectAnimator fourteen2 = ObjectAnimator.ofFloat(image14,"translationY",0,1600);
                ObjectAnimator fifteen2 = ObjectAnimator.ofFloat(image15,"translationY",0,1600);
                one2.setDuration(1500);
                two2.setDuration(1500);
                three2.setDuration(1500);
                four2.setDuration(1500);
                five2.setDuration(1500);
                six2.setDuration(1500);
                seven2.setDuration(1500);
                eight2.setDuration(1500);
                nine2.setDuration(1500);
                ten2.setDuration(1500);
                eleven2.setDuration(1500);
                twelve2.setDuration(1500);
                thirteen2.setDuration(1500);
                fourteen2.setDuration(1500);
                fifteen2.setDuration(1500);

                //endregion

                //ObjectAnimator two = ObjectAnimator.ofFloat(image1,"translationY",200,1600);
                //two.setDuration(1000);


                AnimatorSet animat = new AnimatorSet();

                if(i) {

                  //  one.setDuration(2000);
                    animat.play(one1).with(two1).with(three1).with(four1).with(five1).with(six1).with(seven1).with(eight1).with(nine1).with(ten1).with(eleven1).with(twelve1).with(thirteen1).with(fourteen1).with(fifteen1);
                    animat.start();
                    i=false;
                } else{

                   // one.setDuration(0);
                    animat.play(one2).with(two2).with(three2).with(four2).with(five2).with(six2).with(seven2).with(eight2).with(nine2).with(ten2).with(eleven2).with(twelve2).with(thirteen2).with(fourteen2).with(fifteen2);
                    animat.start();
                    i=true;
                }


            }
        });



    }
}


