package com.prashant.adesara.socket.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ErArGe-5 on 30.12.2016.
 */

public class WelcomePage  extends Activity {
    private Button send;
    private EditText ipPrompt;
    public static String serverIp;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        send = (Button)findViewById(R.id.enterIP);
        ipPrompt = (EditText) findViewById(R.id.ipPrompt);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                serverIp =  ipPrompt.getText().toString();
                if ( !serverIp.matches("[" + .0123456789 + "]+") || serverIp.contains(" ") || serverIp.isEmpty() || serverIp.equals(null) || serverIp == null ) {
                    ipPrompt.setText("");
                    Toast.makeText(WelcomePage.this, "Invalid IP Address!", Toast.LENGTH_LONG).show();
                }
                else {
                    /*Intent i = new Intent( view.getContext(), MyActivity.class);
                    i.putExtra("ipAddressOfServerDevice", serverIp);
                    startActivity(i);*/
                    Intent i = new Intent( view.getContext(), MainPage.class);
                    startActivity(i);
                }
            }
        });
    }

    public static String getServerIp() {
        return serverIp;
    }
}
