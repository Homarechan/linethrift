/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef CHANNEL_SERVICE_H
#define CHANNEL_SERVICE_H

#include <thrift/c_glib/processor/thrift_dispatch_processor.h>

#include "line_types.h"

/* ChannelService service interface */
typedef struct _ChannelServiceIf ChannelServiceIf;  /* dummy object */

struct _ChannelServiceIfInterface
{
  GTypeInterface parent;

  gboolean (*issue_o_t_p) (ChannelServiceIf *iface, OTPResult ** _return, const gchar * channelId, ChannelException ** e, GError **error);
  gboolean (*approve_channel_and_issue_channel_token) (ChannelServiceIf *iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError **error);
  gboolean (*approve_channel_and_issue_request_token) (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError **error);
  gboolean (*fetch_notification_items) (ChannelServiceIf *iface, NotificationFetchResult ** _return, const gint64 localRev, ChannelException ** e, GError **error);
  gboolean (*get_approved_channels) (ChannelServiceIf *iface, ApprovedChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_channel_info) (ChannelServiceIf *iface, ChannelInfo ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_channel_notification_setting) (ChannelServiceIf *iface, ChannelNotificationSetting ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_channel_notification_settings) (ChannelServiceIf *iface, GPtrArray ** _return, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_channels) (ChannelServiceIf *iface, ChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_domains) (ChannelServiceIf *iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError **error);
  gboolean (*get_friend_channel_matrices) (ChannelServiceIf *iface, FriendChannelMatricesResponse ** _return, const GPtrArray * channelIds, ChannelException ** e, GError **error);
  gboolean (*update_channel_settings) (ChannelServiceIf *iface, gboolean* _return, const ChannelSettings * channelSettings, ChannelException ** e, GError **error);
  gboolean (*get_common_domains) (ChannelServiceIf *iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError **error);
  gboolean (*get_notification_badge_count) (ChannelServiceIf *iface, gint32* _return, const gint64 localRev, ChannelException ** e, GError **error);
  gboolean (*issue_channel_token) (ChannelServiceIf *iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError **error);
  gboolean (*issue_request_token) (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError **error);
  gboolean (*issue_request_token_with_auth_scheme) (ChannelServiceIf *iface, RequestTokenResponse ** _return, const gchar * channelId, const gchar * otpId, const GPtrArray * authScheme, const gchar * returnUrl, ChannelException ** e, GError **error);
  gboolean (*issue_request_token_for_auto_login) (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, const gchar * redirectUrl, ChannelException ** e, GError **error);
  gboolean (*get_updated_channel_ids) (ChannelServiceIf *iface, GPtrArray ** _return, const GPtrArray * channelIds, ChannelException ** e, GError **error);
  gboolean (*reserve_coin_use) (ChannelServiceIf *iface, gchar ** _return, const CoinUseReservation * request, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*revoke_channel) (ChannelServiceIf *iface, const gchar * channelId, ChannelException ** e, GError **error);
  gboolean (*sync_channel_data) (ChannelServiceIf *iface, ChannelSyncDatas ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*update_channel_notification_setting) (ChannelServiceIf *iface, const GPtrArray * setting, ChannelException ** e, GError **error);
};
typedef struct _ChannelServiceIfInterface ChannelServiceIfInterface;

GType channel_service_if_get_type (void);
#define TYPE_CHANNEL_SERVICE_IF (channel_service_if_get_type())
#define CHANNEL_SERVICE_IF(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CHANNEL_SERVICE_IF, ChannelServiceIf))
#define IS_CHANNEL_SERVICE_IF(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CHANNEL_SERVICE_IF))
#define CHANNEL_SERVICE_IF_GET_INTERFACE(inst) (G_TYPE_INSTANCE_GET_INTERFACE ((inst), TYPE_CHANNEL_SERVICE_IF, ChannelServiceIfInterface))

