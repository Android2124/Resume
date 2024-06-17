package com.example.resume;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NinthActivity extends AppCompatActivity {

    TextView txtname,txtjobtitle,txtcontact,txtemail,txtpt,txtrole,txtic,txtsname,txtaddress;
    TextView txtedegree,txtfos,txtcname,txtPosition,txteyear,txtsk1,txtsk2,txthobby1,txthobby2,txthobby3;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);

        preferences = getSharedPreferences("Data",0);
        txtname = findViewById(R.id.txtname);
        txtjobtitle = findViewById(R.id.txtjobtitle);
        txtaddress = findViewById(R.id.txtaddress);
        txtcontact = findViewById(R.id.txtnumber);
        txtemail = findViewById(R.id.txtemail);
        txtpt = findViewById(R.id.txtPname);
        txtrole = findViewById(R.id.txtRol);
        txtic = findViewById(R.id.txtCname);
        txtsname = findViewById(R.id.txtsname);
        txtedegree = findViewById(R.id.txtedegree);
        txtfos = findViewById(R.id.txtfos);
        txtcname = findViewById(R.id.txtcname);
        txteyear = findViewById(R.id.txteyear);
        txtPosition = findViewById(R.id.txtPosition);
        txtsk1 = findViewById(R.id.txtSkill1);
        txtsk2 = findViewById(R.id.txtSkill2);
        txthobby1 = findViewById(R.id.txtHobby1);
        txthobby2 = findViewById(R.id.txtHobby2);
        txthobby3 = findViewById(R.id.txtHobby3);

        String fname = preferences.getString("fname","");
        String jt = preferences.getString("jt","");
        String address = preferences.getString("address","");
        String email = preferences.getString("email","");
        String phone = preferences.getString("phone","");
        String pt = preferences.getString("pt","");
        String role = preferences.getString("role","");
        String ic = preferences.getString("ic","");
        String sname = preferences.getString("sname","");
        String edegree = preferences.getString("edegree","");
        String fos = preferences.getString("fos","");
        String eyear = preferences.getString("eyear","");
        String position = preferences.getString("position","");
        String cname = preferences.getString("cname","");
        String location = preferences.getString("location","");
        String skill = preferences.getString("skill","");
        String hobby = preferences.getString("hobby","");

        txtname.setText(""+fname);
        txtjobtitle.setText(""+jt);
        txtemail.setText("E-mail="+email);
        txtaddress.setText("Address"+address);
        txtcontact.setText("Contact no.="+phone);
        txtpt.setText("Project Title"+pt);
        txtrole.setText("Role"+role);
        txtic.setText("Compony="+ic);
        txtsname.setText("School name="+sname);
        txtedegree.setText("Degree="+edegree);
        txtfos.setText("Field of study="+fos);
        txtcname.setText("Project Title"+cname);
        txteyear.setText("Experience Year="+eyear);
        txtPosition.setText("Position"+position);
        txtrole.setText("Role"+location);
        txtsk1.setText("Compony="+skill);
        txtsk2.setText("Job title="+skill);
        txthobby1.setText("Degree=="+hobby);
        txthobby2.setText("Field of study="+hobby);
        txthobby3.setText("Hobby="+hobby);

    }
}