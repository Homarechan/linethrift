#
# Autogenerated by Thrift Compiler (0.11.0)
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

package MessageService_fetchMessageOperations_args;
use base qw(Class::Accessor);
MessageService_fetchMessageOperations_args->mk_accessors( qw( localRevision lastOpTimestamp count ) );

sub new {
                  my $classname = shift;
                  my $self      = {};
                  my $vals      = shift || {};
                  $self->{localRevision} = undef;
                  $self->{lastOpTimestamp} = undef;
                  $self->{count} = undef;
                  if (UNIVERSAL::isa($vals,'HASH')) {
                    if (defined $vals->{localRevision}) {
                      $self->{localRevision} = $vals->{localRevision};
                    }
                    if (defined $vals->{lastOpTimestamp}) {
                      $self->{lastOpTimestamp} = $vals->{lastOpTimestamp};
                    }
                    if (defined $vals->{count}) {
                      $self->{count} = $vals->{count};
                    }
                  }
                  return bless ($self, $classname);
}

sub getName {
                  return 'MessageService_fetchMessageOperations_args';
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
                      /^2$/ && do{                      if ($ftype == Thrift::TType::I64) {
                        $xfer += $input->readI64(\$self->{localRevision});
                      } else {
                        $xfer += $input->skip($ftype);
                      }
                      last; };
                      /^3$/ && do{                      if ($ftype == Thrift::TType::I64) {
                        $xfer += $input->readI64(\$self->{lastOpTimestamp});
                      } else {
                        $xfer += $input->skip($ftype);
                      }
                      last; };
                      /^4$/ && do{                      if ($ftype == Thrift::TType::I32) {
                        $xfer += $input->readI32(\$self->{count});
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
                  $xfer += $output->writeStructBegin('MessageService_fetchMessageOperations_args');
                  if (defined $self->{localRevision}) {
                    $xfer += $output->writeFieldBegin('localRevision', Thrift::TType::I64, 2);
                    $xfer += $output->writeI64($self->{localRevision});
                    $xfer += $output->writeFieldEnd();
                  }
                  if (defined $self->{lastOpTimestamp}) {
                    $xfer += $output->writeFieldBegin('lastOpTimestamp', Thrift::TType::I64, 3);
                    $xfer += $output->writeI64($self->{lastOpTimestamp});
                    $xfer += $output->writeFieldEnd();
                  }
                  if (defined $self->{count}) {
                    $xfer += $output->writeFieldBegin('count', Thrift::TType::I32, 4);
                    $xfer += $output->writeI32($self->{count});
                    $xfer += $output->writeFieldEnd();
                  }
                  $xfer += $output->writeFieldStop();
                  $xfer += $output->writeStructEnd();
                  return $xfer;
                }

package MessageService_fetchMessageOperations_result;
use base qw(Class::Accessor);
MessageService_fetchMessageOperations_result->mk_accessors( qw( success ) );

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
                  return 'MessageService_fetchMessageOperations_result';
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
                      /^0$/ && do{                      if ($ftype == Thrift::TType::STRUCT) {
                        $self->{success} = MessageOperations->new();
                        $xfer += $self->{success}->read($input);
                      } else {
                        $xfer += $input->skip($ftype);
                      }
                      last; };
                      /^1$/ && do{                      if ($ftype == Thrift::TType::STRUCT) {
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
                  $xfer += $output->writeStructBegin('MessageService_fetchMessageOperations_result');
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

package MessageService_getLastReadMessageIds_args;
use base qw(Class::Accessor);
MessageService_getLastReadMessageIds_args->mk_accessors( qw( chatId ) );

sub new {
                  my $classname = shift;
                  my $self      = {};
                  my $vals      = shift || {};
                  $self->{chatId} = undef;
                  if (UNIVERSAL::isa($vals,'HASH')) {
                    if (defined $vals->{chatId}) {
                      $self->{chatId} = $vals->{chatId};
                    }
                  }
                  return bless ($self, $classname);
}

sub getName {
                  return 'MessageService_getLastReadMessageIds_args';
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
                      /^2$/ && do{                      if ($ftype == Thrift::TType::STRING) {
                        $xfer += $input->readString(\$self->{chatId});
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
                  $xfer += $output->writeStructBegin('MessageService_getLastReadMessageIds_args');
                  if (defined $self->{chatId}) {
                    $xfer += $output->writeFieldBegin('chatId', Thrift::TType::STRING, 2);
                    $xfer += $output->writeString($self->{chatId});
                    $xfer += $output->writeFieldEnd();
                  }
                  $xfer += $output->writeFieldStop();
                  $xfer += $output->writeStructEnd();
                  return $xfer;
                }

package MessageService_getLastReadMessageIds_result;
use base qw(Class::Accessor);
MessageService_getLastReadMessageIds_result->mk_accessors( qw( success ) );

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
                  return 'MessageService_getLastReadMessageIds_result';
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
                      /^0$/ && do{                      if ($ftype == Thrift::TType::STRUCT) {
                        $self->{success} = LastReadMessageIds->new();
                        $xfer += $self->{success}->read($input);
                      } else {
                        $xfer += $input->skip($ftype);
                      }
                      last; };
                      /^1$/ && do{                      if ($ftype == Thrift::TType::STRUCT) {
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
                  $xfer += $output->writeStructBegin('MessageService_getLastReadMessageIds_result');
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

package MessageService_multiGetLastReadMessageIds_args;
use base qw(Class::Accessor);
MessageService_multiGetLastReadMessageIds_args->mk_accessors( qw( chatIds ) );

sub new {
                  my $classname = shift;
                  my $self      = {};
                  my $vals      = shift || {};
                  $self->{chatIds} = undef;
                  if (UNIVERSAL::isa($vals,'HASH')) {
                    if (defined $vals->{chatIds}) {
                      $self->{chatIds} = $vals->{chatIds};
                    }
                  }
                  return bless ($self, $classname);
}

sub getName {
                  return 'MessageService_multiGetLastReadMessageIds_args';
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
                      /^2$/ && do{                      if ($ftype == Thrift::TType::LIST) {
                        {
                          my $_size1306 = 0;
                          $self->{chatIds} = [];
                          my $_etype1309 = 0;
                          $xfer += $input->readListBegin(\$_etype1309, \$_size1306);
                          for (my $_i1310 = 0; $_i1310 < $_size1306; ++$_i1310)
                          {
                            my $elem1311 = undef;
                            $xfer += $input->readString(\$elem1311);
                            push(@{$self->{chatIds}},$elem1311);
                          }
                          $xfer += $input->readListEnd();
                        }
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
                  $xfer += $output->writeStructBegin('MessageService_multiGetLastReadMessageIds_args');
                  if (defined $self->{chatIds}) {
                    $xfer += $output->writeFieldBegin('chatIds', Thrift::TType::LIST, 2);
                    {
                      $xfer += $output->writeListBegin(Thrift::TType::STRING, scalar(@{$self->{chatIds}}));
                      {
                        foreach my $iter1312 (@{$self->{chatIds}}) 
                        {
                          $xfer += $output->writeString($iter1312);
                        }
                      }
                      $xfer += $output->writeListEnd();
                    }
                    $xfer += $output->writeFieldEnd();
                  }
                  $xfer += $output->writeFieldStop();
                  $xfer += $output->writeStructEnd();
                  return $xfer;
                }

package MessageService_multiGetLastReadMessageIds_result;
use base qw(Class::Accessor);
MessageService_multiGetLastReadMessageIds_result->mk_accessors( qw( success ) );

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
                  return 'MessageService_multiGetLastReadMessageIds_result';
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
                      /^0$/ && do{                      if ($ftype == Thrift::TType::LIST) {
                        {
                          my $_size1313 = 0;
                          $self->{success} = [];
                          my $_etype1316 = 0;
                          $xfer += $input->readListBegin(\$_etype1316, \$_size1313);
                          for (my $_i1317 = 0; $_i1317 < $_size1313; ++$_i1317)
                          {
                            my $elem1318 = undef;
                            $elem1318 = LastReadMessageIds->new();
                            $xfer += $elem1318->read($input);
                            push(@{$self->{success}},$elem1318);
                          }
                          $xfer += $input->readListEnd();
                        }
                      } else {
                        $xfer += $input->skip($ftype);
                      }
                      last; };
                      /^1$/ && do{                      if ($ftype == Thrift::TType::STRUCT) {
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
                  $xfer += $output->writeStructBegin('MessageService_multiGetLastReadMessageIds_result');
                  if (defined $self->{success}) {
                    $xfer += $output->writeFieldBegin('success', Thrift::TType::LIST, 0);
                    {
                      $xfer += $output->writeListBegin(Thrift::TType::STRUCT, scalar(@{$self->{success}}));
                      {
                        foreach my $iter1319 (@{$self->{success}}) 
                        {
                          $xfer += ${iter1319}->write($output);
                        }
                      }
                      $xfer += $output->writeListEnd();
                    }
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

package MessageServiceIf;

use strict;


sub fetchMessageOperations{
  my $self = shift;
  my $localRevision = shift;
  my $lastOpTimestamp = shift;
  my $count = shift;

  die 'implement interface';
}

sub getLastReadMessageIds{
  my $self = shift;
  my $chatId = shift;

  die 'implement interface';
}

sub multiGetLastReadMessageIds{
  my $self = shift;
  my $chatIds = shift;

  die 'implement interface';
}

package MessageServiceRest;

use strict;


sub new {
                  my ($classname, $impl) = @_;
                  my $self     ={ impl => $impl };

                  return bless($self,$classname);
}

sub fetchMessageOperations{
                  my ($self, $request) = @_;

                  my $localRevision = ($request->{'localRevision'}) ? $request->{'localRevision'} : undef;
                  my $lastOpTimestamp = ($request->{'lastOpTimestamp'}) ? $request->{'lastOpTimestamp'} : undef;
                  my $count = ($request->{'count'}) ? $request->{'count'} : undef;
                  return $self->{impl}->fetchMessageOperations($localRevision, $lastOpTimestamp, $count);
                }

sub getLastReadMessageIds{
                  my ($self, $request) = @_;

                  my $chatId = ($request->{'chatId'}) ? $request->{'chatId'} : undef;
                  return $self->{impl}->getLastReadMessageIds($chatId);
                }

sub multiGetLastReadMessageIds{
                  my ($self, $request) = @_;

                  my $chatIds = ($request->{'chatIds'}) ? $request->{'chatIds'} : undef;
                  return $self->{impl}->multiGetLastReadMessageIds($chatIds);
                }

package MessageServiceClient;


use base qw(MessageServiceIf);
sub new {
                  my ($classname, $input, $output) = @_;
                  my $self      = {};
                  $self->{input}  = $input;
                  $self->{output} = defined $output ? $output : $input;
                  $self->{seqid}  = 0;
                  return bless($self,$classname);
}

sub fetchMessageOperations{
  my $self = shift;
  my $localRevision = shift;
  my $lastOpTimestamp = shift;
  my $count = shift;

                                    $self->send_fetchMessageOperations($localRevision, $lastOpTimestamp, $count);
                  return $self->recv_fetchMessageOperations();
}

sub send_fetchMessageOperations{
  my $self = shift;
  my $localRevision = shift;
  my $lastOpTimestamp = shift;
  my $count = shift;

                  $self->{output}->writeMessageBegin('fetchMessageOperations', Thrift::TMessageType::CALL, $self->{seqid});
                  my $args = new MessageService_fetchMessageOperations_args();
                  $args->{localRevision} = $localRevision;
                  $args->{lastOpTimestamp} = $lastOpTimestamp;
                  $args->{count} = $count;
                  $args->write($self->{output});
                  $self->{output}->writeMessageEnd();
                  $self->{output}->getTransport()->flush();
}

sub recv_fetchMessageOperations{
  my $self = shift;

                  my $rseqid = 0;
                  my $fname;
                  my $mtype = 0;

                  $self->{input}->readMessageBegin(\$fname, \$mtype, \$rseqid);
                  if ($mtype == Thrift::TMessageType::EXCEPTION) {
                    my $x = new Thrift::TApplicationException();
                    $x->read($self->{input});
                    $self->{input}->readMessageEnd();
                    die $x;
                  }
                  my $result = new MessageService_fetchMessageOperations_result();
                  $result->read($self->{input});
                  $self->{input}->readMessageEnd();

                  if (defined $result->{success} ) {
                    return $result->{success};
                  }
                  if (defined $result->{e}) {
                    die $result->{e};
                  }
                  die "fetchMessageOperations failed: unknown result";
}
sub getLastReadMessageIds{
  my $self = shift;
  my $chatId = shift;

                                    $self->send_getLastReadMessageIds($chatId);
                  return $self->recv_getLastReadMessageIds();
}

sub send_getLastReadMessageIds{
  my $self = shift;
  my $chatId = shift;

                  $self->{output}->writeMessageBegin('getLastReadMessageIds', Thrift::TMessageType::CALL, $self->{seqid});
                  my $args = new MessageService_getLastReadMessageIds_args();
                  $args->{chatId} = $chatId;
                  $args->write($self->{output});
                  $self->{output}->writeMessageEnd();
                  $self->{output}->getTransport()->flush();
}

sub recv_getLastReadMessageIds{
  my $self = shift;

                  my $rseqid = 0;
                  my $fname;
                  my $mtype = 0;

                  $self->{input}->readMessageBegin(\$fname, \$mtype, \$rseqid);
                  if ($mtype == Thrift::TMessageType::EXCEPTION) {
                    my $x = new Thrift::TApplicationException();
                    $x->read($self->{input});
                    $self->{input}->readMessageEnd();
                    die $x;
                  }
                  my $result = new MessageService_getLastReadMessageIds_result();
                  $result->read($self->{input});
                  $self->{input}->readMessageEnd();

                  if (defined $result->{success} ) {
                    return $result->{success};
                  }
                  if (defined $result->{e}) {
                    die $result->{e};
                  }
                  die "getLastReadMessageIds failed: unknown result";
}
sub multiGetLastReadMessageIds{
  my $self = shift;
  my $chatIds = shift;

                                    $self->send_multiGetLastReadMessageIds($chatIds);
                  return $self->recv_multiGetLastReadMessageIds();
}

sub send_multiGetLastReadMessageIds{
  my $self = shift;
  my $chatIds = shift;

                  $self->{output}->writeMessageBegin('multiGetLastReadMessageIds', Thrift::TMessageType::CALL, $self->{seqid});
                  my $args = new MessageService_multiGetLastReadMessageIds_args();
                  $args->{chatIds} = $chatIds;
                  $args->write($self->{output});
                  $self->{output}->writeMessageEnd();
                  $self->{output}->getTransport()->flush();
}

sub recv_multiGetLastReadMessageIds{
  my $self = shift;

                  my $rseqid = 0;
                  my $fname;
                  my $mtype = 0;

                  $self->{input}->readMessageBegin(\$fname, \$mtype, \$rseqid);
                  if ($mtype == Thrift::TMessageType::EXCEPTION) {
                    my $x = new Thrift::TApplicationException();
                    $x->read($self->{input});
                    $self->{input}->readMessageEnd();
                    die $x;
                  }
                  my $result = new MessageService_multiGetLastReadMessageIds_result();
                  $result->read($self->{input});
                  $self->{input}->readMessageEnd();

                  if (defined $result->{success} ) {
                    return $result->{success};
                  }
                  if (defined $result->{e}) {
                    die $result->{e};
                  }
                  die "multiGetLastReadMessageIds failed: unknown result";
}
package MessageServiceProcessor;

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
                      my $x = new Thrift::TApplicationException('Function '.$fname.' not implemented.', Thrift::TApplicationException::UNKNOWN_METHOD);
                      $output->writeMessageBegin($fname, Thrift::TMessageType::EXCEPTION, $rseqid);
                      $x->write($output);
                      $output->writeMessageEnd();
                      $output->getTransport()->flush();
                      return;
                    }
                    $self->$methodname($rseqid, $input, $output);
                    return 1;
}

sub process_fetchMessageOperations {
                    my ($self, $seqid, $input, $output) = @_;
                    my $args = new MessageService_fetchMessageOperations_args();
                    $args->read($input);
                    $input->readMessageEnd();
                    my $result = new MessageService_fetchMessageOperations_result();
                    eval {
                      $result->{success} = $self->{handler}->fetchMessageOperations($args->localRevision, $args->lastOpTimestamp, $args->count);
                    }; if( UNIVERSAL::isa($@,'TalkException') ){ 
                      $result->{e} = $@;
                      $@ = undef;
                    }
                    if ($@) {
                      $@ =~ s/^\s+|\s+$//g;
                      my $err = new Thrift::TApplicationException("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
                      $output->writeMessageBegin('fetchMessageOperations', Thrift::TMessageType::EXCEPTION, $seqid);
                      $err->write($output);
                      $output->writeMessageEnd();
                      $output->getTransport()->flush();
                      $@ = undef;
                      return;
                    }
                    $output->writeMessageBegin('fetchMessageOperations', Thrift::TMessageType::REPLY, $seqid);
                    $result->write($output);
                    $output->writeMessageEnd();
                    $output->getTransport()->flush();
}

sub process_getLastReadMessageIds {
                    my ($self, $seqid, $input, $output) = @_;
                    my $args = new MessageService_getLastReadMessageIds_args();
                    $args->read($input);
                    $input->readMessageEnd();
                    my $result = new MessageService_getLastReadMessageIds_result();
                    eval {
                      $result->{success} = $self->{handler}->getLastReadMessageIds($args->chatId);
                    }; if( UNIVERSAL::isa($@,'TalkException') ){ 
                      $result->{e} = $@;
                      $@ = undef;
                    }
                    if ($@) {
                      $@ =~ s/^\s+|\s+$//g;
                      my $err = new Thrift::TApplicationException("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
                      $output->writeMessageBegin('getLastReadMessageIds', Thrift::TMessageType::EXCEPTION, $seqid);
                      $err->write($output);
                      $output->writeMessageEnd();
                      $output->getTransport()->flush();
                      $@ = undef;
                      return;
                    }
                    $output->writeMessageBegin('getLastReadMessageIds', Thrift::TMessageType::REPLY, $seqid);
                    $result->write($output);
                    $output->writeMessageEnd();
                    $output->getTransport()->flush();
}

sub process_multiGetLastReadMessageIds {
                    my ($self, $seqid, $input, $output) = @_;
                    my $args = new MessageService_multiGetLastReadMessageIds_args();
                    $args->read($input);
                    $input->readMessageEnd();
                    my $result = new MessageService_multiGetLastReadMessageIds_result();
                    eval {
                      $result->{success} = $self->{handler}->multiGetLastReadMessageIds($args->chatIds);
                    }; if( UNIVERSAL::isa($@,'TalkException') ){ 
                      $result->{e} = $@;
                      $@ = undef;
                    }
                    if ($@) {
                      $@ =~ s/^\s+|\s+$//g;
                      my $err = new Thrift::TApplicationException("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
                      $output->writeMessageBegin('multiGetLastReadMessageIds', Thrift::TMessageType::EXCEPTION, $seqid);
                      $err->write($output);
                      $output->writeMessageEnd();
                      $output->getTransport()->flush();
                      $@ = undef;
                      return;
                    }
                    $output->writeMessageBegin('multiGetLastReadMessageIds', Thrift::TMessageType::REPLY, $seqid);
                    $result->write($output);
                    $output->writeMessageEnd();
                    $output->getTransport()->flush();
}

1;
