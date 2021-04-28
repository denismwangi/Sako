package com.example.sako.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.R
import com.example.sako.model.Transactions
import kotlinx.android.synthetic.main.list_transactions.view.*

class TransactionsAdapter (var transactionsList : ArrayList<Transactions>) : RecyclerView.Adapter<TransactionsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TransactionsAdapter.ViewHolder {
       lateinit var transactionsViewHolder : RecyclerView.ViewHolder
        transactionsViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_transactions,parent, false))
        return transactionsViewHolder
    }

    override fun getItemCount(): Int {
       return transactionsList.size
    }

    override fun onBindViewHolder(holder: TransactionsAdapter.ViewHolder, position: Int) {
        holder.initialize(transactionsList.get(position))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nameT = itemView.name_t
        var amount = itemView.amount_t
        var time = itemView.time_t


        fun initialize(transact: Transactions) {

            nameT.text = transact.name_of_transaction
            amount.text = transact.amount_transacted
            time.text = transact.time_of_transaction

        }
    }
}