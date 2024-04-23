package com.example.testingwithcompose

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.assertValueEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testingwithcompose.TestTags.COPY_BUTTON
import com.example.testingwithcompose.TestTags.MESSAGE_BAR
import com.example.testingwithcompose.TestTags.MESSAGE_BAR_TEXT
import com.stevdzasan.messagebar.ContentWithMessageBar
import com.stevdzasan.messagebar.MessageBarState
import com.stevdzasan.messagebar.rememberMessageBarState
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MessageBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private lateinit var state : MessageBarState

    @Test
    fun addNoState_Assert_MessageBarDoesNotExist(){

        composeTestRule.setContent {
            state = rememberMessageBarState()
            ContentWithMessageBar(messageBarState = state) {}
        }
        composeTestRule.onNodeWithTag(MESSAGE_BAR).assertDoesNotExist()
    }

    @Test
    fun addSuccessState_AssertCorrectSuccessMessageIsDisplayed(){
        composeTestRule.setContent {
            state = rememberMessageBarState()
            ContentWithMessageBar(messageBarState = state) {}
        }
        state.addSuccess(message = "Success Message!")
        composeTestRule.onNodeWithTag(MESSAGE_BAR_TEXT)
            .assertTextEquals("Success Message!")
        composeTestRule.onNodeWithTag(COPY_BUTTON)
            .assertDoesNotExist()
    }

}