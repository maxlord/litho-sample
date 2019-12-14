package ru.ls.lithosample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView
import com.facebook.litho.sections.SectionContext
import com.facebook.litho.sections.widget.RecyclerCollectionComponent
import ru.ls.lithosample.ui.widget.spec.ListSection

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		val context = ComponentContext(this)

//		val component = Text.create(context)
//			.text("Hello World")
//			.textSizeDip(50f)
//			.build()

//		val component = ListItem.create(context).build()

		val component =
			RecyclerCollectionComponent.create(context)
				.disablePTR(true)
				.section(ListSection.create(SectionContext(context)).build())
				.build()

		setContentView(LithoView.create(context, component))
	}
}