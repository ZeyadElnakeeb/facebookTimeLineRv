package com.example.facebooktimelinerv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: FaceBookTimeLineAdapter
    lateinit var postsItemList:ArrayList<DataItem>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        recyclerView=findViewById(R.id.recyclerView)
        initItems()
        adapter=FaceBookTimeLineAdapter(postsItemList)
        adapter.onImageClickListener=object :FaceBookTimeLineAdapter.SetOnItemClickListener{
            override fun onClick(pos: Int, item: DataItem) {

                var intent=Intent(applicationContext,MainActivity2::class.java)
                intent.putExtra("image",postsItemList[pos].ImagePost)

                startActivity(intent)




          // Toast.makeText(applicationContext,"dns;lnlorkudfhegliwg",Toast.LENGTH_SHORT).show()

            }

        }
        recyclerView.adapter=adapter



    }

    private fun initItems() {


        postsItemList= ArrayList()
        postsItemList.add(DataItem(R.drawable.ahmad_ezz,"Ahmad Ezz","2 hrs .","Ahmed Ezz Eldine Ali Ezzat, is an Egyptian film and television actor,\"with numerous accolades in his professional career spanning over 20 years and over 30 Film/TV prolific credits to his name. His popularity stems from his versatility as an actor in comedy, drama, thriller and action film and television",R.drawable.ahmad_ezz,"682","33 share",R.drawable.ahmad_ezz))
          postsItemList.add(DataItem(R.drawable.ana_de_armas,"Ana De Armas","4 hrs .","Ana Celia de Armas Caso is a Cuban and Spanish actress. She began her career in Cuba with a leading role in the romantic drama Una rosa de Francia. At the age of 18, she moved to Madrid, Spain, and starred in the popular drama El Internado for six seasons from 2007 to 2010",R.drawable.ana_de_armas,"857","23 share",R.drawable.ana_de_armas))
        postsItemList.add(DataItem(R.drawable.elon_musk,"Elon Musk","10 hrs .","Elon Reeve Musk is a businessman and investor. He is the founder, chairman, CEO, and CTO of SpaceX; angel investor, CEO, product architect, and former chairman of Tesla, Inc.; owner, chairman",R.drawable.elon_musk,"1 melion","50 share",R.drawable.elon_musk))
postsItemList.add(DataItem(R.drawable.angelina_jolie,"Angelina Jolie","7 hrs .","Angelina Jolie is an American actress, filmmaker and humanitarian. The recipient of numerous accolades, including an Academy Award and three Golden Globe Awards, she has been named Hollywood's highest-paid actress multiple times",R.drawable.angelina_jolie,"3 malion","46 share",R.drawable.angelina_jolie))
postsItemList.add(DataItem(R.drawable.amr_diab,"Amr Diab","11 hrs .","Amr Abdel Basset Abdel Azeez Diab is an Egyptian singer, composer and actor. He has established himself as a globally acclaimed recording artist and author",R.drawable.amr_diab,"753", "99 share",R.drawable.amr_diab))
postsItemList.add(DataItem(R.drawable.kate_winesalt,"Kate Winesalt","5 hrs .","Kate Elizabeth Winslet CBE is an English actress. Known for her work in independent films, particularly period dramas, and for her portrayals of headstrong and complicated women, she has received numerous ",R.drawable.kate_winesalt,"344","13 share",R.drawable.kate_winesalt))
postsItemList.add(DataItem(R.drawable.amer_karara,"Amer Karara","14 hrs .","Amir Karara is an Egyptian actor and TV presenter. His real beginning came during his presentation of Star Maker in 2003. Karara is best known for his dramatic and action roles such as his roles in Karmouz War, Horob Edtirari and Special Operations",R.drawable.amer_karara,"643","22 share",R.drawable.amer_karara))
postsItemList.add(DataItem(R.drawable.chris_evans,"Chris Evans","17 hrs .","Christopher Robert Evans is an American actor. He began his career with roles in television series such as Opposite Sex in 2000. Wikipedia",R.drawable.chris_evans,"876","11 share",R.drawable.chris_evans))
postsItemList.add(DataItem(R.drawable.jehan_khalil,"Jehan Khalil","8 hrs .","A Moroccan actress, she studied theater and specialized in philosophy, image aesthetics, and cinema. Egyptians and the Arab world knew her after she participated in the (Arab Casting) program to discover talents and won the title of best acting talent in the Arab world in December 2015.,R.drawable.jehan_khalil,",R.drawable.jehan_khalil,"44","76 share",R.drawable.jehan_khalil))
postsItemList.add(DataItem(R.drawable.yasmeen_sabry,"Yasmeen Sabry","9 hrs .", "Yasmine Sabri is a rising star in the Middle East, she participatedin a short time in all the big hit successful TV shows and movies.Yasmine started her career from scratch, she didn’t know anyone in the show business but she managed to be where she is now. Yasmine traveled to New York City and worked there during school",R.drawable.yasmeen_sabry,"10 malion","81 share",R.drawable.yasmeen_sabry))




    }
}