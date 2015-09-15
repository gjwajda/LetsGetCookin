package com.gregwajda.framework;

import com.gregwajda.framework.Graphics.ImageFormat;

public interface Image {
	public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
