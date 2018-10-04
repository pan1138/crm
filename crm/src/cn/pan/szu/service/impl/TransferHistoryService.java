package cn.pan.szu.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.pan.szu.dao.ITransferHistoryDao;
import cn.pan.szu.pojo.TransferHistory;
import cn.pan.szu.service.ITransferHistoryService;

public class TransferHistoryService implements ITransferHistoryService {

	private ITransferHistoryDao transferHistoryDao;
	
	public void setTransferHistoryDao(ITransferHistoryDao transferHistoryDao) {
		this.transferHistoryDao = transferHistoryDao;
	}

	@Override
	public void save(TransferHistory t) {
		transferHistoryDao.save(t);
	}

	@Override
	public TransferHistory findById(Serializable id) {
		return transferHistoryDao.findById(id);
	}

	@Override
	public List<TransferHistory> findAll() {
		return transferHistoryDao.findAll();
	}

	@Override
	public void update(TransferHistory t) {
		transferHistoryDao.update(t);
	}

	@Override
	public void delete(Serializable id) {
		transferHistoryDao.delete(id);
	}


}
