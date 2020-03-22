(*
 Autogenerated by Thrift Compiler (0.14.0)

 DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING
*)

open Thrift
open Line_types

(* HELPER FUNCTIONS AND STRUCTURES *)

class fetchMessageOperations_args =
object (self)
  val mutable _localRevision : Int64.t option = None
  method get_localRevision = _localRevision
  method grab_localRevision = match _localRevision with None->raise (Field_empty "fetchMessageOperations_args.localRevision") | Some _x6092 -> _x6092
  method set_localRevision _x6092 = _localRevision <- Some _x6092
  method unset_localRevision = _localRevision <- None
  method reset_localRevision = _localRevision <- None

  val mutable _lastOpTimestamp : Int64.t option = None
  method get_lastOpTimestamp = _lastOpTimestamp
  method grab_lastOpTimestamp = match _lastOpTimestamp with None->raise (Field_empty "fetchMessageOperations_args.lastOpTimestamp") | Some _x6093 -> _x6093
  method set_lastOpTimestamp _x6093 = _lastOpTimestamp <- Some _x6093
  method unset_lastOpTimestamp = _lastOpTimestamp <- None
  method reset_lastOpTimestamp = _lastOpTimestamp <- None

  val mutable _count : Int32.t option = None
  method get_count = _count
  method grab_count = match _count with None->raise (Field_empty "fetchMessageOperations_args.count") | Some _x6094 -> _x6094
  method set_count _x6094 = _count <- Some _x6094
  method unset_count = _count <- None
  method reset_count = _count <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "fetchMessageOperations_args";
    (match _localRevision with None -> () | Some _v -> 
      oprot#writeFieldBegin("localRevision",Protocol.T_I64,2);
      oprot#writeI64(_v);
      oprot#writeFieldEnd
    );
    (match _lastOpTimestamp with None -> () | Some _v -> 
      oprot#writeFieldBegin("lastOpTimestamp",Protocol.T_I64,3);
      oprot#writeI64(_v);
      oprot#writeFieldEnd
    );
    (match _count with None -> () | Some _v -> 
      oprot#writeFieldBegin("count",Protocol.T_I32,4);
      oprot#writeI32(_v);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_fetchMessageOperations_args (iprot : Protocol.t) =
  let _str6097 = new fetchMessageOperations_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t6098,_id6099) = iprot#readFieldBegin in
        if _t6098 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id6099 with 
          | 2 -> (if _t6098 = Protocol.T_I64 then
              _str6097#set_localRevision iprot#readI64
            else
              iprot#skip _t6098)
          | 3 -> (if _t6098 = Protocol.T_I64 then
              _str6097#set_lastOpTimestamp iprot#readI64
            else
              iprot#skip _t6098)
          | 4 -> (if _t6098 = Protocol.T_I32 then
              _str6097#set_count iprot#readI32
            else
              iprot#skip _t6098)
          | _ -> iprot#skip _t6098);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str6097

class fetchMessageOperations_result =
object (self)
  val mutable _success : messageOperations option = None
  method get_success = _success
  method grab_success = match _success with None->raise (Field_empty "fetchMessageOperations_result.success") | Some _x6100 -> _x6100
  method set_success _x6100 = _success <- Some _x6100
  method unset_success = _success <- None
  method reset_success = _success <- None

  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "fetchMessageOperations_result.e") | Some _x6101 -> _x6101
  method set_e _x6101 = _e <- Some _x6101
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _success <> None then
        _new#set_success self#grab_success#copy;
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "fetchMessageOperations_result";
    (match _success with None -> () | Some _v -> 
      oprot#writeFieldBegin("success",Protocol.T_STRUCT,0);
      _v#write(oprot);
      oprot#writeFieldEnd
    );
    (match _e with None -> () | Some _v -> 
      oprot#writeFieldBegin("e",Protocol.T_STRUCT,1);
      _v#write(oprot);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_fetchMessageOperations_result (iprot : Protocol.t) =
  let _str6104 = new fetchMessageOperations_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t6105,_id6106) = iprot#readFieldBegin in
        if _t6105 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id6106 with 
          | 0 -> (if _t6105 = Protocol.T_STRUCT then
              _str6104#set_success (read_messageOperations iprot)
            else
              iprot#skip _t6105)
          | 1 -> (if _t6105 = Protocol.T_STRUCT then
              _str6104#set_e (read_talkException iprot)
            else
              iprot#skip _t6105)
          | _ -> iprot#skip _t6105);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str6104

class getLastReadMessageIds_args =
object (self)
  val mutable _chatId : string option = None
  method get_chatId = _chatId
  method grab_chatId = match _chatId with None->raise (Field_empty "getLastReadMessageIds_args.chatId") | Some _x6107 -> _x6107
  method set_chatId _x6107 = _chatId <- Some _x6107
  method unset_chatId = _chatId <- None
  method reset_chatId = _chatId <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "getLastReadMessageIds_args";
    (match _chatId with None -> () | Some _v -> 
      oprot#writeFieldBegin("chatId",Protocol.T_STRING,2);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_getLastReadMessageIds_args (iprot : Protocol.t) =
  let _str6110 = new getLastReadMessageIds_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t6111,_id6112) = iprot#readFieldBegin in
        if _t6111 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id6112 with 
          | 2 -> (if _t6111 = Protocol.T_STRING then
              _str6110#set_chatId iprot#readString
            else
              iprot#skip _t6111)
          | _ -> iprot#skip _t6111);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str6110

class getLastReadMessageIds_result =
object (self)
  val mutable _success : lastReadMessageIds option = None
  method get_success = _success
  method grab_success = match _success with None->raise (Field_empty "getLastReadMessageIds_result.success") | Some _x6113 -> _x6113
  method set_success _x6113 = _success <- Some _x6113
  method unset_success = _success <- None
  method reset_success = _success <- None

  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "getLastReadMessageIds_result.e") | Some _x6114 -> _x6114
  method set_e _x6114 = _e <- Some _x6114
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _success <> None then
        _new#set_success self#grab_success#copy;
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "getLastReadMessageIds_result";
    (match _success with None -> () | Some _v -> 
      oprot#writeFieldBegin("success",Protocol.T_STRUCT,0);
      _v#write(oprot);
      oprot#writeFieldEnd
    );
    (match _e with None -> () | Some _v -> 
      oprot#writeFieldBegin("e",Protocol.T_STRUCT,1);
      _v#write(oprot);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_getLastReadMessageIds_result (iprot : Protocol.t) =
  let _str6117 = new getLastReadMessageIds_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t6118,_id6119) = iprot#readFieldBegin in
        if _t6118 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id6119 with 
          | 0 -> (if _t6118 = Protocol.T_STRUCT then
              _str6117#set_success (read_lastReadMessageIds iprot)
            else
              iprot#skip _t6118)
          | 1 -> (if _t6118 = Protocol.T_STRUCT then
              _str6117#set_e (read_talkException iprot)
            else
              iprot#skip _t6118)
          | _ -> iprot#skip _t6118);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str6117

class multiGetLastReadMessageIds_args =
object (self)
  val mutable _chatIds : string list option = None
  method get_chatIds = _chatIds
  method grab_chatIds = match _chatIds with None->raise (Field_empty "multiGetLastReadMessageIds_args.chatIds") | Some _x6120 -> _x6120
  method set_chatIds _x6120 = _chatIds <- Some _x6120
  method unset_chatIds = _chatIds <- None
  method reset_chatIds = _chatIds <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "multiGetLastReadMessageIds_args";
    (match _chatIds with None -> () | Some _v -> 
      oprot#writeFieldBegin("chatIds",Protocol.T_LIST,2);
      oprot#writeListBegin(Protocol.T_STRING,List.length _v);
      List.iter (fun _iter6123 ->         oprot#writeString(_iter6123);
      ) _v;
      oprot#writeListEnd;
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_multiGetLastReadMessageIds_args (iprot : Protocol.t) =
  let _str6124 = new multiGetLastReadMessageIds_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t6125,_id6126) = iprot#readFieldBegin in
        if _t6125 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id6126 with 
          | 2 -> (if _t6125 = Protocol.T_LIST then
              _str6124#set_chatIds 
                (let (_etype6130,_size6127) = iprot#readListBegin in
                  let _con6131 = (Array.to_list (Array.init _size6127 (fun _ -> iprot#readString))) in
                    iprot#readListEnd; _con6131)
            else
              iprot#skip _t6125)
          | _ -> iprot#skip _t6125);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str6124

class multiGetLastReadMessageIds_result =
object (self)
  val mutable _success : lastReadMessageIds list option = None
  method get_success = _success
  method grab_success = match _success with None->raise (Field_empty "multiGetLastReadMessageIds_result.success") | Some _x6132 -> _x6132
  method set_success _x6132 = _success <- Some _x6132
  method unset_success = _success <- None
  method reset_success = _success <- None

  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "multiGetLastReadMessageIds_result.e") | Some _x6133 -> _x6133
  method set_e _x6133 = _e <- Some _x6133
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _success <> None then
        _new#set_success (List.map (fun x -> x#copy) self#grab_success);
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "multiGetLastReadMessageIds_result";
    (match _success with None -> () | Some _v -> 
      oprot#writeFieldBegin("success",Protocol.T_LIST,0);
      oprot#writeListBegin(Protocol.T_STRUCT,List.length _v);
      List.iter (fun _iter6136 ->         _iter6136#write(oprot);
      ) _v;
      oprot#writeListEnd;
      oprot#writeFieldEnd
    );
    (match _e with None -> () | Some _v -> 
      oprot#writeFieldBegin("e",Protocol.T_STRUCT,1);
      _v#write(oprot);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_multiGetLastReadMessageIds_result (iprot : Protocol.t) =
  let _str6137 = new multiGetLastReadMessageIds_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t6138,_id6139) = iprot#readFieldBegin in
        if _t6138 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id6139 with 
          | 0 -> (if _t6138 = Protocol.T_LIST then
              _str6137#set_success 
                (let (_etype6143,_size6140) = iprot#readListBegin in
                  let _con6144 = (Array.to_list (Array.init _size6140 (fun _ -> (read_lastReadMessageIds iprot)))) in
                    iprot#readListEnd; _con6144)
            else
              iprot#skip _t6138)
          | 1 -> (if _t6138 = Protocol.T_STRUCT then
              _str6137#set_e (read_talkException iprot)
            else
              iprot#skip _t6138)
          | _ -> iprot#skip _t6138);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str6137

class virtual iface =
object (self)
  method virtual fetchMessageOperations : Int64.t option -> Int64.t option -> Int32.t option -> messageOperations
  method virtual getLastReadMessageIds : string option -> lastReadMessageIds
  method virtual multiGetLastReadMessageIds : string list option -> lastReadMessageIds list
end

class client (iprot : Protocol.t) (oprot : Protocol.t) =
object (self)
  val mutable seqid = 0
  method fetchMessageOperations localRevision lastOpTimestamp count = 
    self#send_fetchMessageOperations localRevision lastOpTimestamp count;
    self#recv_fetchMessageOperations
  method private send_fetchMessageOperations localRevision lastOpTimestamp count = 
    oprot#writeMessageBegin ("fetchMessageOperations", Protocol.CALL, seqid);
    let args = new fetchMessageOperations_args in
      args#set_localRevision localRevision;
      args#set_lastOpTimestamp lastOpTimestamp;
      args#set_count count;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_fetchMessageOperations  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_fetchMessageOperations_result iprot in
        iprot#readMessageEnd;
        match result#get_success with Some v -> v | None -> (
          (match result#get_e with None -> () | Some _v ->
            raise (TalkException _v));
          raise (Application_Exn.E (Application_Exn.create Application_Exn.MISSING_RESULT "fetchMessageOperations failed: unknown result")))
  method getLastReadMessageIds chatId = 
    self#send_getLastReadMessageIds chatId;
    self#recv_getLastReadMessageIds
  method private send_getLastReadMessageIds chatId = 
    oprot#writeMessageBegin ("getLastReadMessageIds", Protocol.CALL, seqid);
    let args = new getLastReadMessageIds_args in
      args#set_chatId chatId;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_getLastReadMessageIds  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_getLastReadMessageIds_result iprot in
        iprot#readMessageEnd;
        match result#get_success with Some v -> v | None -> (
          (match result#get_e with None -> () | Some _v ->
            raise (TalkException _v));
          raise (Application_Exn.E (Application_Exn.create Application_Exn.MISSING_RESULT "getLastReadMessageIds failed: unknown result")))
  method multiGetLastReadMessageIds chatIds = 
    self#send_multiGetLastReadMessageIds chatIds;
    self#recv_multiGetLastReadMessageIds
  method private send_multiGetLastReadMessageIds chatIds = 
    oprot#writeMessageBegin ("multiGetLastReadMessageIds", Protocol.CALL, seqid);
    let args = new multiGetLastReadMessageIds_args in
      args#set_chatIds chatIds;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_multiGetLastReadMessageIds  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_multiGetLastReadMessageIds_result iprot in
        iprot#readMessageEnd;
        match result#get_success with Some v -> v | None -> (
          (match result#get_e with None -> () | Some _v ->
            raise (TalkException _v));
          raise (Application_Exn.E (Application_Exn.create Application_Exn.MISSING_RESULT "multiGetLastReadMessageIds failed: unknown result")))
end

class processor (handler : iface) =
object (self)
  inherit Processor.t

  val processMap = Hashtbl.create 3
  method process iprot oprot =
    let (name, typ, seqid)  = iprot#readMessageBegin in
      if Hashtbl.mem processMap name then
        (Hashtbl.find processMap name) (seqid, iprot, oprot)
      else (
        iprot#skip(Protocol.T_STRUCT);
        iprot#readMessageEnd;
        let x = Application_Exn.create Application_Exn.UNKNOWN_METHOD ("Unknown function "^name) in
          oprot#writeMessageBegin(name, Protocol.EXCEPTION, seqid);
          x#write oprot;
          oprot#writeMessageEnd;
          oprot#getTransport#flush
      );
      true
  method private process_fetchMessageOperations (seqid, iprot, oprot) =
    let args = read_fetchMessageOperations_args iprot in
      iprot#readMessageEnd;
      let result = new fetchMessageOperations_result in
        (try
          result#set_success (handler#fetchMessageOperations args#get_localRevision args#get_lastOpTimestamp args#get_count);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("fetchMessageOperations", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_getLastReadMessageIds (seqid, iprot, oprot) =
    let args = read_getLastReadMessageIds_args iprot in
      iprot#readMessageEnd;
      let result = new getLastReadMessageIds_result in
        (try
          result#set_success (handler#getLastReadMessageIds args#get_chatId);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("getLastReadMessageIds", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_multiGetLastReadMessageIds (seqid, iprot, oprot) =
    let args = read_multiGetLastReadMessageIds_args iprot in
      iprot#readMessageEnd;
      let result = new multiGetLastReadMessageIds_result in
        (try
          result#set_success (handler#multiGetLastReadMessageIds args#get_chatIds);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("multiGetLastReadMessageIds", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  initializer
    Hashtbl.add processMap "fetchMessageOperations" self#process_fetchMessageOperations;
    Hashtbl.add processMap "getLastReadMessageIds" self#process_getLastReadMessageIds;
    Hashtbl.add processMap "multiGetLastReadMessageIds" self#process_multiGetLastReadMessageIds;
end

