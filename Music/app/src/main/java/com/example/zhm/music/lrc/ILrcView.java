package com.example.zhm.music.lrc;

import java.util.List;

/**
 * 歌词展示的接口
 */

public interface ILrcView {
    //设置展示的歌词集合
    void setLrc(List<LrcRow> lrcRows);
    //歌词滚动，高亮当前行
    void seekLrcToTime(long time);
}
