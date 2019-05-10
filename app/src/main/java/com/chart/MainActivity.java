package com.chart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BarChart chart = findViewById(R.id.chart);
        BarData data = new BarData(getDataSet());
        chart.setData(data);
        chart.setFitBars(true);
        chart.getAxisLeft().setTextColor(Color.GRAY);
        chart.getAxisRight().setTextColor(Color.GRAY);
        chart.getXAxis().setTextColor(Color.BLUE);
        chart.getDescription().setText("Runs");
        chart.getDescription().setTextColor(Color.RED);
        chart.getDescription().setTextSize(16);
        chart.getAxisLeft().setEnabled(true); //show y-axis at left
        chart.getAxisRight().setEnabled(false); //hide y-axis at right
        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        YAxis leftAxis = chart.getAxisLeft();
        leftAxis.setDrawAxisLine(true);
        leftAxis.setDrawGridLines(true);
        leftAxis.setAxisMinimum(0f);
        YAxis rightAxis = chart.getAxisRight();
        rightAxis.setDrawAxisLine(true);
        rightAxis.setAxisMinimum(0f);
//        chart.setDescription("My Chart");
        chart.animateXY(2000, 2000);
        chart.invalidate();
    }

    /*    private List<BarDataSet> getDataSet() {
            List<BarDataSet> dataSets = null;

            List<BarEntry> valueSet1 = new ArrayList<>();
            BarEntry v1e1 = new BarEntry(110.000f, 0); // Jan
            valueSet1.add(v1e1);
            BarEntry v1e2 = new BarEntry(40.000f, 1); // Feb
            valueSet1.add(v1e2);
            BarEntry v1e3 = new BarEntry(60.000f, 2); // Mar
            valueSet1.add(v1e3);
            BarEntry v1e4 = new BarEntry(30.000f, 3); // Apr
            valueSet1.add(v1e4);
            BarEntry v1e5 = new BarEntry(90.000f, 4); // May
            valueSet1.add(v1e5);
            BarEntry v1e6 = new BarEntry(100.000f, 5); // Jun
            valueSet1.add(v1e6);

            ArrayList<BarEntry> valueSet2 = new ArrayList<>();
            BarEntry v2e1 = new BarEntry(150.000f, 0); // Jan
            valueSet2.add(v2e1);
            BarEntry v2e2 = new BarEntry(90.000f, 1); // Feb
            valueSet2.add(v2e2);
            BarEntry v2e3 = new BarEntry(120.000f, 2); // Mar
            valueSet2.add(v2e3);
            BarEntry v2e4 = new BarEntry(60.000f, 3); // Apr
            valueSet2.add(v2e4);
            BarEntry v2e5 = new BarEntry(20.000f, 4); // May
            valueSet2.add(v2e5);
            BarEntry v2e6 = new BarEntry(80.000f, 5); // Jun
            valueSet2.add(v2e6);

            BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
            barDataSet1.setColor(Color.rgb(0, 155, 0));
            BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
            barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

            dataSets = new ArrayList<>();
            dataSets.add(barDataSet1);
            dataSets.add(barDataSet2);
            return dataSets;
        }*/
    private List<IBarDataSet> getDataSet() {
        List<IBarDataSet> dataSets = null;

        List<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(1, 1); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(2, 2); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(3, 3); // Mar
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(4, 4); // Apr
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(5, 5); // May
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(6, 6); // Jun
        valueSet1.add(v1e6);
        BarEntry v1e7 = new BarEntry(7, 7); // Jan
        valueSet1.add(v1e7);
        BarEntry v1e8 = new BarEntry(8, 8); // Feb
        valueSet1.add(v1e8);
        BarEntry v1e9 = new BarEntry(9, 9); // Mar
        valueSet1.add(v1e9);
        BarEntry v1e10 = new BarEntry(10, 10); // Apr
        valueSet1.add(v1e10);
        BarEntry v1e11 = new BarEntry(11, 11); // May
        valueSet1.add(v1e11);
        BarEntry v1e12 = new BarEntry(12, 12); // Jun
        valueSet1.add(v1e12);
        BarEntry v1e13 = new BarEntry(13, 7); // Jan
        valueSet1.add(v1e13);
        BarEntry v1e14 = new BarEntry(14, 8); // Feb
        valueSet1.add(v1e14);
        BarEntry v1e15 = new BarEntry(15, 9); // Mar
        valueSet1.add(v1e15);
        BarEntry v1e16 = new BarEntry(16, 10); // Apr
        valueSet1.add(v1e16);
        BarEntry v1e17 = new BarEntry(17, 11); // May
        valueSet1.add(v1e17);
        BarEntry v1e18 = new BarEntry(18, 12); // Jun
        valueSet1.add(v1e18);
        BarEntry v1e19 = new BarEntry(19, 11); // May
        valueSet1.add(v1e19);
        BarEntry v1e20 = new BarEntry(20, 15); // Jun
        valueSet1.add(v1e20);

  /*  ArrayList<BarEntry> valueSet2 = new ArrayList<>();
    BarEntry v2e1 = new BarEntry(150.000f, 0); // Jan
    valueSet2.add(v2e1);
    BarEntry v2e2 = new BarEntry(90.000f, 1); // Feb
    valueSet2.add(v2e2);
    BarEntry v2e3 = new BarEntry(120.000f, 2); // Mar
    valueSet2.add(v2e3);
    BarEntry v2e4 = new BarEntry(60.000f, 3); // Apr
    valueSet2.add(v2e4);
    BarEntry v2e5 = new BarEntry(20.000f, 4); // May
    valueSet2.add(v2e5);
    BarEntry v2e6 = new BarEntry(80.000f, 5); // Jun
    valueSet2.add(v2e6);*/

        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Overs");
        barDataSet1.setColor(Color.rgb(0, 155, 0));
   /* BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
    barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);*/

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        /*  dataSets.add(barDataSet2);*/
        return dataSets;
    }

/*    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        return xAxis;
    }*/
}