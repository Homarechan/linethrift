#
# Autogenerated by Thrift Compiler (0.14.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
use 5.10.0;
use strict;
use warnings;
use Thrift::Exception;
use Thrift::MessageType;
use Thrift::Type;

use Types;


# HELPER FUNCTIONS AND STRUCTURES

package BotService_notifyLeaveGroup_args;
use base qw(Class::Accessor);
BotService_notifyLeaveGroup_args->mk_accessors( qw( groupMid ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{groupMid} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{groupMid}) {
          $self->{groupMid} = $vals->{groupMid};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'BotService_notifyLeaveGroup_args';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1)
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == Thrift::TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^1$/ && do{          if ($ftype == Thrift::TType::STRING) {
            $xfer += $input->readString(\$self->{groupMid});
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('BotService_notifyLeaveGroup_args');
      if (defined $self->{groupMid}) {
        $xfer += $output->writeFieldBegin('groupMid', Thrift::TType::STRING, 1);
        $xfer += $output->writeString($self->{groupMid});
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package BotService_notifyLeaveGroup_result;
use base qw(Class::Accessor);
BotService_notifyLeaveGroup_result->mk_accessors( qw( ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{e} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{e}) {
          $self->{e} = $vals->{e};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'BotService_notifyLeaveGroup_result';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1)
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == Thrift::TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^1$/ && do{          if ($ftype == Thrift::TType::STRUCT) {
            $self->{e} = TalkException->new();
            $xfer += $self->{e}->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('BotService_notifyLeaveGroup_result');
      if (defined $self->{e}) {
        $xfer += $output->writeFieldBegin('e', Thrift::TType::STRUCT, 1);
        $xfer += $self->{e}->write($output);
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package BotService_notifyLeaveRoom_args;
use base qw(Class::Accessor);
BotService_notifyLeaveRoom_args->mk_accessors( qw( roomMid ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{roomMid} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{roomMid}) {
          $self->{roomMid} = $vals->{roomMid};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'BotService_notifyLeaveRoom_args';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1)
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == Thrift::TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^1$/ && do{          if ($ftype == Thrift::TType::STRING) {
            $xfer += $input->readString(\$self->{roomMid});
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('BotService_notifyLeaveRoom_args');
      if (defined $self->{roomMid}) {
        $xfer += $output->writeFieldBegin('roomMid', Thrift::TType::STRING, 1);
        $xfer += $output->writeString($self->{roomMid});
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package BotService_notifyLeaveRoom_result;
use base qw(Class::Accessor);
BotService_notifyLeaveRoom_result->mk_accessors( qw( ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{e} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{e}) {
          $self->{e} = $vals->{e};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'BotService_notifyLeaveRoom_result';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1)
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == Thrift::TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^1$/ && do{          if ($ftype == Thrift::TType::STRUCT) {
            $self->{e} = TalkException->new();
            $xfer += $self->{e}->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('BotService_notifyLeaveRoom_result');
      if (defined $self->{e}) {
        $xfer += $output->writeFieldBegin('e', Thrift::TType::STRUCT, 1);
        $xfer += $self->{e}->write($output);
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package BotService_getBotUseInfo_args;
use base qw(Class::Accessor);
BotService_getBotUseInfo_args->mk_accessors( qw( botMid ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{botMid} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{botMid}) {
          $self->{botMid} = $vals->{botMid};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'BotService_getBotUseInfo_args';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1)
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == Thrift::TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^2$/ && do{          if ($ftype == Thrift::TType::STRING) {
            $xfer += $input->readString(\$self->{botMid});
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('BotService_getBotUseInfo_args');
      if (defined $self->{botMid}) {
        $xfer += $output->writeFieldBegin('botMid', Thrift::TType::STRING, 2);
        $xfer += $output->writeString($self->{botMid});
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package BotService_getBotUseInfo_result;
use base qw(Class::Accessor);
BotService_getBotUseInfo_result->mk_accessors( qw( success ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{success} = undef;
      $self->{e} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{success}) {
          $self->{success} = $vals->{success};
        }
        if (defined $vals->{e}) {
          $self->{e} = $vals->{e};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'BotService_getBotUseInfo_result';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1)
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == Thrift::TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^0$/ && do{          if ($ftype == Thrift::TType::STRUCT) {
            $self->{success} = BotUseInfo->new();
            $xfer += $self->{success}->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
          /^1$/ && do{          if ($ftype == Thrift::TType::STRUCT) {
            $self->{e} = TalkException->new();
            $xfer += $self->{e}->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('BotService_getBotUseInfo_result');
      if (defined $self->{success}) {
        $xfer += $output->writeFieldBegin('success', Thrift::TType::STRUCT, 0);
        $xfer += $self->{success}->write($output);
        $xfer += $output->writeFieldEnd();
      }
      if (defined $self->{e}) {
        $xfer += $output->writeFieldBegin('e', Thrift::TType::STRUCT, 1);
        $xfer += $self->{e}->write($output);
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package BotService_sendChatCheckedByWatermark_args;
use base qw(Class::Accessor);
BotService_sendChatCheckedByWatermark_args->mk_accessors( qw( seq mid watermark sessionId ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{seq} = undef;
      $self->{mid} = undef;
      $self->{watermark} = undef;
      $self->{sessionId} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{seq}) {
          $self->{seq} = $vals->{seq};
        }
        if (defined $vals->{mid}) {
          $self->{mid} = $vals->{mid};
        }
        if (defined $vals->{watermark}) {
          $self->{watermark} = $vals->{watermark};
        }
        if (defined $vals->{sessionId}) {
          $self->{sessionId} = $vals->{sessionId};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'BotService_sendChatCheckedByWatermark_args';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1)
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == Thrift::TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^1$/ && do{          if ($ftype == Thrift::TType::I32) {
            $xfer += $input->readI32(\$self->{seq});
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
          /^2$/ && do{          if ($ftype == Thrift::TType::STRING) {
            $xfer += $input->readString(\$self->{mid});
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
          /^3$/ && do{          if ($ftype == Thrift::TType::I64) {
            $xfer += $input->readI64(\$self->{watermark});
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
          /^4$/ && do{          if ($ftype == Thrift::TType::BYTE) {
            $xfer += $input->readByte(\$self->{sessionId});
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('BotService_sendChatCheckedByWatermark_args');
      if (defined $self->{seq}) {
        $xfer += $output->writeFieldBegin('seq', Thrift::TType::I32, 1);
        $xfer += $output->writeI32($self->{seq});
        $xfer += $output->writeFieldEnd();
      }
      if (defined $self->{mid}) {
        $xfer += $output->writeFieldBegin('mid', Thrift::TType::STRING, 2);
        $xfer += $output->writeString($self->{mid});
        $xfer += $output->writeFieldEnd();
      }
      if (defined $self->{watermark}) {
        $xfer += $output->writeFieldBegin('watermark', Thrift::TType::I64, 3);
        $xfer += $output->writeI64($self->{watermark});
        $xfer += $output->writeFieldEnd();
      }
      if (defined $self->{sessionId}) {
        $xfer += $output->writeFieldBegin('sessionId', Thrift::TType::BYTE, 4);
        $xfer += $output->writeByte($self->{sessionId});
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package BotService_sendChatCheckedByWatermark_result;
use base qw(Class::Accessor);
BotService_sendChatCheckedByWatermark_result->mk_accessors( qw( ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{e} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{e}) {
          $self->{e} = $vals->{e};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'BotService_sendChatCheckedByWatermark_result';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1)
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == Thrift::TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^1$/ && do{          if ($ftype == Thrift::TType::STRUCT) {
            $self->{e} = TalkException->new();
            $xfer += $self->{e}->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('BotService_sendChatCheckedByWatermark_result');
      if (defined $self->{e}) {
        $xfer += $output->writeFieldBegin('e', Thrift::TType::STRUCT, 1);
        $xfer += $self->{e}->write($output);
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package BotServiceIf;

use strict;


sub notifyLeaveGroup{
  my $self = shift;
  my $groupMid = shift;

  die 'implement interface';
}

sub notifyLeaveRoom{
  my $self = shift;
  my $roomMid = shift;

  die 'implement interface';
}

sub getBotUseInfo{
  my $self = shift;
  my $botMid = shift;

  die 'implement interface';
}

sub sendChatCheckedByWatermark{
  my $self = shift;
  my $seq = shift;
  my $mid = shift;
  my $watermark = shift;
  my $sessionId = shift;

  die 'implement interface';
}

package BotServiceRest;

use strict;


sub new {
      my ($classname, $impl) = @_;
      my $self     ={ impl => $impl };

      return bless($self,$classname);
}

sub notifyLeaveGroup{
      my ($self, $request) = @_;

      my $groupMid = ($request->{'groupMid'}) ? $request->{'groupMid'} : undef;
      return $self->{impl}->notifyLeaveGroup($groupMid);
    }

sub notifyLeaveRoom{
      my ($self, $request) = @_;

      my $roomMid = ($request->{'roomMid'}) ? $request->{'roomMid'} : undef;
      return $self->{impl}->notifyLeaveRoom($roomMid);
    }

sub getBotUseInfo{
      my ($self, $request) = @_;

      my $botMid = ($request->{'botMid'}) ? $request->{'botMid'} : undef;
      return $self->{impl}->getBotUseInfo($botMid);
    }

sub sendChatCheckedByWatermark{
      my ($self, $request) = @_;

      my $seq = ($request->{'seq'}) ? $request->{'seq'} : undef;
      my $mid = ($request->{'mid'}) ? $request->{'mid'} : undef;
      my $watermark = ($request->{'watermark'}) ? $request->{'watermark'} : undef;
      my $sessionId = ($request->{'sessionId'}) ? $request->{'sessionId'} : undef;
      return $self->{impl}->sendChatCheckedByWatermark($seq, $mid, $watermark, $sessionId);
    }

package BotServiceClient;


use base qw(BotServiceIf);
sub new {
      my ($classname, $input, $output) = @_;
      my $self      = {};
      $self->{input}  = $input;
      $self->{output} = defined $output ? $output : $input;
      $self->{seqid}  = 0;
      return bless($self,$classname);
}

sub notifyLeaveGroup{
  my $self = shift;
  my $groupMid = shift;

            $self->send_notifyLeaveGroup($groupMid);
      $self->recv_notifyLeaveGroup();
}

sub send_notifyLeaveGroup{
  my $self = shift;
  my $groupMid = shift;

      $self->{output}->writeMessageBegin('notifyLeaveGroup', Thrift::TMessageType::CALL, $self->{seqid});
      my $args = BotService_notifyLeaveGroup_args->new();
      $args->{groupMid} = $groupMid;
      $args->write($self->{output});
      $self->{output}->writeMessageEnd();
      $self->{output}->getTransport()->flush();
}

sub recv_notifyLeaveGroup{
  my $self = shift;

      my $rseqid = 0;
      my $fname;
      my $mtype = 0;

      $self->{input}->readMessageBegin(\$fname, \$mtype, \$rseqid);
      if ($mtype == Thrift::TMessageType::EXCEPTION) {
        my $x = Thrift::TApplicationException->new();
        $x->read($self->{input});
        $self->{input}->readMessageEnd();
        die $x;
      }
      my $result = BotService_notifyLeaveGroup_result->new();
      $result->read($self->{input});
      $self->{input}->readMessageEnd();

      if (defined $result->{e}) {
        die $result->{e};
      }
      return;
}
sub notifyLeaveRoom{
  my $self = shift;
  my $roomMid = shift;

            $self->send_notifyLeaveRoom($roomMid);
      $self->recv_notifyLeaveRoom();
}

sub send_notifyLeaveRoom{
  my $self = shift;
  my $roomMid = shift;

      $self->{output}->writeMessageBegin('notifyLeaveRoom', Thrift::TMessageType::CALL, $self->{seqid});
      my $args = BotService_notifyLeaveRoom_args->new();
      $args->{roomMid} = $roomMid;
      $args->write($self->{output});
      $self->{output}->writeMessageEnd();
      $self->{output}->getTransport()->flush();
}

sub recv_notifyLeaveRoom{
  my $self = shift;

      my $rseqid = 0;
      my $fname;
      my $mtype = 0;

      $self->{input}->readMessageBegin(\$fname, \$mtype, \$rseqid);
      if ($mtype == Thrift::TMessageType::EXCEPTION) {
        my $x = Thrift::TApplicationException->new();
        $x->read($self->{input});
        $self->{input}->readMessageEnd();
        die $x;
      }
      my $result = BotService_notifyLeaveRoom_result->new();
      $result->read($self->{input});
      $self->{input}->readMessageEnd();

      if (defined $result->{e}) {
        die $result->{e};
      }
      return;
}
sub getBotUseInfo{
  my $self = shift;
  my $botMid = shift;

            $self->send_getBotUseInfo($botMid);
      return $self->recv_getBotUseInfo();
}

sub send_getBotUseInfo{
  my $self = shift;
  my $botMid = shift;

      $self->{output}->writeMessageBegin('getBotUseInfo', Thrift::TMessageType::CALL, $self->{seqid});
      my $args = BotService_getBotUseInfo_args->new();
      $args->{botMid} = $botMid;
      $args->write($self->{output});
      $self->{output}->writeMessageEnd();
      $self->{output}->getTransport()->flush();
}

sub recv_getBotUseInfo{
  my $self = shift;

      my $rseqid = 0;
      my $fname;
      my $mtype = 0;

      $self->{input}->readMessageBegin(\$fname, \$mtype, \$rseqid);
      if ($mtype == Thrift::TMessageType::EXCEPTION) {
        my $x = Thrift::TApplicationException->new();
        $x->read($self->{input});
        $self->{input}->readMessageEnd();
        die $x;
      }
      my $result = BotService_getBotUseInfo_result->new();
      $result->read($self->{input});
      $self->{input}->readMessageEnd();

      if (defined $result->{success} ) {
        return $result->{success};
      }
      if (defined $result->{e}) {
        die $result->{e};
      }
      die "getBotUseInfo failed: unknown result";
}
sub sendChatCheckedByWatermark{
  my $self = shift;
  my $seq = shift;
  my $mid = shift;
  my $watermark = shift;
  my $sessionId = shift;

            $self->send_sendChatCheckedByWatermark($seq, $mid, $watermark, $sessionId);
      $self->recv_sendChatCheckedByWatermark();
}

sub send_sendChatCheckedByWatermark{
  my $self = shift;
  my $seq = shift;
  my $mid = shift;
  my $watermark = shift;
  my $sessionId = shift;

      $self->{output}->writeMessageBegin('sendChatCheckedByWatermark', Thrift::TMessageType::CALL, $self->{seqid});
      my $args = BotService_sendChatCheckedByWatermark_args->new();
      $args->{seq} = $seq;
      $args->{mid} = $mid;
      $args->{watermark} = $watermark;
      $args->{sessionId} = $sessionId;
      $args->write($self->{output});
      $self->{output}->writeMessageEnd();
      $self->{output}->getTransport()->flush();
}

sub recv_sendChatCheckedByWatermark{
  my $self = shift;

      my $rseqid = 0;
      my $fname;
      my $mtype = 0;

      $self->{input}->readMessageBegin(\$fname, \$mtype, \$rseqid);
      if ($mtype == Thrift::TMessageType::EXCEPTION) {
        my $x = Thrift::TApplicationException->new();
        $x->read($self->{input});
        $self->{input}->readMessageEnd();
        die $x;
      }
      my $result = BotService_sendChatCheckedByWatermark_result->new();
      $result->read($self->{input});
      $self->{input}->readMessageEnd();

      if (defined $result->{e}) {
        die $result->{e};
      }
      return;
}
package BotServiceProcessor;

use strict;


sub new {
        my ($classname, $handler) = @_;
        my $self      = {};
        $self->{handler} = $handler;
        return bless ($self, $classname);
}

sub process {
        my ($self, $input, $output) = @_;
        my $rseqid = 0;
        my $fname  = undef;
        my $mtype  = 0;

        $input->readMessageBegin(\$fname, \$mtype, \$rseqid);
        my $methodname = 'process_'.$fname;
        if (!$self->can($methodname)) {
          $input->skip(Thrift::TType::STRUCT);
          $input->readMessageEnd();
          my $x = Thrift::TApplicationException->new('Function '.$fname.' not implemented.', Thrift::TApplicationException::UNKNOWN_METHOD);
          $output->writeMessageBegin($fname, Thrift::TMessageType::EXCEPTION, $rseqid);
          $x->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
          return;
        }
        $self->$methodname($rseqid, $input, $output);
        return 1;
}

sub process_notifyLeaveGroup {
        my ($self, $seqid, $input, $output) = @_;
        my $args = BotService_notifyLeaveGroup_args->new();
        $args->read($input);
        $input->readMessageEnd();
        my $result = BotService_notifyLeaveGroup_result->new();
        eval {
          $self->{handler}->notifyLeaveGroup($args->groupMid);
        }; if( UNIVERSAL::isa($@,'TalkException') ){ 
          $result->{e} = $@;
          $@ = undef;
        }
        if ($@) {
          $@ =~ s/^\s+|\s+$//g;
          my $err = Thrift::TApplicationException->new("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
          $output->writeMessageBegin('notifyLeaveGroup', Thrift::TMessageType::EXCEPTION, $seqid);
          $err->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
          $@ = undef;
          return;
        }
        $output->writeMessageBegin('notifyLeaveGroup', Thrift::TMessageType::REPLY, $seqid);
        $result->write($output);
        $output->writeMessageEnd();
        $output->getTransport()->flush();
}

sub process_notifyLeaveRoom {
        my ($self, $seqid, $input, $output) = @_;
        my $args = BotService_notifyLeaveRoom_args->new();
        $args->read($input);
        $input->readMessageEnd();
        my $result = BotService_notifyLeaveRoom_result->new();
        eval {
          $self->{handler}->notifyLeaveRoom($args->roomMid);
        }; if( UNIVERSAL::isa($@,'TalkException') ){ 
          $result->{e} = $@;
          $@ = undef;
        }
        if ($@) {
          $@ =~ s/^\s+|\s+$//g;
          my $err = Thrift::TApplicationException->new("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
          $output->writeMessageBegin('notifyLeaveRoom', Thrift::TMessageType::EXCEPTION, $seqid);
          $err->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
          $@ = undef;
          return;
        }
        $output->writeMessageBegin('notifyLeaveRoom', Thrift::TMessageType::REPLY, $seqid);
        $result->write($output);
        $output->writeMessageEnd();
        $output->getTransport()->flush();
}

sub process_getBotUseInfo {
        my ($self, $seqid, $input, $output) = @_;
        my $args = BotService_getBotUseInfo_args->new();
        $args->read($input);
        $input->readMessageEnd();
        my $result = BotService_getBotUseInfo_result->new();
        eval {
          $result->{success} = $self->{handler}->getBotUseInfo($args->botMid);
        }; if( UNIVERSAL::isa($@,'TalkException') ){ 
          $result->{e} = $@;
          $@ = undef;
        }
        if ($@) {
          $@ =~ s/^\s+|\s+$//g;
          my $err = Thrift::TApplicationException->new("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
          $output->writeMessageBegin('getBotUseInfo', Thrift::TMessageType::EXCEPTION, $seqid);
          $err->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
          $@ = undef;
          return;
        }
        $output->writeMessageBegin('getBotUseInfo', Thrift::TMessageType::REPLY, $seqid);
        $result->write($output);
        $output->writeMessageEnd();
        $output->getTransport()->flush();
}

sub process_sendChatCheckedByWatermark {
        my ($self, $seqid, $input, $output) = @_;
        my $args = BotService_sendChatCheckedByWatermark_args->new();
        $args->read($input);
        $input->readMessageEnd();
        my $result = BotService_sendChatCheckedByWatermark_result->new();
        eval {
          $self->{handler}->sendChatCheckedByWatermark($args->seq, $args->mid, $args->watermark, $args->sessionId);
        }; if( UNIVERSAL::isa($@,'TalkException') ){ 
          $result->{e} = $@;
          $@ = undef;
        }
        if ($@) {
          $@ =~ s/^\s+|\s+$//g;
          my $err = Thrift::TApplicationException->new("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
          $output->writeMessageBegin('sendChatCheckedByWatermark', Thrift::TMessageType::EXCEPTION, $seqid);
          $err->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
          $@ = undef;
          return;
        }
        $output->writeMessageBegin('sendChatCheckedByWatermark', Thrift::TMessageType::REPLY, $seqid);
        $result->write($output);
        $output->writeMessageEnd();
        $output->getTransport()->flush();
}

1;
