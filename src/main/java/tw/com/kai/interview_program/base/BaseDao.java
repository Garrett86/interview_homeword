package tw.com.kai.interview_program.base;

import tw.com.kai.interview_program.pojo.Mall;

import java.util.List;

public interface BaseDao<T> {
    public void save(T t);
    public  void delete(int e);
    public  void update(T t);
    public List<Mall> searchMall(String keyword);
}
