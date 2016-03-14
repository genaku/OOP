package com.gen.lab1_3

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.gen.lab1_3.Ducks.*
import com.gen.lab1_3.Strategies.Fly

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener({ playDucks() })
    }

    private fun playWithDuck(duck: Duck) {
        with (duck) {
            display()
            quack()
            dance()
            fly()
        }
    }

    private fun playDucks() {
        val mallardDuck = MallardDuck()
        playWithDuck(mallardDuck)
        playWithDuck(mallardDuck)

        val redheadDuck = RedheadDuck()
        playWithDuck(redheadDuck)
        playWithDuck(mallardDuck)
        playWithDuck(redheadDuck)

        playWithDuck(RubberDuck())

        playWithDuck(DeckoyDuck())

        val modelDuck = ModelDuck()
        playWithDuck(modelDuck)
        modelDuck.flyBehavior = { Fly.flyWithWings() };
        playWithDuck(modelDuck)
    }

}
