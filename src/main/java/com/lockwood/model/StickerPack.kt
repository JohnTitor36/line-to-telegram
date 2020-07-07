package com.lockwood.model

class StickerPack(
        val title: String,
        val copyright: String,
        val isAnimated: Boolean,
        val stickers: Array<Sticker>
) {

    override fun toString(): String {
        return "$title by $copyright"
    }

}