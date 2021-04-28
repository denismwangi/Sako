package com.example.sako.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.R
import com.example.sako.model.Accounts
import kotlinx.android.synthetic.main.list_accounts.view.*

class AccountsAdapter(var accountsList: ArrayList<Accounts>): RecyclerView.Adapter<AccountsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountsAdapter.ViewHolder {
        lateinit var accountsViewHolder : RecyclerView.ViewHolder
        accountsViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_accounts,parent, false))
        return accountsViewHolder
    }

    override fun getItemCount(): Int {
        return accountsList.size
    }

    override fun onBindViewHolder(holder: AccountsAdapter.ViewHolder, position: Int) {
        holder.initialize(accountsList.get(position))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var circlename = itemView.circlename
        var amount = itemView.circlebal



        fun initialize(account: Accounts) {

            circlename.text = account.circleName
            amount.text = account.amount


        }
    }


}