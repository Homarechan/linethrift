/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef ACCOUNT_SUPERVISOR_SERVICE_H
#define ACCOUNT_SUPERVISOR_SERVICE_H

#include <thrift/c_glib/processor/thrift_dispatch_processor.h>

#include "line_types.h"

/* AccountSupervisorService service interface */
typedef struct _AccountSupervisorServiceIf AccountSupervisorServiceIf;  /* dummy object */

struct _AccountSupervisorServiceIfInterface
{
  GTypeInterface parent;

  gboolean (*get_r_s_a_key) (AccountSupervisorServiceIf *iface, RSAKey ** _return, TalkException ** e, GError **error);
  gboolean (*notify_email_confirmation_result) (AccountSupervisorServiceIf *iface, const GHashTable * parameterMap, TalkException ** e, GError **error);
  gboolean (*register_virtual_account) (AccountSupervisorServiceIf *iface, gchar ** _return, const gchar * locale, const gchar * encryptedVirtualUserId, const gchar * encryptedPassword, TalkException ** e, GError **error);
  gboolean (*request_virtual_account_password_change) (AccountSupervisorServiceIf *iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedOldPassword, const gchar * encryptedNewPassword, TalkException ** e, GError **error);
  gboolean (*request_virtual_account_password_set) (AccountSupervisorServiceIf *iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedNewPassword, TalkException ** e, GError **error);
  gboolean (*unregister_virtual_account) (AccountSupervisorServiceIf *iface, const gchar * virtualMid, TalkException ** e, GError **error);
};
typedef struct _AccountSupervisorServiceIfInterface AccountSupervisorServiceIfInterface;

GType account_supervisor_service_if_get_type (void);
#define TYPE_ACCOUNT_SUPERVISOR_SERVICE_IF (account_supervisor_service_if_get_type())
#define ACCOUNT_SUPERVISOR_SERVICE_IF(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_IF, AccountSupervisorServiceIf))
#define IS_ACCOUNT_SUPERVISOR_SERVICE_IF(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_IF))
#define ACCOUNT_SUPERVISOR_SERVICE_IF_GET_INTERFACE(inst) (G_TYPE_INSTANCE_GET_INTERFACE ((inst), TYPE_ACCOUNT_SUPERVISOR_SERVICE_IF, AccountSupervisorServiceIfInterface))

gboolean account_supervisor_service_if_get_r_s_a_key (AccountSupervisorServiceIf *iface, RSAKey ** _return, TalkException ** e, GError **error);
gboolean account_supervisor_service_if_notify_email_confirmation_result (AccountSupervisorServiceIf *iface, const GHashTable * parameterMap, TalkException ** e, GError **error);
gboolean account_supervisor_service_if_register_virtual_account (AccountSupervisorServiceIf *iface, gchar ** _return, const gchar * locale, const gchar * encryptedVirtualUserId, const gchar * encryptedPassword, TalkException ** e, GError **error);
gboolean account_supervisor_service_if_request_virtual_account_password_change (AccountSupervisorServiceIf *iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedOldPassword, const gchar * encryptedNewPassword, TalkException ** e, GError **error);
gboolean account_supervisor_service_if_request_virtual_account_password_set (AccountSupervisorServiceIf *iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedNewPassword, TalkException ** e, GError **error);
gboolean account_supervisor_service_if_unregister_virtual_account (AccountSupervisorServiceIf *iface, const gchar * virtualMid, TalkException ** e, GError **error);

/* AccountSupervisorService service client */
struct _AccountSupervisorServiceClient
{
  GObject parent;

  ThriftProtocol *input_protocol;
  ThriftProtocol *output_protocol;
};
typedef struct _AccountSupervisorServiceClient AccountSupervisorServiceClient;

struct _AccountSupervisorServiceClientClass
{
  GObjectClass parent;
};
typedef struct _AccountSupervisorServiceClientClass AccountSupervisorServiceClientClass;

