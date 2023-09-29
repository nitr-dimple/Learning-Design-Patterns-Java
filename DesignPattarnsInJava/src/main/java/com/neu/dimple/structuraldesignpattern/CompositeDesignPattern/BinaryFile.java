package com.neu.dimple.structuraldesignpattern.CompositeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BinaryFile extends File{

    private long size;

    public BinaryFile(String name, long size){
        super(name);
        this.size = size;
    }


    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File File) {
        throw new UnsupportedOperationException("Leaf node does not supper add operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node does not supper get operation");

    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf node does not supper remove operation");

    }
}
