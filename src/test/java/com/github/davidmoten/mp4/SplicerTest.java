package com.github.davidmoten.mp4;

import java.io.File;
import java.io.IOException;

import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.junit.Test;

public class SplicerTest {

	@Test
	public void test() throws IOException {
		File file = new File("src/test/resources/big-buck-bunny.mp4");
		MovieBox m = MP4Util.parseMovie(file);
		System.out.println(m.getFourcc());
		System.out.println("fileSize=" + file.length());
		System.out.println("displaySize=" + m.getDisplaySize().getWidth() + "x" + m.getStoredSize().getHeight());
		System.out.println("storedSize=" + m.getDisplaySize().getWidth() + "x" + m.getDisplaySize().getHeight());
		Header h = m.getHeader();
		System.out.println("bodySize=" + h.getBodySize() + ", size=" + h.getSize() + ", headerSize=" + h.headerSize());
	}

}
