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

package AgeCheckService_checkUserAge_args;
use base qw(Class::Accessor);
AgeCheckService_checkUserAge_args->mk_accessors( qw( carrier sessionId verifier standardAge ) );

sub new {
        my $classname = shift;
        my $self      = {};
        my $vals      = shift || {};
        $self->{carrier} = undef;
        $self->{sessionId} = undef;
        $self->{verifier} = undef;
        $self->{standardAge} = undef;
        if (UNIVERSAL::isa($vals,'HASH')) {
          if (defined $vals->{carrier}) {
            $self->{carrier} = $vals->{carrier};
          }
          if (defined $vals->{sessionId}) {
            $self->{sessionId} = $vals->{sessionId};
          }
          if (defined $vals->{verifier}) {
            $self->{verifier} = $vals->{verifier};
          }
          if (defined $vals->{standardAge}) {
            $self->{standardAge} = $vals->{standardAge};
          }
        }
        return bless ($self, $classname);
}

sub getName {
        return 'AgeCheckService_checkUserAge_args';
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
            /^2$/ && do{            if ($ftype == Thrift::TType::I32) {
              $xfer += $input->readI32(\$self->{carrier});
            } else {
              $xfer += $input->skip($ftype);
            }
            last; };
            /^3$/ && do{            if ($ftype == Thrift::TType::STRING) {
              $xfer += $input->readString(\$self->{sessionId});
            } else {
              $xfer += $input->skip($ftype);
            }
            last; };
            /^4$/ && do{            if ($ftype == Thrift::TType::STRING) {
              $xfer += $input->readString(\$self->{verifier});
            } else {
              $xfer += $input->skip($ftype);
            }
            last; };
            /^5$/ && do{            if ($ftype == Thrift::TType::I32) {
              $xfer += $input->readI32(\$self->{standardAge});
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
        $xfer += $output->writeStructBegin('AgeCheckService_checkUserAge_args');
        if (defined $self->{carrier}) {
          $xfer += $output->writeFieldBegin('carrier', Thrift::TType::I32, 2);
          $xfer += $output->writeI32($self->{carrier});
          $xfer += $output->writeFieldEnd();
        }
        if (defined $self->{sessionId}) {
          $xfer += $output->writeFieldBegin('sessionId', Thrift::TType::STRING, 3);
          $xfer += $output->writeString($self->{sessionId});
          $xfer += $output->writeFieldEnd();
        }
        if (defined $self->{verifier}) {
          $xfer += $output->writeFieldBegin('verifier', Thrift::TType::STRING, 4);
          $xfer += $output->writeString($self->{verifier});
          $xfer += $output->writeFieldEnd();
        }
        if (defined $self->{standardAge}) {
          $xfer += $output->writeFieldBegin('standardAge', Thrift::TType::I32, 5);
          $xfer += $output->writeI32($self->{standardAge});
          $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
      }

package AgeCheckService_checkUserAge_result;
use base qw(Class::Accessor);
AgeCheckService_checkUserAge_result->mk_accessors( qw( success ) );

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
        return 'AgeCheckService_checkUserAge_result';
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
            /^0$/ && do{            if ($ftype == Thrift::TType::I32) {
              $xfer += $input->readI32(\$self->{success});
            } else {
              $xfer += $input->skip($ftype);
            }
            last; };
            /^1$/ && do{            if ($ftype == Thrift::TType::STRUCT) {
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
        $xfer += $output->writeStructBegin('AgeCheckService_checkUserAge_result');
        if (defined $self->{success}) {
          $xfer += $output->writeFieldBegin('success', Thrift::TType::I32, 0);
          $xfer += $output->writeI32($self->{success});
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

package AgeCheckService_checkUserAgeWithDocomo_args;
use base qw(Class::Accessor);
AgeCheckService_checkUserAgeWithDocomo_args->mk_accessors( qw( openIdRedirectUrl standardAge verifier ) );

sub new {
        my $classname = shift;
        my $self      = {};
        my $vals      = shift || {};
        $self->{openIdRedirectUrl} = undef;
        $self->{standardAge} = undef;
        $self->{verifier} = undef;
        if (UNIVERSAL::isa($vals,'HASH')) {
          if (defined $vals->{openIdRedirectUrl}) {
            $self->{openIdRedirectUrl} = $vals->{openIdRedirectUrl};
          }
          if (defined $vals->{standardAge}) {
            $self->{standardAge} = $vals->{standardAge};
          }
          if (defined $vals->{verifier}) {
            $self->{verifier} = $vals->{verifier};
          }
        }
        return bless ($self, $classname);
}

sub getName {
        return 'AgeCheckService_checkUserAgeWithDocomo_args';
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
            /^2$/ && do{            if ($ftype == Thrift::TType::STRING) {
              $xfer += $input->readString(\$self->{openIdRedirectUrl});
            } else {
              $xfer += $input->skip($ftype);
            }
            last; };
            /^3$/ && do{            if ($ftype == Thrift::TType::I32) {
              $xfer += $input->readI32(\$self->{standardAge});
            } else {
              $xfer += $input->skip($ftype);
            }
            last; };
            /^4$/ && do{            if ($ftype == Thrift::TType::STRING) {
              $xfer += $input->readString(\$self->{verifier});
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
        $xfer += $output->writeStructBegin('AgeCheckService_checkUserAgeWithDocomo_args');
        if (defined $self->{openIdRedirectUrl}) {
          $xfer += $output->writeFieldBegin('openIdRedirectUrl', Thrift::TType::STRING, 2);
          $xfer += $output->writeString($self->{openIdRedirectUrl});
          $xfer += $output->writeFieldEnd();
        }
        if (defined $self->{standardAge}) {
          $xfer += $output->writeFieldBegin('standardAge', Thrift::TType::I32, 3);
          $xfer += $output->writeI32($self->{standardAge});
          $xfer += $output->writeFieldEnd();
        }
        if (defined $self->{verifier}) {
          $xfer += $output->writeFieldBegin('verifier', Thrift::TType::STRING, 4);
          $xfer += $output->writeString($self->{verifier});
          $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
      }

package AgeCheckService_checkUserAgeWithDocomo_result;
use base qw(Class::Accessor);
AgeCheckService_checkUserAgeWithDocomo_result->mk_accessors( qw( success ) );

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
        return 'AgeCheckService_checkUserAgeWithDocomo_result';
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
            /^0$/ && do{            if ($ftype == Thrift::TType::STRUCT) {
              $self->{success} = AgeCheckDocomoResult->new();
              $xfer += $self->{success}->read($input);
            } else {
              $xfer += $input->skip($ftype);
            }
            last; };
            /^1$/ && do{            if ($ftype == Thrift::TType::STRUCT) {
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
        $xfer += $output->writeStructBegin('AgeCheckService_checkUserAgeWithDocomo_result');
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

package AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args;
use base qw(Class::Accessor);

sub new {
        my $classname = shift;
        my $self      = {};
        my $vals      = shift || {};
        return bless ($self, $classname);
}

sub getName {
        return 'AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args';
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
        $xfer += $output->writeStructBegin('AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args');
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
      }

package AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result;
use base qw(Class::Accessor);
AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result->mk_accessors( qw( success ) );

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
        return 'AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result';
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
            /^0$/ && do{            if ($ftype == Thrift::TType::STRING) {
              $xfer += $input->readString(\$self->{success});
            } else {
              $xfer += $input->skip($ftype);
            }
            last; };
            /^1$/ && do{            if ($ftype == Thrift::TType::STRUCT) {
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
        $xfer += $output->writeStructBegin('AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result');
        if (defined $self->{success}) {
          $xfer += $output->writeFieldBegin('success', Thrift::TType::STRING, 0);
          $xfer += $output->writeString($self->{success});
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

package AgeCheckService_retrieveRequestToken_args;
use base qw(Class::Accessor);
AgeCheckService_retrieveRequestToken_args->mk_accessors( qw( carrier ) );

sub new {
        my $classname = shift;
        my $self      = {};
        my $vals      = shift || {};
        $self->{carrier} = undef;
        if (UNIVERSAL::isa($vals,'HASH')) {
          if (defined $vals->{carrier}) {
            $self->{carrier} = $vals->{carrier};
          }
        }
        return bless ($self, $classname);
}

sub getName {
        return 'AgeCheckService_retrieveRequestToken_args';
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
            /^2$/ && do{            if ($ftype == Thrift::TType::I32) {
              $xfer += $input->readI32(\$self->{carrier});
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
        $xfer += $output->writeStructBegin('AgeCheckService_retrieveRequestToken_args');
        if (defined $self->{carrier}) {
          $xfer += $output->writeFieldBegin('carrier', Thrift::TType::I32, 2);
          $xfer += $output->writeI32($self->{carrier});
          $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
      }

package AgeCheckService_retrieveRequestToken_result;
use base qw(Class::Accessor);
AgeCheckService_retrieveRequestToken_result->mk_accessors( qw( success ) );

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
        return 'AgeCheckService_retrieveRequestToken_result';
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
            /^0$/ && do{            if ($ftype == Thrift::TType::STRUCT) {
              $self->{success} = AgeCheckRequestResult->new();
              $xfer += $self->{success}->read($input);
            } else {
              $xfer += $input->skip($ftype);
            }
            last; };
            /^1$/ && do{            if ($ftype == Thrift::TType::STRUCT) {
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
        $xfer += $output->writeStructBegin('AgeCheckService_retrieveRequestToken_result');
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

package AgeCheckServiceIf;

use strict;


sub checkUserAge{
  my $self = shift;
  my $carrier = shift;
  my $sessionId = shift;
  my $verifier = shift;
  my $standardAge = shift;

  die 'implement interface';
}

sub checkUserAgeWithDocomo{
  my $self = shift;
  my $openIdRedirectUrl = shift;
  my $standardAge = shift;
  my $verifier = shift;

  die 'implement interface';
}

sub retrieveOpenIdAuthUrlWithDocomo{
  my $self = shift;

  die 'implement interface';
}

sub retrieveRequestToken{
  my $self = shift;
  my $carrier = shift;

  die 'implement interface';
}

package AgeCheckServiceRest;

use strict;


sub new {
        my ($classname, $impl) = @_;
        my $self     ={ impl => $impl };

        return bless($self,$classname);
}

sub checkUserAge{
        my ($self, $request) = @_;

        my $carrier = ($request->{'carrier'}) ? $request->{'carrier'} : undef;
        my $sessionId = ($request->{'sessionId'}) ? $request->{'sessionId'} : undef;
        my $verifier = ($request->{'verifier'}) ? $request->{'verifier'} : undef;
        my $standardAge = ($request->{'standardAge'}) ? $request->{'standardAge'} : undef;
        return $self->{impl}->checkUserAge($carrier, $sessionId, $verifier, $standardAge);
      }

sub checkUserAgeWithDocomo{
        my ($self, $request) = @_;

        my $openIdRedirectUrl = ($request->{'openIdRedirectUrl'}) ? $request->{'openIdRedirectUrl'} : undef;
        my $standardAge = ($request->{'standardAge'}) ? $request->{'standardAge'} : undef;
        my $verifier = ($request->{'verifier'}) ? $request->{'verifier'} : undef;
        return $self->{impl}->checkUserAgeWithDocomo($openIdRedirectUrl, $standardAge, $verifier);
      }

sub retrieveOpenIdAuthUrlWithDocomo{
        my ($self, $request) = @_;

        return $self->{impl}->retrieveOpenIdAuthUrlWithDocomo();
      }

sub retrieveRequestToken{
        my ($self, $request) = @_;

        my $carrier = ($request->{'carrier'}) ? $request->{'carrier'} : undef;
        return $self->{impl}->retrieveRequestToken($carrier);
      }

package AgeCheckServiceClient;


use base qw(AgeCheckServiceIf);
sub new {
        my ($classname, $input, $output) = @_;
        my $self      = {};
        $self->{input}  = $input;
        $self->{output} = defined $output ? $output : $input;
        $self->{seqid}  = 0;
        return bless($self,$classname);
}

sub checkUserAge{
  my $self = shift;
  my $carrier = shift;
  my $sessionId = shift;
  my $verifier = shift;
  my $standardAge = shift;

                $self->send_checkUserAge($carrier, $sessionId, $verifier, $standardAge);
        return $self->recv_checkUserAge();
}

sub send_checkUserAge{
  my $self = shift;
  my $carrier = shift;
  my $sessionId = shift;
  my $verifier = shift;
  my $standardAge = shift;

        $self->{output}->writeMessageBegin('checkUserAge', Thrift::TMessageType::CALL, $self->{seqid});
        my $args = AgeCheckService_checkUserAge_args->new();
        $args->{carrier} = $carrier;
        $args->{sessionId} = $sessionId;
        $args->{verifier} = $verifier;
        $args->{standardAge} = $standardAge;
        $args->write($self->{output});
        $self->{output}->writeMessageEnd();
        $self->{output}->getTransport()->flush();
}

sub recv_checkUserAge{
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
        my $result = AgeCheckService_checkUserAge_result->new();
        $result->read($self->{input});
        $self->{input}->readMessageEnd();

        if (defined $result->{success} ) {
          return $result->{success};
        }
        if (defined $result->{e}) {
          die $result->{e};
        }
        die "checkUserAge failed: unknown result";
}
sub checkUserAgeWithDocomo{
  my $self = shift;
  my $openIdRedirectUrl = shift;
  my $standardAge = shift;
  my $verifier = shift;

                $self->send_checkUserAgeWithDocomo($openIdRedirectUrl, $standardAge, $verifier);
        return $self->recv_checkUserAgeWithDocomo();
}

sub send_checkUserAgeWithDocomo{
  my $self = shift;
  my $openIdRedirectUrl = shift;
  my $standardAge = shift;
  my $verifier = shift;

        $self->{output}->writeMessageBegin('checkUserAgeWithDocomo', Thrift::TMessageType::CALL, $self->{seqid});
        my $args = AgeCheckService_checkUserAgeWithDocomo_args->new();
        $args->{openIdRedirectUrl} = $openIdRedirectUrl;
        $args->{standardAge} = $standardAge;
        $args->{verifier} = $verifier;
        $args->write($self->{output});
        $self->{output}->writeMessageEnd();
        $self->{output}->getTransport()->flush();
}

sub recv_checkUserAgeWithDocomo{
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
        my $result = AgeCheckService_checkUserAgeWithDocomo_result->new();
        $result->read($self->{input});
        $self->{input}->readMessageEnd();

        if (defined $result->{success} ) {
          return $result->{success};
        }
        if (defined $result->{e}) {
          die $result->{e};
        }
        die "checkUserAgeWithDocomo failed: unknown result";
}
sub retrieveOpenIdAuthUrlWithDocomo{
  my $self = shift;

                $self->send_retrieveOpenIdAuthUrlWithDocomo();
        return $self->recv_retrieveOpenIdAuthUrlWithDocomo();
}

sub send_retrieveOpenIdAuthUrlWithDocomo{
  my $self = shift;

        $self->{output}->writeMessageBegin('retrieveOpenIdAuthUrlWithDocomo', Thrift::TMessageType::CALL, $self->{seqid});
        my $args = AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args->new();
        $args->write($self->{output});
        $self->{output}->writeMessageEnd();
        $self->{output}->getTransport()->flush();
}

sub recv_retrieveOpenIdAuthUrlWithDocomo{
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
        my $result = AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result->new();
        $result->read($self->{input});
        $self->{input}->readMessageEnd();

        if (defined $result->{success} ) {
          return $result->{success};
        }
        if (defined $result->{e}) {
          die $result->{e};
        }
        die "retrieveOpenIdAuthUrlWithDocomo failed: unknown result";
}
sub retrieveRequestToken{
  my $self = shift;
  my $carrier = shift;

                $self->send_retrieveRequestToken($carrier);
        return $self->recv_retrieveRequestToken();
}

sub send_retrieveRequestToken{
  my $self = shift;
  my $carrier = shift;

        $self->{output}->writeMessageBegin('retrieveRequestToken', Thrift::TMessageType::CALL, $self->{seqid});
        my $args = AgeCheckService_retrieveRequestToken_args->new();
        $args->{carrier} = $carrier;
        $args->write($self->{output});
        $self->{output}->writeMessageEnd();
        $self->{output}->getTransport()->flush();
}

sub recv_retrieveRequestToken{
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
        my $result = AgeCheckService_retrieveRequestToken_result->new();
        $result->read($self->{input});
        $self->{input}->readMessageEnd();

        if (defined $result->{success} ) {
          return $result->{success};
        }
        if (defined $result->{e}) {
          die $result->{e};
        }
        die "retrieveRequestToken failed: unknown result";
}
package AgeCheckServiceProcessor;

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

sub process_checkUserAge {
          my ($self, $seqid, $input, $output) = @_;
          my $args = AgeCheckService_checkUserAge_args->new();
          $args->read($input);
          $input->readMessageEnd();
          my $result = AgeCheckService_checkUserAge_result->new();
          eval {
            $result->{success} = $self->{handler}->checkUserAge($args->carrier, $args->sessionId, $args->verifier, $args->standardAge);
          }; if( UNIVERSAL::isa($@,'TalkException') ){ 
            $result->{e} = $@;
            $@ = undef;
          }
          if ($@) {
            $@ =~ s/^\s+|\s+$//g;
            my $err = Thrift::TApplicationException->new("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
            $output->writeMessageBegin('checkUserAge', Thrift::TMessageType::EXCEPTION, $seqid);
            $err->write($output);
            $output->writeMessageEnd();
            $output->getTransport()->flush();
            $@ = undef;
            return;
          }
          $output->writeMessageBegin('checkUserAge', Thrift::TMessageType::REPLY, $seqid);
          $result->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
}

sub process_checkUserAgeWithDocomo {
          my ($self, $seqid, $input, $output) = @_;
          my $args = AgeCheckService_checkUserAgeWithDocomo_args->new();
          $args->read($input);
          $input->readMessageEnd();
          my $result = AgeCheckService_checkUserAgeWithDocomo_result->new();
          eval {
            $result->{success} = $self->{handler}->checkUserAgeWithDocomo($args->openIdRedirectUrl, $args->standardAge, $args->verifier);
          }; if( UNIVERSAL::isa($@,'TalkException') ){ 
            $result->{e} = $@;
            $@ = undef;
          }
          if ($@) {
            $@ =~ s/^\s+|\s+$//g;
            my $err = Thrift::TApplicationException->new("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
            $output->writeMessageBegin('checkUserAgeWithDocomo', Thrift::TMessageType::EXCEPTION, $seqid);
            $err->write($output);
            $output->writeMessageEnd();
            $output->getTransport()->flush();
            $@ = undef;
            return;
          }
          $output->writeMessageBegin('checkUserAgeWithDocomo', Thrift::TMessageType::REPLY, $seqid);
          $result->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
}

sub process_retrieveOpenIdAuthUrlWithDocomo {
          my ($self, $seqid, $input, $output) = @_;
          my $args = AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args->new();
          $args->read($input);
          $input->readMessageEnd();
          my $result = AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result->new();
          eval {
            $result->{success} = $self->{handler}->retrieveOpenIdAuthUrlWithDocomo();
          }; if( UNIVERSAL::isa($@,'TalkException') ){ 
            $result->{e} = $@;
            $@ = undef;
          }
          if ($@) {
            $@ =~ s/^\s+|\s+$//g;
            my $err = Thrift::TApplicationException->new("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
            $output->writeMessageBegin('retrieveOpenIdAuthUrlWithDocomo', Thrift::TMessageType::EXCEPTION, $seqid);
            $err->write($output);
            $output->writeMessageEnd();
            $output->getTransport()->flush();
            $@ = undef;
            return;
          }
          $output->writeMessageBegin('retrieveOpenIdAuthUrlWithDocomo', Thrift::TMessageType::REPLY, $seqid);
          $result->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
}

sub process_retrieveRequestToken {
          my ($self, $seqid, $input, $output) = @_;
          my $args = AgeCheckService_retrieveRequestToken_args->new();
          $args->read($input);
          $input->readMessageEnd();
          my $result = AgeCheckService_retrieveRequestToken_result->new();
          eval {
            $result->{success} = $self->{handler}->retrieveRequestToken($args->carrier);
          }; if( UNIVERSAL::isa($@,'TalkException') ){ 
            $result->{e} = $@;
            $@ = undef;
          }
          if ($@) {
            $@ =~ s/^\s+|\s+$//g;
            my $err = Thrift::TApplicationException->new("Unexpected Exception: " . $@, Thrift::TApplicationException::INTERNAL_ERROR);
            $output->writeMessageBegin('retrieveRequestToken', Thrift::TMessageType::EXCEPTION, $seqid);
            $err->write($output);
            $output->writeMessageEnd();
            $output->getTransport()->flush();
            $@ = undef;
            return;
          }
          $output->writeMessageBegin('retrieveRequestToken', Thrift::TMessageType::REPLY, $seqid);
          $result->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
}

1;
