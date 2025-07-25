/*
 * SPDX-FileCopyrightText: (C) 2025 DeliteAI Authors
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package dev.deliteai.impl.io.datamodels

internal data class DownloadManagerCursor(
    val status: Int,
    val reasonCode: Int?,
    val lastModifiedAt: Long,
)
