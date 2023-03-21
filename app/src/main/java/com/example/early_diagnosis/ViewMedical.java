package com.example.early_diagnosis;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ViewMedical extends AppCompatActivity {
    static Hashtable<Integer, String> hashtable = ViewSecond.hashtable;
    //static Integer QuestionID = 1;
    static String QuestID;

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_medical);
        //t1 = findViewById(R.id.planname1);
        // t2 = findViewById(R.id.planname2);
        //t3 = findViewById(R.id.planname3);
        // t4 = findViewById(R.id.planname4);
        // t5 = findViewById(R.id.planname5);
        //  t6 = findViewById(R.id.planname6);
        //  t7 = findViewById(R.id.planname7);
        //  t8 = findViewById(R.id.planname8);
        // t9 = findViewById(R.id.planname9);
        //  t10 = findViewById(R.id.planname10);
        //  t11 = findViewById(R.id.planname11);
        //  t12 = findViewById(R.id.planname12);
        //  t13 = findViewById(R.id.planname13);
        // t14 = findViewById(R.id.planname14);
        //t15 = findViewById(R.id.planname15);
        t16 = findViewById(R.id.planname16);


        if (UserHome.reference == 1) {
            String url = "http://blackfarm.in/early_diagnosing/prediction_early.php";
            List<NameValuePair> list = new ArrayList<>();
            com.example.early_diagnosis.JSONParser jn = new com.example.early_diagnosis.JSONParser();
            JSONObject jsonObject = jn.makeHttpRequest(url, "GET", list);
            try {
                String res = jsonObject.getString("status");
            } catch (JSONException e) {
                e.printStackTrace();
            }


            Medical m = new Medical();
            System.out.println(m.result);
            m.getData(hashtable.get(1), hashtable.get(2), hashtable.get(3), hashtable.get(4), hashtable.get(5), hashtable.get(6), hashtable.get(7), hashtable.get(8), hashtable.get(9), hashtable.get(10), hashtable.get(11), hashtable.get(12), hashtable.get(13), hashtable.get(14), hashtable.get(15));
            // t1.setText(hashtable.get(1));
            // t2.setText(hashtable.get(2));
            // t3.setText(hashtable.get(3));
            // t4.setText(hashtable.get(4));
            // t5.setText(hashtable.get(5));
            // t6.setText(hashtable.get(6));
            // t7.setText(hashtable.get(7));
            // t8.setText(hashtable.get(8));
            // t9.setText(hashtable.get(9));
            // t10.setText(hashtable.get(10));
            // t11.setText(hashtable.get(11));
            // t12.setText(hashtable.get(12));
            // t13.setText(hashtable.get(13));
            // t14.setText(hashtable.get(14));
            // t15.setText(hashtable.get(15));


            //t16.setText(m.result);
            if (m.totalsumno > m.totalsumyes) {
                System.out.println("Disease Not Found...You are perfectly fine");
                m.result = "Disease Not Found...You are perfectly fine";
            } else if (m.totalsumno < m.totalsumyes) {
                System.out.println("Disease Found Yes...You have some medical issues");
                m.result = "Disease Found Yes...You have some medical issues";
            } else {
                System.out.println("Disease Found Yes/No..Cannot be predict..Sorry");
                m.result = "Disease Found Yes/No..Cannot be predict..Sorry";
            }
            System.out.println("total no of no:" + m.totalsumno);
            System.out.println("total no of yes:" + m.totalsumyes);
            t16.setText(m.result);


        }else if(UserHome.reference==2){
            String url = "http://blackfarm.in/early_diagnosing/prediction_early_second.php";
            List<NameValuePair> list = new ArrayList<>();
            com.example.early_diagnosis.JSONParser jn = new com.example.early_diagnosis.JSONParser();
            JSONObject jsonObject = jn.makeHttpRequest(url, "GET", list);
            try {
                String res = jsonObject.getString("status");
            } catch (JSONException e) {
                e.printStackTrace();
            }


            Medical m = new Medical();
            System.out.println(m.result);
            m.getData(hashtable.get(1), hashtable.get(2), hashtable.get(3), hashtable.get(4), hashtable.get(5), hashtable.get(6), hashtable.get(7), hashtable.get(8), hashtable.get(9), hashtable.get(10), hashtable.get(11), hashtable.get(12), hashtable.get(13), hashtable.get(14), hashtable.get(15));


            if (m.totalsumno > m.totalsumyes) {
                System.out.println("Disease Not Found...You are perfectly fine");
                m.result = "Disease Not Found...You are perfectly fine";
            } else if (m.totalsumno < m.totalsumyes) {
                System.out.println("Disease Found Yes...You have some medical issues");
                m.result = "Disease Found Yes...You have some medical issues";
            } else {
                System.out.println("Disease Found Yes/No..Cannot be predict..Sorry");
                m.result = "Disease Found Yes/No..Cannot be predict..Sorry";
            }
            System.out.println("total no of no:" + m.totalsumno);
            System.out.println("total no of yes:" + m.totalsumyes);
            t16.setText(m.result);

        }
    }
    public void onBackPressed() {
        new android.app.AlertDialog.Builder(this).setMessage("Do you want to go to Home?").setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent za = new Intent(getApplicationContext(), com.example.early_diagnosis.UserHome.class);
                        startActivity(za);

                    }
                }).setNegativeButton("No", null).show();
    }

}
