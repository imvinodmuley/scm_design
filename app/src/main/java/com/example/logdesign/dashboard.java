package com.example.logdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {
CardView pbtn,sbtn,dbtn,rbtn,fbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        NotificationManager mNotificationManager;

        Context mContext;
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this.getApplicationContext(), "notify_001");
        Intent ii = new Intent(this.getApplicationContext(), dashboard.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, ii, 0);

        NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle();
        bigText.setBigContentTitle("7 days are remaining to return product.");

        mBuilder.setContentIntent(pendingIntent);
        mBuilder.setSmallIcon(R.drawable.ic_stat_name);
        mBuilder.setContentTitle("Return Date");
        mBuilder.setContentText("Product id: 1"+" Product name: Vim");
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        mBuilder.setStyle(bigText);

        mNotificationManager =
                (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String channelId = "Your_channel_id";
            NotificationChannel channel = new NotificationChannel(
                    channelId,
                    "Channel human readable title",
                    NotificationManager.IMPORTANCE_HIGH);
            mNotificationManager.createNotificationChannel(channel);
            mBuilder.setChannelId(channelId);
        }

        mNotificationManager.notify(0, mBuilder.build());
        pbtn=(CardView)findViewById(R.id.collector_products_info);
        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product();
            }
        });

        sbtn=(CardView)findViewById(R.id.scanqr);
        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scan();
            }
        });

        dbtn=(CardView)findViewById(R.id.display);
        dbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diplay();
            }
        });
        rbtn=(CardView)findViewById(R.id.collector_reward);
        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product();
            }
        });
        fbtn=(CardView)findViewById(R.id.collector_fine);
        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product();
            }
        });
    }

    public void logout(View view)
    {
        this.finish();
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void product()
    {
        Intent i=new Intent(this,display_product_info.class);
        startActivity(i);
    }

    public void scan(){
        Intent i=new Intent(this,scanqr.class);
        startActivity(i);
    }

    public void diplay(){
        Intent i=new Intent(this,displayqr.class);
        startActivity(i);

    }
    
}