package com.l.chunk;

import com.l.Utils;

/**
 * Created by Lemniscate on 2019/5/9.
 * <p>
 * struct ResTable_ref
 * {
 * uint32_t ident;
 * };
 */
public class ResTableRef {

    public int ident;

    public int getSize() {
        return 4;
    }

    @Override
    public String toString() {
        return "ident:0x" + Utils.bytesToHexString(Utils.int2Byte(ident));
    }
}
