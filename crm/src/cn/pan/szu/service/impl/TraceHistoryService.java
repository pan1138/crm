package cn.pan.szu.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.pan.szu.dao.ITraceHistoryDao;
import cn.pan.szu.pojo.TraceHistory;
import cn.pan.szu.service.ITraceHistoryService;

public class TraceHistoryService implements ITraceHistoryService{
	
	private ITraceHistoryDao traceHistoryDao;
	
	public void setTraceHistoryDao(ITraceHistoryDao traceHistoryDao) {
		this.traceHistoryDao = traceHistoryDao;
	}

	@Override
	public void save(TraceHistory t) {
		traceHistoryDao.save(t);
	}

	@Override
	public TraceHistory findById(Serializable id) {
		return traceHistoryDao.findById(id);
	}

	@Override
	public List<TraceHistory> findAll() {
		return traceHistoryDao.findAll();
	}

	@Override
	public void update(TraceHistory t) {
		traceHistoryDao.update(t);
	}

	@Override
	public void delete(Serializable id) {
		traceHistoryDao.delete(id);
	}

}
