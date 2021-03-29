package com.lovely.calendarview.exceptions

/**
 * Created by Applandeo Team.
 */

data class UnsupportedMethodsException(override val message: String) : RuntimeException(message)