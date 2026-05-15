package ma.fst.receiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())) {

            boolean isAirplaneOn =
                    intent.getBooleanExtra("state", false);

            String message;

            if (isAirplaneOn) {

                message = "Mode Avion ACTIVÉ";

            } else {

                message = "Mode Avion DÉSACTIVÉ";
            }

            Toast.makeText(
                    context,
                    message,
                    Toast.LENGTH_LONG
            ).show();
        }
    }
}