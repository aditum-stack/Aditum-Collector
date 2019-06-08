// ORM class for table 'community'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 07 18:02:51 GMT+08:00 2019
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

public class community extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.id = (Long)value;
      }
    });
    setters.put("community_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.community_id = (String)value;
      }
    });
    setters.put("community_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.community_name = (String)value;
      }
    });
    setters.put("community_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.community_city = (String)value;
      }
    });
    setters.put("community_address", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.community_address = (String)value;
      }
    });
    setters.put("device_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.device_count = (Integer)value;
      }
    });
    setters.put("device_online_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.device_online_count = (Integer)value;
      }
    });
    setters.put("person_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.person_count = (Integer)value;
      }
    });
    setters.put("create_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.create_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("update_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.update_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("is_deleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        community.this.is_deleted = (Boolean)value;
      }
    });
  }
  public community() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public community with_id(Long id) {
    this.id = id;
    return this;
  }
  private String community_id;
  public String get_community_id() {
    return community_id;
  }
  public void set_community_id(String community_id) {
    this.community_id = community_id;
  }
  public community with_community_id(String community_id) {
    this.community_id = community_id;
    return this;
  }
  private String community_name;
  public String get_community_name() {
    return community_name;
  }
  public void set_community_name(String community_name) {
    this.community_name = community_name;
  }
  public community with_community_name(String community_name) {
    this.community_name = community_name;
    return this;
  }
  private String community_city;
  public String get_community_city() {
    return community_city;
  }
  public void set_community_city(String community_city) {
    this.community_city = community_city;
  }
  public community with_community_city(String community_city) {
    this.community_city = community_city;
    return this;
  }
  private String community_address;
  public String get_community_address() {
    return community_address;
  }
  public void set_community_address(String community_address) {
    this.community_address = community_address;
  }
  public community with_community_address(String community_address) {
    this.community_address = community_address;
    return this;
  }
  private Integer device_count;
  public Integer get_device_count() {
    return device_count;
  }
  public void set_device_count(Integer device_count) {
    this.device_count = device_count;
  }
  public community with_device_count(Integer device_count) {
    this.device_count = device_count;
    return this;
  }
  private Integer device_online_count;
  public Integer get_device_online_count() {
    return device_online_count;
  }
  public void set_device_online_count(Integer device_online_count) {
    this.device_online_count = device_online_count;
  }
  public community with_device_online_count(Integer device_online_count) {
    this.device_online_count = device_online_count;
    return this;
  }
  private Integer person_count;
  public Integer get_person_count() {
    return person_count;
  }
  public void set_person_count(Integer person_count) {
    this.person_count = person_count;
  }
  public community with_person_count(Integer person_count) {
    this.person_count = person_count;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public community with_create_time(java.sql.Timestamp create_time) {
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
  public community with_update_time(java.sql.Timestamp update_time) {
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
  public community with_is_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof community)) {
      return false;
    }
    community that = (community) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.community_id == null ? that.community_id == null : this.community_id.equals(that.community_id));
    equal = equal && (this.community_name == null ? that.community_name == null : this.community_name.equals(that.community_name));
    equal = equal && (this.community_city == null ? that.community_city == null : this.community_city.equals(that.community_city));
    equal = equal && (this.community_address == null ? that.community_address == null : this.community_address.equals(that.community_address));
    equal = equal && (this.device_count == null ? that.device_count == null : this.device_count.equals(that.device_count));
    equal = equal && (this.device_online_count == null ? that.device_online_count == null : this.device_online_count.equals(that.device_online_count));
    equal = equal && (this.person_count == null ? that.person_count == null : this.person_count.equals(that.person_count));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.is_deleted == null ? that.is_deleted == null : this.is_deleted.equals(that.is_deleted));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof community)) {
      return false;
    }
    community that = (community) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.community_id == null ? that.community_id == null : this.community_id.equals(that.community_id));
    equal = equal && (this.community_name == null ? that.community_name == null : this.community_name.equals(that.community_name));
    equal = equal && (this.community_city == null ? that.community_city == null : this.community_city.equals(that.community_city));
    equal = equal && (this.community_address == null ? that.community_address == null : this.community_address.equals(that.community_address));
    equal = equal && (this.device_count == null ? that.device_count == null : this.device_count.equals(that.device_count));
    equal = equal && (this.device_online_count == null ? that.device_online_count == null : this.device_online_count.equals(that.device_online_count));
    equal = equal && (this.person_count == null ? that.person_count == null : this.person_count.equals(that.person_count));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.is_deleted == null ? that.is_deleted == null : this.is_deleted.equals(that.is_deleted));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.community_id = JdbcWritableBridge.readString(2, __dbResults);
    this.community_name = JdbcWritableBridge.readString(3, __dbResults);
    this.community_city = JdbcWritableBridge.readString(4, __dbResults);
    this.community_address = JdbcWritableBridge.readString(5, __dbResults);
    this.device_count = JdbcWritableBridge.readInteger(6, __dbResults);
    this.device_online_count = JdbcWritableBridge.readInteger(7, __dbResults);
    this.person_count = JdbcWritableBridge.readInteger(8, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.is_deleted = JdbcWritableBridge.readBoolean(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.community_id = JdbcWritableBridge.readString(2, __dbResults);
    this.community_name = JdbcWritableBridge.readString(3, __dbResults);
    this.community_city = JdbcWritableBridge.readString(4, __dbResults);
    this.community_address = JdbcWritableBridge.readString(5, __dbResults);
    this.device_count = JdbcWritableBridge.readInteger(6, __dbResults);
    this.device_online_count = JdbcWritableBridge.readInteger(7, __dbResults);
    this.person_count = JdbcWritableBridge.readInteger(8, __dbResults);
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
    JdbcWritableBridge.writeString(community_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(community_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(community_city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(community_address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(device_count, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(device_online_count, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(person_count, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_deleted, 11 + __off, -7, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(community_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(community_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(community_city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(community_address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(device_count, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(device_online_count, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(person_count, 8 + __off, 4, __dbStmt);
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
        this.community_id = null;
    } else {
    this.community_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.community_name = null;
    } else {
    this.community_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.community_city = null;
    } else {
    this.community_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.community_address = null;
    } else {
    this.community_address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.device_count = null;
    } else {
    this.device_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.device_online_count = null;
    } else {
    this.device_online_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.person_count = null;
    } else {
    this.person_count = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.community_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_id);
    }
    if (null == this.community_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_name);
    }
    if (null == this.community_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_city);
    }
    if (null == this.community_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_address);
    }
    if (null == this.device_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.device_count);
    }
    if (null == this.device_online_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.device_online_count);
    }
    if (null == this.person_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.person_count);
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
    if (null == this.community_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_id);
    }
    if (null == this.community_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_name);
    }
    if (null == this.community_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_city);
    }
    if (null == this.community_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, community_address);
    }
    if (null == this.device_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.device_count);
    }
    if (null == this.device_online_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.device_online_count);
    }
    if (null == this.person_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.person_count);
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
    __sb.append(FieldFormatter.escapeAndEnclose(community_id==null?"null":community_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(community_name==null?"null":community_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(community_city==null?"null":community_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(community_address==null?"null":community_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_count==null?"null":"" + device_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_online_count==null?"null":"" + device_online_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(person_count==null?"null":"" + person_count, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(community_id==null?"null":community_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(community_name==null?"null":community_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(community_city==null?"null":community_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(community_address==null?"null":community_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_count==null?"null":"" + device_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_online_count==null?"null":"" + device_online_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(person_count==null?"null":"" + person_count, delimiters));
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
    if (__cur_str.equals("null")) { this.community_id = null; } else {
      this.community_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.community_name = null; } else {
      this.community_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.community_city = null; } else {
      this.community_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.community_address = null; } else {
      this.community_address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.device_count = null; } else {
      this.device_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.device_online_count = null; } else {
      this.device_online_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.person_count = null; } else {
      this.person_count = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.community_id = null; } else {
      this.community_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.community_name = null; } else {
      this.community_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.community_city = null; } else {
      this.community_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.community_address = null; } else {
      this.community_address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.device_count = null; } else {
      this.device_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.device_online_count = null; } else {
      this.device_online_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.person_count = null; } else {
      this.person_count = Integer.valueOf(__cur_str);
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
    community o = (community) super.clone();
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(community o) throws CloneNotSupportedException {
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("community_id", this.community_id);
    __sqoop$field_map.put("community_name", this.community_name);
    __sqoop$field_map.put("community_city", this.community_city);
    __sqoop$field_map.put("community_address", this.community_address);
    __sqoop$field_map.put("device_count", this.device_count);
    __sqoop$field_map.put("device_online_count", this.device_online_count);
    __sqoop$field_map.put("person_count", this.person_count);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("is_deleted", this.is_deleted);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("community_id", this.community_id);
    __sqoop$field_map.put("community_name", this.community_name);
    __sqoop$field_map.put("community_city", this.community_city);
    __sqoop$field_map.put("community_address", this.community_address);
    __sqoop$field_map.put("device_count", this.device_count);
    __sqoop$field_map.put("device_online_count", this.device_online_count);
    __sqoop$field_map.put("person_count", this.person_count);
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
