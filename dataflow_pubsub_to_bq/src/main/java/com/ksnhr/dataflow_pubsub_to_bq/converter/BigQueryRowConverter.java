package com.ksnhr.dataflow_pubsub_to_bq.converter;

import com.google.api.services.bigquery.model.TableRow;
import com.google.gson.Gson;
import com.ksnhr.dataflow_pubsub_to_bq.entity.ChicagoTrafficJson;
import org.apache.beam.sdk.transforms.DoFn;


public class BigQueryRowConverter extends DoFn<String,TableRow> {

    @ProcessElement
    public void processElement(ProcessContext dofn) throws Exception {
      String json = dofn.element();
      Gson gson = new Gson();
      ChicagoTrafficJson jsonObj = gson.fromJson(json,ChicagoTrafficJson.class);
      TableRow output = new TableRow();
      output.set("segment_id", jsonObj.segment_id);
      output.set("last_update", jsonObj.last_update + "-05:00");
      output.set("street", jsonObj.street);
      output.set("street_heading", jsonObj.street_heading);
      output.set("direction", jsonObj.direction);
      output.set("from_street", jsonObj.from_street);
      output.set("to_street", jsonObj.to_street);
      output.set("current_speed", jsonObj.current_speed);
      output.set("comments", jsonObj.comments);
      output.set("start_latitude", jsonObj.start_latitude);
      output.set("end_latitude", jsonObj.end_latitude);
      output.set("start_longitude", jsonObj.start_longitude);
      output.set("end_longitude", jsonObj.end_longitude);
      output.set("length", jsonObj.length);
      dofn.output(output);
    }  
}
