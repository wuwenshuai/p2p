package com.xmg.p2p.base.mapper;

import java.util.List;

import com.xmg.p2p.base.domain.SystemDictionary;
import com.xmg.p2p.base.query.SystemDictionaryQueryObject;

public interface SystemDictionaryMapper {

	int insert(SystemDictionary record);

	SystemDictionary selectByPrimaryKey(Long id);

	List<SystemDictionary> selectAll();
	
	/**
	 * 分页的方法
	 * @param record
	 * @return
	 */
	int queryForCount(SystemDictionaryQueryObject qo);
	List<SystemDictionary> query(SystemDictionaryQueryObject qo);

	int updateByPrimaryKey(SystemDictionary record);
}