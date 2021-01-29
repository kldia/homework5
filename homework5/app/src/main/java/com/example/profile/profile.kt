package com.example.profile

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import jp.wasabeef.glide.transformations.BlurTransformation
import kotlinx.android.synthetic.main.activity_profile.*

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        profilePic.clipToOutline = true
    supportActionBar!!.hide()



val  pictures = listOf<String>("https://www.thinkright.me/wp-content/uploads/2019/09/Untitled-design-27.jpg",
"https://i1.wp.com/gwjeel.com/wp-content/uploads/2018/04/pexels-photo-443446.jpeg",
    "https://libreshot.com/wp-content/uploads/2020/03/hills-mist.jpg",
    "https://arc-anglerfish-arc2-prod-bonnier.s3.amazonaws.com/public/AGH2J5N2LFCXBSVSEG2J6DOZU4.jpg",
    "https://www.lifeofpix.com/wp-content/uploads/2018/07/IMG_0235-1600x1067.jpg",
    "https://loveincorporated.blob.core.windows.net/contentimages/main/be241209-6d6d-47b2-b691-9ea5c9d46fb3-worldsmostbeautifulwaterfalls.jpg"
    )
val rand = (pictures.indices).random()


        Glide.with(this)
            .load(pictures[rand])
            .placeholder(R.drawable.ic_launcher_background)
            .apply(bitmapTransform(   BlurTransformation(5)))
           .into(cover)

        Glide.with(this)
            .load("https://moonvillageassociation.org/wp-content/uploads/2018/06/default-profile-picture1.jpg")
            .placeholder(R.color.placeholder)
            .into(profilePic)



    }
}


