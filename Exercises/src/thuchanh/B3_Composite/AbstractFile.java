package thuchanh.B3_Composite;

public abstract class AbstractFile {
    protected String name;
    protected String ngayTao;
    protected AbstractFile parent;

    public AbstractFile(String name, String ngayTao) {
        this.name = name;
        this.ngayTao = ngayTao;
    }

    public void setParent(AbstractFile parent) {
        this.parent = parent;
    }

    public abstract String getStringTreeFolder(String prefix);
    public abstract String getPath();

}
