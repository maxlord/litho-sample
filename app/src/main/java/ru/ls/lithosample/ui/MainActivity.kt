package ru.ls.lithosample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView
import com.facebook.litho.widget.Text

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		val context = ComponentContext(this)
		val component = Text.create(context)
			.text("Hello World")
			.textSizeDip(50f)
			.build()

		setContentView(LithoView.create(context, component))
	}
}