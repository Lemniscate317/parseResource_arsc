package com.l.chunk;

/**
 * Created by Lemniscate on 2019/5/9.
 * <p>
 * struct ResTable_map_entry : public ResTable_entry
 * {
 * //指向父ResTable_map_entry的资源ID，如果没有父ResTable_map_entry，则等于0。
 * ResTable_ref parent;
 * //等于后面ResTable_map的数量
 * uint32_t count;
 * };
 */
public class ResTableMapEntry extends ResTableEntry {
    public ResTableRef parent;
    public int count;

    public ResTableMapEntry(){
        parent = new ResTableRef();
    }

    @Override
    public int getSize(){
        return super.getSize() + parent.getSize() + 4;
    }

    @Override
    public String toString(){
        return super.toString() + ",parent:"+parent.toString()+",count:"+count;
    }
}
