package thuchanh.A6;

import java.util.List;

public interface IDataAccess {
    public void add(SanPham sp);
    public void update(SanPham sp);
    public void delete(SanPham sp);
    public List<SanPham> getAll();
}
