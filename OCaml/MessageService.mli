(*
 Autogenerated by Thrift Compiler (0.11.0)

 DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING
*)

open Thrift
open Line_types

class virtual iface :
object
  method virtual fetchMessageOperations : Int64.t option -> Int64.t option -> Int32.t option -> messageOperations
  method virtual getLastReadMessageIds : string option -> lastReadMessageIds
  method virtual multiGetLastReadMessageIds : string list option -> lastReadMessageIds list
end

class client : Protocol.t -> Protocol.t -> 
object
  method fetchMessageOperations : Int64.t -> Int64.t -> Int32.t -> messageOperations
  method getLastReadMessageIds : string -> lastReadMessageIds
  method multiGetLastReadMessageIds : string list -> lastReadMessageIds list
end

class processor : iface ->
object
  inherit Processor.t

  val processMap : (string, int * Protocol.t * Protocol.t -> unit) Hashtbl.t
  method process : Protocol.t -> Protocol.t -> bool
end

