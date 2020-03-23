package com.example.last.classeight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scienceone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scienceone);
        Button butt1= (Button)findViewById(R.id.measurement);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(scienceone.this,sciencechapter_one.class);
                startActivity(int1);

            }
        });
        Button butt2= (Button)findViewById(R.id.pressure);

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2=new Intent(scienceone.this,sciencechapter_two.class);
                startActivity(int2);

            }
        });
        Button butt3= (Button)findViewById(R.id.simple_machine);

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3=new Intent(scienceone.this,sciencechapter_three.class);
                startActivity(int3);

            }
        });
        Button butt4= (Button)findViewById(R.id.work);

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4=new Intent(scienceone.this,sciencechapter_four.class);
                startActivity(int4);

            }
        });
        Button butt5= (Button)findViewById(R.id.heat);

        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5=new Intent(scienceone.this,sciencechapter_five.class);
                startActivity(int5);

            }
        });
        Button butt6= (Button)findViewById(R.id.sound);

        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6=new Intent(scienceone.this,sciencechapter_six.class);
                startActivity(int6);

            }
        });
        Button butt7= (Button)findViewById(R.id.light);

        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7=new Intent(scienceone.this,sciencechapter_seven.class);
                startActivity(int7);

            }
        });
        Button butt8= (Button)findViewById(R.id.magnetism);

        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8=new Intent(scienceone.this,sciencechapter_eight.class);
                startActivity(int8);

            }
        });
        Button butt9= (Button)findViewById(R.id.velocity);

        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9=new Intent(scienceone.this,sciencechapter_nine.class);
                startActivity(int9);

            }
        });
        Button butt10= (Button)findViewById(R.id.matter);

        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10=new Intent(scienceone.this,sciencechapter_ten.class);
                startActivity(int10);

            }
        });
        Button butt11= (Button)findViewById(R.id.acid);

        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11=new Intent(scienceone.this,sciencechapter_eleven.class);
                startActivity(int11);

            }
        });
        Button butt12= (Button)findViewById(R.id.mixture);

        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12=new Intent(scienceone.this,sciencechapter_twelve.class);
                startActivity(int12);

            }
        });





    }
}
