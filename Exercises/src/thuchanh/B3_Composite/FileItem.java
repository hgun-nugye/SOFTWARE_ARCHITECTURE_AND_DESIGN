package thuchanh.B3_Composite;

public class FileItem extends AbstractFile{
    public FileItem(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public String getStringTreeFolder(String prefix) {
        return prefix + name +"\n";
    }

    @Override
    public String getPath() {
        if (parent != null) {
            return parent.getPath()+"\\" + name;
        }
        return name;
    }
}
