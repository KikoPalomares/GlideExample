package com.kikopalomares.glideexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlideApp.with(this)
                .load("https://lh3.googleusercontent.com/3JxvGkI4Q4E55jejawJerWRRXCZzYztPWkZXcZjHs5QYqm596i7ZbQ8fLlNIas2Ws7xSaiN3Pr_DJl0aa4duzf_oVbiZ5oXoEdD2jE8O2-FjoXB0roAa631nIjW63omv6Guevw7SJLlVVZhmGdSO1CREcvNbY5uMTZidvaYhEv89_m6_is71oyi0aDBCtqFSjLv2VIEHlJRdXt8dcBVcHmeMyUZUXtq1K1vLoEqxTRLyDb1M-_oTdaqIvivun9wijCKJj2wRyWcJg0UdOn1b1FQMvu1boxoJNOS_cODnoo6ZCsnl0Mu2UnURqOAUyG031yxuaBSKPsgRhnF2GeNqQ0D3i4kUpo3VZ9q6TU9_x1wOY5sAyrbX7Lfct22KGmUwoW-yVtWZ9XH6KSxyXnOovsAlhGdvUCAPeD8vAC_1RgI7-RynokZbnstdoUiCYfxzl897CBP6Ck-Wyk4izviuZdfIU4d4wd4nqYd_EkbEW1XRaGFHyNObHirsy3bpzcFvMiSwvR81s87A9HjtQfZDyEKcAdZ6Bmblv0MfPTwixtPjw_N1fBqHPKH8giGWB6VLn82fQb4f43Io64XXiaYXqGE6JT_ZGVuTQkibnAct=s895-no")
                .into(imageView)
    }
}
