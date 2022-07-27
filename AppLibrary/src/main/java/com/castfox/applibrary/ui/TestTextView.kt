package com.castfox.applibrary.ui

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class TestTextView @JvmOverloads constructor(
  context: Context,
  private val attrs: AttributeSet?,
  private val defStyleAttr: Int = 0,
) : AppCompatTextView (context, attrs, defStyleAttr) {

  fun texttttt(): String{
    return "texttttt"
  }


}