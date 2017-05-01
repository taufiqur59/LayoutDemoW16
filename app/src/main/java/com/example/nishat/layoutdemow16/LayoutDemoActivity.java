package com.example.nishat.layoutdemow16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class LayoutDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_demo);
    }

    public void changePic(View view) {
        int id = view.getId();
        ImageView myImageView = (ImageView) findViewById(R.id.imageViewer);

        if(id==R.id.radioAsad) {
            myImageView.setImageResource(R.drawable.asad);
        } else if(id == R.id.radioGamil) {
            myImageView.setImageResource(R.drawable.gamil);
        } else if(id == R.id.radioRupa) {
            myImageView.setImageResource(R.drawable.rupa);
        } else if(id == R.id.radioZinia) {
            myImageView.setImageResource(R.drawable.zinia);
        }
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.i("lifeCycle","onStart was called.");
    }

}
