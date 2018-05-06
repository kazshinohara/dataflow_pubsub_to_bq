package com.ksnhr.dataflow_pubsub_to_bq.partition;

import com.google.api.services.bigquery.model.TableRow;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.apache.beam.sdk.io.gcp.bigquery.TableDestination;
import org.apache.beam.sdk.transforms.SerializableFunction;
import org.apache.beam.sdk.values.ValueInSingleWindow;


public class DayPartitionDestinations implements SerializableFunction<ValueInSingleWindow<TableRow>,TableDestination> {
    private final String tablePrefix;

    public DayPartitionDestinations(String tableId) {
      tablePrefix = tableId + "_";
    }

    @Override
    public TableDestination apply(ValueInSingleWindow<TableRow> input) {
      java.util.Date now = new Date();
      SimpleDateFormat sdf = new java.text.SimpleDateFormat("YYYYMMdd");
      sdf.setTimeZone(TimeZone.getTimeZone("CDT"));
      return new TableDestination(tablePrefix+sdf.format(now),"impression_log");
    }
}
