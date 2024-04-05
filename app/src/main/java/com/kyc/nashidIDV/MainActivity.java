package com.kyc.nashidIDV;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {
    Button btnStartSDK;
    int REQUEST_CODE_ASK_PERMISSIONS = 100;

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStartSDK = findViewById(R.id.btn_start_sdk);

        btnStartSDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                NashidSDK nashidSDK=new NashidSDK();
//                nashidSDK.openIdCardScanScreen(MainActivity.this);
//                Intent i = new Intent(MainActivity.this, SelectDocumentActivity.class);
//                startActivity(i);
            }
        });

    }

}
