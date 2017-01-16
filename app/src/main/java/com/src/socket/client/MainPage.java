package com.src.socket.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.src.socket.client.R;

/**
 * Created by ErArGe-5 on 30.12.2016.
 */

public class MainPage extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        Button send = (Button)findViewById(R.id.buttonCase1);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), MyActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
