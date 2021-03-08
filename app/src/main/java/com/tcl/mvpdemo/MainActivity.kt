package com.tcl.mvpdemo

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.tcl.mvpdemo.mvp.activity.StudentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_ok.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.bt_ok) {
            var intent = Intent()
            intent.setClass(this, StudentActivity::class.java)
            startActivity(intent)
        }
    }
}