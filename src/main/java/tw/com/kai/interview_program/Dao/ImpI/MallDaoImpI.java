package tw.com.kai.interview_program.Dao.ImpI;

import tw.com.kai.interview_program.Dao.MallDao;
import tw.com.kai.interview_program.pojo.Mall;
import tw.com.kai.interview_program.uitils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MallDaoImpI implements MallDao {


    @Override
    public void save(Mall mall) {
    }

    @Override
    public void delete(int e) {

    }

    @Override
    public void update(Mall mall) {

    }

    @Override
    public List<Mall> searchMall(String keyword) {
        List<Mall> list = new ArrayList<>();
        String sql = "select * from mall where name like ?";
        try (Connection conn =  DBConnection.getDB().getCon();
             PreparedStatement ps = conn.prepareStatement(sql);) {
//            ps.setString(1, "%" + keyword + "%");
            ps.setString(1, "%" + keyword + "%");
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    Mall mall = new Mall();
                    mall.setId(rs.getInt("id"));
                    mall.setName(rs.getString("name"));
                    mall.setPrice(rs.getString("price"));
                    mall.setSaleCount(rs.getString("saleCount"));
                    mall.setBreadCount(rs.getString("breadCount"));
                    list.add(mall);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
