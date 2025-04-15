package designpatterns.structural.composite;

public class CompositePatternDemo {

    public static void main(String[] args) {
        FileSystemComponent component1 = new File("file-1.txt");
        FileSystemComponent component2 = new File("file-2.txt");

        Directory dir1 = new Directory("dir-1");
        Directory dir2 = new Directory("dir-2");

        dir1.addComponent(component1);
        dir2.addComponent(component2);

        dir1.showDetails();
        dir2.showDetails();

    }
}
