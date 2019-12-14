package ru.ls.lithosample.ui.widget.spec

import com.facebook.litho.sections.Children
import com.facebook.litho.sections.SectionContext
import com.facebook.litho.sections.annotations.GroupSectionSpec
import com.facebook.litho.sections.annotations.OnCreateChildren
import com.facebook.litho.sections.common.SingleComponentSection

@GroupSectionSpec
class ListSectionSpec {

	companion object {

		@JvmStatic
		@OnCreateChildren
		fun onCreateChildren(c: SectionContext): Children {
			val builder = Children.create()
			for (i in 0 until 32) {
				builder.child(
					SingleComponentSection.create(c)
						.key(i.toString())
						.component(ListItem.create(c).build())
				)
			}
			return builder.build()
		}
	}
}