package DesignPatterns.CompositeFileSystem;

import java.util.ArrayList;

public class Folder implements FileSystemInterface{
    private String name;
    private int size;
    private ArrayList<FileSystemInterface> children;

    public Folder(String n,int sz){
        this.name = name;
        this.size = size;
    }

    public void add(FileSystemInterface item){
        children.add(item);
    }

    public void ls(){
        for(FileSystemInterface child : children){
            System.out.println(child.getName());
        }
    }

    @Override
    public void openAll() {
        System.out.println(name);
        for(FileSystemInterface child : children){
            System.out.println("/");
            child.openAll();
        }
    }

    @Override
    public int getSize() {
        int total = size;
        for(FileSystemInterface child:children){
            total+=child.getSize();
        }
        return total;
    }

    @Override
    public boolean isFolder() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public FileSystemInterface cd(String target) {
        for(FileSystemInterface child : children){
            if(child.isFolder() && child.getName() == target){
                return child;
            }
        }
        return null;
    }
}
