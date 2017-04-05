package net.yyh.frame.service;

import net.yyh.frame.dao.SampleDao;
import net.yyh.frame.model.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    SampleDao sampleDao;


    @Override
    public Sample findSampleByfId(Long id) {
        return sampleDao.findOne(id);
    }

    @Override
    public List<Sample> findSamplesByName(String name) {
        return sampleDao.findSamplesByName(name);
    }
}
