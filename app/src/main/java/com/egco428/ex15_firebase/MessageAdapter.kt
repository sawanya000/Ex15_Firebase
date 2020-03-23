package com.egco428.ex15_firebase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MessageAdapter(val mContext: Context, val layoutResId: Int, val messageList: List<Message>):
    ArrayAdapter<Message>(mContext, layoutResId, messageList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflator: LayoutInflater = LayoutInflater.from(mContext)
        val view: View = layoutInflator.inflate(layoutResId, null)
        val msgTextView = view.findViewById<TextView>(R.id.mesView)
        val idTxt = view.findViewById<TextView>(R.id.idTxt)
        val ratTxt = view.findViewById<TextView>(R.id.ratTxt)
        val msg = messageList[position]

        msgTextView.text = msg.message
        idTxt.text = msg.id
        ratTxt.text = msg.rating.toString()

        return view
    }
}