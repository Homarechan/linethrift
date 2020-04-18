(*
 Autogenerated by Thrift Compiler (0.11.0)

 DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING
*)

open Thrift
open Line_types

(* HELPER FUNCTIONS AND STRUCTURES *)

class checkUserAge_args =
object (self)
  val mutable _carrier : CarrierCode.t option = None
  method get_carrier = _carrier
  method grab_carrier = match _carrier with None->raise (Field_empty "checkUserAge_args.carrier") | Some _x4158 -> _x4158
  method set_carrier _x4158 = _carrier <- Some _x4158
  method unset_carrier = _carrier <- None
  method reset_carrier = _carrier <- None

  val mutable _sessionId : string option = None
  method get_sessionId = _sessionId
  method grab_sessionId = match _sessionId with None->raise (Field_empty "checkUserAge_args.sessionId") | Some _x4159 -> _x4159
  method set_sessionId _x4159 = _sessionId <- Some _x4159
  method unset_sessionId = _sessionId <- None
  method reset_sessionId = _sessionId <- None

  val mutable _verifier : string option = None
  method get_verifier = _verifier
  method grab_verifier = match _verifier with None->raise (Field_empty "checkUserAge_args.verifier") | Some _x4160 -> _x4160
  method set_verifier _x4160 = _verifier <- Some _x4160
  method unset_verifier = _verifier <- None
  method reset_verifier = _verifier <- None

  val mutable _standardAge : Int32.t option = None
  method get_standardAge = _standardAge
  method grab_standardAge = match _standardAge with None->raise (Field_empty "checkUserAge_args.standardAge") | Some _x4161 -> _x4161
  method set_standardAge _x4161 = _standardAge <- Some _x4161
  method unset_standardAge = _standardAge <- None
  method reset_standardAge = _standardAge <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "checkUserAge_args";
    (match _carrier with None -> () | Some _v -> 
      oprot#writeFieldBegin("carrier",Protocol.T_I32,2);
      oprot#writeI32(CarrierCode.to_i _v);
      oprot#writeFieldEnd
    );
    (match _sessionId with None -> () | Some _v -> 
      oprot#writeFieldBegin("sessionId",Protocol.T_STRING,3);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _verifier with None -> () | Some _v -> 
      oprot#writeFieldBegin("verifier",Protocol.T_STRING,4);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _standardAge with None -> () | Some _v -> 
      oprot#writeFieldBegin("standardAge",Protocol.T_I32,5);
      oprot#writeI32(_v);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_checkUserAge_args (iprot : Protocol.t) =
  let _str4164 = new checkUserAge_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4165,_id4166) = iprot#readFieldBegin in
        if _t4165 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4166 with 
          | 2 -> (if _t4165 = Protocol.T_I32 then
              _str4164#set_carrier (CarrierCode.of_i iprot#readI32)
            else
              iprot#skip _t4165)
          | 3 -> (if _t4165 = Protocol.T_STRING then
              _str4164#set_sessionId iprot#readString
            else
              iprot#skip _t4165)
          | 4 -> (if _t4165 = Protocol.T_STRING then
              _str4164#set_verifier iprot#readString
            else
              iprot#skip _t4165)
          | 5 -> (if _t4165 = Protocol.T_I32 then
              _str4164#set_standardAge iprot#readI32
            else
              iprot#skip _t4165)
          | _ -> iprot#skip _t4165);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4164

class checkUserAge_result =
object (self)
  val mutable _success : UserAgeType.t option = None
  method get_success = _success
  method grab_success = match _success with None->raise (Field_empty "checkUserAge_result.success") | Some _x4167 -> _x4167
  method set_success _x4167 = _success <- Some _x4167
  method unset_success = _success <- None
  method reset_success = _success <- None

  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "checkUserAge_result.e") | Some _x4168 -> _x4168
  method set_e _x4168 = _e <- Some _x4168
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "checkUserAge_result";
    (match _success with None -> () | Some _v -> 
      oprot#writeFieldBegin("success",Protocol.T_I32,0);
      oprot#writeI32(UserAgeType.to_i _v);
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
let rec read_checkUserAge_result (iprot : Protocol.t) =
  let _str4171 = new checkUserAge_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4172,_id4173) = iprot#readFieldBegin in
        if _t4172 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4173 with 
          | 0 -> (if _t4172 = Protocol.T_I32 then
              _str4171#set_success (UserAgeType.of_i iprot#readI32)
            else
              iprot#skip _t4172)
          | 1 -> (if _t4172 = Protocol.T_STRUCT then
              _str4171#set_e (read_talkException iprot)
            else
              iprot#skip _t4172)
          | _ -> iprot#skip _t4172);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4171

class checkUserAgeWithDocomo_args =
object (self)
  val mutable _openIdRedirectUrl : string option = None
  method get_openIdRedirectUrl = _openIdRedirectUrl
  method grab_openIdRedirectUrl = match _openIdRedirectUrl with None->raise (Field_empty "checkUserAgeWithDocomo_args.openIdRedirectUrl") | Some _x4174 -> _x4174
  method set_openIdRedirectUrl _x4174 = _openIdRedirectUrl <- Some _x4174
  method unset_openIdRedirectUrl = _openIdRedirectUrl <- None
  method reset_openIdRedirectUrl = _openIdRedirectUrl <- None

  val mutable _standardAge : Int32.t option = None
  method get_standardAge = _standardAge
  method grab_standardAge = match _standardAge with None->raise (Field_empty "checkUserAgeWithDocomo_args.standardAge") | Some _x4175 -> _x4175
  method set_standardAge _x4175 = _standardAge <- Some _x4175
  method unset_standardAge = _standardAge <- None
  method reset_standardAge = _standardAge <- None

  val mutable _verifier : string option = None
  method get_verifier = _verifier
  method grab_verifier = match _verifier with None->raise (Field_empty "checkUserAgeWithDocomo_args.verifier") | Some _x4176 -> _x4176
  method set_verifier _x4176 = _verifier <- Some _x4176
  method unset_verifier = _verifier <- None
  method reset_verifier = _verifier <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "checkUserAgeWithDocomo_args";
    (match _openIdRedirectUrl with None -> () | Some _v -> 
      oprot#writeFieldBegin("openIdRedirectUrl",Protocol.T_STRING,2);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _standardAge with None -> () | Some _v -> 
      oprot#writeFieldBegin("standardAge",Protocol.T_I32,3);
      oprot#writeI32(_v);
      oprot#writeFieldEnd
    );
    (match _verifier with None -> () | Some _v -> 
      oprot#writeFieldBegin("verifier",Protocol.T_STRING,4);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_checkUserAgeWithDocomo_args (iprot : Protocol.t) =
  let _str4179 = new checkUserAgeWithDocomo_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4180,_id4181) = iprot#readFieldBegin in
        if _t4180 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4181 with 
          | 2 -> (if _t4180 = Protocol.T_STRING then
              _str4179#set_openIdRedirectUrl iprot#readString
            else
              iprot#skip _t4180)
          | 3 -> (if _t4180 = Protocol.T_I32 then
              _str4179#set_standardAge iprot#readI32
            else
              iprot#skip _t4180)
          | 4 -> (if _t4180 = Protocol.T_STRING then
              _str4179#set_verifier iprot#readString
            else
              iprot#skip _t4180)
          | _ -> iprot#skip _t4180);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4179

class checkUserAgeWithDocomo_result =
object (self)
  val mutable _success : ageCheckDocomoResult option = None
  method get_success = _success
  method grab_success = match _success with None->raise (Field_empty "checkUserAgeWithDocomo_result.success") | Some _x4182 -> _x4182
  method set_success _x4182 = _success <- Some _x4182
  method unset_success = _success <- None
  method reset_success = _success <- None

  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "checkUserAgeWithDocomo_result.e") | Some _x4183 -> _x4183
  method set_e _x4183 = _e <- Some _x4183
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
    oprot#writeStructBegin "checkUserAgeWithDocomo_result";
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
let rec read_checkUserAgeWithDocomo_result (iprot : Protocol.t) =
  let _str4186 = new checkUserAgeWithDocomo_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4187,_id4188) = iprot#readFieldBegin in
        if _t4187 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4188 with 
          | 0 -> (if _t4187 = Protocol.T_STRUCT then
              _str4186#set_success (read_ageCheckDocomoResult iprot)
            else
              iprot#skip _t4187)
          | 1 -> (if _t4187 = Protocol.T_STRUCT then
              _str4186#set_e (read_talkException iprot)
            else
              iprot#skip _t4187)
          | _ -> iprot#skip _t4187);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4186

class retrieveOpenIdAuthUrlWithDocomo_args =
object (self)
  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "retrieveOpenIdAuthUrlWithDocomo_args";
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_retrieveOpenIdAuthUrlWithDocomo_args (iprot : Protocol.t) =
  let _str4191 = new retrieveOpenIdAuthUrlWithDocomo_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4192,_id4193) = iprot#readFieldBegin in
        if _t4192 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4193 with 
          | _ -> iprot#skip _t4192);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4191

class retrieveOpenIdAuthUrlWithDocomo_result =
object (self)
  val mutable _success : string option = None
  method get_success = _success
  method grab_success = match _success with None->raise (Field_empty "retrieveOpenIdAuthUrlWithDocomo_result.success") | Some _x4194 -> _x4194
  method set_success _x4194 = _success <- Some _x4194
  method unset_success = _success <- None
  method reset_success = _success <- None

  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "retrieveOpenIdAuthUrlWithDocomo_result.e") | Some _x4195 -> _x4195
  method set_e _x4195 = _e <- Some _x4195
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "retrieveOpenIdAuthUrlWithDocomo_result";
    (match _success with None -> () | Some _v -> 
      oprot#writeFieldBegin("success",Protocol.T_STRING,0);
      oprot#writeString(_v);
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
let rec read_retrieveOpenIdAuthUrlWithDocomo_result (iprot : Protocol.t) =
  let _str4198 = new retrieveOpenIdAuthUrlWithDocomo_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4199,_id4200) = iprot#readFieldBegin in
        if _t4199 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4200 with 
          | 0 -> (if _t4199 = Protocol.T_STRING then
              _str4198#set_success iprot#readString
            else
              iprot#skip _t4199)
          | 1 -> (if _t4199 = Protocol.T_STRUCT then
              _str4198#set_e (read_talkException iprot)
            else
              iprot#skip _t4199)
          | _ -> iprot#skip _t4199);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4198

class retrieveRequestToken_args =
object (self)
  val mutable _carrier : CarrierCode.t option = None
  method get_carrier = _carrier
  method grab_carrier = match _carrier with None->raise (Field_empty "retrieveRequestToken_args.carrier") | Some _x4201 -> _x4201
  method set_carrier _x4201 = _carrier <- Some _x4201
  method unset_carrier = _carrier <- None
  method reset_carrier = _carrier <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "retrieveRequestToken_args";
    (match _carrier with None -> () | Some _v -> 
      oprot#writeFieldBegin("carrier",Protocol.T_I32,2);
      oprot#writeI32(CarrierCode.to_i _v);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_retrieveRequestToken_args (iprot : Protocol.t) =
  let _str4204 = new retrieveRequestToken_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4205,_id4206) = iprot#readFieldBegin in
        if _t4205 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4206 with 
          | 2 -> (if _t4205 = Protocol.T_I32 then
              _str4204#set_carrier (CarrierCode.of_i iprot#readI32)
            else
              iprot#skip _t4205)
          | _ -> iprot#skip _t4205);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4204

class retrieveRequestToken_result =
object (self)
  val mutable _success : ageCheckRequestResult option = None
  method get_success = _success
  method grab_success = match _success with None->raise (Field_empty "retrieveRequestToken_result.success") | Some _x4207 -> _x4207
  method set_success _x4207 = _success <- Some _x4207
  method unset_success = _success <- None
  method reset_success = _success <- None

  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "retrieveRequestToken_result.e") | Some _x4208 -> _x4208
  method set_e _x4208 = _e <- Some _x4208
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
    oprot#writeStructBegin "retrieveRequestToken_result";
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
let rec read_retrieveRequestToken_result (iprot : Protocol.t) =
  let _str4211 = new retrieveRequestToken_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4212,_id4213) = iprot#readFieldBegin in
        if _t4212 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4213 with 
          | 0 -> (if _t4212 = Protocol.T_STRUCT then
              _str4211#set_success (read_ageCheckRequestResult iprot)
            else
              iprot#skip _t4212)
          | 1 -> (if _t4212 = Protocol.T_STRUCT then
              _str4211#set_e (read_talkException iprot)
            else
              iprot#skip _t4212)
          | _ -> iprot#skip _t4212);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4211

class virtual iface =
object (self)
  method virtual checkUserAge : CarrierCode.t option -> string option -> string option -> Int32.t option -> UserAgeType.t
  method virtual checkUserAgeWithDocomo : string option -> Int32.t option -> string option -> ageCheckDocomoResult
  method virtual retrieveOpenIdAuthUrlWithDocomo : string
  method virtual retrieveRequestToken : CarrierCode.t option -> ageCheckRequestResult
end

class client (iprot : Protocol.t) (oprot : Protocol.t) =
object (self)
  val mutable seqid = 0
  method checkUserAge carrier sessionId verifier standardAge = 
    self#send_checkUserAge carrier sessionId verifier standardAge;
    self#recv_checkUserAge
  method private send_checkUserAge carrier sessionId verifier standardAge = 
    oprot#writeMessageBegin ("checkUserAge", Protocol.CALL, seqid);
    let args = new checkUserAge_args in
      args#set_carrier carrier;
      args#set_sessionId sessionId;
      args#set_verifier verifier;
      args#set_standardAge standardAge;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_checkUserAge  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_checkUserAge_result iprot in
        iprot#readMessageEnd;
        match result#get_success with Some v -> v | None -> (
          (match result#get_e with None -> () | Some _v ->
            raise (TalkException _v));
          raise (Application_Exn.E (Application_Exn.create Application_Exn.MISSING_RESULT "checkUserAge failed: unknown result")))
  method checkUserAgeWithDocomo openIdRedirectUrl standardAge verifier = 
    self#send_checkUserAgeWithDocomo openIdRedirectUrl standardAge verifier;
    self#recv_checkUserAgeWithDocomo
  method private send_checkUserAgeWithDocomo openIdRedirectUrl standardAge verifier = 
    oprot#writeMessageBegin ("checkUserAgeWithDocomo", Protocol.CALL, seqid);
    let args = new checkUserAgeWithDocomo_args in
      args#set_openIdRedirectUrl openIdRedirectUrl;
      args#set_standardAge standardAge;
      args#set_verifier verifier;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_checkUserAgeWithDocomo  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_checkUserAgeWithDocomo_result iprot in
        iprot#readMessageEnd;
        match result#get_success with Some v -> v | None -> (
          (match result#get_e with None -> () | Some _v ->
            raise (TalkException _v));
          raise (Application_Exn.E (Application_Exn.create Application_Exn.MISSING_RESULT "checkUserAgeWithDocomo failed: unknown result")))
  method retrieveOpenIdAuthUrlWithDocomo  = 
    self#send_retrieveOpenIdAuthUrlWithDocomo;
    self#recv_retrieveOpenIdAuthUrlWithDocomo
  method private send_retrieveOpenIdAuthUrlWithDocomo  = 
    oprot#writeMessageBegin ("retrieveOpenIdAuthUrlWithDocomo", Protocol.CALL, seqid);
    let args = new retrieveOpenIdAuthUrlWithDocomo_args in
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_retrieveOpenIdAuthUrlWithDocomo  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_retrieveOpenIdAuthUrlWithDocomo_result iprot in
        iprot#readMessageEnd;
        match result#get_success with Some v -> v | None -> (
          (match result#get_e with None -> () | Some _v ->
            raise (TalkException _v));
          raise (Application_Exn.E (Application_Exn.create Application_Exn.MISSING_RESULT "retrieveOpenIdAuthUrlWithDocomo failed: unknown result")))
  method retrieveRequestToken carrier = 
    self#send_retrieveRequestToken carrier;
    self#recv_retrieveRequestToken
  method private send_retrieveRequestToken carrier = 
    oprot#writeMessageBegin ("retrieveRequestToken", Protocol.CALL, seqid);
    let args = new retrieveRequestToken_args in
      args#set_carrier carrier;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_retrieveRequestToken  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_retrieveRequestToken_result iprot in
        iprot#readMessageEnd;
        match result#get_success with Some v -> v | None -> (
          (match result#get_e with None -> () | Some _v ->
            raise (TalkException _v));
          raise (Application_Exn.E (Application_Exn.create Application_Exn.MISSING_RESULT "retrieveRequestToken failed: unknown result")))
end

class processor (handler : iface) =
object (self)
  inherit Processor.t

  val processMap = Hashtbl.create 4
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
  method private process_checkUserAge (seqid, iprot, oprot) =
    let args = read_checkUserAge_args iprot in
      iprot#readMessageEnd;
      let result = new checkUserAge_result in
        (try
          result#set_success (handler#checkUserAge args#get_carrier args#get_sessionId args#get_verifier args#get_standardAge);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("checkUserAge", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_checkUserAgeWithDocomo (seqid, iprot, oprot) =
    let args = read_checkUserAgeWithDocomo_args iprot in
      iprot#readMessageEnd;
      let result = new checkUserAgeWithDocomo_result in
        (try
          result#set_success (handler#checkUserAgeWithDocomo args#get_openIdRedirectUrl args#get_standardAge args#get_verifier);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("checkUserAgeWithDocomo", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_retrieveOpenIdAuthUrlWithDocomo (seqid, iprot, oprot) =
    let _ = read_retrieveOpenIdAuthUrlWithDocomo_args iprot in
      iprot#readMessageEnd;
      let result = new retrieveOpenIdAuthUrlWithDocomo_result in
        (try
          result#set_success (handler#retrieveOpenIdAuthUrlWithDocomo);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("retrieveOpenIdAuthUrlWithDocomo", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_retrieveRequestToken (seqid, iprot, oprot) =
    let args = read_retrieveRequestToken_args iprot in
      iprot#readMessageEnd;
      let result = new retrieveRequestToken_result in
        (try
          result#set_success (handler#retrieveRequestToken args#get_carrier);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("retrieveRequestToken", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  initializer
    Hashtbl.add processMap "checkUserAge" self#process_checkUserAge;
    Hashtbl.add processMap "checkUserAgeWithDocomo" self#process_checkUserAgeWithDocomo;
    Hashtbl.add processMap "retrieveOpenIdAuthUrlWithDocomo" self#process_retrieveOpenIdAuthUrlWithDocomo;
    Hashtbl.add processMap "retrieveRequestToken" self#process_retrieveRequestToken;
end

