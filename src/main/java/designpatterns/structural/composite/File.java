package designpatterns.structural.composite;

public class File implements FileSystemComponent {

    private String file;

    public File(String file) {
        this.file = file;
    }

    @Override
    public void showDetails() {
        System.out.println("File : "+file);
    }
}
