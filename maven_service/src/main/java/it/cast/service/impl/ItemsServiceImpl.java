package it.cast.service.impl;


import it.cast.dao.ItemsDao;
import it.cast.domian.Items;
import it.cast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//事务注解
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    public Items fandId(Integer id){

        return itemsDao.fandId(id);
    }


}
