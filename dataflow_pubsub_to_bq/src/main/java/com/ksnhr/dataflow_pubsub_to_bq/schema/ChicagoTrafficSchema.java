package com.ksnhr.dataflow_pubsub_to_bq.schema;

import com.google.api.services.bigquery.model.TableFieldSchema;
import com.google.api.services.bigquery.model.TableSchema;
import java.util.ArrayList;
import java.util.List;

public class ChicagoTrafficSchema {
    public static TableSchema create() {
        List<TableFieldSchema> fields;
        fields = new ArrayList<> ();
        fields.add(new TableFieldSchema().setName("segment_id").setType("INTEGER"));
        fields.add(new TableFieldSchema().setName("street").setType("STRING"));
        fields.add(new TableFieldSchema().setName("direction").setType("STRING"));
        fields.add(new TableFieldSchema().setName("from_street").setType("STRING"));
        fields.add(new TableFieldSchema().setName("to_street").setType("STRING"));
        fields.add(new TableFieldSchema().setName("length").setType("FLOAT"));
        fields.add(new TableFieldSchema().setName("street_heading").setType("STRING"));
        fields.add(new TableFieldSchema().setName("comments").setType("STRING"));
        fields.add(new TableFieldSchema().setName("start_longitude").setType("FLOAT"));
        fields.add(new TableFieldSchema().setName("end_longitude").setType("FLOAT"));
        fields.add(new TableFieldSchema().setName("start_latitude").setType("FLOAT"));
        fields.add(new TableFieldSchema().setName("end_latitude").setType("FLOAT"));
        fields.add(new TableFieldSchema().setName("current_speed").setType("INTEGER"));
        fields.add(new TableFieldSchema().setName("last_update").setType("TIMESTAMP"));
        TableSchema schema = new TableSchema().setFields(fields);
        return schema;
    }
}

//
