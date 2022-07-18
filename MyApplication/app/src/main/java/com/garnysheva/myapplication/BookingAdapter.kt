package com.garnysheva.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.garnysheva.myapplication.databinding.BookingItemBinding

class BookingAdapter: RecyclerView.Adapter<BookingAdapter.BookingHolder>() {
    val bookingList = ArrayList<Booking>()
    class BookingHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = BookingItemBinding.bind(item)
        fun bind(booking: Booking) = with(binding){
            tvCompany.text = booking.company
            tvName.text = booking.name
            tvDate.text = booking.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookingHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.booking_item, parent, false)
        return BookingHolder(view)
    }

    override fun onBindViewHolder(holder: BookingHolder, position: Int) {
        holder.bind(bookingList[position])
    }

    override fun getItemCount(): Int {
      return  bookingList.size
    }

    fun addBooking(booking: Booking){
        bookingList.add(booking)
        notifyDataSetChanged()
    }
}