package com.l.chunk;

/**
 * Created by Lemniscate on 2019/5/9.
 * <p>
 * struct ResTable_typeSpec
 * {
 * struct ResChunk_header header;
 * <p>
 * // The type identifier this chunk is holding.  Type IDs start
 * // at 1 (corresponding to the value of the type bits in a
 * // resource identifier).  0 is invalid.
 * uint8_t id;
 * <p>
 * // Must be 0.
 * uint8_t res0;
 * // Must be 0.
 * uint16_t res1;
 * <p>
 * // Number of uint32_t entry configuration masks that follow.
 * uint32_t entryCount;
 * <p>
 * enum {
 * // Additional flag indicating an entry is public.
 * SPEC_PUBLIC = 0x40000000
 * };
 * };
 */
public class ResTableTypeSpec {
    public final static int SPEC_PUBLIC = 0x40000000;

    public ResChunkHeader header;
    public byte id;//资源的类型id animator/anim/color/drawble/layout/menu/raw/string/xml等
    public byte res0;//0
    public short res1;//0
    public int entryCount;

    public ResTableTypeSpec() {
        header = new ResChunkHeader();
    }

    @Override
    public String toString() {
        return "header:" + header.toString() + ",id:" + id + ",res0:" + res0 + ",res1:" + res1 + ",entryCount:" + entryCount;
    }
}
