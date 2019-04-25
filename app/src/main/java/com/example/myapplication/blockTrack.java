package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class blockTrack extends WearableActivity {
    ImageView block_1;
    ImageView block_2;
    ImageView block_3;
    ImageView block_4;
    ImageView block_5;
    ImageView block_6;
    ImageView block_7;
    Handler handler = new Handler();
    Runnable r1,r2,r3,r4,r5,r6,r0;
    long delay = 500;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block_track_activity);

        block_1 = findViewById(R.id.blk_1);
        block_2 = findViewById(R.id.blk_2);
        block_3 = findViewById(R.id.blk_3);
        block_4 = findViewById(R.id.blk_4);
        block_5 = findViewById(R.id.blk_5);
        block_6 = findViewById(R.id.blk_6);
        block_7 = findViewById(R.id.blk_7);

        final ImageButton start_button = findViewById(R.id.btn_strt_block);
        final Button speed = findViewById(R.id.btn_speed_block);
        final ImageButton goBack = findViewById(R.id.btn_bk_block);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View st = findViewById(R.id.btn_strt_block);
                View gb = findViewById(R.id.btn_bk_block);
                View sp = findViewById(R.id.btn_speed_block);

                st.setVisibility(View.INVISIBLE);
                gb.setVisibility(View.INVISIBLE);
                sp.setVisibility(View.INVISIBLE);
                try {
                    moveBlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        View sp = findViewById(R.id.btn_speed_block);
                        View st = findViewById(R.id.btn_strt_block);
                        View gb = findViewById(R.id.btn_bk_block);
                        st.setVisibility(View.VISIBLE);
                        gb.setVisibility(View.VISIBLE);
                        sp.setVisibility(View.VISIBLE);
                    }
                },delay*19);

            }

        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count%3==0){
                    delay = 1000;
                    speed.setText("1X");
                }
                else if(count%3==1){
                    delay = 500;
                    speed.setText("2X");
                }
                else{
                    delay = 250;
                    speed.setText("4X");
                }
            }
        });



        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });



    }


    public void moveBlock() throws InterruptedException {
         r0 = new Runnable() {
           // @Override
            public void run() {
                block_1.setVisibility(View.VISIBLE);
                block_2.setVisibility(View.INVISIBLE);
                block_3.setVisibility(View.INVISIBLE);
                block_4.setVisibility(View.INVISIBLE);
                block_5.setVisibility(View.INVISIBLE);
                block_6.setVisibility(View.INVISIBLE);
                block_7.setVisibility(View.INVISIBLE);

            }
        };
        r1 = new Runnable() {
            //@Override
            public void run() {
                block_1.setVisibility(View.INVISIBLE);
                block_2.setVisibility(View.VISIBLE);
                block_3.setVisibility(View.INVISIBLE);
                block_4.setVisibility(View.INVISIBLE);
                block_5.setVisibility(View.INVISIBLE);
                block_6.setVisibility(View.INVISIBLE);
                block_7.setVisibility(View.INVISIBLE);


            }
        };
         r2 = new Runnable() {
            //@Override
            public void run() {
                block_1.setVisibility(View.INVISIBLE);
                block_2.setVisibility(View.INVISIBLE);
                block_3.setVisibility(View.VISIBLE);
                block_4.setVisibility(View.INVISIBLE);
                block_5.setVisibility(View.INVISIBLE);
                block_6.setVisibility(View.INVISIBLE);
                block_7.setVisibility(View.INVISIBLE);

            }
        };
         r3 = new Runnable() {
            //@Override
            public void run() {
                block_1.setVisibility(View.INVISIBLE);
                block_2.setVisibility(View.INVISIBLE);
                block_3.setVisibility(View.INVISIBLE);
                block_4.setVisibility(View.VISIBLE);
                block_5.setVisibility(View.INVISIBLE);
                block_6.setVisibility(View.INVISIBLE);
                block_7.setVisibility(View.INVISIBLE);
            }
        };

         r4 = new Runnable() {
           // @Override
            public void run() {
                block_1.setVisibility(View.INVISIBLE);
                block_2.setVisibility(View.INVISIBLE);
                block_3.setVisibility(View.INVISIBLE);
                block_4.setVisibility(View.INVISIBLE);
                block_5.setVisibility(View.VISIBLE);
                block_6.setVisibility(View.INVISIBLE);
                block_7.setVisibility(View.INVISIBLE);

            }
        };
         r5 = new Runnable() {
           // @Override
            public void run() {
                block_1.setVisibility(View.INVISIBLE);
                block_2.setVisibility(View.INVISIBLE);
                block_3.setVisibility(View.INVISIBLE);
                block_4.setVisibility(View.INVISIBLE);
                block_5.setVisibility(View.INVISIBLE);
                block_6.setVisibility(View.VISIBLE);
                block_7.setVisibility(View.INVISIBLE);

            }
        };
         r6 = new Runnable() {
          //  @Override
            public void run() {
                block_1.setVisibility(View.INVISIBLE);
                block_2.setVisibility(View.INVISIBLE);
                block_3.setVisibility(View.INVISIBLE);
                block_4.setVisibility(View.INVISIBLE);
                block_5.setVisibility(View.INVISIBLE);
                block_6.setVisibility(View.INVISIBLE);
                block_7.setVisibility(View.VISIBLE);
            }
        };

        block_1.setVisibility(View.VISIBLE);
        block_2.setVisibility(View.INVISIBLE);
        block_3.setVisibility(View.INVISIBLE);
        block_4.setVisibility(View.INVISIBLE);
        block_5.setVisibility(View.INVISIBLE);
        block_6.setVisibility(View.INVISIBLE);
        block_7.setVisibility(View.INVISIBLE);
        handler.postDelayed(r1,delay*1);
        handler.postDelayed(r2,delay*2);
        handler.postDelayed(r3,delay*3);
        handler.postDelayed(r4,delay*4);
        handler.postDelayed(r5,delay*5);
        handler.postDelayed(r6,delay*6);
        handler.postDelayed(r5,delay*7);
        handler.postDelayed(r4,delay*8);
        handler.postDelayed(r3,delay*9);
        handler.postDelayed(r2,delay*10);
        handler.postDelayed(r1,delay*11);
        handler.postDelayed(r0,delay*12);
        handler.postDelayed(r1,delay*13);
        handler.postDelayed(r2,delay*14);
        handler.postDelayed(r3,delay*15);
        handler.postDelayed(r4,delay*16);
        handler.postDelayed(r5,delay*17);
        handler.postDelayed(r6,delay*18);





    }



}
