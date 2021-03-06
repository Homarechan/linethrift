(*
 Autogenerated by Thrift Compiler (0.14.0)

 DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING
*)

open Thrift
open Line_types

class virtual iface :
object
  method virtual issueOTP : string option -> oTPResult
  method virtual approveChannelAndIssueChannelToken : string option -> channelToken
  method virtual approveChannelAndIssueRequestToken : string option -> string option -> string
  method virtual fetchNotificationItems : Int64.t option -> notificationFetchResult
  method virtual getApprovedChannels : Int64.t option -> string option -> approvedChannelInfos
  method virtual getChannelInfo : string option -> string option -> channelInfo
  method virtual getChannelNotificationSetting : string option -> string option -> channelNotificationSetting
  method virtual getChannelNotificationSettings : string option -> channelNotificationSetting list
  method virtual getChannels : Int64.t option -> string option -> channelInfos
  method virtual getDomains : Int64.t option -> channelDomains
  method virtual getFriendChannelMatrices : string list option -> friendChannelMatricesResponse
  method virtual updateChannelSettings : channelSettings option -> bool
  method virtual getCommonDomains : Int64.t option -> channelDomains
  method virtual getNotificationBadgeCount : Int64.t option -> Int32.t
  method virtual issueChannelToken : string option -> channelToken
  method virtual issueRequestToken : string option -> string option -> string
  method virtual issueRequestTokenWithAuthScheme : string option -> string option -> string list option -> string option -> requestTokenResponse
  method virtual issueRequestTokenForAutoLogin : string option -> string option -> string option -> string
  method virtual getUpdatedChannelIds : channelIdWithLastUpdated list option -> string list
  method virtual reserveCoinUse : coinUseReservation option -> string option -> string
  method virtual revokeChannel : string option -> unit
  method virtual syncChannelData : Int64.t option -> string option -> channelSyncDatas
  method virtual updateChannelNotificationSetting : channelNotificationSetting list option -> unit
end

class client : Protocol.t -> Protocol.t -> 
object
  method issueOTP : string -> oTPResult
  method approveChannelAndIssueChannelToken : string -> channelToken
  method approveChannelAndIssueRequestToken : string -> string -> string
  method fetchNotificationItems : Int64.t -> notificationFetchResult
  method getApprovedChannels : Int64.t -> string -> approvedChannelInfos
  method getChannelInfo : string -> string -> channelInfo
  method getChannelNotificationSetting : string -> string -> channelNotificationSetting
  method getChannelNotificationSettings : string -> channelNotificationSetting list
  method getChannels : Int64.t -> string -> channelInfos
  method getDomains : Int64.t -> channelDomains
  method getFriendChannelMatrices : string list -> friendChannelMatricesResponse
  method updateChannelSettings : channelSettings -> bool
  method getCommonDomains : Int64.t -> channelDomains
  method getNotificationBadgeCount : Int64.t -> Int32.t
  method issueChannelToken : string -> channelToken
  method issueRequestToken : string -> string -> string
  method issueRequestTokenWithAuthScheme : string -> string -> string list -> string -> requestTokenResponse
  method issueRequestTokenForAutoLogin : string -> string -> string -> string
  method getUpdatedChannelIds : channelIdWithLastUpdated list -> string list
  method reserveCoinUse : coinUseReservation -> string -> string
  method revokeChannel : string -> unit
  method syncChannelData : Int64.t -> string -> channelSyncDatas
  method updateChannelNotificationSetting : channelNotificationSetting list -> unit
end

class processor : iface ->
object
  inherit Processor.t

  val processMap : (string, int * Protocol.t * Protocol.t -> unit) Hashtbl.t
  method process : Protocol.t -> Protocol.t -> bool
end

