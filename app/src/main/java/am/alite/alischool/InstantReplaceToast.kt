package am.alite.alischool

import android.content.Context
import android.widget.Toast

/**
 * Created by axm on 21/08/17.
 */
private var toast: Toast? = null

/**
 * Show instant replace toast
 */
fun showIRToast(ctx: Context, msg: CharSequence, duration: Int=Toast.LENGTH_LONG) {
    toast?.cancel()

    toast = Toast.makeText(ctx, msg, duration)
    toast?.show()
}
