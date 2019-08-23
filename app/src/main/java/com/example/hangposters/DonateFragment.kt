package com.example.hangposters


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class DonateFragment : Fragment() {

    companion object {
        // val TAG: String =   maps::class.java.simpleName
        fun newInstance() = DonateFragment()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


       var v: View = inflater.inflate(R.layout.fragment_donate, container, false)
        var fab = v.findViewById<Button>(R.id.bDonate)


        fab.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.com/"))

            startActivity(intent)
        }
        return v
    }


}
