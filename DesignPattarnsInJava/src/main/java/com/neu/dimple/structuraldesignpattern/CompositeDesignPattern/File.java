package com.neu.dimple.structuraldesignpattern.CompositeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public abstract class File {

    private String name;

    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void ls();
    public abstract void addFile(File File);
    public abstract File[] getFiles();
    public abstract boolean removeFile(File file);
}
