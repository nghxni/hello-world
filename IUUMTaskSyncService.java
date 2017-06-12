package com.vispractice.mdm.wf.service;

import com.vispractice.mdm.bean.vendor.WfAuditHistory;
import com.vispractice.mdm.bean.wf.WFApplyInfo;
import com.vispractice.mdm.bean.wf.WfTaskResponse;

/**
 * 与统一门户代办/已办对接
 * @author houyongchuan
 *
 */
public interface IUUMTaskSyncService {

	/**
	 * 同步已办
	 * @param aduitHistory
	 * @return
	 */
	public String importTakDone(WfAuditHistory aduitHistory);
	
	/**
	 * 同步代办
	 * @param aduitHistory
	 * @return
	 */
	public WfTaskResponse importTak(WfAuditHistory aduitHistory);

	/**
	 * 删除待办
	 * @param aduitHistory
	 * @return
	 */
	public WfTaskResponse deleteTask(WfAuditHistory aduitHistory);
}
