package com.l.chunk;

/**
 * Created by Lemniscate on 2019/5/9.
 *
 * struct ResTable_package
 {
 struct ResChunk_header header;

 // If this is a base package, its ID.  Package IDs start
 // at 1 (corresponding to the value of the package bits in a
 // resource identifier).  0 means this is not a base package.
 uint32_t id;

 // Actual name of this package, \0-terminated.
 char16_t name[128];

 // Offset to a ResStringPool_header defining the resource
 // type symbol table.  If zero, this package is inheriting from
 // another base package (overriding specific values in it).
 uint32_t typeStrings;

 // Last index into typeStrings that is for public use by others.
 uint32_t lastPublicType;

 // Offset to a ResStringPool_header defining the resource
 // key symbol table.  If zero, this package is inheriting from
 // another base package (overriding specific values in it).
 uint32_t keyStrings;

 // Last index into keyStrings that is for public use by others.
 uint32_t lastPublicKey;
 };
 */
public class ResTablePackage {
    public ResChunkHeader header;
    public int id;
    public char[] name = new char[128];
    public int typeStrings;//类型字符串资源池相对头部的偏移
    public int lastPublicType;//最后一个导出的public资源字符串在类型字符串资源池中的索引
    public int keyStrings;//资源项名称字符串相对头部的偏移
    public int lastPublicKey;//最后一个导出的public资源项名称字符串在资源项名称字符串资源池中的索引

    public ResTablePackage(){
        header = new ResChunkHeader();
    }

    @Override
    public String toString(){
        return "header:"+header.toString()+"\n"+",id="+id+",name:"+name.toString()+",typeStrings:"+typeStrings+",lastPublicType:"+lastPublicType+",keyStrings:"+keyStrings+",lastPublicKey:"+lastPublicKey;
    }
}
