package DesignPatterns.CompositeFileSystem;

// Leaf File
public class File implements FileSystemInterface {
    private String name;
    private int size;

    public File(String n,int s){
        this.name = n;
        this.size = s;
    }

    @Override
    public void ls() {
        System.out.println(name);
    }

    @Override
    public void openAll() {
        System.out.println(name);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public FileSystemInterface cd(String name) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFolder() {
        return false;
    }
}
