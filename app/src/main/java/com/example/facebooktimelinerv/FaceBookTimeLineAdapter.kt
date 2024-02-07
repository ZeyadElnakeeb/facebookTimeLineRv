package com.example.facebooktimelinerv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class FaceBookTimeLineAdapter(private val postItemList: ArrayList<DataItem>):RecyclerView.Adapter<FaceBookTimeLineAdapter.FaceBookTimeLineViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FaceBookTimeLineViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_post_layout,parent,false)
        return FaceBookTimeLineViewHolder(view)


    }

    override fun getItemCount(): Int =postItemList.size

    override fun onBindViewHolder(holder: FaceBookTimeLineViewHolder, position: Int) {
        var posts=postItemList[position]
        holder.imageUser.setImageResource(posts.imageUser)
        holder.userName.text=posts.userName
        holder.time.text=posts.time
        holder.adressPost.text=posts.adressPost
        holder.imagePost.setImageResource(posts.ImagePost)
        holder.countShare.text=posts.countShare
        holder.countLike.text=posts.countLike
        holder.smallImage.setImageResource(posts.smallImage)
        if (onImageClickListener!=null) {
            holder.imagePost.setOnClickListener {

                onImageClickListener!!.onClick(position,posts)
            }
        }

    }

           var onImageClickListener:SetOnItemClickListener?=null

    interface SetOnItemClickListener{
        fun onClick(pos: Int, item: DataItem)
    }



    class FaceBookTimeLineViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        var imageUser:ImageView
        var userName:TextView
        var time :TextView
        var adressPost:TextView
        var imagePost:ImageView
        var countLike:TextView
        var countShare:TextView
        var smallImage:ImageView

        init {

            imageUser=itemView.findViewById(R.id.user_Image)
            userName=itemView.findViewById(R.id.user_name)
            time=itemView.findViewById(R.id.time)
            adressPost=itemView.findViewById(R.id.title)
            imagePost=itemView.findViewById(R.id.image_post)
            countLike=itemView.findViewById(R.id.like_count)
            countShare=itemView.findViewById(R.id.shareCounter)
            smallImage=itemView.findViewById(R.id.image_small)





        }


    }
}