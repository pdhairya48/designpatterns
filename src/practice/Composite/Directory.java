package practice.Composite;

import java.util.ArrayList;
import java.util.List;


public class Directory extends File {
    private final List<File> fileList = new ArrayList<>();

    public Directory(final String name) {
        super(name);
    }

    @Override public void ls() {
        fileList.forEach(File::ls);
    }

    @Override public void addFile(final File file) {
        fileList.add(file);
    }

    @Override public File[] getFiles() {
        return fileList.toArray(new File[fileList.size()]);
    }

    @Override public boolean removeFile(final File file) {
        if (fileList.size() == 0) {
            return false;
        } else {
            fileList.remove(file);
        }
        return true;
    }
}
