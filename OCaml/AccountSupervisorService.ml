(*
 Autogenerated by Thrift Compiler (0.14.0)

 DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING
*)

open Thrift
open Line_types

(* HELPER FUNCTIONS AND STRUCTURES *)

class getRSAKey_args =
object (self)
  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "getRSAKey_args";
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_getRSAKey_args (iprot : Protocol.t) =
  let _str3991 = new getRSAKey_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t3992,_id3993) = iprot#readFieldBegin in
        if _t3992 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id3993 with 
          | _ -> iprot#skip _t3992);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str3991

class getRSAKey_result =
object (self)
  val mutable _success : rSAKey option = None
  method get_success = _success
  method grab_success = match _success with None->raise (Field_empty "getRSAKey_result.success") | Some _x3994 -> _x3994
  method set_success _x3994 = _success <- Some _x3994
  method unset_success = _success <- None
  method reset_success = _success <- None

  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "getRSAKey_result.e") | Some _x3995 -> _x3995
  method set_e _x3995 = _e <- Some _x3995
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
    oprot#writeStructBegin "getRSAKey_result";
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
let rec read_getRSAKey_result (iprot : Protocol.t) =
  let _str3998 = new getRSAKey_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t3999,_id4000) = iprot#readFieldBegin in
        if _t3999 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4000 with 
          | 0 -> (if _t3999 = Protocol.T_STRUCT then
              _str3998#set_success (read_rSAKey iprot)
            else
              iprot#skip _t3999)
          | 1 -> (if _t3999 = Protocol.T_STRUCT then
              _str3998#set_e (read_talkException iprot)
            else
              iprot#skip _t3999)
          | _ -> iprot#skip _t3999);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str3998

class notifyEmailConfirmationResult_args =
object (self)
  val mutable _parameterMap : (string,string) Hashtbl.t option = None
  method get_parameterMap = _parameterMap
  method grab_parameterMap = match _parameterMap with None->raise (Field_empty "notifyEmailConfirmationResult_args.parameterMap") | Some _x4001 -> _x4001
  method set_parameterMap _x4001 = _parameterMap <- Some _x4001
  method unset_parameterMap = _parameterMap <- None
  method reset_parameterMap = _parameterMap <- None

  method copy =
      let _new = Oo.copy self in
      if _parameterMap <> None then
        _new#set_parameterMap (Hashtbl.copy self#grab_parameterMap);
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "notifyEmailConfirmationResult_args";
    (match _parameterMap with None -> () | Some _v -> 
      oprot#writeFieldBegin("parameterMap",Protocol.T_MAP,2);
      oprot#writeMapBegin(Protocol.T_STRING,Protocol.T_STRING,Hashtbl.length _v);
      Hashtbl.iter (fun _kiter4004 -> fun _viter4005 -> 
        oprot#writeString(_kiter4004);
        oprot#writeString(_viter4005);
      ) _v;
      oprot#writeMapEnd;
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_notifyEmailConfirmationResult_args (iprot : Protocol.t) =
  let _str4006 = new notifyEmailConfirmationResult_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4007,_id4008) = iprot#readFieldBegin in
        if _t4007 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4008 with 
          | 2 -> (if _t4007 = Protocol.T_MAP then
              _str4006#set_parameterMap 
                (let (_ktype4010,_vtype4011,_size4009) = iprot#readMapBegin in
                let _con4013 = Hashtbl.create _size4009 in
                  for i = 1 to _size4009 do
                    let _k = iprot#readString in
                    let _v = iprot#readString in
                      Hashtbl.add _con4013 _k _v
                  done; iprot#readMapEnd; _con4013)
            else
              iprot#skip _t4007)
          | _ -> iprot#skip _t4007);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4006

class notifyEmailConfirmationResult_result =
object (self)
  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "notifyEmailConfirmationResult_result.e") | Some _x4014 -> _x4014
  method set_e _x4014 = _e <- Some _x4014
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "notifyEmailConfirmationResult_result";
    (match _e with None -> () | Some _v -> 
      oprot#writeFieldBegin("e",Protocol.T_STRUCT,1);
      _v#write(oprot);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_notifyEmailConfirmationResult_result (iprot : Protocol.t) =
  let _str4017 = new notifyEmailConfirmationResult_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4018,_id4019) = iprot#readFieldBegin in
        if _t4018 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4019 with 
          | 1 -> (if _t4018 = Protocol.T_STRUCT then
              _str4017#set_e (read_talkException iprot)
            else
              iprot#skip _t4018)
          | _ -> iprot#skip _t4018);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4017

class registerVirtualAccount_args =
object (self)
  val mutable _locale : string option = None
  method get_locale = _locale
  method grab_locale = match _locale with None->raise (Field_empty "registerVirtualAccount_args.locale") | Some _x4020 -> _x4020
  method set_locale _x4020 = _locale <- Some _x4020
  method unset_locale = _locale <- None
  method reset_locale = _locale <- None

  val mutable _encryptedVirtualUserId : string option = None
  method get_encryptedVirtualUserId = _encryptedVirtualUserId
  method grab_encryptedVirtualUserId = match _encryptedVirtualUserId with None->raise (Field_empty "registerVirtualAccount_args.encryptedVirtualUserId") | Some _x4021 -> _x4021
  method set_encryptedVirtualUserId _x4021 = _encryptedVirtualUserId <- Some _x4021
  method unset_encryptedVirtualUserId = _encryptedVirtualUserId <- None
  method reset_encryptedVirtualUserId = _encryptedVirtualUserId <- None

  val mutable _encryptedPassword : string option = None
  method get_encryptedPassword = _encryptedPassword
  method grab_encryptedPassword = match _encryptedPassword with None->raise (Field_empty "registerVirtualAccount_args.encryptedPassword") | Some _x4022 -> _x4022
  method set_encryptedPassword _x4022 = _encryptedPassword <- Some _x4022
  method unset_encryptedPassword = _encryptedPassword <- None
  method reset_encryptedPassword = _encryptedPassword <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "registerVirtualAccount_args";
    (match _locale with None -> () | Some _v -> 
      oprot#writeFieldBegin("locale",Protocol.T_STRING,2);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _encryptedVirtualUserId with None -> () | Some _v -> 
      oprot#writeFieldBegin("encryptedVirtualUserId",Protocol.T_STRING,3);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _encryptedPassword with None -> () | Some _v -> 
      oprot#writeFieldBegin("encryptedPassword",Protocol.T_STRING,4);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_registerVirtualAccount_args (iprot : Protocol.t) =
  let _str4025 = new registerVirtualAccount_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4026,_id4027) = iprot#readFieldBegin in
        if _t4026 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4027 with 
          | 2 -> (if _t4026 = Protocol.T_STRING then
              _str4025#set_locale iprot#readString
            else
              iprot#skip _t4026)
          | 3 -> (if _t4026 = Protocol.T_STRING then
              _str4025#set_encryptedVirtualUserId iprot#readString
            else
              iprot#skip _t4026)
          | 4 -> (if _t4026 = Protocol.T_STRING then
              _str4025#set_encryptedPassword iprot#readString
            else
              iprot#skip _t4026)
          | _ -> iprot#skip _t4026);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4025

class registerVirtualAccount_result =
object (self)
  val mutable _success : string option = None
  method get_success = _success
  method grab_success = match _success with None->raise (Field_empty "registerVirtualAccount_result.success") | Some _x4028 -> _x4028
  method set_success _x4028 = _success <- Some _x4028
  method unset_success = _success <- None
  method reset_success = _success <- None

  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "registerVirtualAccount_result.e") | Some _x4029 -> _x4029
  method set_e _x4029 = _e <- Some _x4029
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "registerVirtualAccount_result";
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
let rec read_registerVirtualAccount_result (iprot : Protocol.t) =
  let _str4032 = new registerVirtualAccount_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4033,_id4034) = iprot#readFieldBegin in
        if _t4033 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4034 with 
          | 0 -> (if _t4033 = Protocol.T_STRING then
              _str4032#set_success iprot#readString
            else
              iprot#skip _t4033)
          | 1 -> (if _t4033 = Protocol.T_STRUCT then
              _str4032#set_e (read_talkException iprot)
            else
              iprot#skip _t4033)
          | _ -> iprot#skip _t4033);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4032

class requestVirtualAccountPasswordChange_args =
object (self)
  val mutable _virtualMid : string option = None
  method get_virtualMid = _virtualMid
  method grab_virtualMid = match _virtualMid with None->raise (Field_empty "requestVirtualAccountPasswordChange_args.virtualMid") | Some _x4035 -> _x4035
  method set_virtualMid _x4035 = _virtualMid <- Some _x4035
  method unset_virtualMid = _virtualMid <- None
  method reset_virtualMid = _virtualMid <- None

  val mutable _encryptedVirtualUserId : string option = None
  method get_encryptedVirtualUserId = _encryptedVirtualUserId
  method grab_encryptedVirtualUserId = match _encryptedVirtualUserId with None->raise (Field_empty "requestVirtualAccountPasswordChange_args.encryptedVirtualUserId") | Some _x4036 -> _x4036
  method set_encryptedVirtualUserId _x4036 = _encryptedVirtualUserId <- Some _x4036
  method unset_encryptedVirtualUserId = _encryptedVirtualUserId <- None
  method reset_encryptedVirtualUserId = _encryptedVirtualUserId <- None

  val mutable _encryptedOldPassword : string option = None
  method get_encryptedOldPassword = _encryptedOldPassword
  method grab_encryptedOldPassword = match _encryptedOldPassword with None->raise (Field_empty "requestVirtualAccountPasswordChange_args.encryptedOldPassword") | Some _x4037 -> _x4037
  method set_encryptedOldPassword _x4037 = _encryptedOldPassword <- Some _x4037
  method unset_encryptedOldPassword = _encryptedOldPassword <- None
  method reset_encryptedOldPassword = _encryptedOldPassword <- None

  val mutable _encryptedNewPassword : string option = None
  method get_encryptedNewPassword = _encryptedNewPassword
  method grab_encryptedNewPassword = match _encryptedNewPassword with None->raise (Field_empty "requestVirtualAccountPasswordChange_args.encryptedNewPassword") | Some _x4038 -> _x4038
  method set_encryptedNewPassword _x4038 = _encryptedNewPassword <- Some _x4038
  method unset_encryptedNewPassword = _encryptedNewPassword <- None
  method reset_encryptedNewPassword = _encryptedNewPassword <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "requestVirtualAccountPasswordChange_args";
    (match _virtualMid with None -> () | Some _v -> 
      oprot#writeFieldBegin("virtualMid",Protocol.T_STRING,2);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _encryptedVirtualUserId with None -> () | Some _v -> 
      oprot#writeFieldBegin("encryptedVirtualUserId",Protocol.T_STRING,3);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _encryptedOldPassword with None -> () | Some _v -> 
      oprot#writeFieldBegin("encryptedOldPassword",Protocol.T_STRING,4);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _encryptedNewPassword with None -> () | Some _v -> 
      oprot#writeFieldBegin("encryptedNewPassword",Protocol.T_STRING,5);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_requestVirtualAccountPasswordChange_args (iprot : Protocol.t) =
  let _str4041 = new requestVirtualAccountPasswordChange_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4042,_id4043) = iprot#readFieldBegin in
        if _t4042 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4043 with 
          | 2 -> (if _t4042 = Protocol.T_STRING then
              _str4041#set_virtualMid iprot#readString
            else
              iprot#skip _t4042)
          | 3 -> (if _t4042 = Protocol.T_STRING then
              _str4041#set_encryptedVirtualUserId iprot#readString
            else
              iprot#skip _t4042)
          | 4 -> (if _t4042 = Protocol.T_STRING then
              _str4041#set_encryptedOldPassword iprot#readString
            else
              iprot#skip _t4042)
          | 5 -> (if _t4042 = Protocol.T_STRING then
              _str4041#set_encryptedNewPassword iprot#readString
            else
              iprot#skip _t4042)
          | _ -> iprot#skip _t4042);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4041

class requestVirtualAccountPasswordChange_result =
object (self)
  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "requestVirtualAccountPasswordChange_result.e") | Some _x4044 -> _x4044
  method set_e _x4044 = _e <- Some _x4044
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "requestVirtualAccountPasswordChange_result";
    (match _e with None -> () | Some _v -> 
      oprot#writeFieldBegin("e",Protocol.T_STRUCT,1);
      _v#write(oprot);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_requestVirtualAccountPasswordChange_result (iprot : Protocol.t) =
  let _str4047 = new requestVirtualAccountPasswordChange_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4048,_id4049) = iprot#readFieldBegin in
        if _t4048 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4049 with 
          | 1 -> (if _t4048 = Protocol.T_STRUCT then
              _str4047#set_e (read_talkException iprot)
            else
              iprot#skip _t4048)
          | _ -> iprot#skip _t4048);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4047

class requestVirtualAccountPasswordSet_args =
object (self)
  val mutable _virtualMid : string option = None
  method get_virtualMid = _virtualMid
  method grab_virtualMid = match _virtualMid with None->raise (Field_empty "requestVirtualAccountPasswordSet_args.virtualMid") | Some _x4050 -> _x4050
  method set_virtualMid _x4050 = _virtualMid <- Some _x4050
  method unset_virtualMid = _virtualMid <- None
  method reset_virtualMid = _virtualMid <- None

  val mutable _encryptedVirtualUserId : string option = None
  method get_encryptedVirtualUserId = _encryptedVirtualUserId
  method grab_encryptedVirtualUserId = match _encryptedVirtualUserId with None->raise (Field_empty "requestVirtualAccountPasswordSet_args.encryptedVirtualUserId") | Some _x4051 -> _x4051
  method set_encryptedVirtualUserId _x4051 = _encryptedVirtualUserId <- Some _x4051
  method unset_encryptedVirtualUserId = _encryptedVirtualUserId <- None
  method reset_encryptedVirtualUserId = _encryptedVirtualUserId <- None

  val mutable _encryptedNewPassword : string option = None
  method get_encryptedNewPassword = _encryptedNewPassword
  method grab_encryptedNewPassword = match _encryptedNewPassword with None->raise (Field_empty "requestVirtualAccountPasswordSet_args.encryptedNewPassword") | Some _x4052 -> _x4052
  method set_encryptedNewPassword _x4052 = _encryptedNewPassword <- Some _x4052
  method unset_encryptedNewPassword = _encryptedNewPassword <- None
  method reset_encryptedNewPassword = _encryptedNewPassword <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "requestVirtualAccountPasswordSet_args";
    (match _virtualMid with None -> () | Some _v -> 
      oprot#writeFieldBegin("virtualMid",Protocol.T_STRING,2);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _encryptedVirtualUserId with None -> () | Some _v -> 
      oprot#writeFieldBegin("encryptedVirtualUserId",Protocol.T_STRING,3);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    (match _encryptedNewPassword with None -> () | Some _v -> 
      oprot#writeFieldBegin("encryptedNewPassword",Protocol.T_STRING,4);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_requestVirtualAccountPasswordSet_args (iprot : Protocol.t) =
  let _str4055 = new requestVirtualAccountPasswordSet_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4056,_id4057) = iprot#readFieldBegin in
        if _t4056 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4057 with 
          | 2 -> (if _t4056 = Protocol.T_STRING then
              _str4055#set_virtualMid iprot#readString
            else
              iprot#skip _t4056)
          | 3 -> (if _t4056 = Protocol.T_STRING then
              _str4055#set_encryptedVirtualUserId iprot#readString
            else
              iprot#skip _t4056)
          | 4 -> (if _t4056 = Protocol.T_STRING then
              _str4055#set_encryptedNewPassword iprot#readString
            else
              iprot#skip _t4056)
          | _ -> iprot#skip _t4056);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4055

class requestVirtualAccountPasswordSet_result =
object (self)
  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "requestVirtualAccountPasswordSet_result.e") | Some _x4058 -> _x4058
  method set_e _x4058 = _e <- Some _x4058
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "requestVirtualAccountPasswordSet_result";
    (match _e with None -> () | Some _v -> 
      oprot#writeFieldBegin("e",Protocol.T_STRUCT,1);
      _v#write(oprot);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_requestVirtualAccountPasswordSet_result (iprot : Protocol.t) =
  let _str4061 = new requestVirtualAccountPasswordSet_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4062,_id4063) = iprot#readFieldBegin in
        if _t4062 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4063 with 
          | 1 -> (if _t4062 = Protocol.T_STRUCT then
              _str4061#set_e (read_talkException iprot)
            else
              iprot#skip _t4062)
          | _ -> iprot#skip _t4062);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4061

class unregisterVirtualAccount_args =
object (self)
  val mutable _virtualMid : string option = None
  method get_virtualMid = _virtualMid
  method grab_virtualMid = match _virtualMid with None->raise (Field_empty "unregisterVirtualAccount_args.virtualMid") | Some _x4064 -> _x4064
  method set_virtualMid _x4064 = _virtualMid <- Some _x4064
  method unset_virtualMid = _virtualMid <- None
  method reset_virtualMid = _virtualMid <- None

  method copy =
      let _new = Oo.copy self in
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "unregisterVirtualAccount_args";
    (match _virtualMid with None -> () | Some _v -> 
      oprot#writeFieldBegin("virtualMid",Protocol.T_STRING,2);
      oprot#writeString(_v);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_unregisterVirtualAccount_args (iprot : Protocol.t) =
  let _str4067 = new unregisterVirtualAccount_args in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4068,_id4069) = iprot#readFieldBegin in
        if _t4068 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4069 with 
          | 2 -> (if _t4068 = Protocol.T_STRING then
              _str4067#set_virtualMid iprot#readString
            else
              iprot#skip _t4068)
          | _ -> iprot#skip _t4068);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4067

class unregisterVirtualAccount_result =
object (self)
  val mutable _e : talkException option = None
  method get_e = _e
  method grab_e = match _e with None->raise (Field_empty "unregisterVirtualAccount_result.e") | Some _x4070 -> _x4070
  method set_e _x4070 = _e <- Some _x4070
  method unset_e = _e <- None
  method reset_e = _e <- None

  method copy =
      let _new = Oo.copy self in
      if _e <> None then
        _new#set_e self#grab_e#copy;
    _new
  method write (oprot : Protocol.t) =
    oprot#writeStructBegin "unregisterVirtualAccount_result";
    (match _e with None -> () | Some _v -> 
      oprot#writeFieldBegin("e",Protocol.T_STRUCT,1);
      _v#write(oprot);
      oprot#writeFieldEnd
    );
    oprot#writeFieldStop;
    oprot#writeStructEnd
end
let rec read_unregisterVirtualAccount_result (iprot : Protocol.t) =
  let _str4073 = new unregisterVirtualAccount_result in
    ignore(iprot#readStructBegin);
    (try while true do
        let (_,_t4074,_id4075) = iprot#readFieldBegin in
        if _t4074 = Protocol.T_STOP then
          raise Break
        else ();
        (match _id4075 with 
          | 1 -> (if _t4074 = Protocol.T_STRUCT then
              _str4073#set_e (read_talkException iprot)
            else
              iprot#skip _t4074)
          | _ -> iprot#skip _t4074);
        iprot#readFieldEnd;
      done; ()
    with Break -> ());
    iprot#readStructEnd;
    _str4073

class virtual iface =
object (self)
  method virtual getRSAKey : rSAKey
  method virtual notifyEmailConfirmationResult : (string,string) Hashtbl.t option -> unit
  method virtual registerVirtualAccount : string option -> string option -> string option -> string
  method virtual requestVirtualAccountPasswordChange : string option -> string option -> string option -> string option -> unit
  method virtual requestVirtualAccountPasswordSet : string option -> string option -> string option -> unit
  method virtual unregisterVirtualAccount : string option -> unit
end

class client (iprot : Protocol.t) (oprot : Protocol.t) =
object (self)
  val mutable seqid = 0
  method getRSAKey  = 
    self#send_getRSAKey;
    self#recv_getRSAKey
  method private send_getRSAKey  = 
    oprot#writeMessageBegin ("getRSAKey", Protocol.CALL, seqid);
    let args = new getRSAKey_args in
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_getRSAKey  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_getRSAKey_result iprot in
        iprot#readMessageEnd;
        match result#get_success with Some v -> v | None -> (
          (match result#get_e with None -> () | Some _v ->
            raise (TalkException _v));
          raise (Application_Exn.E (Application_Exn.create Application_Exn.MISSING_RESULT "getRSAKey failed: unknown result")))
  method notifyEmailConfirmationResult parameterMap = 
    self#send_notifyEmailConfirmationResult parameterMap;
    self#recv_notifyEmailConfirmationResult
  method private send_notifyEmailConfirmationResult parameterMap = 
    oprot#writeMessageBegin ("notifyEmailConfirmationResult", Protocol.CALL, seqid);
    let args = new notifyEmailConfirmationResult_args in
      args#set_parameterMap parameterMap;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_notifyEmailConfirmationResult  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_notifyEmailConfirmationResult_result iprot in
        iprot#readMessageEnd;
        (match result#get_e with None -> () | Some _v ->
          raise (TalkException _v));
        ()
  method registerVirtualAccount locale encryptedVirtualUserId encryptedPassword = 
    self#send_registerVirtualAccount locale encryptedVirtualUserId encryptedPassword;
    self#recv_registerVirtualAccount
  method private send_registerVirtualAccount locale encryptedVirtualUserId encryptedPassword = 
    oprot#writeMessageBegin ("registerVirtualAccount", Protocol.CALL, seqid);
    let args = new registerVirtualAccount_args in
      args#set_locale locale;
      args#set_encryptedVirtualUserId encryptedVirtualUserId;
      args#set_encryptedPassword encryptedPassword;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_registerVirtualAccount  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_registerVirtualAccount_result iprot in
        iprot#readMessageEnd;
        match result#get_success with Some v -> v | None -> (
          (match result#get_e with None -> () | Some _v ->
            raise (TalkException _v));
          raise (Application_Exn.E (Application_Exn.create Application_Exn.MISSING_RESULT "registerVirtualAccount failed: unknown result")))
  method requestVirtualAccountPasswordChange virtualMid encryptedVirtualUserId encryptedOldPassword encryptedNewPassword = 
    self#send_requestVirtualAccountPasswordChange virtualMid encryptedVirtualUserId encryptedOldPassword encryptedNewPassword;
    self#recv_requestVirtualAccountPasswordChange
  method private send_requestVirtualAccountPasswordChange virtualMid encryptedVirtualUserId encryptedOldPassword encryptedNewPassword = 
    oprot#writeMessageBegin ("requestVirtualAccountPasswordChange", Protocol.CALL, seqid);
    let args = new requestVirtualAccountPasswordChange_args in
      args#set_virtualMid virtualMid;
      args#set_encryptedVirtualUserId encryptedVirtualUserId;
      args#set_encryptedOldPassword encryptedOldPassword;
      args#set_encryptedNewPassword encryptedNewPassword;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_requestVirtualAccountPasswordChange  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_requestVirtualAccountPasswordChange_result iprot in
        iprot#readMessageEnd;
        (match result#get_e with None -> () | Some _v ->
          raise (TalkException _v));
        ()
  method requestVirtualAccountPasswordSet virtualMid encryptedVirtualUserId encryptedNewPassword = 
    self#send_requestVirtualAccountPasswordSet virtualMid encryptedVirtualUserId encryptedNewPassword;
    self#recv_requestVirtualAccountPasswordSet
  method private send_requestVirtualAccountPasswordSet virtualMid encryptedVirtualUserId encryptedNewPassword = 
    oprot#writeMessageBegin ("requestVirtualAccountPasswordSet", Protocol.CALL, seqid);
    let args = new requestVirtualAccountPasswordSet_args in
      args#set_virtualMid virtualMid;
      args#set_encryptedVirtualUserId encryptedVirtualUserId;
      args#set_encryptedNewPassword encryptedNewPassword;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_requestVirtualAccountPasswordSet  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_requestVirtualAccountPasswordSet_result iprot in
        iprot#readMessageEnd;
        (match result#get_e with None -> () | Some _v ->
          raise (TalkException _v));
        ()
  method unregisterVirtualAccount virtualMid = 
    self#send_unregisterVirtualAccount virtualMid;
    self#recv_unregisterVirtualAccount
  method private send_unregisterVirtualAccount virtualMid = 
    oprot#writeMessageBegin ("unregisterVirtualAccount", Protocol.CALL, seqid);
    let args = new unregisterVirtualAccount_args in
      args#set_virtualMid virtualMid;
      args#write oprot;
      oprot#writeMessageEnd;
      oprot#getTransport#flush
  method private recv_unregisterVirtualAccount  =
    let (fname, mtype, rseqid) = iprot#readMessageBegin in
      (if mtype = Protocol.EXCEPTION then
        let x = Application_Exn.read iprot in
          (iprot#readMessageEnd;           raise (Application_Exn.E x))
      else ());
      let result = read_unregisterVirtualAccount_result iprot in
        iprot#readMessageEnd;
        (match result#get_e with None -> () | Some _v ->
          raise (TalkException _v));
        ()
end

class processor (handler : iface) =
object (self)
  inherit Processor.t

  val processMap = Hashtbl.create 6
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
  method private process_getRSAKey (seqid, iprot, oprot) =
    let _ = read_getRSAKey_args iprot in
      iprot#readMessageEnd;
      let result = new getRSAKey_result in
        (try
          result#set_success (handler#getRSAKey);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("getRSAKey", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_notifyEmailConfirmationResult (seqid, iprot, oprot) =
    let args = read_notifyEmailConfirmationResult_args iprot in
      iprot#readMessageEnd;
      let result = new notifyEmailConfirmationResult_result in
        (try
          (handler#notifyEmailConfirmationResult args#get_parameterMap);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("notifyEmailConfirmationResult", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_registerVirtualAccount (seqid, iprot, oprot) =
    let args = read_registerVirtualAccount_args iprot in
      iprot#readMessageEnd;
      let result = new registerVirtualAccount_result in
        (try
          result#set_success (handler#registerVirtualAccount args#get_locale args#get_encryptedVirtualUserId args#get_encryptedPassword);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("registerVirtualAccount", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_requestVirtualAccountPasswordChange (seqid, iprot, oprot) =
    let args = read_requestVirtualAccountPasswordChange_args iprot in
      iprot#readMessageEnd;
      let result = new requestVirtualAccountPasswordChange_result in
        (try
          (handler#requestVirtualAccountPasswordChange args#get_virtualMid args#get_encryptedVirtualUserId args#get_encryptedOldPassword args#get_encryptedNewPassword);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("requestVirtualAccountPasswordChange", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_requestVirtualAccountPasswordSet (seqid, iprot, oprot) =
    let args = read_requestVirtualAccountPasswordSet_args iprot in
      iprot#readMessageEnd;
      let result = new requestVirtualAccountPasswordSet_result in
        (try
          (handler#requestVirtualAccountPasswordSet args#get_virtualMid args#get_encryptedVirtualUserId args#get_encryptedNewPassword);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("requestVirtualAccountPasswordSet", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  method private process_unregisterVirtualAccount (seqid, iprot, oprot) =
    let args = read_unregisterVirtualAccount_args iprot in
      iprot#readMessageEnd;
      let result = new unregisterVirtualAccount_result in
        (try
          (handler#unregisterVirtualAccount args#get_virtualMid);
        with
          | TalkException e -> 
              result#set_e e
        );
        oprot#writeMessageBegin ("unregisterVirtualAccount", Protocol.REPLY, seqid);
        result#write oprot;
        oprot#writeMessageEnd;
        oprot#getTransport#flush
  initializer
    Hashtbl.add processMap "getRSAKey" self#process_getRSAKey;
    Hashtbl.add processMap "notifyEmailConfirmationResult" self#process_notifyEmailConfirmationResult;
    Hashtbl.add processMap "registerVirtualAccount" self#process_registerVirtualAccount;
    Hashtbl.add processMap "requestVirtualAccountPasswordChange" self#process_requestVirtualAccountPasswordChange;
    Hashtbl.add processMap "requestVirtualAccountPasswordSet" self#process_requestVirtualAccountPasswordSet;
    Hashtbl.add processMap "unregisterVirtualAccount" self#process_unregisterVirtualAccount;
end

