package ru.ls.lithosample.ui.widget.spec

import com.facebook.litho.Column
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.Prop
import com.facebook.litho.widget.Text
import com.facebook.yoga.YogaEdge

@LayoutSpec
class ListItemSpec {

	companion object {

		@JvmStatic
		@OnCreateLayout
		fun onCreateLayout(
			c: ComponentContext,
			@Prop color: Int,
			@Prop title: String,
			@Prop subtitle: String
		): Component {
			return Column.create(c)
				.paddingDip(YogaEdge.ALL, 16f)
				.backgroundColor(color)
				.child(
					Text.create(c)
						.text(title)
						.textSizeSp(40f)
				)
				.child(
					Text.create(c)
						.text(subtitle)
						.textSizeSp(20f)
				)
				.build()
		}
	}
}