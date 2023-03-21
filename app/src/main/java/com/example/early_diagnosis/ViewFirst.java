package com.example.early_diagnosis;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ViewFirst extends AppCompatActivity{
    static Hashtable<Integer, String> hashtable =new Hashtable<Integer, String>();
    static Integer QuestionID = 1;
    static String QuestID;
    TextView quest,count;
    String[] question_id, question;
    Button first;
    RadioGroup opt;
    RadioButton selectedOption;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_first);

        UserHome.reference=1;
        first = findViewById(R.id.first1);
        quest = (TextView) findViewById(R.id.quest1);
        opt = (RadioGroup)findViewById(R.id.option);
        count=(TextView)findViewById(R.id.count1);


        String url = "http://blackfarm.in/early_diagnosing/View_questions.php";

        try {
            List<NameValuePair> list = new ArrayList<>();
            QuestID=Integer.toString(QuestionID);
            count.setText(QuestID);
            list.add(new BasicNameValuePair("question_id", ViewFirst.QuestID));
            com.example.early_diagnosis.JSONParser jn = new com.example.early_diagnosis.JSONParser();
            JSONObject jsonObject = jn.makeHttpRequest(url, "GET", list);
            String res = jsonObject.getString("status");

            if (res.equalsIgnoreCase("1")) {
                JSONArray ja;
                ja = jsonObject.getJSONArray("data");
                question_id = new String[ja.length()];
                question = new String[ja.length()];


                for (int i = 0; i < ja.length(); i++) {

                    JSONObject jo = ja.getJSONObject(i);
                    question_id[i] = jo.getString("idmedical_questions");
                    question[i] = jo.getString("question");


                    com.example.early_diagnosis.Question data = new com.example.early_diagnosis.Question();
                    data.question = jo.getString("question");
                    quest.setText(data.question);

                }

                    first.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        int selectedId = opt.getCheckedRadioButtonId();
                        selectedOption = (RadioButton) findViewById(selectedId);

                        String ans=selectedOption.getText().toString();

                            hashtable.put(QuestionID,  ans);
                            Toast.makeText(getApplicationContext(),ans,Toast.LENGTH_LONG).show();
                            System.out.println(ans);
                            System.out.println(hashtable);
                            Intent i = new Intent(getApplicationContext(), com.example.early_diagnosis.ViewSecond.class);
                            startActivity(i);
                    }
                });


            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void onItemClick(View view, int position) {
        QuestID=question_id[position];
        Integer.parseInt(QuestID);

        Intent l = new Intent(getApplicationContext(),ViewFirst.class);//Viewfood
        startActivity(l);
    }

    public void onBackPressed() {
        new android.app.AlertDialog.Builder(this).setMessage("Do you want to Logout?").setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent za = new Intent(getApplicationContext(), com.example.early_diagnosis.UserHome.class);
                        startActivity(za);

                    }
                }).setNegativeButton("No", null).show();
    }
}