package com.baidu.disconf.web.service.data.service;

import java.util.List;

import com.baidu.disconf.web.service.data.bo.Data;
import com.baidu.disconf.web.service.data.bo.DataSql;
import com.baidu.disconf.web.service.data.bo.DataSync;

public interface DataMgr {

	List<Data> getDataList();

	Data getData();
	
	int exec(String sql);
	
	List<String> getTabs();

	List<DataSql> getDatas(String tab);
	
	List<DataSync> getDataSync();
}
