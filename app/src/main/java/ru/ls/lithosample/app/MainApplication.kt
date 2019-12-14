package ru.ls.lithosample.app

import android.app.Application
import com.facebook.soloader.SoLoader

class MainApplication: Application() {

	override fun onCreate() {
		super.onCreate()

		SoLoader.init(this, false)
	}
}