package it.cast.dao;

import it.cast.domian.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsDao {

    @Select("select * from items where id=#{id}")
    Items fandId(Integer id);
}
