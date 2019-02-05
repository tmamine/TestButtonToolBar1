package com.example.amine.testbuttontoolbar.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Toolbar;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;
import com.example.amine.testbuttontoolbar.MainActivity;
import com.example.amine.testbuttontoolbar.Model.Sme;
import com.example.amine.testbuttontoolbar.R;

import java.util.ArrayList;
import java.util.List;



public class GraphDirectFragment extends Fragment {

    Spinner sItemsAnnee, sItemsDirection, sItemsRubrique;
    Button bAfficherGraphe;
    AnyChartView anyChartView;

    public static  String anneeTmp, directionTmp, rubriqueTmp;

    private List<String> smeListAnnee = new ArrayList<>();
    private List<String> smeListRubrique = new ArrayList<>();
    private List<String> smeListDirection = new ArrayList<>();

    private List<DataEntry> data;
    private Pie pie;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View graphDirectView;
        graphDirectView = inflater.inflate(R.layout.fragment_graphe_direction, container, false);
        //Toolbar tb = graphDirectView.findViewById(R.id.nav_action);
        //tb.setTitle(R.string.app_second_title);

        //-------------initialisation des spinners----------------------------------------------------------

        ArrayAdapter<String> adapterAnnee = new ArrayAdapter<>(graphDirectView.getContext(), android.R.layout.simple_spinner_item, smeListAnnee);
        ArrayAdapter<String> adapterDirection = new ArrayAdapter<>(graphDirectView.getContext(), android.R.layout.simple_spinner_item, smeListDirection);
        ArrayAdapter<String> adapterRubrique = new ArrayAdapter<>(graphDirectView.getContext(), android.R.layout.simple_spinner_item, smeListRubrique);

        fillSpinnerAnnee();
        fillSpinnerDirection();
        fillSpinnerRubrique();

        adapterAnnee.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterDirection.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterRubrique.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sItemsAnnee = (Spinner) graphDirectView.findViewById(R.id.spinner_annee);
        sItemsDirection = (Spinner) graphDirectView.findViewById(R.id.spinner_direction);
        sItemsRubrique = (Spinner) graphDirectView.findViewById(R.id.spinner_rubrique);

        sItemsAnnee.setAdapter(adapterAnnee);
        sItemsDirection.setAdapter(adapterDirection);
        sItemsRubrique.setAdapter(adapterRubrique);

        //---------------------------------------------------------------------------------------------------

        bAfficherGraphe = (Button) graphDirectView.findViewById(R.id.button_afficher_graphe);

        bAfficherGraphe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                anneeTmp = sItemsAnnee.getSelectedItem().toString();
                directionTmp = sItemsDirection.getSelectedItem().toString();
                rubriqueTmp = sItemsRubrique.getSelectedItem().toString();

                AnyChartFragment fragment2 = new AnyChartFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_chart, fragment2);
                fragmentTransaction.commit();

                //startActivity(new Intent(graphDirectView.getContext(), ChartActivity.class));

                Toast.makeText(graphDirectView.getContext(), "test1", Toast.LENGTH_LONG).show();
            }
        });

        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);

        return graphDirectView;
    }

    public void fillSpinnerAnnee() {

        for (Sme sme : Sme.smeList) {
            if (Sme.smeList.get(Sme.smeList.indexOf(sme)).getAnnee().equals(sme.getAnnee())) {
                if (smeListAnnee.contains(sme.getAnnee().toString())) {
                    //do nothing
                } else {
                    smeListAnnee.add(sme.getAnnee().toString());
                }
            }
        }

    }

    public void fillSpinnerDirection() {

        for (Sme sme : Sme.smeList) {
            if (Sme.smeList.get(Sme.smeList.indexOf(sme)).getDirection().equals(sme.getDirection())) {
                if (smeListDirection.contains(sme.getDirection())) {
                    //do nothing
                } else {
                    smeListDirection.add(sme.getDirection());
                }
            }
        }

    }

    public void fillSpinnerRubrique() {

        smeListRubrique.add("RA");
        smeListRubrique.add("RA VOLI");
        smeListRubrique.add("RA CONF");
        smeListRubrique.add("CONS ORI");
        smeListRubrique.add("CONS ONP");
        smeListRubrique.add("CONS ORP");
        smeListRubrique.add("FUIT O");
        smeListRubrique.add("DECH MET");
        smeListRubrique.add("DECH HUIL");
        smeListRubrique.add("DECH MACH");
        smeListRubrique.add("RG GES");
        smeListRubrique.add("RG SF6");
        smeListRubrique.add("RG NOX");
        smeListRubrique.add("RG SO2");
        smeListRubrique.add("RG POUS");
        smeListRubrique.add("INC EI");
        smeListRubrique.add("INC MAINT (tit mellil)");
        smeListRubrique.add("INC POI");
        smeListRubrique.add("EP RET");
        smeListRubrique.add("EP DEV");
        smeListRubrique.add("CONS RDR");
        smeListRubrique.add("CONS SN");
        smeListRubrique.add("CONS HUIL");
        smeListRubrique.add("ENG ENV");
        smeListRubrique.add("ENG VIST");

    }
}
