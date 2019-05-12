package com.l.chunk;

/**
 * Created by Lemniscate on 2019/5/9.
 */
public class ResTableHeader {
    public ResChunkHeader header;
    public int packageCount;

    public ResTableHeader() {
        header = new ResChunkHeader();
    }

    public int getHeaderSize() {
        return header.getHeaderSize() + 4;
    }

    @Override
    public String toString() {
        return "header:" + header.toString() + "\n" + "packageCount:" + packageCount;
    }
}
