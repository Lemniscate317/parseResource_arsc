package com.l.chunk;

import com.l.Utils;

/**
 * Created by Lemniscate on 2019/5/9.
 */
public class ResChunkHeader {
    public short type;
    public short headerSize;
    public int size;

    public int getHeaderSize(){
        return 2+2+4;
    }

    @Override
    public String toString(){
        return "type:"+ Utils.bytesToHexString(Utils.int2Byte(type))+",headerSize:"+headerSize+",size:"+size;
    }
}
