/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class SquareMembershipState {
  public static inline var JOIN_REQUESTED : Int = 1;
  public static inline var JOINED : Int = 2;
  public static inline var REJECTED : Int = 3;
  public static inline var LEFT : Int = 4;
  public static inline var KICK_OUT : Int = 5;
  public static inline var BANNED : Int = 6;
  public static inline var DELETED : Int = 7;

  public static var VALID_VALUES = { new IntSet( [JOIN_REQUESTED, JOINED, REJECTED, LEFT, KICK_OUT, BANNED, DELETED]); };
  public static var VALUES_TO_NAMES = { [
    JOIN_REQUESTED => "JOIN_REQUESTED",
    JOINED => "JOINED",
    REJECTED => "REJECTED",
    LEFT => "LEFT",
    KICK_OUT => "KICK_OUT",
    BANNED => "BANNED",
    DELETED => "DELETED"
  ]; };
}
