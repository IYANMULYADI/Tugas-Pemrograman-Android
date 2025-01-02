package com.example.testingt1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameTextView = findViewById(R.id.name);
        TextView nimTextView = findViewById(R.id.nim);
        Button toastButton = findViewById(R.id.toastButton);

        String name = nameTextView.getText().toString();
        String nim = nimTextView.getText().toString();

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = name + " " + nim + " Kamu Berhasil Membuat tugas ini";

                // Membuat layout kustom untuk toast
                View customToastView = getLayoutInflater().inflate(R.layout.custom_toast_layout, null);
                TextView toastText = customToastView.findViewById(R.id.toastText);
                toastText.setText(message);

                Toast customToast = new Toast(MainActivity.this);
                customToast.setDuration(Toast.LENGTH_LONG);
                customToast.setView(customToastView);
                customToast.show();
            }
        });



    }
}
