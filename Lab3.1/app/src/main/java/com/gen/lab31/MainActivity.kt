package com.gen.lab31

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import com.gen.lab31.Beverage.Latte
import com.gen.lab31.Condiment.ChocolateCrumbs
import com.gen.lab31.Condiment.Cinnamon
import com.gen.lab31.Condiment.IceCubes
import com.gen.lab31.Condiment.Lemon
import com.gen.lab31.Const.IceCubeType
import com.gen.lab31.Const.PortionType

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton?
        fab?.setOnClickListener(View.OnClickListener { view -> Snackbar.make(view, doBeverage(), Snackbar.LENGTH_LONG).setAction("Action", null).show() })
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

    fun doBeverage(): String {
        // Наливаем чашечку латте
        val latte = Latte(PortionType.Double)
        // добавляем корицы
        val cinnamon = Cinnamon(latte)
        // добавляем пару долек лимона
        val lemon = Lemon(cinnamon, 2)
        // добавляем пару кубиков льда
        val iceCubes = IceCubes(lemon, 2, IceCubeType.Dry);
        // добавляем 2 грамма шоколадной крошки
        val beverage = ChocolateCrumbs(iceCubes, 2);

        // Выписываем счет покупателю
        return "${beverage.getDescription()} costs ${beverage.getCost()}";
    }
}
