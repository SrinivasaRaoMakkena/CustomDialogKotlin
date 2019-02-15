package dot.ga.gov.customdialog


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import kotlinx.android.synthetic.main.fruit_item.view.*

class DataAdapter(
    private val mDataset: Array<String>,
    internal var recyclerViewItemClickListener: RecyclerViewItemClickListener
) : RecyclerView.Adapter<DataAdapter.FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): FruitViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)

        return FruitViewHolder(v)

    }

    override fun onBindViewHolder(fruitViewHolder: FruitViewHolder, i: Int) {
        fruitViewHolder.mTextView.text = mDataset[i]


    }

    override fun getItemCount(): Int {
        return mDataset.size
    }


    inner class FruitViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        var mTextView: TextView

        init {
            mTextView = v.textView
            v.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            recyclerViewItemClickListener.clickOnItem(mDataset[this.adapterPosition])

        }
    }

    interface RecyclerViewItemClickListener {
        fun clickOnItem(data: String)
    }
}


