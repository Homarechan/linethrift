#
# Autogenerated by Thrift Compiler (0.11.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'line_types'

module UniversalNotificationService
  class Client
    include ::Thrift::Client

    def notify(event)
      send_notify(event)
      recv_notify()
    end

    def send_notify(event)
      send_message('notify', Notify_args, :event => event)
    end

    def recv_notify()
      result = receive_message(Notify_result)
      raise result.e unless result.e.nil?
      return
    end

  end

  class Processor
    include ::Thrift::Processor

    def process_notify(seqid, iprot, oprot)
      args = read_args(iprot, Notify_args)
      result = Notify_result.new()
      begin
        @handler.notify(args.event)
      rescue ::UniversalNotificationServiceException => e
        result.e = e
      end
      write_result(result, oprot, 'notify', seqid)
    end

  end

  # HELPER FUNCTIONS AND STRUCTURES

  class Notify_args
    include ::Thrift::Struct, ::Thrift::Struct_Union
    EVENT = 2

    FIELDS = {
      EVENT => {:type => ::Thrift::Types::STRUCT, :name => 'event', :class => ::GlobalEvent}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class Notify_result
    include ::Thrift::Struct, ::Thrift::Struct_Union
    E = 1

    FIELDS = {
      E => {:type => ::Thrift::Types::STRUCT, :name => 'e', :class => ::UniversalNotificationServiceException}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

end

