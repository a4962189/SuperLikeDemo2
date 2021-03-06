package com.example.superlikedemo.superLike;

import android.content.Context;

import com.example.superlikedemo.R;

/**
 * Created by Sen on 2018/4/26.
 */

public class BitmapProviderFactory {

    public static BitmapProvider.Provider getHDProvider(Context context) {
        return new BitmapProvider.Builder(context)
                .setDrawableArray(new int[]{R.mipmap.emoji_1, R.mipmap.emoji_2, R.mipmap.emoji_3, R.mipmap.emoji_4, R.mipmap.emoji_5,
                        R.mipmap.emoji_6, R.mipmap.emoji_7, R.mipmap.emoji_8, R.mipmap.emoji_9, R.mipmap.emoji_10})
                .setNumberDrawableArray(new int[]{R.mipmap.multi_digg_num_0, R.mipmap.multi_digg_num_1, R.mipmap.multi_digg_num_2, R.mipmap.multi_digg_num_3,
                        R.mipmap.multi_digg_num_4, R.mipmap.multi_digg_num_5, R.mipmap.multi_digg_num_6, R.mipmap.multi_digg_num_7,
                        R.mipmap.multi_digg_num_8, R.mipmap.multi_digg_num_9})
                .setLevelDrawableArray(new int[]{R.mipmap.multi_digg_word_level_1, R.mipmap.multi_digg_word_level_2, R.mipmap.multi_digg_word_level_3})
                .build();
    }


    public static BitmapProvider.Provider getSmoothProvider(Context context) {
        return new BitmapProvider.Builder(context).build();
    }

}
