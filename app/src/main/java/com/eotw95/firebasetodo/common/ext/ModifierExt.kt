package com.eotw95.firebasetodo.common.ext

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun Modifier.basicButton(): Modifier {
    return this.fillMaxWidth().padding(16.dp, 8.dp)
}
fun Modifier.toolBarActions(): Modifier {
    return this.wrapContentSize(Alignment.TopEnd)
}
fun Modifier.smallSpacer(): Modifier {
    return this.fillMaxWidth().height(8.dp)
}