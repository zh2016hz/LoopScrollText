package com.xiaoniu.finance.myapplication;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;

/**
 * 文件描述：    跑马灯效果
 * Created by  xn069392
 * 创建时间    2018/5/29
 */

public class LoopScrollText extends android.support.v7.widget.AppCompatTextView {
    public LoopScrollText(Context context) {
        this(context, null);
    }

    public LoopScrollText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    private void initView() {
        setSingleLine();
        setMarqueeRepeatLimit(-1);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override
    public boolean isFocused() {
        return true;
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        if (focused)
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
    }

    @Override
    public void g(boolean hasWindowFocus) {
        if (hasWindowFocus)
            super.onWindowFocusChanged(hasWindowFocus);
    }
}
