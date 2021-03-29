package com.lovely.calendarview.exceptions

/**
 * Created by Applandeo Team.
 */

data class OutOfDateRangeException(override val message: String) : Exception(message)