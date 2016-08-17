package com.example.marulong.firebasetraining;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;



import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Firebase.setAndroidContext(this);
        String url = "https://firechat-29413.firebaseio.com/contacts";
        new Firebase(url).addChildEventListener(
                new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                        adapter.add(
                                (String) dataSnapshot.child("name").getValue());
                    }

                    @Override
                    public void onChildRemoved(DataSnapshot dataSnapshot) {
                        adapter.remove(
                                (String) dataSnapshot.child("name").getValue());
                    }

                    @Override
                    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }

                    @Override
                    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                    }
                });

// Setup Firebase library
       // Firebase.setAndroidContext(this);

// Creating a Firebase database Reference
        //Firebase myFirebaseRef = new Firebase("https://firechat-29413.firebaseio.com/");

// Writing Data
       // myFirebaseRef.child(“message”).setValue("Do you have data? You'll love Firebase.”);

               // myFirebaseRef.child(“message”).addValueEventListener(new ValueEventListener() {

                  //  public void onDataChange(DataSnapshot snapshot) {

                       // Settings.System.out.println(snapshot.getValue());
                  //  }

                   // public void onCancelled(FirebaseError error) {


                   // }

               // });

 }
}
