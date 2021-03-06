package com.example.musicappmvvm.model.chart

import java.io.Serializable

data class Song(
    val album: Album,
    val artist: ArtistXX,
    val artists: List<ArtistXXX>,
    val artists_names: String,
    val code: String,
    val content_owner: Int,
    val duration: Int,
    val id: String,
    val isWorldWide: Boolean,
    val isoffical: Boolean,
    val link: String,
    val lyric: String,
    val mv_link: String,
    val name: String,
    val order: Any,
    val performer: String,
    val playlist_id: String,
    val position: Int,
    val rank_num: Any,
    val rank_status: String,
    val thumbnail: String,
    val title: String,
    val total: Int,
    val type: String
) : Serializable