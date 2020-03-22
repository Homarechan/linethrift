/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.Hashtable;
import java.util.Vector;
import java.util.Enumeration;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class GlobalEvent implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("GlobalEvent");

  private static final TField KEY_FIELD_DESC = new TField("key", TType.STRING, (short)1);
  private static final TField TARGETS_FIELD_DESC = new TField("targets", TType.LIST, (short)2);
  private static final TField CREATED_TIME_FIELD_DESC = new TField("createdTime", TType.I64, (short)3);
  private static final TField DATA_FIELD_DESC = new TField("data", TType.I64, (short)4);
  private static final TField MAX_DELAY_FIELD_DESC = new TField("maxDelay", TType.I32, (short)5);

  private String key;
  private Vector targets;
  private long createdTime;
  private long data;
  private int maxDelay;

  // isset id assignments
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __DATA_ISSET_ID = 1;
  private static final int __MAXDELAY_ISSET_ID = 2;
  private boolean[] __isset_vector = new boolean[3];

  public GlobalEvent() {
  }

  public GlobalEvent(
    String key,
    Vector targets,
    long createdTime,
    long data,
    int maxDelay)
  {
    this();
    this.key = key;
    this.targets = targets;
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.data = data;
    setDataIsSet(true);
    this.maxDelay = maxDelay;
    setMaxDelayIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GlobalEvent(GlobalEvent other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetKey()) {
      this.key = other.key;
    }
    if (other.isSetTargets()) {
      Vector __this__targets = new Vector();
      for (Enumeration other_enum = other.targets.elements(); other_enum.hasMoreElements(); ) {
        NotificationTarget other_element = (NotificationTarget)other_enum.nextElement();
        __this__targets.addElement(new NotificationTarget(other_element));
      }
      this.targets = __this__targets;
    }
    this.createdTime = other.createdTime;
    this.data = other.data;
    this.maxDelay = other.maxDelay;
  }

  public GlobalEvent deepCopy() {
    return new GlobalEvent(this);
  }

  public void clear() {
    this.key = null;
    this.targets = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    setDataIsSet(false);
    this.data = 0;
    setMaxDelayIsSet(false);
    this.maxDelay = 0;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public int getTargetsSize() {
    return (this.targets == null) ? 0 : this.targets.size();
  }

  public Enumeration getTargetsEnumeration() {
    return (this.targets == null) ? null : this.targets.elements();
  }

  public void addToTargets(NotificationTarget elem) {
    if (this.targets == null) {
      this.targets = new Vector();
    }
    this.targets.addElement(elem);
  }

  public Vector getTargets() {
    return this.targets;
  }

  public void setTargets(Vector targets) {
    this.targets = targets;
  }

  public void unsetTargets() {
    this.targets = null;
  }

  /** Returns true if field targets is set (has been assigned a value) and false otherwise */
  public boolean isSetTargets() {
    return this.targets != null;
  }

  public void setTargetsIsSet(boolean value) {
    if (!value) {
      this.targets = null;
    }
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public void setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
  }

  public void unsetCreatedTime() {
    __isset_vector[__CREATEDTIME_ISSET_ID] = false;
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return __isset_vector[__CREATEDTIME_ISSET_ID];
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_vector[__CREATEDTIME_ISSET_ID] = value;
  }

  public long getData() {
    return this.data;
  }

  public void setData(long data) {
    this.data = data;
    setDataIsSet(true);
  }

  public void unsetData() {
    __isset_vector[__DATA_ISSET_ID] = false;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return __isset_vector[__DATA_ISSET_ID];
  }

  public void setDataIsSet(boolean value) {
    __isset_vector[__DATA_ISSET_ID] = value;
  }

  public int getMaxDelay() {
    return this.maxDelay;
  }

  public void setMaxDelay(int maxDelay) {
    this.maxDelay = maxDelay;
    setMaxDelayIsSet(true);
  }

  public void unsetMaxDelay() {
    __isset_vector[__MAXDELAY_ISSET_ID] = false;
  }

  /** Returns true if field maxDelay is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxDelay() {
    return __isset_vector[__MAXDELAY_ISSET_ID];
  }

  public void setMaxDelayIsSet(boolean value) {
    __isset_vector[__MAXDELAY_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GlobalEvent)
      return this.equals((GlobalEvent)that);
    return false;
  }

  public boolean equals(GlobalEvent that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_targets = true && this.isSetTargets();
    boolean that_present_targets = true && that.isSetTargets();
    if (this_present_targets || that_present_targets) {
      if (!(this_present_targets && that_present_targets))
        return false;
      if (!this.targets.equals(that.targets))
        return false;
    }

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_data = true;
    boolean that_present_data = true;
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (this.data != that.data)
        return false;
    }

    boolean this_present_maxDelay = true;
    boolean that_present_maxDelay = true;
    if (this_present_maxDelay || that_present_maxDelay) {
      if (!(this_present_maxDelay && that_present_maxDelay))
        return false;
      if (this.maxDelay != that.maxDelay)
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    GlobalEvent other = (GlobalEvent)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetKey(), other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTargets(), other.isSetTargets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargets()) {
      lastComparison = TBaseHelper.compareTo(this.targets, other.targets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCreatedTime(), other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetData(), other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetMaxDelay(), other.isSetMaxDelay());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxDelay()) {
      lastComparison = TBaseHelper.compareTo(this.maxDelay, other.maxDelay);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // KEY
          if (field.type == TType.STRING) {
            this.key = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TARGETS
          if (field.type == TType.LIST) {
            {
              TList _list137 = iprot.readListBegin();
              this.targets = new Vector(_list137.size);
              for (int _i138 = 0; _i138 < _list137.size; ++_i138)
              {
                NotificationTarget _elem139;
                _elem139 = new NotificationTarget();
                _elem139.read(iprot);
                this.targets.addElement(_elem139);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CREATED_TIME
          if (field.type == TType.I64) {
            this.createdTime = iprot.readI64();
            setCreatedTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // DATA
          if (field.type == TType.I64) {
            this.data = iprot.readI64();
            setDataIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // MAX_DELAY
          if (field.type == TType.I32) {
            this.maxDelay = iprot.readI32();
            setMaxDelayIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.key != null) {
      oprot.writeFieldBegin(KEY_FIELD_DESC);
      oprot.writeString(this.key);
      oprot.writeFieldEnd();
    }
    if (this.targets != null) {
      oprot.writeFieldBegin(TARGETS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.targets.size()));
        for (Enumeration _iter140_enum = this.targets.elements(); _iter140_enum.hasMoreElements(); )         {
          NotificationTarget _iter140 = (NotificationTarget)_iter140_enum.nextElement();
          _iter140.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
    oprot.writeI64(this.createdTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DATA_FIELD_DESC);
    oprot.writeI64(this.data);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MAX_DELAY_FIELD_DESC);
    oprot.writeI32(this.maxDelay);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("GlobalEvent(");
    boolean first = true;

    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      sb.append(this.key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("targets:");
    if (this.targets == null) {
      sb.append("null");
    } else {
      sb.append(this.targets);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    sb.append(this.data);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxDelay:");
    sb.append(this.maxDelay);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

