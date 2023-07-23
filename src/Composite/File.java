package Composite;

public abstract class File {

    private String name;

    public abstract void ls();

    public abstract void addFile(File file);

    public abstract File[] getFiles();
    public abstract boolean removeFile(File file);

    public File(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
