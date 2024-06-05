/*
 * Copyright (C) 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.intentresolver.contentpreview.payloadtoggle.ui.viewmodel

import android.graphics.Bitmap
import com.android.intentresolver.contentpreview.payloadtoggle.domain.model.ValueUpdate
import com.android.intentresolver.contentpreview.payloadtoggle.shared.ContentType
import kotlinx.coroutines.flow.Flow

/** An individual preview within Shareousel. */
data class ShareouselPreviewViewModel(
    /** Image to be shared. */
    val bitmapLoadState: Flow<ValueUpdate<Bitmap?>>,
    /** Type of data to be shared. */
    val contentType: ContentType,
    /** Whether this preview has been selected by the user. */
    val isSelected: Flow<Boolean>,
    /** Sets whether this preview has been selected by the user. */
    val setSelected: suspend (Boolean) -> Unit,
    val aspectRatio: Float,
)
