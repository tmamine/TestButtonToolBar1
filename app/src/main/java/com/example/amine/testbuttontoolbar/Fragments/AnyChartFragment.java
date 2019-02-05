package com.example.amine.testbuttontoolbar.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.core.cartesian.series.Column;
import com.example.amine.testbuttontoolbar.Model.Sme;
import com.example.amine.testbuttontoolbar.R;

import java.util.ArrayList;
import java.util.List;

public class AnyChartFragment extends Fragment {

    AnyChartView anyChartView;
    private List<DataEntry> data;
    //private Pie pie;
    private Cartesian cartesian;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View graphDirectView;
        graphDirectView = inflater.inflate(R.layout.fragment_anychart, container, false);

        //pie = AnyChart.pie();
        cartesian = AnyChart.column();

        data = new ArrayList<>();

        anyChartView = graphDirectView.findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(graphDirectView.findViewById(R.id.progressBar_chart_view));


        if (!GraphDirectFragment.anneeTmp.equals(null) && !GraphDirectFragment.directionTmp.equals(null) && !GraphDirectFragment.rubriqueTmp.equals(null)) {

            for (Sme sme : Sme.smeList) {
                if (sme.getAnnee().equals(Long.parseLong(GraphDirectFragment.anneeTmp)) &&
                        sme.getDirection().equals(GraphDirectFragment.directionTmp)) {

                    switch (GraphDirectFragment.rubriqueTmp) {
                        case "RA" :
                            if(!sme.getRa().equals(null))
                                data.add(new ValueDataEntry(sme.getSites(), sme.getRa().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "RA", Toast.LENGTH_LONG).show();
                            break;

                        case "RA VOLI":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getRaVoli().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "RA VOLI", Toast.LENGTH_LONG).show();
                            break;
                        case "RA CONF":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getRaConf().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "RA CONF", Toast.LENGTH_LONG).show();
                            break;
                        case "CONS ORI":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getConsOri().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "CONS ORI", Toast.LENGTH_LONG).show();
                            break;
                        case "CONS ONP":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getConsOnp().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "CONS ONP", Toast.LENGTH_LONG).show();
                            break;
                        case "CONS ORP":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getConsOrp().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "CONS ORP", Toast.LENGTH_LONG).show();
                            break;
                        case "FUIT O":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getFruitO().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "FUIT O", Toast.LENGTH_LONG).show();
                            break;
                        case "DECH MET":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getDechMet().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "DECH MET", Toast.LENGTH_LONG).show();
                            break;
                        case "DECH HUIL":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getDechHuil().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "DECH HUIL", Toast.LENGTH_LONG).show();
                            break;
                        case "DECH MACH":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getDechMach().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "DECH MACH", Toast.LENGTH_LONG).show();
                            break;
                        case "RG GES":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getRgGes().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "DECH MACH", Toast.LENGTH_LONG).show();
                            break;
                        case "RG SF6":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getRgSf6().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "RG SF6", Toast.LENGTH_LONG).show();
                            break;
                        case "RG NOX":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getRgNox().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "RG NOX", Toast.LENGTH_LONG).show();
                            break;
                        case "RG SO2":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getRgSo2().intValue()));
                            Toast.makeText(graphDirectView.getContext(),  "RG SO2", Toast.LENGTH_LONG).show();
                            break;
                        case "RG POUS":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getRgPous().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "RG POUS", Toast.LENGTH_LONG).show();
                            break;
                        case "INC EI":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getIncEi().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "INC EI", Toast.LENGTH_LONG).show();
                            break;
                        case "INC MAINT (tit mellil)":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getIncMaint().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "INC MAINT (tit mellil)", Toast.LENGTH_LONG).show();
                            break;
                        case "INC POI":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getIncPoi().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "INC POI", Toast.LENGTH_LONG).show();
                            break;
                        case "EP RET":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getEpRet().intValue()));
                            //Toast.makeText(graphDirectView.getContext(), "EP RET", Toast.LENGTH_LONG).show();
                            break;
                        case "EP DEV":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getEpDev().intValue()));
                            //Toast.makeText(graphDirectView.getContext(), "EP DEV", Toast.LENGTH_LONG).show();
                            break;
                        case "CONS RDR":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getConsRdr().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "CONS RDR", Toast.LENGTH_LONG).show();
                            break;
                        case "CONS SN":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getConsSn().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "CONS SN", Toast.LENGTH_LONG).show();
                            break;
                        case "CONS HUIL":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getConsHuil().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "CONS HUIL", Toast.LENGTH_LONG).show();
                            break;
                        case "ENG ENV":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getEngEnv().intValue()));
                            //Toast.makeText(graphDirectView.getContext(), "ENG ENV", Toast.LENGTH_LONG).show();
                            break;
                        case "ENG VIST":
                            data.add(new ValueDataEntry(sme.getSites(), sme.getEngVist().intValue()));
                            Toast.makeText(graphDirectView.getContext(), "ENG VIST", Toast.LENGTH_LONG).show();
                            break;
                        default:
                            Toast.makeText(graphDirectView.getContext(), "Aucune valeur détectée ", Toast.LENGTH_LONG).show();
                    }
                }
            }

            Column column = cartesian.column(data);
            column.tooltip();
            /*column.tooltip()
                    .titleFormat("{%X}")
                    .position(Position.CENTER_BOTTOM)
                    .anchor(Anchor.CENTER_BOTTOM)
                    .offsetX(0d)
                    .offsetY(5d)
                    .format("{%Value}");*/

            //cartesian.animation(true);

            //cartesian.title("Graphe de la representation des rubriques par rapport aux sites dans l'année " );//+ GraphDirectFragment.anneeTmp);

            cartesian.yScale().minimum(0d);

            //cartesian.yAxis(0).labels().format("${%Value}{groupsSeparator: }");

            //cartesian.tooltip().positionMode(TooltipPositionMode.POINT);
            //cartesian.interactivity().hoverMode(HoverMode.BY_X);

            cartesian.xAxis(0).title("Sites");
            cartesian.yAxis(0).title(GraphDirectFragment.rubriqueTmp);

            anyChartView.setChart(cartesian);

            /*pie.data(data);
            anyChartView.setChart(pie);*/

            Toast.makeText(graphDirectView.getContext(), "Affichage du graphe", Toast.LENGTH_LONG).show();
        }
        return graphDirectView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
