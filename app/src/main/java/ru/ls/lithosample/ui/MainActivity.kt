package ru.ls.lithosample.ui

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView
import ru.ls.lithosample.ui.widget.component.MyComponent

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		val context = ComponentContext(this)

//		val component = Text.create(context)
//			.text("Hello World")
//			.textSizeDip(50f)
//			.build()

//		val component = ListItem.create(context).build()

//		val component =
//			RecyclerCollectionComponent.create(context)
//				.disablePTR(true)
//				.section(ListSection.create(SectionContext(context)).build())
//				.build()

		val component = MyComponent.create(context)
			.title("My title")
			.imageUri(Uri.parse("https://via.placeholder.com/150"))
			.build()

		setContentView(LithoView.create(context, component))
	}
}