package snowfall.extensions

import android.content.Context
import android.provider.Settings
import android.provider.Settings.Global.ANIMATOR_DURATION_SCALE

fun Context.isSystemAnimationEnabled(): Boolean = Settings.Global.getFloat(
        contentResolver,
        ANIMATOR_DURATION_SCALE,
        -1f
) > 0f