package com.cloudxanh.library.widget

import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.cloudxanh.library.utils.reHeight

class DragBehavior(private val frameSecond: View) : CoordinatorLayout.Behavior<View>() {

    override fun layoutDependsOn(parent: CoordinatorLayout, fab: View, dependency: View): Boolean {
        return true
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        child.reHeight(frameSecond.y.toInt())
        return true
    }

}