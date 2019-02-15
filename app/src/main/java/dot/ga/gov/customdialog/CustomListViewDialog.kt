package dot.ga.gov.customdialog

import android.app.Activity
import android.app.Dialog

import android.os.Bundle

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.Window


import kotlinx.android.synthetic.main.custom_dialog_layout.*

class CustomListViewDialog(var activity: Activity, internal var adapter: RecyclerView.Adapter<*>) : Dialog(activity),
    View.OnClickListener {
    var dialog: Dialog? = null

    internal var recyclerView: RecyclerView? = null
    private var mLayoutManager: RecyclerView.LayoutManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.custom_dialog_layout)

        recyclerView = recycler_view
        mLayoutManager = LinearLayoutManager(activity)
        recyclerView?.layoutManager = mLayoutManager
        recyclerView?.adapter = adapter

        yes.setOnClickListener(this)
        no.setOnClickListener(this)

    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.yes -> {
            }
            R.id.no -> dismiss()
            else -> {
            }
        }//Do Something
        dismiss()
    }
}