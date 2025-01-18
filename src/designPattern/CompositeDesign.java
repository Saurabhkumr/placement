package designPattern;

import java.util.ArrayList;
import java.util.List;

interface FileSystem{
     void showDetails();
}

class File implements FileSystem{
    public String fileName;
    public  File(String str){
        this.fileName=str;
    }

    @Override
    public void showDetails() {
        System.out.println("Filename : "+this.fileName);
    }
}

class Directory implements FileSystem{
    public String directoryName;
    List<FileSystem> fs = new ArrayList<>();

    public  Directory(String str) {
        this.directoryName = str;
    }
    public void addDirectory(FileSystem f ){
        fs.add(f);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory : "+this.directoryName);
        for(FileSystem f : fs){
            f.showDetails();
        }
    }
}



public class CompositeDesign {
    public static void main(String[] args) {
        Directory dir = new Directory("MyDir");
        Directory subdir1 = new Directory("SubDir-1");
        Directory subdir2 = new Directory("SubDir-2");
        FileSystem file1 = new File("file-1");
        FileSystem file2 = new File("file-2");
        FileSystem file3 = new File("file-3");
        FileSystem file4 = new File("file-4");

        dir.addDirectory(subdir1);
        dir.addDirectory(subdir2);
        subdir1.addDirectory(file1);
        subdir1.addDirectory(file2);
        subdir2.addDirectory(file3);
        subdir2.addDirectory(file4);

        dir.showDetails();


    }
}
