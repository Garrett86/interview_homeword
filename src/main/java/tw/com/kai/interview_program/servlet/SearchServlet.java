package tw.com.kai.interview_program.servlet;

import tw.com.kai.interview_program.Dao.ImpI.MallDaoImpI;
import tw.com.kai.interview_program.Dao.MallDao;
import tw.com.kai.interview_program.pojo.Mall;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/searchServlet")
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 設置請求的字符編碼為 UTF-8
        req.setCharacterEncoding("UTF-8");

        String keyword = req.getParameter("keyword");
        if (keyword == null || keyword.trim().isEmpty()) {
            keyword = "";
        }
//使用 MallDaoImpI 資料查詢
        MallDao dao = new MallDaoImpI();
        List<Mall> listMall = dao.searchMall(keyword);

//傳遞資料到 reault 頁面
        req.setAttribute("listMall", listMall);
        req.setAttribute("keyword", keyword);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
