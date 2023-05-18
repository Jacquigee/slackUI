package com.example.slackui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

data class SlackChannel (
    val name: String,
    val isPrivate: Boolean = false,
    val hasNewMessages: Boolean = false,
    val taggedMessageCount: Int = 0
)

@Composable
fun SlackChannelUI(slackChannel: SlackChannel) {

}

@Preview(showBackground = true)
@Composable
fun SlackChannelUIPreview(){

}