package cn.itcast.dao.company;

import cn.itcast.domain.company.Company;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-05-08 13:03
 * dao层接口
 */
@Repository
public interface CompanyDao {

    /**
     * 查询所有的企业列表
     */
    List<Company> findAll();


    //企业保存
    void save(Company company);

    Company findById(String id);

    //更新
    void update(Company company);

    void delete(String id);
    void deleteaa(String id);
}
