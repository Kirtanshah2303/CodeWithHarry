package com.example.codewithharry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Collection;

import www.sanju.motiontoast.MotionToast;

public class MainActivity extends AppCompatActivity {

    ArrayList seatnumber = new ArrayList();

    ToggleButton button1,button2;
    Button login,login1,login2;
    public void clickbtn(View view){
        Log.i("this","clickbtn: This is a message");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          button1 = findViewById(R.id.toggleButton);
        button2 = findViewById(R.id.toggleButton2);
        login = findViewById(R.id.login);
        login1 = findViewById(R.id.login1);
        login2 = findViewById(R.id.login2);
        button1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        button2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               Toast.makeText(getBaseContext(),""+seatnumber,Toast.LENGTH_SHORT).show();
                MotionToast.Companion.createToast(MainActivity.this,"Upload Completed!",
                        MotionToast.TOAST_SUCCESS,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.LONG_DURATION,
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               Toast.makeText(getBaseContext(),""+seatnumber,Toast.LENGTH_SHORT).show();
                MotionToast.Companion.createColorToast(MainActivity.this,"Ooops...Please enter valid Number !",
                        MotionToast.TOAST_ERROR,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.LONG_DURATION,
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });
        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               Toast.makeText(getBaseContext(),""+seatnumber,Toast.LENGTH_SHORT).show();
                MotionToast.Companion.darkColorToast(MainActivity.this,"Upload Completed!",
                        MotionToast.TOAST_WARNING,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.LONG_DURATION,
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });

    }
}