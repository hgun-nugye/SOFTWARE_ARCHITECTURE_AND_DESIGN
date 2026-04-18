package thuchanh.B3_Composite;

public class MainFile {
    public static void main(String[] args) {
        Folder folder1 = new Folder("Folder1", "2024-06-01");
        Folder folder2 = new Folder("Folder2", "2024-06-02");

        FileItem file = new FileItem("File1.txt", "2024-06-03");
        FileItem file2 = new FileItem("File2.txt", "2024-06-03");

        folder1.addItem(folder2);
//        folder2.setParent(folder1);
        folder2.addItem(file);
//        file.setParent(folder2);

        System.out.println(folder1.getStringTreeFolder("|--"));
        System.out.println(file.getPath());
        System.out.println(file2.getPath());
    }
}
