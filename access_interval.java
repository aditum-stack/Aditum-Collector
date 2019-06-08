// ORM class for table 'access_interval'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 08 15:43:25 GMT+08:00 2019
// For connector: org.apache.sqoop.manager.GenericJdbcManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class access_interval extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_interval.this.id = (Long)value;
      }
    });
    setters.put("personnel_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_interval.this.personnel_id = (String)value;
      }
    });
    setters.put("mean_time_retention", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_interval.this.mean_time_retention = (String)value;
      }
    });
    setters.put("first_address_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_interval.this.first_address_count = (Integer)value;
      }
    });
    setters.put("mean_time_out", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_interval.this.mean_time_out = (String)value;
      }
    });
    setters.put("second_address_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_interval.this.second_address_count = (Integer)value;
      }
    });
    setters.put("create_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_interval.this.create_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("update_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_interval.this.update_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("is_deleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_interval.this.is_deleted = (Boolean)value;
      }
    });
  }
  public access_interval() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public access_interval with_id(Long id) {
    this.id = id;
    return this;
  }
  private String personnel_id;
  public String get_personnel_id() {
    return personnel_id;
  }
  public void set_personnel_id(String personnel_id) {
    this.personnel_id = personnel_id;
  }
  public access_interval with_personnel_id(String personnel_id) {
    this.personnel_id = personnel_id;
    return this;
  }
  private String mean_time_retention;
  public String get_mean_time_retention() {
    return mean_time_retention;
  }
  public void set_mean_time_retention(String mean_time_retention) {
    this.mean_time_retention = mean_time_retention;
  }
  public access_interval with_mean_time_retention(String mean_time_retention) {
    this.mean_time_retention = mean_time_retention;
    return this;
  }
  private Integer first_address_count;
  public Integer get_first_address_count() {
    return first_address_count;
  }
  public void set_first_address_count(Integer first_address_count) {
    this.first_address_count = first_address_count;
  }
  public access_interval with_first_address_count(Integer first_address_count) {
    this.first_address_count = first_address_count;
    return this;
  }
  private String mean_time_out;
  public String get_mean_time_out() {
    return mean_time_out;
  }
  public void set_mean_time_out(String mean_time_out) {
    this.mean_time_out = mean_time_out;
  }
  public access_interval with_mean_time_out(String mean_time_out) {
    this.mean_time_out = mean_time_out;
    return this;
  }
  private Integer second_address_count;
  public Integer get_second_address_count() {
    return second_address_count;
  }
  public void set_second_address_count(Integer second_address_count) {
    this.second_address_count = second_address_count;
  }
  public access_interval with_second_address_count(Integer second_address_count) {
    this.second_address_count = second_address_count;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public access_interval with_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
    return this;
  }
  private java.sql.Timestamp update_time;
  public java.sql.Timestamp get_update_time() {
    return update_time;
  }
  public void set_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
  }
  public access_interval with_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
    return this;
  }
  private Boolean is_deleted;
  public Boolean get_is_deleted() {
    return is_deleted;
  }
  public void set_is_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
  }
  public access_interval with_is_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof access_interval)) {
      return false;
    }
    access_interval that = (access_interval) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.personnel_id == null ? that.personnel_id == null : this.personnel_id.equals(that.personnel_id));
    equal = equal && (this.mean_time_retention == null ? that.mean_time_retention == null : this.mean_time_retention.equals(that.mean_time_retention));
    equal = equal && (this.first_address_count == null ? that.first_address_count == null : this.first_address_count.equals(that.first_address_count));
    equal = equal && (this.mean_time_out == null ? that.mean_time_out == null : this.mean_time_out.equals(that.mean_time_out));
    equal = equal && (this.second_address_count == null ? that.second_address_count == null : this.second_address_count.equals(that.second_address_count));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.is_deleted == null ? that.is_deleted == null : this.is_deleted.equals(that.is_deleted));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof access_interval)) {
      return false;
    }
    access_interval that = (access_interval) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.personnel_id == null ? that.personnel_id == null : this.personnel_id.equals(that.personnel_id));
    equal = equal && (this.mean_time_retention == null ? that.mean_time_retention == null : this.mean_time_retention.equals(that.mean_time_retention));
    equal = equal && (this.first_address_count == null ? that.first_address_count == null : this.first_address_count.equals(that.first_address_count));
    equal = equal && (this.mean_time_out == null ? that.mean_time_out == null : this.mean_time_out.equals(that.mean_time_out));
    equal = equal && (this.second_address_count == null ? that.second_address_count == null : this.second_address_count.equals(that.second_address_count));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.is_deleted == null ? that.is_deleted == null : this.is_deleted.equals(that.is_deleted));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.personnel_id = JdbcWritableBridge.readString(2, __dbResults);
    this.mean_time_retention = JdbcWritableBridge.readString(3, __dbResults);
    this.first_address_count = JdbcWritableBridge.readInteger(4, __dbResults);
    this.mean_time_out = JdbcWritableBridge.readString(5, __dbResults);
    this.second_address_count = JdbcWritableBridge.readInteger(6, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.is_deleted = JdbcWritableBridge.readBoolean(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.personnel_id = JdbcWritableBridge.readString(2, __dbResults);
    this.mean_time_retention = JdbcWritableBridge.readString(3, __dbResults);
    this.first_address_count = JdbcWritableBridge.readInteger(4, __dbResults);
    this.mean_time_out = JdbcWritableBridge.readString(5, __dbResults);
    this.second_address_count = JdbcWritableBridge.readInteger(6, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.is_deleted = JdbcWritableBridge.readBoolean(9, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(personnel_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mean_time_retention, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(first_address_count, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(mean_time_out, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(second_address_count, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_deleted, 9 + __off, -7, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(personnel_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mean_time_retention, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(first_address_count, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(mean_time_out, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(second_address_count, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_deleted, 9 + __off, -7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.personnel_id = null;
    } else {
    this.personnel_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mean_time_retention = null;
    } else {
    this.mean_time_retention = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_address_count = null;
    } else {
    this.first_address_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.mean_time_out = null;
    } else {
    this.mean_time_out = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.second_address_count = null;
    } else {
    this.second_address_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = new Timestamp(__dataIn.readLong());
    this.create_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.update_time = null;
    } else {
    this.update_time = new Timestamp(__dataIn.readLong());
    this.update_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.is_deleted = null;
    } else {
    this.is_deleted = Boolean.valueOf(__dataIn.readBoolean());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.personnel_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personnel_id);
    }
    if (null == this.mean_time_retention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mean_time_retention);
    }
    if (null == this.first_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.first_address_count);
    }
    if (null == this.mean_time_out) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mean_time_out);
    }
    if (null == this.second_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.second_address_count);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
    if (null == this.is_deleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_deleted);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.personnel_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personnel_id);
    }
    if (null == this.mean_time_retention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mean_time_retention);
    }
    if (null == this.first_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.first_address_count);
    }
    if (null == this.mean_time_out) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mean_time_out);
    }
    if (null == this.second_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.second_address_count);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
    if (null == this.is_deleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_deleted);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personnel_id==null?"null":personnel_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mean_time_retention==null?"null":mean_time_retention, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_address_count==null?"null":"" + first_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mean_time_out==null?"null":mean_time_out, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(second_address_count==null?"null":"" + second_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_deleted==null?"null":"" + is_deleted, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personnel_id==null?"null":personnel_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mean_time_retention==null?"null":mean_time_retention, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_address_count==null?"null":"" + first_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mean_time_out==null?"null":mean_time_out, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(second_address_count==null?"null":"" + second_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_deleted==null?"null":"" + is_deleted, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.personnel_id = null; } else {
      this.personnel_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mean_time_retention = null; } else {
      this.mean_time_retention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_address_count = null; } else {
      this.first_address_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mean_time_out = null; } else {
      this.mean_time_out = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.second_address_count = null; } else {
      this.second_address_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_deleted = null; } else {
      this.is_deleted = BooleanParser.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.personnel_id = null; } else {
      this.personnel_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mean_time_retention = null; } else {
      this.mean_time_retention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_address_count = null; } else {
      this.first_address_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mean_time_out = null; } else {
      this.mean_time_out = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.second_address_count = null; } else {
      this.second_address_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_deleted = null; } else {
      this.is_deleted = BooleanParser.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    access_interval o = (access_interval) super.clone();
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(access_interval o) throws CloneNotSupportedException {
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("personnel_id", this.personnel_id);
    __sqoop$field_map.put("mean_time_retention", this.mean_time_retention);
    __sqoop$field_map.put("first_address_count", this.first_address_count);
    __sqoop$field_map.put("mean_time_out", this.mean_time_out);
    __sqoop$field_map.put("second_address_count", this.second_address_count);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("is_deleted", this.is_deleted);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("personnel_id", this.personnel_id);
    __sqoop$field_map.put("mean_time_retention", this.mean_time_retention);
    __sqoop$field_map.put("first_address_count", this.first_address_count);
    __sqoop$field_map.put("mean_time_out", this.mean_time_out);
    __sqoop$field_map.put("second_address_count", this.second_address_count);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("is_deleted", this.is_deleted);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
