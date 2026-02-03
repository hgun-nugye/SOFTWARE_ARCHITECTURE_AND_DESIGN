package thuchanh.A6;

import java.util.List;

public interface IDataAccess {
    public void add(SanPham sp);
    public void update(SanPham sp);
    public void delete(String sp);
    public List<SanPham> getAll();
}
