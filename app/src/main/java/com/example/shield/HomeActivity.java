package com.example.shield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;
import com.test.shield.DomesticActivity;
import com.test.shield.HelpActivity;
import com.test.shield.TraffickingActivity;

public class HomeActivity extends AppCompatActivity {
    Button btnLogout, trafik,domvol,logout;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        logout=findViewById(R.id.logout);
        btnLogout = findViewById(R.id.help);
        trafik=findViewById(R.id.trafficking);
        domvol=findViewById(R.id.domvol);

        /**btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intToMain);
            }
        });**/
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, HelpActivity.class);
                startActivity(intToMain);
            }
        });
        trafik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, TraffickingActivity.class);
                startActivity(intToMain);
            }
        });
        domvol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, DomesticActivity.class);
                startActivity(intToMain);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intToMain);
            }
        });
    }
}