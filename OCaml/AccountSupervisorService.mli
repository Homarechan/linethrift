(*
 Autogenerated by Thrift Compiler (0.14.0)

 DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING
*)

open Thrift
open Line_types

class virtual iface :
object
  method virtual getRSAKey : rSAKey
  method virtual notifyEmailConfirmationResult : (string,string) Hashtbl.t option -> unit
  method virtual registerVirtualAccount : string option -> string option -> string option -> string
  method virtual requestVirtualAccountPasswordChange : string option -> string option -> string option -> string option -> unit
  method virtual requestVirtualAccountPasswordSet : string option -> string option -> string option -> unit
  method virtual unregisterVirtualAccount : string option -> unit
end

class client : Protocol.t -> Protocol.t -> 
object
  method getRSAKey : rSAKey
  method notifyEmailConfirmationResult : (string,string) Hashtbl.t -> unit
  method registerVirtualAccount : string -> string -> string -> string
  method requestVirtualAccountPasswordChange : string -> string -> string -> string -> unit
  method requestVirtualAccountPasswordSet : string -> string -> string -> unit
  method unregisterVirtualAccount : string -> unit
end

class processor : iface ->
object
  inherit Processor.t

  val processMap : (string, int * Protocol.t * Protocol.t -> unit) Hashtbl.t
  method process : Protocol.t -> Protocol.t -> bool
end

