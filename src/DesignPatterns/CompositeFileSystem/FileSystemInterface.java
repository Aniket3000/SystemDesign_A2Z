package DesignPatterns.CompositeFileSystem;

public interface FileSystemInterface {
    public void ls();
    public int getSize();
    public void openAll();
    public FileSystemInterface cd(String name);
    public String getName();
    public boolean isFolder();
}
