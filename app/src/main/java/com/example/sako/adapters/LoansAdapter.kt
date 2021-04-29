package com.example.sako.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.R
import com.example.sako.model.Loans
import kotlinx.android.synthetic.main.list_loan.view.*

class LoansAdapter(var loansList : ArrayList<Loans>) : RecyclerView.Adapter<LoansAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoansAdapter.ViewHolder {
        lateinit var loansViewHolder : RecyclerView.ViewHolder
       loansViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_loan,parent, false))
        return loansViewHolder
    }

    override fun getItemCount(): Int {
        return loansList.size
    }

    override fun onBindViewHolder(holder: LoansAdapter.ViewHolder, position: Int) {
        holder.initialize(loansList.get(position))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var circlename = itemView.circlename
        var amount = itemView.loan_amount
        var date = itemView.date_approved


        fun initialize(loan: Loans) {

            circlename.text = loan.circlename
           amount.text = loan.amount
            date.text = loan.dateApproved


        }
    }
}