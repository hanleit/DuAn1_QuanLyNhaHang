
package controllers;

import dao.ChiTietCaTrucDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.ChiTietCaTruc;
import utils.MsgBox;
import utils.XDate;

public class QLChiTietCaTruc{
    public static ChiTietCaTrucDAO dao = new ChiTietCaTrucDAO();
    
    public static void insert(ChiTietCaTruc entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(ChiTietCaTruc entity) {
        if (dao.update(entity) > 0) {
            MsgBox.alert(null, "Cập nhật thành công!");
        } else {
            MsgBox.alert(null, "Cập nhật thất bại!");
        }
    }

    public static boolean detele(String...id) {
        if (dao.delete(id)> 0) {
            MsgBox.alert(null, "Xóa thành công!");
            return true;
        } else {
            MsgBox.alert(null, "Xóa thất bại!");
        } 
        return false;
    }

    public static void fillToCbo(JComboBox<String> cbo) {
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbo.getModel();
        model.removeAllElements();
        List<ChiTietCaTruc> list = dao.selectAll();
        model.addElement("Chưa chọn ngày trực");
        for (ChiTietCaTruc ct : list) {
            model.addElement(XDate.dateParseString(ct.getNgayTruc(), "dd-MM-yyyy"));
        }
    }
    
    
}
