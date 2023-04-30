package com.freely.listenfreely.pojos

data class Albums(
    var albumUrl: String,
    var albumName: String,
    var topAlbumSongs: ArrayList<TopAlbumsSongs>
)

data class TopAlbumsSongs(
    var songName: String,
    var songImg: String?,
    var songAlbum: String?,
    var songArtist: String?,
    var songLength: String
)