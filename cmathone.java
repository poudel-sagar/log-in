//gfgf//
package com.example.last.classeight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cmathone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extraone);
        Button sets1= (Button)findViewById(R.id.sets);
        sets1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int15=new Intent(cmathone.this,cmathchapter_one.class);
                startActivity(int15);

            }
        });
        Button root1= (Button)findViewById(R.id.root);

        root1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int16=new Intent(cmathone.this,cmathchapter_two.class);
                startActivity(int16);

            }
        });
        Button realnum3= (Button)findViewById(R.id.real_number_system);

        realnum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int17=new Intent(cmathone.this,cmathchapter_three.class);
                startActivity(int17);

            }
        });
        Button integers1= (Button)findViewById(R.id.integers);

        integers1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int18=new Intent(cmathone.this,cmathchapter_four.class);
                startActivity(int18);

            }
        });
        Button ratio_proportion1= (Button)findViewById(R.id.ratio_proportion);

        ratio_proportion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int19=new Intent(cmathone.this,cmathchapter_five.class);
                startActivity(int19);

            }
        });
        Button profit_loss1= (Button)findViewById(R.id.profit_loss);

        profit_loss1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int20=new Intent(cmathone.this,cmathchapter_six.class);
                startActivity(int20);

            }
        });
        Button unitary_method1= (Button)findViewById(R.id.unitary_method);

        unitary_method1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int21=new Intent(cmathone.this,cmathchapter_seven.class);
                startActivity(int21);

            }
        });
        Button geometry1= (Button)findViewById(R.id.geometry);

        geometry1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int22=new Intent(cmathone.this,cmathchapter_eight.class);
                startActivity(int22);

            }
        });
        Button coordinate_geometry1= (Button)findViewById(R.id.coordinate_geometry);

        coordinate_geometry1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int23=new Intent(cmathone.this,cmathchapter_nine.class);
                startActivity(int23);

            }
        });
        Button area_perimeter1= (Button)findViewById(R.id.area_perimeter);

        area_perimeter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int24=new Intent(cmathone.this,cmathchapter_ten.class);
                startActivity(int24);

            }
        });
        Button solid_shapes1= (Button)findViewById(R.id.solid_shapes);

        solid_shapes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int25=new Intent(cmathone.this,cmathchapter_eleven.class);
                startActivity(int25);

            }
        });
        Button mixture1= (Button)findViewById(R.id.mixture);

        mixture1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int26=new Intent(cmathone.this,cmathchapter_twelve.class);
                startActivity(int26);


            }
        });
        Button drawing1= (Button)findViewById(R.id.drawing);

        drawing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int27=new Intent(cmathone.this,cmathchapter_thirteen.class);
                startActivity(int27);


            }
        });
        Button statistics1= (Button)findViewById(R.id.statistics);

        statistics1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int28=new Intent(cmathone.this,cmathchapter_fourteen.class);
                startActivity(int28);


            }
        });






    }
}
