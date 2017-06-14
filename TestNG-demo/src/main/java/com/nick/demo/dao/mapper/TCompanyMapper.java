package com.nick.demo.dao.mapper;

import com.nick.demo.model.po.TCompany;

public interface TCompanyMapper {
    int deleteByPrimaryKey(Long companyId);

    int insert(TCompany record);

    int insertSelective(TCompany record);

    TCompany selectByPrimaryKey(Long companyId);

    int updateByPrimaryKeySelective(TCompany record);

    int updateByPrimaryKey(TCompany record);
}