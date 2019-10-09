package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.layout_test.*

class TestFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return View.inflate(context, R.layout.layout_test, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn.setOnClickListener{
            if(slidingPanel.isOpen){
                slidingPanel.closePane()
                Toast.makeText(context, "asd", LENGTH_SHORT).show()
            }
            else {
                slidingPanel.openPane()
                Toast.makeText(context, "dsa", LENGTH_SHORT).show()
            }
        }
        slidingPanel.coveredFadeColor = 0
    }

}