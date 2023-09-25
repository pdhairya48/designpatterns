 package practice.Composite;

public class BinaryFile extends File{

    private final long size;

    public BinaryFile(final String name,final long size) {
        super(name);
        this.size=size;
    }

    @Override public void ls() {
        System.out.println(getName()+"\t"+size);
    }

    @Override public void addFile(final File file) {
        throw new UnsupportedOperationException("Leaf doesn't support add operation");
    }

    @Override public File[] getFiles() {
        throw new UnsupportedOperationException("Lead doesn't support getFiles operation");
    }

    @Override public boolean removeFile(final File file) {
        throw new UnsupportedOperationException("lead doesn't support remove operation");
    }
}
