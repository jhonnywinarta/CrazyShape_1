package tw.edu.pu.o1083023.crazyshape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*


class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        Draw()

        btnClear.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                handv.path.reset()
                handv.invalidate()
            }
        })

        btnHome.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                finish()
            }

        })
    }
    fun Draw(){
        val rand:Int = (0..3).random()
            when (rand) {
                0 -> textMsg.text="Please draw a circle 請畫出圓形"
                1 -> textMsg.text="Please draw a square 請畫出方形"
                2 -> textMsg.text="Please draw a star 請畫出星形"
                3 -> textMsg.text="Please draw a triangle 請畫出三角形"
            }
    }
}