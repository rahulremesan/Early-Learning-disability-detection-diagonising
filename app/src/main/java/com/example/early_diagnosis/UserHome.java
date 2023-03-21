package com.example.early_diagnosis;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.transition.Fade;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class UserHome extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    TextView naname, consumerno;
    SharedPreferences sp;
    private String res="";
    static Integer reference;
    FloatingActionButton button;

    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        Fade fade = new Fade();
        fade.setDuration(400);
        getWindow().setAllowEnterTransitionOverlap(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(fade);
        }

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("User Home");
        drawer = findViewById(R.id.drawer_layout);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        sp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String name = com.example.early_diagnosis.Login.userid;

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        View headerview = navigationView.getHeaderView(0);
        naname = headerview.findViewById(R.id.navname);
        consumerno = headerview.findViewById(R.id.consumerno_text);
        consumerno.setText(name);

        /*String url = "http://blackfarm.in/calorie_calculator/delete_item.php";
        List<NameValuePair> list = new ArrayList<>();
        list.add(new BasicNameValuePair("user_id", Login.userid ));
        JSONParser jn = new JSONParser();
        JSONObject jsonObject = jn.makeHttpRequest(url, "GET", list);
        String cal_consumed;
        res = null;

        try {
            res = jsonObject.getString("status");
        } catch (JSONException e) {
            Log.e("JSON Parser", "Error parsing data [" + e.getMessage() + "] ");
        }*/

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.viewhome:
                Intent viewCom = new Intent(getApplicationContext(), UserHome.class);//Viewing Farm
                startActivity(viewCom);
                finish();
                break;
            case R.id.viewquestion:
                Intent viewCom1= new Intent(getApplicationContext(),ViewFirst.class);//Viewing Farm
                startActivity(viewCom1);
                finish();
                UserHome.reference=1;
                break;

            case R.id.viewnextquestion:
                Intent viewCom2= new Intent(getApplicationContext(),ViewReadFirst.class);//Viewing Farm
                startActivity(viewCom2);
                finish();
                UserHome.reference=2;
                break;

            case R.id.nav_logout:
                new AlertDialog.Builder(this).setMessage("Do you want to Logout?").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent za = new Intent(getApplicationContext(), com.example.early_diagnosis.Login.class);
                                startActivity(za);

                            }
                        }).setNegativeButton("No", null).show();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override

    public void onBackPressed() {
        new android.app.AlertDialog.Builder(this).setMessage("Do you want to Logout?").setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent za = new Intent(getApplicationContext(), com.example.early_diagnosis.Login.class);
                        startActivity(za);

                    }
                }).setNegativeButton("No", null).show();
    }

}