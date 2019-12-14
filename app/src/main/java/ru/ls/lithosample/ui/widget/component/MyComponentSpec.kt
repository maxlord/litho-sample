package ru.ls.lithosample.ui.widget.component

import android.net.Uri
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.Prop

@LayoutSpec
class MyComponentSpec {

	companion object {

		@JvmStatic
		@OnCreateLayout
		fun onCreateLayout(
			c: ComponentContext,
			@Prop title: String,
			@Prop imageUri: Uri
		) : Component? {
			return null
		}

	}
}