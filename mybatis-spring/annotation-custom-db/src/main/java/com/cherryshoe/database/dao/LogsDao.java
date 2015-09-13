package com.cherryshoe.database.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cherryshoe.database.domain.Logs;
import com.cherryshoe.database.persistence.LogsMapper;

@Service
public class LogsDao {

  @Autowired
  private LogsMapper mapper;

  /*
   * Retrieves db records by LOGS_ID column
   */
  public Logs getLogsById(Integer logsId) {
    return mapper.getLogsById(logsId);
  }
  
  /*
   * Retrieves db records by SENT_DATE range, format for from and to timestamp are:
   * 'DD/MM/YYYY HH24:MI:SS': i.e. '19/08/2015 00:00:00' and '19/08/2015 23:59:59'
   */
  public List<Logs> getLogsSentDateRange(String fromTimestamp, String toTimestamp) {
	    return mapper.getLogsBySentDateRange(fromTimestamp, toTimestamp);
	  }
}
