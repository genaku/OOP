package com.gen.lab2

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.gen.lab2.Const.Place
import com.gen.lab2.Data.WeatherData
import com.gen.lab2.Data.WeatherDataPro
import com.gen.lab2.Display.StatsDisplay
import com.gen.lab2.Display.StatsDisplayPro
import com.gen.lab2.Display.WeatherDisplay
import com.gen.lab2.Display.WeatherDisplayPro

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton?
        fab?.setOnClickListener({ showPlaceDataPro() })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    private fun showData() {

        val wd = WeatherData()

        val display = WeatherDisplay(1)
        wd.registerObserver(display)

        val statsDisplay = StatsDisplay(2)
        wd.registerObserver(statsDisplay)

        wd.setMeasurements(3.0, 0.7, 760.0);
        wd.setMeasurements(4.0, 0.8, 740.0);
        wd.setMeasurements(10.0, 0.5, 770.0);

        wd.removeObserver(statsDisplay);

        wd.setMeasurements(-10.0, 0.6, 761.0);

    }

    private fun showPlaceData() {

        val wdIn = WeatherData(Place.STATION_IN)
        val wdOut = WeatherData(Place.STATION_OUT)

        val display = WeatherDisplay(1)
        wdIn.registerObserver(display)
        wdOut.registerObserver(display)

        val statsDisplay = StatsDisplay(2)
        wdIn.registerObserver(statsDisplay)
        wdOut.registerObserver(statsDisplay)

        wdIn.setMeasurements(3.0, 0.7, 760.0);
        wdIn.setMeasurements(4.0, 0.8, 740.0);
        wdIn.setMeasurements(10.0, 0.5, 770.0);

        wdOut.setMeasurements(14.0, 0.5, 755.0);

        wdIn.removeObserver(statsDisplay);

        wdIn.setMeasurements(-10.0, 0.6, 761.0);

    }

    private fun showPlaceDataPro() {

        val wdIn = WeatherData(Place.STATION_IN)
        val wdOut = WeatherDataPro(Place.STATION_OUT)

        val display = WeatherDisplayPro(1)
        wdIn.registerObserver(display)
        wdOut.registerObserver(display)

        val statsDisplay = StatsDisplayPro(2)
        wdIn.registerObserver(statsDisplay)
        wdOut.registerObserver(statsDisplay)

        wdIn.setMeasurements(3.0, 0.7, 760.0);
        wdIn.setMeasurements(4.0, 0.8, 740.0);
        wdIn.setMeasurements(10.0, 0.5, 770.0);

        wdOut.setMeasurements(14.0, 0.5, 755.0, 120.0, 5.0);

        wdIn.removeObserver(statsDisplay);

        wdOut.setMeasurements(12.0, 0.6, 740.0, 140.0, 4.0);

        wdIn.setMeasurements(-10.0, 0.6, 761.0);

    }

}
