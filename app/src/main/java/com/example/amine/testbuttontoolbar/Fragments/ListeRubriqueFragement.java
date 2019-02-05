package com.example.amine.testbuttontoolbar.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.amine.testbuttontoolbar.MainActivity;
import com.example.amine.testbuttontoolbar.Model.Sme;
import com.example.amine.testbuttontoolbar.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class ListeRubriqueFragement extends Fragment {

    FloatingActionButton fab;

    private static final String TAG = "ListeRubriqueFragment";


    private RecyclerView mRecyclerView;
    public static MyAdapter mAdapter;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View listeRubriqueView;
        listeRubriqueView = inflater.inflate(R.layout.fragment_liste_rubrique, container, false);

//-------------------------------------------------------------------------

        /*FirebaseDatabase mFirebaseDatabase = FirebaseDatabase.getInstance();
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
                mAdapter.notifyDataSetChanged();
                Toast.makeText(listeRubriqueView.getContext(), "Chargement Terminé", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(listeRubriqueView.getContext(), "" + databaseError.getCode() + " - " + databaseError.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
*/
        //---RecycleView-----------------------------------------------------------
        mRecyclerView = (RecyclerView) listeRubriqueView.findViewById(R.id.recycler_view);

        mAdapter = new MyAdapter(Sme.smeList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(listeRubriqueView.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

        //prepareSmeData();
//--------------------------------------------------------------------------------------
        /*fab = (FloatingActionButton) listeRubriqueView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                GraphDirectFragment gdfragment = new GraphDirectFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_chart, gdfragment);
                fragmentTransaction.commit();
            }
        });*/
        //((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //((MainActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);

        return listeRubriqueView;
    }
}
