// ORM class for table 'device'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 08 15:32:06 GMT+08:00 2019
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

public class device extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.id = (Long)value;
      }
    });
    setters.put("imei", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.imei = (String)value;
      }
    });
    setters.put("alias", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.alias = (String)value;
      }
    });
    setters.put("community_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.community_id = (String)value;
      }
    });
    setters.put("device_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.device_status = (Long)value;
      }
    });
    setters.put("activate_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.activate_time = (String)value;
      }
    });
    setters.put("last_online_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.last_online_time = (String)value;
      }
    });
    setters.put("last_offline_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.last_offline_time = (String)value;
      }
    });
    setters.put("create_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.create_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("update_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.update_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("is_deleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        device.this.is_deleted = (Boolean)value;
      }
    });
  }
  public device() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public device with_id(Long id) {
    this.id = id;
    return this;
  }
  private String imei;
  public String get_imei() {
    return imei;
  }
  public void set_imei(String imei) {
    this.imei = imei;
  }
  public device with_imei(String imei) {
    this.imei = imei;
    return this;
  }
  private String alias;
  public String get_alias() {
    return alias;
  }
  public void set_alias(String alias) {
    this.alias = alias;
  }
  public device with_alias(String alias) {
    this.alias = alias;
    return this;
  }
  private String community_id;
  public String get_community_id() {
    return community_id;
  }
  public void set_community_id(String community_id) {
    this.community_id = community_id;
  }
  public device with_community_id(String community_id) {
    this.community_id = community_id;
    return this;
  }
  private Long device_status;
  public Long get_device_status() {
    return device_status;
  }
  public void set_device_status(Long device_status) {
    this.device_status = device_status;
  }
  public device with_device_status(Long device_status) {
    this.device_status = device_status;
    return this;
  }
  private String activate_time;
  public String get_activate_time() {
    return activate_time;
  }
  public void set_activate_time(String activate_time) {
    this.activate_time = activate_time;
  }
  public device with_activate_time(String activate_time) {
    this.activate_time = activate_time;
    return this;
  }
  private String last_online_time;
  public String get_last_online_time() {
    return last_online_time;
  }
  public void set_last_online_time(String last_online_time) {
    this.last_online_time = last_online_time;
  }
  public device with_last_online_time(String last_online_time) {
    this.last_online_time = last_online_time;
    return this;
  }
  private String last_offline_time;
  public String get_last_offline_time() {
    return last_offline_time;
  }
  public void set_last_offline_time(String last_offline_time) {
    this.last_offline_time = last_offline_time;
  }
  public device with_last_offline_time(String last_offline_time) {
    this.last_offline_time = last_offline_time;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public device with_create_time(java.sql.Timestamp create_time) {
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
  public device with_update_time(java.sql.Timestamp update_time) {
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
  public device with_is_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof device)) {
      return false;
    }
    device that = (device) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.imei == null ? that.imei == null : this.imei.equals(that.imei));
    equal = equal && (this.alias == null ? that.alias == null : this.alias.equals(that.alias));
    equal = equal && (this.community_id == null ? that.community_id == null : this.community_id.equals(that.community_id));
    equal = equal && (this.device_status == null ? that.device_status == null : this.device_status.equals(that.device_status));
    equal = equal && (this.activate_time == null ? that.activate_time == null : this.activate_time.equals(that.activate_time));
    equal = equal && (this.last_online_time == null ? that.last_online_time == null : this.last_online_time.equals(that.last_online_time));
    equal = equal && (this.last_offline_time == null ? that.last_offline_time == null : this.last_offline_time.equals(that.last_offline_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.is_deleted == null ? that.is_deleted == null : this.is_deleted.equals(that.is_deleted));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof device)) {
      return false;
    }
    device that = (device) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.imei == null ? that.imei == null : this.imei.equals(that.imei));
    equal = equal && (this.alias == null ? that.alias == null : this.alias.equals(that.alias));
    equal = equal && (this.community_id == null ? that.community_id == null : this.community_id.equals(that.community_id));
    equal = equal && (this.device_status == null ? that.device_status == null : this.device_status.equals(that.device_status));
    equal = equal && (this.activate_time == null ? that.activate_time == null : this.activate_time.equals(that.activate_time));
    equal = equal && (this.last_online_time == null ? that.last_online_time == null : this.last_online_time.equals(that.last_online_time));
    equal = equal && (this.last_offline_time == null ? that.last_offline_time == null : this.last_offline_time.equals(that.last_offline_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.is_deleted == null ? that.is_deleted == null : this.is_deleted.equals(that.is_deleted));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.imei = JdbcWritableBridge.readString(2, __dbResults);
    this.alias = JdbcWritableBridge.readString(3, __dbResults);
    this.community_id = JdbcWritableBridge.readString(4, __dbResults);
    this.device_status = JdbcWritableBridge.readLong(5, __dbResults);
    this.activate_time = JdbcWritableBridge.readString(6, __dbResults);
    this.last_online_time = JdbcWritableBridge.readString(7, __dbResults);
    this.last_offline_time = JdbcWritableBridge.readString(8, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.is_deleted = JdbcWritableBridge.readBoolean(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.imei = JdbcWritableBridge.readString(2, __dbResults);
    this.alias = JdbcWritableBridge.readString(3, __dbResults);
    this.community_id = JdbcWritableBridge.readString(4, __dbResults);
    this.device_status = JdbcWritableBridge.readLong(5, __dbResults);
    this.activate_time = JdbcWritableBridge.readString(6, __dbResults);
    this.last_online_time = JdbcWritableBridge.readString(7, __dbResults);
    this.last_offline_time = JdbcWritableBridge.readString(8, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.is_deleted = JdbcWritableBridge.readBoolean(11, __dbResults);
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
    JdbcWritableBridge.writeString(imei, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(alias, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(community_id, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(device_status, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(activate_time, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_online_time, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_offline_time, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_deleted, 11 + __off, -7, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(imei, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(alias, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(community_id, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(device_status, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(activate_time, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_online_time, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_offline_time, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_deleted, 11 + __off, -7, __dbStmt);
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
        this.imei = null;
    } else {
    this.imei = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.alias = null;
    } else {
    this.alias = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.community_id = null;
    } else {
    this.community_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.device_status = null;
    } else {
    this.device_status = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.activate_time = null;
    } else {
    this.activate_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.last_online_time = null;
    } else {
    this.last_online_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.last_offline_time = null;
    } else {
    this.last_offline_time = Text.readString(__dataIn);
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
    if (null == this.imei) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, imei);
    }
    if (null == this.alias) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, alias);
    }
    if (null == this.community_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_id);
    }
    if (null == this.device_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.device_status);
    }
    if (null == this.activate_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, activate_time);
    }
    if (null == this.last_online_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_online_time);
    }
    if (null == this.last_offline_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_offline_time);
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
    if (null == this.imei) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, imei);
    }
    if (null == this.alias) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, alias);
    }
    if (null == this.community_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_id);
    }
    if (null == this.device_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.device_status);
    }
    if (null == this.activate_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, activate_time);
    }
    if (null == this.last_online_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_online_time);
    }
    if (null == this.last_offline_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_offline_time);
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
    __sb.append(FieldFormatter.escapeAndEnclose(imei==null?"null":imei, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(alias==null?"null":alias, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(community_id==null?"null":community_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_status==null?"null":"" + device_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(activate_time==null?"null":activate_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_online_time==null?"null":last_online_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_offline_time==null?"null":last_offline_time, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(imei==null?"null":imei, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(alias==null?"null":alias, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(community_id==null?"null":community_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_status==null?"null":"" + device_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(activate_time==null?"null":activate_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_online_time==null?"null":last_online_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_offline_time==null?"null":last_offline_time, delimiters));
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
    if (__cur_str.equals("null")) { this.imei = null; } else {
      this.imei = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.alias = null; } else {
      this.alias = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.community_id = null; } else {
      this.community_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.device_status = null; } else {
      this.device_status = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.activate_time = null; } else {
      this.activate_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.last_online_time = null; } else {
      this.last_online_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.last_offline_time = null; } else {
      this.last_offline_time = __cur_str;
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
    if (__cur_str.equals("null")) { this.imei = null; } else {
      this.imei = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.alias = null; } else {
      this.alias = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.community_id = null; } else {
      this.community_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.device_status = null; } else {
      this.device_status = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.activate_time = null; } else {
      this.activate_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.last_online_time = null; } else {
      this.last_online_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.last_offline_time = null; } else {
      this.last_offline_time = __cur_str;
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
    device o = (device) super.clone();
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(device o) throws CloneNotSupportedException {
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("imei", this.imei);
    __sqoop$field_map.put("alias", this.alias);
    __sqoop$field_map.put("community_id", this.community_id);
    __sqoop$field_map.put("device_status", this.device_status);
    __sqoop$field_map.put("activate_time", this.activate_time);
    __sqoop$field_map.put("last_online_time", this.last_online_time);
    __sqoop$field_map.put("last_offline_time", this.last_offline_time);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("is_deleted", this.is_deleted);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("imei", this.imei);
    __sqoop$field_map.put("alias", this.alias);
    __sqoop$field_map.put("community_id", this.community_id);
    __sqoop$field_map.put("device_status", this.device_status);
    __sqoop$field_map.put("activate_time", this.activate_time);
    __sqoop$field_map.put("last_online_time", this.last_online_time);
    __sqoop$field_map.put("last_offline_time", this.last_offline_time);
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
