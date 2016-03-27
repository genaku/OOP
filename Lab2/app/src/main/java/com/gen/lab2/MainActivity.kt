package com.gen.lab2

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton?
        fab?.setOnClickListener(View.OnClickListener { showData() })
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

        val display = WeatherDisplay()
        wd.registerObserver(display)

        val statsDisplay = StatsDisplay()
        wd.registerObserver(statsDisplay)

        wd.setMeasurements(3.0, 0.7, 760.0);
        wd.setMeasurements(4.0, 0.8, 740.0);
        wd.setMeasurements(10.0, 0.5, 770.0);

        wd.removeObserver(statsDisplay);

        wd.setMeasurements(-10.0, 0.6, 761.0);

    }
}