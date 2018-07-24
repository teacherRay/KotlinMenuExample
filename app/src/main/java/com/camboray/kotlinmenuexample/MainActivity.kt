package com.camboray.kotlinmenuexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.camboray.kotlinmenuexample.R.id.hello
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu,menu)
        super.onCreateOptionsMenu(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_menu_item) {
            showAbout()
        } else if (item.itemId == R.id.map_menu_item){
            showMap()
        }else if (item.itemId == R.id.contact_menu_item){
            showContact()
        }else if (item.itemId == R.id.news_menu_item){
            showNews()
        }else if (item.itemId == R.id.fees_menu_item){
            showFees()
        }
        return true
    }


    private fun showAbout(){
        hello.text = "About the Home of English"
    }

    public fun showMap(){
        hello.text = "Location Map"
    }

    public fun showContact(){
    hello.text = "Phone 023 665 321"
}
    public fun showNews(){
        hello.text = "Home of English News"
    }
    public fun showFees(){
        hello.text = "Home of English Fees"
    }
}

