package com.example.zhm.music.lrc;

import java.util.List;

/*
 * 解析歌词，得到LrcRow的List
 */

public interface ILrcBuilder {
    List<LrcRow> getLrcRows(String rawLrc);
}
