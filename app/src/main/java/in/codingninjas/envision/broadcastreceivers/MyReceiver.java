package in.codingninjas.envision.broadcastreceivers;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import static android.content.Context.NOTIFICATION_SERVICE;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        Toast.makeText(context,"Battery Low",Toast.LENGTH_LONG).show();

        NotificationManager manager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("mychannelid","Expenses Channel",NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);

        }




        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,"mychannelid");
        builder.setContentTitle("Expense Alarm");
        builder.setContentText("Alarm Received");
        builder.setSmallIcon(R.drawable.ic_launcher_foreground);

        Intent intent1 = new Intent(context,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context,2,intent1,0);

        builder.setContentIntent(pendingIntent);
        Notification notification = builder.build();
        manager.notify(1,notification);

    }
}
