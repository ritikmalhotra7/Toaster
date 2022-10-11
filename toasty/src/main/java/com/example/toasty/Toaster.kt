package com.example.toasty

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.getColor
import com.example.toasty.databinding.ToastLayoutBinding

class Toaster() {
    /*
        This is the main function which creates the custom toasts
        you can read readme provided with this library inorder to see its use cases
     */
    fun customToast(
        ctx: Context,
        msg: String = "",
        duration: Int = Toast.LENGTH_SHORT,
        textColor: Int = getColor(ctx, R.color.white),
        toastColor: Int = getColor(ctx, R.color.toast_background),
        cornerRadius: Float = 50f,
        strokeWidth: Int = 0,
        strokeColor: Int = getColor(ctx, R.color.black),
        iconDrawable: Drawable? = null,
    ) {
        val toast = Toast(ctx)
        toast.duration = duration
        val toasterLayout = ToastLayoutBinding.inflate(LayoutInflater.from(ctx))
        toasterLayout.apply {
            toastRoot.background =
                createDrawable(toastColor, cornerRadius, strokeWidth, strokeColor)
            toastText.text = msg
            toastText.setTextColor(textColor)
            toastText.isSelected = true
            iconDrawable?.let {
                toastIconPreText.background = it
                toastIconPreText.visibility = View.VISIBLE
            }
        }
        toast.view = toasterLayout.root
        toast.show()
    }

    //This function is to create a view/drawable to attach to toast
    private fun createDrawable(
        toastColor: Int,
        cornerRadius: Float,
        strokeWidth: Int,
        strokeColor: Int
    ): GradientDrawable {
        val radiusArray = FloatArray(8)
        for (i in 0..7) radiusArray[i] = cornerRadius
        val drawable = GradientDrawable()
        drawable.apply {
            shape = GradientDrawable.RECTANGLE
            setColor(toastColor)
            cornerRadii = radiusArray
            setStroke(strokeWidth, strokeColor)
        }
        return drawable
    }
}