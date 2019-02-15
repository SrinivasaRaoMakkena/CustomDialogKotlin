package dot.ga.gov.customdialog


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), DataAdapter.RecyclerViewItemClickListener {


    internal var customDialog: CustomListViewDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }

    fun clickHere(view: View) {
        val items = arrayOf(
            "Apple Apple Apple ",
            "Banana",
            "Orange",
            "Grapes",
            "Apple",
            "Banana",
            "Orange",
            "Grapes",
            "Apple",
            "Banana",
            "Orange",
            "Grapes",
            "Apple",
            "Banana",
            "Orange",
            "Grapes",
            "Apple",
            "Banana",
            "Orange",
            "Grapes"
        )


        val dataAdapter = DataAdapter(items, this)
        customDialog = CustomListViewDialog(this@HomeActivity, dataAdapter)

        //if we know that the particular variable not null any time ,we can assign !! (not null operator ), then  it won't check for null, if it becomes null, it willthrow exception
        customDialog!!.show()
        customDialog!!.setCanceledOnTouchOutside(false)


    }

    override fun clickOnItem(data: String) {
        //Synthetic property without calling findViewById() method and supports view caching to improve performance.
        button.text = data

        if (customDialog != null) {
            customDialog!!.dismiss()
        }
    }
}
