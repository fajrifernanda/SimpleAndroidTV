/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package tv.com.androidtvcodelab

import java.io.Serializable

/**
 * Movie class represents video entity with title, description, image thumbs and video url.
 */
data class Movie(
        var vote_count: Int?=null,
        var id: Int?=null,
        var isVideo: Boolean  ?= false,
        var vote_average: Double?=null,
        var title: String? = null,
        var popularity: Double?=null,
        var poster_path: String? = null,
        var original_language: String? = null,
        var original_title: String? = null,
        var backdrop_path: String? = null,
        var isAdult: Boolean? = false,
        var overview: String? = null,
        var release_date: String? = null,
        var genre_ids: List<Int>? = null
): Serializable
