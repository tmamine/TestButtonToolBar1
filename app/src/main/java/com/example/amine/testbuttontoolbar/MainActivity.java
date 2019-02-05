package com.example.amine.testbuttontoolbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.amine.testbuttontoolbar.Fragments.GraphDirectFragment;
import com.example.amine.testbuttontoolbar.Fragments.ListeRubriqueFragement;
import com.example.amine.testbuttontoolbar.Model.Sme;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //------------------------------------------------------------------------------------------

        Sme.smeList = new ArrayList<>();

        FirebaseDatabase mFirebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = mFirebaseDatabase.getReference();

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot childDataSnapshot : dataSnapshot.getChildren()) {

                    Log.v(TAG, "" + childDataSnapshot.getKey()); //displays the key for the node
                    Log.v(TAG, "" + childDataSnapshot.child("annee").getValue());
                    //gives the value for given keyname

                    Sme post = childDataSnapshot.getValue(Sme.class);
                    Sme.smeList.add(post);
                }
                ListeRubriqueFragement.mAdapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Chargement Terminé", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(MainActivity.this, "" + databaseError.getCode() + " - " + databaseError.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        //------------------------------------------------------------------------------------------

        //getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new ListeRubriqueFragement()).commit();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.enter, R.anim.exit);

        ListeRubriqueFragement newFragmentobject = new ListeRubriqueFragement();

        ft
                .addToBackStack(null)
                .add(R.id.fragmentContainer, newFragmentobject, "ListeRubriqueFragment")
                .commit();

        MainActivity.this.getSupportActionBar().setTitle("ListeRubriqueFragment");

        // Start the animated transition.

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new ListeRubriqueFragement()).commit();
                Snackbar.make(view, "Refresh", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        setSupportActionBar(toolbar);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_settings:
                //return true;
                this.onBackPressed();
            case R.id.action_chart:
                getSupportFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(R.anim.enter, R.anim.exit)
                        .addToBackStack(null)
                        .replace(R.id.fragmentContainer, new GraphDirectFragment()).commit();

                MainActivity.this.getSupportActionBar().setTitle("GraphDirectFragment");
        }
        return true;
    }

}
