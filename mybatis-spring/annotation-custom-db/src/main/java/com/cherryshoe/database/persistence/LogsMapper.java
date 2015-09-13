package com.cherryshoe.database.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.cherryshoe.database.domain.Logs;

public interface LogsMapper {

  /*
   * Retrieves db records by LOGS_ID column
   */
  Logs getLogsById(Integer logsId);
  
  /*
   * Retrieves db records by SENT_DATE range, format for from and to timestamp are:
   * 'DD/MM/YYYY HH24:MI:SS': i.e. '19/08/2015 00:00:00' and '19/08/2015 23:59:59'
   */
  List<Logs> getLogsBySentDateRange(
		  @Param("fromTimestamp") String fromTimestamp, @Param("toTimestamp") String toTimestamp);
}
