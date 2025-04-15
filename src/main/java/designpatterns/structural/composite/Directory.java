package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

    private String directory;
    private List<FileSystemComponent> fileSystemComponents = new ArrayList<>();

    public Directory(String directory) {
        this.directory = directory;
    }

    public void addComponent(FileSystemComponent component) {
        fileSystemComponents.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        fileSystemComponents.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory : "+directory);

        for (FileSystemComponent component: fileSystemComponents) {
            component.showDetails();
        }
    }
}
