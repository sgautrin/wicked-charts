package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.Marker;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.State;
import com.googlecode.wickedcharts.highcharts.options.StatesChoice;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.series.CoordinatesSeries;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class ScatterWithRegressionLineOptions extends ShowcaseOptions {

  public ScatterWithRegressionLineOptions() {

    setxAxis(new Axis()
        .setMin(-0.5)
        .setMax(5.5));

    setyAxis(new Axis()
        .setMin(0));

    setTitle(new Title("Scatter plot with regression line"));

    addSeries(new CoordinatesSeries()
        .addPoint(0, 1.11)
        .addPoint(5, 4.51)
        .setName("Regression Line")
        .setType(SeriesType.LINE)
        .setMarker(new Marker(Boolean.TRUE))
        .setStates(new StatesChoice().setHover(new State()
            .setLineWidth(0))));

    addSeries(new SimpleSeries()
        .setType(SeriesType.SCATTER)
        .setName("Observations")
        .addPoint(1)
        .addPoint(1.5)
        .addPoint(2.8)
        .addPoint(3.5)
        .addPoint(3.9)
        .addPoint(4.2)
        .setMarker(new Marker().setRadius(4)));

  }

  @Override
  public String getLabel() {
    return "Scatter with regression line";
  }

}