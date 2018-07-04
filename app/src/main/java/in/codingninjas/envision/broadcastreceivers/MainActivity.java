package in.codingninjas.envision.broadcastreceivers;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.provider.Telephony;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //NotificationManager manager;
    BroadcastReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","onCreate");
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            String name = savedInstanceState.getString("name");
        }
//
//        BroadcastReceiver receiver = new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context context, Intent intent) {
//                Toast.makeText(MainActivity.this,"Custom Broadcast",Toast.LENGTH_LONG).show();
//            }
//        };
//        IntentFilter filter = new IntentFilter("custom_action");
//
//
//        registerReceiver(receiver,filter);

        Intent bIntent = new Intent("custom_action");
        sendBroadcast(bIntent);

//
//        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
//
//        Intent intent = new Intent(this,MyReceiver.class);
//        PendingIntent pendingIntent =  PendingIntent.getBroadcast(this,1,intent,0);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2018,8,2);
//
//
//        long currentTime = System.currentTimeMillis();
//        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,currentTime + 5000,10000,pendingIntent);
//        alarmManager.cancel(pendingIntent);








        //manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
//            NotificationChannel channel = new NotificationChannel("mychannel","My Channel", NotificationManager.IMPORTANCE_HIGH);
//            manager.createNotificationChannel(channel);
//        }



    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("MainActivity","onStart");
//        receiver = new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context context, Intent intent) {
//                Toast.makeText(MainActivity.this,"Dynamically Battery Low eventy",Toast.LENGTH_LONG).show();
////                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this,"mychannel");
////                builder.setSmallIcon(R.drawable.ic_launcher_foreground);
////                builder.setContentTitle("Battery Okay");
////                builder.setContentText("Battery is over 15%.");
////                Notification notification = builder.build();
////                manager.notify(1,notification);
//            }
//        };
//
//        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_OKAY);
//        registerReceiver(receiver,intentFilter);
//    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("MainActivity","onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("MainActivity","onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        unregisterReceiver(receiver);
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//
//    }

//    @Override
//    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
//        outState.putString("name","abc");
//
//
//        super.onSaveInstanceState(outState, outPersistentState);
//    }
}