GType account_supervisor_service_client_get_type (void);
#define TYPE_ACCOUNT_SUPERVISOR_SERVICE_CLIENT (account_supervisor_service_client_get_type())
#define ACCOUNT_SUPERVISOR_SERVICE_CLIENT(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_CLIENT, AccountSupervisorServiceClient))
#define ACCOUNT_SUPERVISOR_SERVICE_CLIENT_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), TYPE_ACCOUNT_SUPERVISOR_SERVICE_CLIENT, AccountSupervisorServiceClientClass))
#define ACCOUNT_SUPERVISOR_SERVICE_IS_CLIENT(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_CLIENT))
#define ACCOUNT_SUPERVISOR_SERVICE_IS_CLIENT_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_ACCOUNT_SUPERVISOR_SERVICE_CLIENT))
#define ACCOUNT_SUPERVISOR_SERVICE_CLIENT_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_CLIENT, AccountSupervisorServiceClientClass))

gboolean account_supervisor_service_client_get_r_s_a_key (AccountSupervisorServiceIf * iface, RSAKey ** _return, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_send_get_r_s_a_key (AccountSupervisorServiceIf * iface, GError ** error);
gboolean account_supervisor_service_client_recv_get_r_s_a_key (AccountSupervisorServiceIf * iface, RSAKey ** _return, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_notify_email_confirmation_result (AccountSupervisorServiceIf * iface, const GHashTable * parameterMap, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_send_notify_email_confirmation_result (AccountSupervisorServiceIf * iface, const GHashTable * parameterMap, GError ** error);
gboolean account_supervisor_service_client_recv_notify_email_confirmation_result (AccountSupervisorServiceIf * iface, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_register_virtual_account (AccountSupervisorServiceIf * iface, gchar ** _return, const gchar * locale, const gchar * encryptedVirtualUserId, const gchar * encryptedPassword, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_send_register_virtual_account (AccountSupervisorServiceIf * iface, const gchar * locale, const gchar * encryptedVirtualUserId, const gchar * encryptedPassword, GError ** error);
gboolean account_supervisor_service_client_recv_register_virtual_account (AccountSupervisorServiceIf * iface, gchar ** _return, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_request_virtual_account_password_change (AccountSupervisorServiceIf * iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedOldPassword, const gchar * encryptedNewPassword, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_send_request_virtual_account_password_change (AccountSupervisorServiceIf * iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedOldPassword, const gchar * encryptedNewPassword, GError ** error);
gboolean account_supervisor_service_client_recv_request_virtual_account_password_change (AccountSupervisorServiceIf * iface, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_request_virtual_account_password_set (AccountSupervisorServiceIf * iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedNewPassword, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_send_request_virtual_account_password_set (AccountSupervisorServiceIf * iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedNewPassword, GError ** error);
gboolean account_supervisor_service_client_recv_request_virtual_account_password_set (AccountSupervisorServiceIf * iface, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_unregister_virtual_account (AccountSupervisorServiceIf * iface, const gchar * virtualMid, TalkException ** e, GError ** error);
gboolean account_supervisor_service_client_send_unregister_virtual_account (AccountSupervisorServiceIf * iface, const gchar * virtualMid, GError ** error);
gboolean account_supervisor_service_client_recv_unregister_virtual_account (AccountSupervisorServiceIf * iface, TalkException ** e, GError ** error);
void account_supervisor_service_client_set_property (GObject *object, guint property_id, const GValue *value, GParamSpec *pspec);
void account_supervisor_service_client_get_property (GObject *object, guint property_id, GValue *value, GParamSpec *pspec);

/* AccountSupervisorService handler (abstract base class) */
struct _AccountSupervisorServiceHandler
{
  GObject parent;
};
typedef struct _AccountSupervisorServiceHandler AccountSupervisorServiceHandler;

struct _AccountSupervisorServiceHandlerClass
{
  GObjectClass parent;

  gboolean (*get_r_s_a_key) (AccountSupervisorServiceIf *iface, RSAKey ** _return, TalkException ** e, GError **error);
  gboolean (*notify_email_confirmation_result) (AccountSupervisorServiceIf *iface, const GHashTable * parameterMap, TalkException ** e, GError **error);
  gboolean (*register_virtual_account) (AccountSupervisorServiceIf *iface, gchar ** _return, const gchar * locale, const gchar * encryptedVirtualUserId, const gchar * encryptedPassword, TalkException ** e, GError **error);
  gboolean (*request_virtual_account_password_change) (AccountSupervisorServiceIf *iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedOldPassword, const gchar * encryptedNewPassword, TalkException ** e, GError **error);
  gboolean (*request_virtual_account_password_set) (AccountSupervisorServiceIf *iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedNewPassword, TalkException ** e, GError **error);
  gboolean (*unregister_virtual_account) (AccountSupervisorServiceIf *iface, const gchar * virtualMid, TalkException ** e, GError **error);
};
typedef struct _AccountSupervisorServiceHandlerClass AccountSupervisorServiceHandlerClass;

GType account_supervisor_service_handler_get_type (void);
#define TYPE_ACCOUNT_SUPERVISOR_SERVICE_HANDLER (account_supervisor_service_handler_get_type())
#define ACCOUNT_SUPERVISOR_SERVICE_HANDLER(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_HANDLER, AccountSupervisorServiceHandler))
#define IS_ACCOUNT_SUPERVISOR_SERVICE_HANDLER(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_HANDLER))
#define ACCOUNT_SUPERVISOR_SERVICE_HANDLER_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), TYPE_ACCOUNT_SUPERVISOR_SERVICE_HANDLER, AccountSupervisorServiceHandlerClass))
#define IS_ACCOUNT_SUPERVISOR_SERVICE_HANDLER_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_ACCOUNT_SUPERVISOR_SERVICE_HANDLER))
#define ACCOUNT_SUPERVISOR_SERVICE_HANDLER_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_HANDLER, AccountSupervisorServiceHandlerClass))

gboolean account_supervisor_service_handler_get_r_s_a_key (AccountSupervisorServiceIf *iface, RSAKey ** _return, TalkException ** e, GError **error);
gboolean account_supervisor_service_handler_notify_email_confirmation_result (AccountSupervisorServiceIf *iface, const GHashTable * parameterMap, TalkException ** e, GError **error);
gboolean account_supervisor_service_handler_register_virtual_account (AccountSupervisorServiceIf *iface, gchar ** _return, const gchar * locale, const gchar * encryptedVirtualUserId, const gchar * encryptedPassword, TalkException ** e, GError **error);
gboolean account_supervisor_service_handler_request_virtual_account_password_change (AccountSupervisorServiceIf *iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedOldPassword, const gchar * encryptedNewPassword, TalkException ** e, GError **error);
gboolean account_supervisor_service_handler_request_virtual_account_password_set (AccountSupervisorServiceIf *iface, const gchar * virtualMid, const gchar * encryptedVirtualUserId, const gchar * encryptedNewPassword, TalkException ** e, GError **error);
gboolean account_supervisor_service_handler_unregister_virtual_account (AccountSupervisorServiceIf *iface, const gchar * virtualMid, TalkException ** e, GError **error);

/* AccountSupervisorService processor */
struct _AccountSupervisorServiceProcessor
{
  ThriftDispatchProcessor parent;

  /* protected */
  AccountSupervisorServiceHandler *handler;
  GHashTable *process_map;
};
typedef struct _AccountSupervisorServiceProcessor AccountSupervisorServiceProcessor;

struct _AccountSupervisorServiceProcessorClass
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
typedef struct _AccountSupervisorServiceProcessorClass AccountSupervisorServiceProcessorClass;

GType account_supervisor_service_processor_get_type (void);
#define TYPE_ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR (account_supervisor_service_processor_get_type())
#define ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR, AccountSupervisorServiceProcessor))
#define IS_ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR))
#define ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), TYPE_ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR, AccountSupervisorServiceProcessorClass))
#define IS_ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR))
#define ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_ACCOUNT_SUPERVISOR_SERVICE_PROCESSOR, AccountSupervisorServiceProcessorClass))

#endif /* ACCOUNT_SUPERVISOR_SERVICE_H */
