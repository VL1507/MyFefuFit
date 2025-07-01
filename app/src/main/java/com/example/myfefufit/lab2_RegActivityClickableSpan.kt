package com.example.myfefufit

import android.text.TextPaint
import android.text.style.ClickableSpan
import android.view.View
import androidx.core.graphics.toColorInt

class lab2_RegActivityClickableSpan : ClickableSpan() {
    override fun onClick(p0: View) {
        TODO("Not yet implemented")
    }

    override fun updateDrawState(ds: TextPaint) {
        super.updateDrawState(ds)
        ds.color = "#4B09F3".toColorInt()
        ds.isUnderlineText = false
    }
}