gboolean channel_service_if_issue_o_t_p (ChannelServiceIf *iface, OTPResult ** _return, const gchar * channelId, ChannelException ** e, GError **error);
gboolean channel_service_if_approve_channel_and_issue_channel_token (ChannelServiceIf *iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError **error);
gboolean channel_service_if_approve_channel_and_issue_request_token (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError **error);
gboolean channel_service_if_fetch_notification_items (ChannelServiceIf *iface, NotificationFetchResult ** _return, const gint64 localRev, ChannelException ** e, GError **error);
gboolean channel_service_if_get_approved_channels (ChannelServiceIf *iface, ApprovedChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_if_get_channel_info (ChannelServiceIf *iface, ChannelInfo ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_if_get_channel_notification_setting (ChannelServiceIf *iface, ChannelNotificationSetting ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_if_get_channel_notification_settings (ChannelServiceIf *iface, GPtrArray ** _return, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_if_get_channels (ChannelServiceIf *iface, ChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_if_get_domains (ChannelServiceIf *iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError **error);
gboolean channel_service_if_get_friend_channel_matrices (ChannelServiceIf *iface, FriendChannelMatricesResponse ** _return, const GPtrArray * channelIds, ChannelException ** e, GError **error);
gboolean channel_service_if_update_channel_settings (ChannelServiceIf *iface, gboolean* _return, const ChannelSettings * channelSettings, ChannelException ** e, GError **error);
gboolean channel_service_if_get_common_domains (ChannelServiceIf *iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError **error);
gboolean channel_service_if_get_notification_badge_count (ChannelServiceIf *iface, gint32* _return, const gint64 localRev, ChannelException ** e, GError **error);
gboolean channel_service_if_issue_channel_token (ChannelServiceIf *iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError **error);
gboolean channel_service_if_issue_request_token (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError **error);
gboolean channel_service_if_issue_request_token_with_auth_scheme (ChannelServiceIf *iface, RequestTokenResponse ** _return, const gchar * channelId, const gchar * otpId, const GPtrArray * authScheme, const gchar * returnUrl, ChannelException ** e, GError **error);
gboolean channel_service_if_issue_request_token_for_auto_login (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, const gchar * redirectUrl, ChannelException ** e, GError **error);
gboolean channel_service_if_get_updated_channel_ids (ChannelServiceIf *iface, GPtrArray ** _return, const GPtrArray * channelIds, ChannelException ** e, GError **error);
gboolean channel_service_if_reserve_coin_use (ChannelServiceIf *iface, gchar ** _return, const CoinUseReservation * request, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_if_revoke_channel (ChannelServiceIf *iface, const gchar * channelId, ChannelException ** e, GError **error);
gboolean channel_service_if_sync_channel_data (ChannelServiceIf *iface, ChannelSyncDatas ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_if_update_channel_notification_setting (ChannelServiceIf *iface, const GPtrArray * setting, ChannelException ** e, GError **error);

/* ChannelService service client */
struct _ChannelServiceClient
{
  GObject parent;

  ThriftProtocol *input_protocol;
  ThriftProtocol *output_protocol;
};
typedef struct _ChannelServiceClient ChannelServiceClient;

struct _ChannelServiceClientClass
{
  GObjectClass parent;
};
typedef struct _ChannelServiceClientClass ChannelServiceClientClass;

GType channel_service_client_get_type (void);
#define TYPE_CHANNEL_SERVICE_CLIENT (channel_service_client_get_type())
#define CHANNEL_SERVICE_CLIENT(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CHANNEL_SERVICE_CLIENT, ChannelServiceClient))
#define CHANNEL_SERVICE_CLIENT_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), TYPE_CHANNEL_SERVICE_CLIENT, ChannelServiceClientClass))
#define CHANNEL_SERVICE_IS_CLIENT(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CHANNEL_SERVICE_CLIENT))
#define CHANNEL_SERVICE_IS_CLIENT_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CHANNEL_SERVICE_CLIENT))
#define CHANNEL_SERVICE_CLIENT_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CHANNEL_SERVICE_CLIENT, ChannelServiceClientClass))

gboolean channel_service_client_issue_o_t_p (ChannelServiceIf * iface, OTPResult ** _return, const gchar * channelId, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_issue_o_t_p (ChannelServiceIf * iface, const gchar * channelId, GError ** error);
gboolean channel_service_client_recv_issue_o_t_p (ChannelServiceIf * iface, OTPResult ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_approve_channel_and_issue_channel_token (ChannelServiceIf * iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_approve_channel_and_issue_channel_token (ChannelServiceIf * iface, const gchar * channelId, GError ** error);
gboolean channel_service_client_recv_approve_channel_and_issue_channel_token (ChannelServiceIf * iface, ChannelToken ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_approve_channel_and_issue_request_token (ChannelServiceIf * iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_approve_channel_and_issue_request_token (ChannelServiceIf * iface, const gchar * channelId, const gchar * otpId, GError ** error);
gboolean channel_service_client_recv_approve_channel_and_issue_request_token (ChannelServiceIf * iface, gchar ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_fetch_notification_items (ChannelServiceIf * iface, NotificationFetchResult ** _return, const gint64 localRev, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_fetch_notification_items (ChannelServiceIf * iface, const gint64 localRev, GError ** error);
gboolean channel_service_client_recv_fetch_notification_items (ChannelServiceIf * iface, NotificationFetchResult ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_approved_channels (ChannelServiceIf * iface, ApprovedChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_approved_channels (ChannelServiceIf * iface, const gint64 lastSynced, const gchar * locale, GError ** error);
gboolean channel_service_client_recv_get_approved_channels (ChannelServiceIf * iface, ApprovedChannelInfos ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_channel_info (ChannelServiceIf * iface, ChannelInfo ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_channel_info (ChannelServiceIf * iface, const gchar * channelId, const gchar * locale, GError ** error);
gboolean channel_service_client_recv_get_channel_info (ChannelServiceIf * iface, ChannelInfo ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_channel_notification_setting (ChannelServiceIf * iface, ChannelNotificationSetting ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_channel_notification_setting (ChannelServiceIf * iface, const gchar * channelId, const gchar * locale, GError ** error);
gboolean channel_service_client_recv_get_channel_notification_setting (ChannelServiceIf * iface, ChannelNotificationSetting ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_channel_notification_settings (ChannelServiceIf * iface, GPtrArray ** _return, const gchar * locale, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_channel_notification_settings (ChannelServiceIf * iface, const gchar * locale, GError ** error);
gboolean channel_service_client_recv_get_channel_notification_settings (ChannelServiceIf * iface, GPtrArray ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_channels (ChannelServiceIf * iface, ChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_channels (ChannelServiceIf * iface, const gint64 lastSynced, const gchar * locale, GError ** error);
gboolean channel_service_client_recv_get_channels (ChannelServiceIf * iface, ChannelInfos ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_domains (ChannelServiceIf * iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_domains (ChannelServiceIf * iface, const gint64 lastSynced, GError ** error);
gboolean channel_service_client_recv_get_domains (ChannelServiceIf * iface, ChannelDomains ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_friend_channel_matrices (ChannelServiceIf * iface, FriendChannelMatricesResponse ** _return, const GPtrArray * channelIds, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_friend_channel_matrices (ChannelServiceIf * iface, const GPtrArray * channelIds, GError ** error);
gboolean channel_service_client_recv_get_friend_channel_matrices (ChannelServiceIf * iface, FriendChannelMatricesResponse ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_update_channel_settings (ChannelServiceIf * iface, gboolean* _return, const ChannelSettings * channelSettings, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_update_channel_settings (ChannelServiceIf * iface, const ChannelSettings * channelSettings, GError ** error);
gboolean channel_service_client_recv_update_channel_settings (ChannelServiceIf * iface, gboolean* _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_common_domains (ChannelServiceIf * iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_common_domains (ChannelServiceIf * iface, const gint64 lastSynced, GError ** error);
gboolean channel_service_client_recv_get_common_domains (ChannelServiceIf * iface, ChannelDomains ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_notification_badge_count (ChannelServiceIf * iface, gint32* _return, const gint64 localRev, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_notification_badge_count (ChannelServiceIf * iface, const gint64 localRev, GError ** error);
gboolean channel_service_client_recv_get_notification_badge_count (ChannelServiceIf * iface, gint32* _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_issue_channel_token (ChannelServiceIf * iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_issue_channel_token (ChannelServiceIf * iface, const gchar * channelId, GError ** error);
gboolean channel_service_client_recv_issue_channel_token (ChannelServiceIf * iface, ChannelToken ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_issue_request_token (ChannelServiceIf * iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_issue_request_token (ChannelServiceIf * iface, const gchar * channelId, const gchar * otpId, GError ** error);
gboolean channel_service_client_recv_issue_request_token (ChannelServiceIf * iface, gchar ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_issue_request_token_with_auth_scheme (ChannelServiceIf * iface, RequestTokenResponse ** _return, const gchar * channelId, const gchar * otpId, const GPtrArray * authScheme, const gchar * returnUrl, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_issue_request_token_with_auth_scheme (ChannelServiceIf * iface, const gchar * channelId, const gchar * otpId, const GPtrArray * authScheme, const gchar * returnUrl, GError ** error);
gboolean channel_service_client_recv_issue_request_token_with_auth_scheme (ChannelServiceIf * iface, RequestTokenResponse ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_issue_request_token_for_auto_login (ChannelServiceIf * iface, gchar ** _return, const gchar * channelId, const gchar * otpId, const gchar * redirectUrl, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_issue_request_token_for_auto_login (ChannelServiceIf * iface, const gchar * channelId, const gchar * otpId, const gchar * redirectUrl, GError ** error);
gboolean channel_service_client_recv_issue_request_token_for_auto_login (ChannelServiceIf * iface, gchar ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_get_updated_channel_ids (ChannelServiceIf * iface, GPtrArray ** _return, const GPtrArray * channelIds, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_get_updated_channel_ids (ChannelServiceIf * iface, const GPtrArray * channelIds, GError ** error);
gboolean channel_service_client_recv_get_updated_channel_ids (ChannelServiceIf * iface, GPtrArray ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_reserve_coin_use (ChannelServiceIf * iface, gchar ** _return, const CoinUseReservation * request, const gchar * locale, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_reserve_coin_use (ChannelServiceIf * iface, const CoinUseReservation * request, const gchar * locale, GError ** error);
gboolean channel_service_client_recv_reserve_coin_use (ChannelServiceIf * iface, gchar ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_revoke_channel (ChannelServiceIf * iface, const gchar * channelId, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_revoke_channel (ChannelServiceIf * iface, const gchar * channelId, GError ** error);
gboolean channel_service_client_recv_revoke_channel (ChannelServiceIf * iface, ChannelException ** e, GError ** error);
gboolean channel_service_client_sync_channel_data (ChannelServiceIf * iface, ChannelSyncDatas ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_sync_channel_data (ChannelServiceIf * iface, const gint64 lastSynced, const gchar * locale, GError ** error);
gboolean channel_service_client_recv_sync_channel_data (ChannelServiceIf * iface, ChannelSyncDatas ** _return, ChannelException ** e, GError ** error);
gboolean channel_service_client_update_channel_notification_setting (ChannelServiceIf * iface, const GPtrArray * setting, ChannelException ** e, GError ** error);
gboolean channel_service_client_send_update_channel_notification_setting (ChannelServiceIf * iface, const GPtrArray * setting, GError ** error);
gboolean channel_service_client_recv_update_channel_notification_setting (ChannelServiceIf * iface, ChannelException ** e, GError ** error);
void channel_service_client_set_property (GObject *object, guint property_id, const GValue *value, GParamSpec *pspec);
void channel_service_client_get_property (GObject *object, guint property_id, GValue *value, GParamSpec *pspec);

/* ChannelService handler (abstract base class) */
struct _ChannelServiceHandler
{
  GObject parent;
};
typedef struct _ChannelServiceHandler ChannelServiceHandler;

struct _ChannelServiceHandlerClass
{
  GObjectClass parent;

  gboolean (*issue_o_t_p) (ChannelServiceIf *iface, OTPResult ** _return, const gchar * channelId, ChannelException ** e, GError **error);
  gboolean (*approve_channel_and_issue_channel_token) (ChannelServiceIf *iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError **error);
  gboolean (*approve_channel_and_issue_request_token) (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError **error);
  gboolean (*fetch_notification_items) (ChannelServiceIf *iface, NotificationFetchResult ** _return, const gint64 localRev, ChannelException ** e, GError **error);
  gboolean (*get_approved_channels) (ChannelServiceIf *iface, ApprovedChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_channel_info) (ChannelServiceIf *iface, ChannelInfo ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_channel_notification_setting) (ChannelServiceIf *iface, ChannelNotificationSetting ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_channel_notification_settings) (ChannelServiceIf *iface, GPtrArray ** _return, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_channels) (ChannelServiceIf *iface, ChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*get_domains) (ChannelServiceIf *iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError **error);
  gboolean (*get_friend_channel_matrices) (ChannelServiceIf *iface, FriendChannelMatricesResponse ** _return, const GPtrArray * channelIds, ChannelException ** e, GError **error);
  gboolean (*update_channel_settings) (ChannelServiceIf *iface, gboolean* _return, const ChannelSettings * channelSettings, ChannelException ** e, GError **error);
  gboolean (*get_common_domains) (ChannelServiceIf *iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError **error);
  gboolean (*get_notification_badge_count) (ChannelServiceIf *iface, gint32* _return, const gint64 localRev, ChannelException ** e, GError **error);
  gboolean (*issue_channel_token) (ChannelServiceIf *iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError **error);
  gboolean (*issue_request_token) (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError **error);
  gboolean (*issue_request_token_with_auth_scheme) (ChannelServiceIf *iface, RequestTokenResponse ** _return, const gchar * channelId, const gchar * otpId, const GPtrArray * authScheme, const gchar * returnUrl, ChannelException ** e, GError **error);
  gboolean (*issue_request_token_for_auto_login) (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, const gchar * redirectUrl, ChannelException ** e, GError **error);
  gboolean (*get_updated_channel_ids) (ChannelServiceIf *iface, GPtrArray ** _return, const GPtrArray * channelIds, ChannelException ** e, GError **error);
  gboolean (*reserve_coin_use) (ChannelServiceIf *iface, gchar ** _return, const CoinUseReservation * request, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*revoke_channel) (ChannelServiceIf *iface, const gchar * channelId, ChannelException ** e, GError **error);
  gboolean (*sync_channel_data) (ChannelServiceIf *iface, ChannelSyncDatas ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
  gboolean (*update_channel_notification_setting) (ChannelServiceIf *iface, const GPtrArray * setting, ChannelException ** e, GError **error);
};
typedef struct _ChannelServiceHandlerClass ChannelServiceHandlerClass;

GType channel_service_handler_get_type (void);
#define TYPE_CHANNEL_SERVICE_HANDLER (channel_service_handler_get_type())
#define CHANNEL_SERVICE_HANDLER(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CHANNEL_SERVICE_HANDLER, ChannelServiceHandler))
#define IS_CHANNEL_SERVICE_HANDLER(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CHANNEL_SERVICE_HANDLER))
#define CHANNEL_SERVICE_HANDLER_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), TYPE_CHANNEL_SERVICE_HANDLER, ChannelServiceHandlerClass))
#define IS_CHANNEL_SERVICE_HANDLER_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CHANNEL_SERVICE_HANDLER))
#define CHANNEL_SERVICE_HANDLER_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CHANNEL_SERVICE_HANDLER, ChannelServiceHandlerClass))

gboolean channel_service_handler_issue_o_t_p (ChannelServiceIf *iface, OTPResult ** _return, const gchar * channelId, ChannelException ** e, GError **error);
gboolean channel_service_handler_approve_channel_and_issue_channel_token (ChannelServiceIf *iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError **error);
gboolean channel_service_handler_approve_channel_and_issue_request_token (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError **error);
gboolean channel_service_handler_fetch_notification_items (ChannelServiceIf *iface, NotificationFetchResult ** _return, const gint64 localRev, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_approved_channels (ChannelServiceIf *iface, ApprovedChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_channel_info (ChannelServiceIf *iface, ChannelInfo ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_channel_notification_setting (ChannelServiceIf *iface, ChannelNotificationSetting ** _return, const gchar * channelId, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_channel_notification_settings (ChannelServiceIf *iface, GPtrArray ** _return, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_channels (ChannelServiceIf *iface, ChannelInfos ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_domains (ChannelServiceIf *iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_friend_channel_matrices (ChannelServiceIf *iface, FriendChannelMatricesResponse ** _return, const GPtrArray * channelIds, ChannelException ** e, GError **error);
gboolean channel_service_handler_update_channel_settings (ChannelServiceIf *iface, gboolean* _return, const ChannelSettings * channelSettings, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_common_domains (ChannelServiceIf *iface, ChannelDomains ** _return, const gint64 lastSynced, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_notification_badge_count (ChannelServiceIf *iface, gint32* _return, const gint64 localRev, ChannelException ** e, GError **error);
gboolean channel_service_handler_issue_channel_token (ChannelServiceIf *iface, ChannelToken ** _return, const gchar * channelId, ChannelException ** e, GError **error);
gboolean channel_service_handler_issue_request_token (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, ChannelException ** e, GError **error);
gboolean channel_service_handler_issue_request_token_with_auth_scheme (ChannelServiceIf *iface, RequestTokenResponse ** _return, const gchar * channelId, const gchar * otpId, const GPtrArray * authScheme, const gchar * returnUrl, ChannelException ** e, GError **error);
gboolean channel_service_handler_issue_request_token_for_auto_login (ChannelServiceIf *iface, gchar ** _return, const gchar * channelId, const gchar * otpId, const gchar * redirectUrl, ChannelException ** e, GError **error);
gboolean channel_service_handler_get_updated_channel_ids (ChannelServiceIf *iface, GPtrArray ** _return, const GPtrArray * channelIds, ChannelException ** e, GError **error);
gboolean channel_service_handler_reserve_coin_use (ChannelServiceIf *iface, gchar ** _return, const CoinUseReservation * request, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_handler_revoke_channel (ChannelServiceIf *iface, const gchar * channelId, ChannelException ** e, GError **error);
gboolean channel_service_handler_sync_channel_data (ChannelServiceIf *iface, ChannelSyncDatas ** _return, const gint64 lastSynced, const gchar * locale, ChannelException ** e, GError **error);
gboolean channel_service_handler_update_channel_notification_setting (ChannelServiceIf *iface, const GPtrArray * setting, ChannelException ** e, GError **error);

/* ChannelService processor */
struct _ChannelServiceProcessor
{
  ThriftDispatchProcessor parent;

  /* protected */
  ChannelServiceHandler *handler;
  GHashTable *process_map;
};
typedef struct _ChannelServiceProcessor ChannelServiceProcessor;

struct _ChannelServiceProcessorClass
{
  ThriftDispatchProcessorClass parent;

  /* protected */
  gboolean (*dispatch_call) (ThriftDispatchProcessor *processor,
                             ThriftProtocol *in,
                             ThriftProtocol *out,
                             gchar *fname,
                             gint32 seqid,
                             GError **error);
};
typedef struct _ChannelServiceProcessorClass ChannelServiceProcessorClass;

GType channel_service_processor_get_type (void);
#define TYPE_CHANNEL_SERVICE_PROCESSOR (channel_service_processor_get_type())
#define CHANNEL_SERVICE_PROCESSOR(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CHANNEL_SERVICE_PROCESSOR, ChannelServiceProcessor))
#define IS_CHANNEL_SERVICE_PROCESSOR(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CHANNEL_SERVICE_PROCESSOR))
#define CHANNEL_SERVICE_PROCESSOR_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), TYPE_CHANNEL_SERVICE_PROCESSOR, ChannelServiceProcessorClass))
#define IS_CHANNEL_SERVICE_PROCESSOR_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CHANNEL_SERVICE_PROCESSOR))
#define CHANNEL_SERVICE_PROCESSOR_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CHANNEL_SERVICE_PROCESSOR, ChannelServiceProcessorClass))

#endif /* CHANNEL_SERVICE_H */
