// ORM class for table 'access_address'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 08 15:43:15 GMT+08:00 2019
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

public class access_address extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.id = (Long)value;
      }
    });
    setters.put("personnel_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.personnel_id = (String)value;
      }
    });
    setters.put("first_address", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.first_address = (String)value;
      }
    });
    setters.put("first_address_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.first_address_count = (Integer)value;
      }
    });
    setters.put("second_address", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.second_address = (String)value;
      }
    });
    setters.put("second_address_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.second_address_count = (Integer)value;
      }
    });
    setters.put("total_address", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.total_address = (String)value;
      }
    });
    setters.put("total_address_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.total_address_count = (Integer)value;
      }
    });
    setters.put("total_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.total_count = (Integer)value;
      }
    });
    setters.put("create_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.create_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("update_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.update_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("is_deleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        access_address.this.is_deleted = (Boolean)value;
      }
    });
  }
  public access_address() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public access_address with_id(Long id) {
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
  public access_address with_personnel_id(String personnel_id) {
    this.personnel_id = personnel_id;
    return this;
  }
  private String first_address;
  public String get_first_address() {
    return first_address;
  }
  public void set_first_address(String first_address) {
    this.first_address = first_address;
  }
  public access_address with_first_address(String first_address) {
    this.first_address = first_address;
    return this;
  }
  private Integer first_address_count;
  public Integer get_first_address_count() {
    return first_address_count;
  }
  public void set_first_address_count(Integer first_address_count) {
    this.first_address_count = first_address_count;
  }
  public access_address with_first_address_count(Integer first_address_count) {
    this.first_address_count = first_address_count;
    return this;
  }
  private String second_address;
  public String get_second_address() {
    return second_address;
  }
  public void set_second_address(String second_address) {
    this.second_address = second_address;
  }
  public access_address with_second_address(String second_address) {
    this.second_address = second_address;
    return this;
  }
  private Integer second_address_count;
  public Integer get_second_address_count() {
    return second_address_count;
  }
  public void set_second_address_count(Integer second_address_count) {
    this.second_address_count = second_address_count;
  }
  public access_address with_second_address_count(Integer second_address_count) {
    this.second_address_count = second_address_count;
    return this;
  }
  private String total_address;
  public String get_total_address() {
    return total_address;
  }
  public void set_total_address(String total_address) {
    this.total_address = total_address;
  }
  public access_address with_total_address(String total_address) {
    this.total_address = total_address;
    return this;
  }
  private Integer total_address_count;
  public Integer get_total_address_count() {
    return total_address_count;
  }
  public void set_total_address_count(Integer total_address_count) {
    this.total_address_count = total_address_count;
  }
  public access_address with_total_address_count(Integer total_address_count) {
    this.total_address_count = total_address_count;
    return this;
  }
  private Integer total_count;
  public Integer get_total_count() {
    return total_count;
  }
  public void set_total_count(Integer total_count) {
    this.total_count = total_count;
  }
  public access_address with_total_count(Integer total_count) {
    this.total_count = total_count;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public access_address with_create_time(java.sql.Timestamp create_time) {
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
  public access_address with_update_time(java.sql.Timestamp update_time) {
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
  public access_address with_is_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof access_address)) {
      return false;
    }
    access_address that = (access_address) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.personnel_id == null ? that.personnel_id == null : this.personnel_id.equals(that.personnel_id));
    equal = equal && (this.first_address == null ? that.first_address == null : this.first_address.equals(that.first_address));
    equal = equal && (this.first_address_count == null ? that.first_address_count == null : this.first_address_count.equals(that.first_address_count));
    equal = equal && (this.second_address == null ? that.second_address == null : this.second_address.equals(that.second_address));
    equal = equal && (this.second_address_count == null ? that.second_address_count == null : this.second_address_count.equals(that.second_address_count));
    equal = equal && (this.total_address == null ? that.total_address == null : this.total_address.equals(that.total_address));
    equal = equal && (this.total_address_count == null ? that.total_address_count == null : this.total_address_count.equals(that.total_address_count));
    equal = equal && (this.total_count == null ? that.total_count == null : this.total_count.equals(that.total_count));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.is_deleted == null ? that.is_deleted == null : this.is_deleted.equals(that.is_deleted));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof access_address)) {
      return false;
    }
    access_address that = (access_address) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.personnel_id == null ? that.personnel_id == null : this.personnel_id.equals(that.personnel_id));
    equal = equal && (this.first_address == null ? that.first_address == null : this.first_address.equals(that.first_address));
    equal = equal && (this.first_address_count == null ? that.first_address_count == null : this.first_address_count.equals(that.first_address_count));
    equal = equal && (this.second_address == null ? that.second_address == null : this.second_address.equals(that.second_address));
    equal = equal && (this.second_address_count == null ? that.second_address_count == null : this.second_address_count.equals(that.second_address_count));
    equal = equal && (this.total_address == null ? that.total_address == null : this.total_address.equals(that.total_address));
    equal = equal && (this.total_address_count == null ? that.total_address_count == null : this.total_address_count.equals(that.total_address_count));
    equal = equal && (this.total_count == null ? that.total_count == null : this.total_count.equals(that.total_count));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.is_deleted == null ? that.is_deleted == null : this.is_deleted.equals(that.is_deleted));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.personnel_id = JdbcWritableBridge.readString(2, __dbResults);
    this.first_address = JdbcWritableBridge.readString(3, __dbResults);
    this.first_address_count = JdbcWritableBridge.readInteger(4, __dbResults);
    this.second_address = JdbcWritableBridge.readString(5, __dbResults);
    this.second_address_count = JdbcWritableBridge.readInteger(6, __dbResults);
    this.total_address = JdbcWritableBridge.readString(7, __dbResults);
    this.total_address_count = JdbcWritableBridge.readInteger(8, __dbResults);
    this.total_count = JdbcWritableBridge.readInteger(9, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.is_deleted = JdbcWritableBridge.readBoolean(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.personnel_id = JdbcWritableBridge.readString(2, __dbResults);
    this.first_address = JdbcWritableBridge.readString(3, __dbResults);
    this.first_address_count = JdbcWritableBridge.readInteger(4, __dbResults);
    this.second_address = JdbcWritableBridge.readString(5, __dbResults);
    this.second_address_count = JdbcWritableBridge.readInteger(6, __dbResults);
    this.total_address = JdbcWritableBridge.readString(7, __dbResults);
    this.total_address_count = JdbcWritableBridge.readInteger(8, __dbResults);
    this.total_count = JdbcWritableBridge.readInteger(9, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.is_deleted = JdbcWritableBridge.readBoolean(12, __dbResults);
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
    JdbcWritableBridge.writeString(first_address, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(first_address_count, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(second_address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(second_address_count, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(total_address, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(total_address_count, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(total_count, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_deleted, 12 + __off, -7, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(personnel_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(first_address, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(first_address_count, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(second_address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(second_address_count, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(total_address, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(total_address_count, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(total_count, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_deleted, 12 + __off, -7, __dbStmt);
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
        this.first_address = null;
    } else {
    this.first_address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_address_count = null;
    } else {
    this.first_address_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.second_address = null;
    } else {
    this.second_address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.second_address_count = null;
    } else {
    this.second_address_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.total_address = null;
    } else {
    this.total_address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.total_address_count = null;
    } else {
    this.total_address_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.total_count = null;
    } else {
    this.total_count = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.first_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_address);
    }
    if (null == this.first_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.first_address_count);
    }
    if (null == this.second_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, second_address);
    }
    if (null == this.second_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.second_address_count);
    }
    if (null == this.total_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, total_address);
    }
    if (null == this.total_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total_address_count);
    }
    if (null == this.total_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total_count);
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
    if (null == this.first_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_address);
    }
    if (null == this.first_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.first_address_count);
    }
    if (null == this.second_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, second_address);
    }
    if (null == this.second_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.second_address_count);
    }
    if (null == this.total_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, total_address);
    }
    if (null == this.total_address_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total_address_count);
    }
    if (null == this.total_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total_count);
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
    __sb.append(FieldFormatter.escapeAndEnclose(first_address==null?"null":first_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_address_count==null?"null":"" + first_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(second_address==null?"null":second_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(second_address_count==null?"null":"" + second_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_address==null?"null":total_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_address_count==null?"null":"" + total_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_count==null?"null":"" + total_count, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(first_address==null?"null":first_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_address_count==null?"null":"" + first_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(second_address==null?"null":second_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(second_address_count==null?"null":"" + second_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_address==null?"null":total_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_address_count==null?"null":"" + total_address_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_count==null?"null":"" + total_count, delimiters));
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
    if (__cur_str.equals("null")) { this.first_address = null; } else {
      this.first_address = __cur_str;
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
    if (__cur_str.equals("null")) { this.second_address = null; } else {
      this.second_address = __cur_str;
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
    if (__cur_str.equals("null")) { this.total_address = null; } else {
      this.total_address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_address_count = null; } else {
      this.total_address_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_count = null; } else {
      this.total_count = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.first_address = null; } else {
      this.first_address = __cur_str;
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
    if (__cur_str.equals("null")) { this.second_address = null; } else {
      this.second_address = __cur_str;
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
    if (__cur_str.equals("null")) { this.total_address = null; } else {
      this.total_address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_address_count = null; } else {
      this.total_address_count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_count = null; } else {
      this.total_count = Integer.valueOf(__cur_str);
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
    access_address o = (access_address) super.clone();
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(access_address o) throws CloneNotSupportedException {
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("personnel_id", this.personnel_id);
    __sqoop$field_map.put("first_address", this.first_address);
    __sqoop$field_map.put("first_address_count", this.first_address_count);
    __sqoop$field_map.put("second_address", this.second_address);
    __sqoop$field_map.put("second_address_count", this.second_address_count);
    __sqoop$field_map.put("total_address", this.total_address);
    __sqoop$field_map.put("total_address_count", this.total_address_count);
    __sqoop$field_map.put("total_count", this.total_count);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("is_deleted", this.is_deleted);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("personnel_id", this.personnel_id);
    __sqoop$field_map.put("first_address", this.first_address);
    __sqoop$field_map.put("first_address_count", this.first_address_count);
    __sqoop$field_map.put("second_address", this.second_address);
    __sqoop$field_map.put("second_address_count", this.second_address_count);
    __sqoop$field_map.put("total_address", this.total_address);
    __sqoop$field_map.put("total_address_count", this.total_address_count);
    __sqoop$field_map.put("total_count", this.total_count);
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
