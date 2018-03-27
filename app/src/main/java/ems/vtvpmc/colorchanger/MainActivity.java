package ems.vtvpmc.colorchanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button buttonRed;
    private Button buttonGreen;
    private Button buttonBlue;
    private Button buttonBackground;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonBlue= (Button) findViewById(R.id.buttonBlue);
        buttonBackground = (Button) findViewById(R.id.buttonBackground);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setBackgroundColor(getResources().getColor(R.color.blue));
            }
        });
     }
}
