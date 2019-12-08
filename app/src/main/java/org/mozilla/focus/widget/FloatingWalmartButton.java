/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.focus.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.mozilla.focus.R;

public class FloatingWalmartButton extends FloatingActionButton {

    public void setKeepHidden(boolean keepHidden) {
        this.keepHidden = keepHidden;
    }

    private boolean keepHidden=false;

    public FloatingWalmartButton(Context context) {
        super(context);
    }

    public FloatingWalmartButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FloatingWalmartButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onFinishInflate() {


        super.onFinishInflate();
    }

    @Override
    public void setVisibility(int visibility) {
        Log.d("FloatingWalmartButton","Dima : setVisibility : visibility " + visibility + " keepHidden " + keepHidden);
        if (keepHidden && visibility == View.VISIBLE) {
            // There are multiple callbacks updating the visibility of the button. Let's make sure
            // we do not show the button if we do not want to.
            return;
        }

        if (visibility == View.VISIBLE) {
            Log.d("FloatingWalmartButton","Dima : setVisibility : show");
            show();
        } else {
            Log.d("FloatingWalmartButton","Dima : setVisibility : hide");
            hide();
        }
    }
}
