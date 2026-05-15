package ma.fst.receiverdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AirplaneModeReceiver airplaneReceiver;

    private boolean isReceiverRegistered = false;

    private Button btnToggleAirplane;
    private Button btnSendCustom;

    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        airplaneReceiver = new AirplaneModeReceiver();

        tvStatus = findViewById(R.id.tvStatus);

        btnToggleAirplane =
                findViewById(R.id.btnToggleAirplane);

        btnSendCustom =
                findViewById(R.id.btnSendCustom);

        // Button Airplane
        btnToggleAirplane.setOnClickListener(v -> {

            toggleAirplaneReceiver();
        });

        // Button Custom
        btnSendCustom.setOnClickListener(v -> {

            sendCustomBroadcast();
        });
    }

    // Toggle Receiver
    private void toggleAirplaneReceiver() {

        if (!isReceiverRegistered) {

            IntentFilter filter = new IntentFilter();

            filter.addAction(
                    Intent.ACTION_AIRPLANE_MODE_CHANGED
            );

            registerReceiver(
                    airplaneReceiver,
                    filter
            );

            isReceiverRegistered = true;

            tvStatus.setText(
                    "Receiver Avion ACTIVÉ"
            );

            btnToggleAirplane.setText(
                    "Désactiver Receiver"
            );

            Toast.makeText(
                    this,
                    "Receiver activé",
                    Toast.LENGTH_SHORT
            ).show();

        } else {

            unregisterReceiver(airplaneReceiver);

            isReceiverRegistered = false;

            tvStatus.setText(
                    "Receiver Avion DÉSACTIVÉ"
            );

            btnToggleAirplane.setText(
                    "Activer Receiver"
            );

            Toast.makeText(
                    this,
                    "Receiver désactivé",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    // Send Custom Broadcast
    private void sendCustomBroadcast() {

        Intent intent =
                new Intent(
                        "com.example.receiverdemo.CUSTOM_EVENT"
                );

        intent.putExtra(
                "message",
                "Bonjour depuis le broadcast"
        );

        sendBroadcast(intent);

        Toast.makeText(
                this,
                "Broadcast envoyé",
                Toast.LENGTH_SHORT
        ).show();
    }

    @Override
    protected void onDestroy() {

        if (isReceiverRegistered) {

            unregisterReceiver(airplaneReceiver);
        }

        super.onDestroy();
    }
}