package com.example.amine.testbuttontoolbar.Fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.amine.testbuttontoolbar.Model.Sme;
import com.example.amine.testbuttontoolbar.R;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView direction, site, annee;

        public MyViewHolder(View view) {
            super(view);

            direction = (TextView) view.findViewById(R.id.direction);
            site = (TextView) view.findViewById(R.id.site);
            annee = (TextView) view.findViewById(R.id.annee);
        }
    }

    public MyAdapter(List<Sme> smeList) {
        Sme.smeList = smeList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_adapter, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Sme sme = Sme.smeList.get(position);

        holder.direction.setText(sme.getDirection());
        holder.site.setText(sme.getSites());
        holder.annee.setText(sme.getAnnee().toString());
    }

    @Override
    public int getItemCount() {

            return Sme.smeList.size();
    }

}