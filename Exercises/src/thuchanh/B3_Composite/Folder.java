package thuchanh.B3_Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    private List<AbstractFile> children = new ArrayList<>();

    public Folder(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public String getStringTreeFolder(String prefix) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(name).append("\n");
        for(AbstractFile child : children) {
            sb.append(child.getStringTreeFolder(prefix + "----"));
        }
        return sb.toString();
    }

    @Override
    public String getPath() {
        if(parent!=null){
            return parent.getPath() + "\\" + name;
        }
        return name;
    }

    public void addItem(AbstractFile item){
        children.add(item);
        item.setParent(this);
    }

    public void removeItem(AbstractFile item){
        children.remove(item);
        item.setParent(null);
    }
}
