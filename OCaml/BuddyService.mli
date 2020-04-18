(*
 Autogenerated by Thrift Compiler (0.11.0)

 DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING
*)

open Thrift
open Line_types

class virtual iface :
object
  method virtual findBuddyContactsByQuery : string option -> string option -> string option -> Int32.t option -> Int32.t option -> BuddySearchRequestSource.t option -> buddySearchResult list
  method virtual getBuddyContacts : string option -> string option -> string option -> Int32.t option -> Int32.t option -> contact list
  method virtual getBuddyDetail : string option -> buddyDetail
  method virtual getBuddyOnAir : string option -> buddyOnAir
  method virtual getCountriesHavingBuddy : string list
  method virtual getNewlyReleasedBuddyIds : string option -> (string,Int64.t) Hashtbl.t
  method virtual getPopularBuddyBanner : string option -> string option -> ApplicationType.t option -> string option -> buddyBanner
  method virtual getPopularBuddyLists : string option -> string option -> buddyList list
  method virtual getPromotedBuddyContacts : string option -> string option -> contact list
end

class client : Protocol.t -> Protocol.t -> 
object
  method findBuddyContactsByQuery : string -> string -> string -> Int32.t -> Int32.t -> BuddySearchRequestSource.t -> buddySearchResult list
  method getBuddyContacts : string -> string -> string -> Int32.t -> Int32.t -> contact list
  method getBuddyDetail : string -> buddyDetail
  method getBuddyOnAir : string -> buddyOnAir
  method getCountriesHavingBuddy : string list
  method getNewlyReleasedBuddyIds : string -> (string,Int64.t) Hashtbl.t
  method getPopularBuddyBanner : string -> string -> ApplicationType.t -> string -> buddyBanner
  method getPopularBuddyLists : string -> string -> buddyList list
  method getPromotedBuddyContacts : string -> string -> contact list
end

class processor : iface ->
object
  inherit Processor.t

  val processMap : (string, int * Protocol.t * Protocol.t -> unit) Hashtbl.t
  method process : Protocol.t -> Protocol.t -> bool
end

