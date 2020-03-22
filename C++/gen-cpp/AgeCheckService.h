/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef AgeCheckService_H
#define AgeCheckService_H

#include <thrift/TDispatchProcessor.h>
#include <thrift/async/TConcurrentClientSyncInfo.h>
#include <memory>
#include "line_types.h"



#ifdef _MSC_VER
  #pragma warning( push )
  #pragma warning (disable : 4250 ) //inheriting methods via dominance 
#endif

class AgeCheckServiceIf {
 public:
  virtual ~AgeCheckServiceIf() {}
  virtual UserAgeType::type checkUserAge(const CarrierCode::type carrier, const std::string& sessionId, const std::string& verifier, const int32_t standardAge) = 0;
  virtual void checkUserAgeWithDocomo(AgeCheckDocomoResult& _return, const std::string& openIdRedirectUrl, const int32_t standardAge, const std::string& verifier) = 0;
  virtual void retrieveOpenIdAuthUrlWithDocomo(std::string& _return) = 0;
  virtual void retrieveRequestToken(AgeCheckRequestResult& _return, const CarrierCode::type carrier) = 0;
};

class AgeCheckServiceIfFactory {
 public:
  typedef AgeCheckServiceIf Handler;

  virtual ~AgeCheckServiceIfFactory() {}

  virtual AgeCheckServiceIf* getHandler(const ::apache::thrift::TConnectionInfo& connInfo) = 0;
  virtual void releaseHandler(AgeCheckServiceIf* /* handler */) = 0;
};

class AgeCheckServiceIfSingletonFactory : virtual public AgeCheckServiceIfFactory {
 public:
  AgeCheckServiceIfSingletonFactory(const ::std::shared_ptr<AgeCheckServiceIf>& iface) : iface_(iface) {}
  virtual ~AgeCheckServiceIfSingletonFactory() {}

  virtual AgeCheckServiceIf* getHandler(const ::apache::thrift::TConnectionInfo&) {
    return iface_.get();
  }
  virtual void releaseHandler(AgeCheckServiceIf* /* handler */) {}

 protected:
  ::std::shared_ptr<AgeCheckServiceIf> iface_;
};

class AgeCheckServiceNull : virtual public AgeCheckServiceIf {
 public:
  virtual ~AgeCheckServiceNull() {}
  UserAgeType::type checkUserAge(const CarrierCode::type /* carrier */, const std::string& /* sessionId */, const std::string& /* verifier */, const int32_t /* standardAge */) {
    UserAgeType::type _return = (UserAgeType::type)0;
    return _return;
  }
  void checkUserAgeWithDocomo(AgeCheckDocomoResult& /* _return */, const std::string& /* openIdRedirectUrl */, const int32_t /* standardAge */, const std::string& /* verifier */) {
    return;
  }
  void retrieveOpenIdAuthUrlWithDocomo(std::string& /* _return */) {
    return;
  }
  void retrieveRequestToken(AgeCheckRequestResult& /* _return */, const CarrierCode::type /* carrier */) {
    return;
  }
};

typedef struct _AgeCheckService_checkUserAge_args__isset {
  _AgeCheckService_checkUserAge_args__isset() : carrier(false), sessionId(false), verifier(false), standardAge(false) {}
  bool carrier :1;
  bool sessionId :1;
  bool verifier :1;
  bool standardAge :1;
} _AgeCheckService_checkUserAge_args__isset;

class AgeCheckService_checkUserAge_args {
 public:

  AgeCheckService_checkUserAge_args(const AgeCheckService_checkUserAge_args&);
  AgeCheckService_checkUserAge_args& operator=(const AgeCheckService_checkUserAge_args&);
  AgeCheckService_checkUserAge_args() : carrier((CarrierCode::type)0), sessionId(), verifier(), standardAge(0) {
  }

  virtual ~AgeCheckService_checkUserAge_args() noexcept;
  /**
   * 
   * @see CarrierCode
   */
  CarrierCode::type carrier;
  std::string sessionId;
  std::string verifier;
  int32_t standardAge;

  _AgeCheckService_checkUserAge_args__isset __isset;

  void __set_carrier(const CarrierCode::type val);

  void __set_sessionId(const std::string& val);

  void __set_verifier(const std::string& val);

  void __set_standardAge(const int32_t val);

  bool operator == (const AgeCheckService_checkUserAge_args & rhs) const
  {
    if (!(carrier == rhs.carrier))
      return false;
    if (!(sessionId == rhs.sessionId))
      return false;
    if (!(verifier == rhs.verifier))
      return false;
    if (!(standardAge == rhs.standardAge))
      return false;
    return true;
  }
  bool operator != (const AgeCheckService_checkUserAge_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AgeCheckService_checkUserAge_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class AgeCheckService_checkUserAge_pargs {
 public:


  virtual ~AgeCheckService_checkUserAge_pargs() noexcept;
  /**
   * 
   * @see CarrierCode
   */
  const CarrierCode::type* carrier;
  const std::string* sessionId;
  const std::string* verifier;
  const int32_t* standardAge;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _AgeCheckService_checkUserAge_result__isset {
  _AgeCheckService_checkUserAge_result__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _AgeCheckService_checkUserAge_result__isset;

class AgeCheckService_checkUserAge_result {
 public:

  AgeCheckService_checkUserAge_result(const AgeCheckService_checkUserAge_result&);
  AgeCheckService_checkUserAge_result& operator=(const AgeCheckService_checkUserAge_result&);
  AgeCheckService_checkUserAge_result() : success((UserAgeType::type)0) {
  }

  virtual ~AgeCheckService_checkUserAge_result() noexcept;
  /**
   * 
   * @see UserAgeType
   */
  UserAgeType::type success;
  TalkException e;

  _AgeCheckService_checkUserAge_result__isset __isset;

  void __set_success(const UserAgeType::type val);

  void __set_e(const TalkException& val);

  bool operator == (const AgeCheckService_checkUserAge_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    if (!(e == rhs.e))
      return false;
    return true;
  }
  bool operator != (const AgeCheckService_checkUserAge_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AgeCheckService_checkUserAge_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _AgeCheckService_checkUserAge_presult__isset {
  _AgeCheckService_checkUserAge_presult__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _AgeCheckService_checkUserAge_presult__isset;

class AgeCheckService_checkUserAge_presult {
 public:


  virtual ~AgeCheckService_checkUserAge_presult() noexcept;
  /**
   * 
   * @see UserAgeType
   */
  UserAgeType::type* success;
  TalkException e;

  _AgeCheckService_checkUserAge_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

typedef struct _AgeCheckService_checkUserAgeWithDocomo_args__isset {
  _AgeCheckService_checkUserAgeWithDocomo_args__isset() : openIdRedirectUrl(false), standardAge(false), verifier(false) {}
  bool openIdRedirectUrl :1;
  bool standardAge :1;
  bool verifier :1;
} _AgeCheckService_checkUserAgeWithDocomo_args__isset;

class AgeCheckService_checkUserAgeWithDocomo_args {
 public:

  AgeCheckService_checkUserAgeWithDocomo_args(const AgeCheckService_checkUserAgeWithDocomo_args&);
  AgeCheckService_checkUserAgeWithDocomo_args& operator=(const AgeCheckService_checkUserAgeWithDocomo_args&);
  AgeCheckService_checkUserAgeWithDocomo_args() : openIdRedirectUrl(), standardAge(0), verifier() {
  }

  virtual ~AgeCheckService_checkUserAgeWithDocomo_args() noexcept;
  std::string openIdRedirectUrl;
  int32_t standardAge;
  std::string verifier;

  _AgeCheckService_checkUserAgeWithDocomo_args__isset __isset;

  void __set_openIdRedirectUrl(const std::string& val);

  void __set_standardAge(const int32_t val);

  void __set_verifier(const std::string& val);

  bool operator == (const AgeCheckService_checkUserAgeWithDocomo_args & rhs) const
  {
    if (!(openIdRedirectUrl == rhs.openIdRedirectUrl))
      return false;
    if (!(standardAge == rhs.standardAge))
      return false;
    if (!(verifier == rhs.verifier))
      return false;
    return true;
  }
  bool operator != (const AgeCheckService_checkUserAgeWithDocomo_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AgeCheckService_checkUserAgeWithDocomo_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class AgeCheckService_checkUserAgeWithDocomo_pargs {
 public:


  virtual ~AgeCheckService_checkUserAgeWithDocomo_pargs() noexcept;
  const std::string* openIdRedirectUrl;
  const int32_t* standardAge;
  const std::string* verifier;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _AgeCheckService_checkUserAgeWithDocomo_result__isset {
  _AgeCheckService_checkUserAgeWithDocomo_result__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _AgeCheckService_checkUserAgeWithDocomo_result__isset;

class AgeCheckService_checkUserAgeWithDocomo_result {
 public:

  AgeCheckService_checkUserAgeWithDocomo_result(const AgeCheckService_checkUserAgeWithDocomo_result&);
  AgeCheckService_checkUserAgeWithDocomo_result& operator=(const AgeCheckService_checkUserAgeWithDocomo_result&);
  AgeCheckService_checkUserAgeWithDocomo_result() {
  }

  virtual ~AgeCheckService_checkUserAgeWithDocomo_result() noexcept;
  AgeCheckDocomoResult success;
  TalkException e;

  _AgeCheckService_checkUserAgeWithDocomo_result__isset __isset;

  void __set_success(const AgeCheckDocomoResult& val);

  void __set_e(const TalkException& val);

  bool operator == (const AgeCheckService_checkUserAgeWithDocomo_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    if (!(e == rhs.e))
      return false;
    return true;
  }
  bool operator != (const AgeCheckService_checkUserAgeWithDocomo_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AgeCheckService_checkUserAgeWithDocomo_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _AgeCheckService_checkUserAgeWithDocomo_presult__isset {
  _AgeCheckService_checkUserAgeWithDocomo_presult__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _AgeCheckService_checkUserAgeWithDocomo_presult__isset;

class AgeCheckService_checkUserAgeWithDocomo_presult {
 public:


  virtual ~AgeCheckService_checkUserAgeWithDocomo_presult() noexcept;
  AgeCheckDocomoResult* success;
  TalkException e;

  _AgeCheckService_checkUserAgeWithDocomo_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};


class AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args {
 public:

  AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args(const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args&);
  AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args& operator=(const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args&);
  AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args() {
  }

  virtual ~AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args() noexcept;

  bool operator == (const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args & /* rhs */) const
  {
    return true;
  }
  bool operator != (const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_pargs {
 public:


  virtual ~AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_pargs() noexcept;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result__isset {
  _AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result__isset;

class AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result {
 public:

  AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result(const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result&);
  AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result& operator=(const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result&);
  AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result() : success() {
  }

  virtual ~AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result() noexcept;
  std::string success;
  TalkException e;

  _AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result__isset __isset;

  void __set_success(const std::string& val);

  void __set_e(const TalkException& val);

  bool operator == (const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    if (!(e == rhs.e))
      return false;
    return true;
  }
  bool operator != (const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_presult__isset {
  _AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_presult__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_presult__isset;

class AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_presult {
 public:


  virtual ~AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_presult() noexcept;
  std::string* success;
  TalkException e;

  _AgeCheckService_retrieveOpenIdAuthUrlWithDocomo_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

typedef struct _AgeCheckService_retrieveRequestToken_args__isset {
  _AgeCheckService_retrieveRequestToken_args__isset() : carrier(false) {}
  bool carrier :1;
} _AgeCheckService_retrieveRequestToken_args__isset;

class AgeCheckService_retrieveRequestToken_args {
 public:

  AgeCheckService_retrieveRequestToken_args(const AgeCheckService_retrieveRequestToken_args&);
  AgeCheckService_retrieveRequestToken_args& operator=(const AgeCheckService_retrieveRequestToken_args&);
  AgeCheckService_retrieveRequestToken_args() : carrier((CarrierCode::type)0) {
  }

  virtual ~AgeCheckService_retrieveRequestToken_args() noexcept;
  /**
   * 
   * @see CarrierCode
   */
  CarrierCode::type carrier;

  _AgeCheckService_retrieveRequestToken_args__isset __isset;

  void __set_carrier(const CarrierCode::type val);

  bool operator == (const AgeCheckService_retrieveRequestToken_args & rhs) const
  {
    if (!(carrier == rhs.carrier))
      return false;
    return true;
  }
  bool operator != (const AgeCheckService_retrieveRequestToken_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AgeCheckService_retrieveRequestToken_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class AgeCheckService_retrieveRequestToken_pargs {
 public:


  virtual ~AgeCheckService_retrieveRequestToken_pargs() noexcept;
  /**
   * 
   * @see CarrierCode
   */
  const CarrierCode::type* carrier;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _AgeCheckService_retrieveRequestToken_result__isset {
  _AgeCheckService_retrieveRequestToken_result__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _AgeCheckService_retrieveRequestToken_result__isset;

class AgeCheckService_retrieveRequestToken_result {
 public:

  AgeCheckService_retrieveRequestToken_result(const AgeCheckService_retrieveRequestToken_result&);
  AgeCheckService_retrieveRequestToken_result& operator=(const AgeCheckService_retrieveRequestToken_result&);
  AgeCheckService_retrieveRequestToken_result() {
  }

  virtual ~AgeCheckService_retrieveRequestToken_result() noexcept;
  AgeCheckRequestResult success;
  TalkException e;

  _AgeCheckService_retrieveRequestToken_result__isset __isset;

  void __set_success(const AgeCheckRequestResult& val);

  void __set_e(const TalkException& val);

  bool operator == (const AgeCheckService_retrieveRequestToken_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    if (!(e == rhs.e))
      return false;
    return true;
  }
  bool operator != (const AgeCheckService_retrieveRequestToken_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AgeCheckService_retrieveRequestToken_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _AgeCheckService_retrieveRequestToken_presult__isset {
  _AgeCheckService_retrieveRequestToken_presult__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _AgeCheckService_retrieveRequestToken_presult__isset;

class AgeCheckService_retrieveRequestToken_presult {
 public:


  virtual ~AgeCheckService_retrieveRequestToken_presult() noexcept;
  AgeCheckRequestResult* success;
  TalkException e;

  _AgeCheckService_retrieveRequestToken_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

class AgeCheckServiceClient : virtual public AgeCheckServiceIf {
 public:
  AgeCheckServiceClient(std::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
    setProtocol(prot);
  }
  AgeCheckServiceClient(std::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, std::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    setProtocol(iprot,oprot);
  }
 private:
  void setProtocol(std::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
  setProtocol(prot,prot);
  }
  void setProtocol(std::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, std::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    piprot_=iprot;
    poprot_=oprot;
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
 public:
  std::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  std::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  UserAgeType::type checkUserAge(const CarrierCode::type carrier, const std::string& sessionId, const std::string& verifier, const int32_t standardAge);
  void send_checkUserAge(const CarrierCode::type carrier, const std::string& sessionId, const std::string& verifier, const int32_t standardAge);
  UserAgeType::type recv_checkUserAge();
  void checkUserAgeWithDocomo(AgeCheckDocomoResult& _return, const std::string& openIdRedirectUrl, const int32_t standardAge, const std::string& verifier);
  void send_checkUserAgeWithDocomo(const std::string& openIdRedirectUrl, const int32_t standardAge, const std::string& verifier);
  void recv_checkUserAgeWithDocomo(AgeCheckDocomoResult& _return);
  void retrieveOpenIdAuthUrlWithDocomo(std::string& _return);
  void send_retrieveOpenIdAuthUrlWithDocomo();
  void recv_retrieveOpenIdAuthUrlWithDocomo(std::string& _return);
  void retrieveRequestToken(AgeCheckRequestResult& _return, const CarrierCode::type carrier);
  void send_retrieveRequestToken(const CarrierCode::type carrier);
  void recv_retrieveRequestToken(AgeCheckRequestResult& _return);
 protected:
  std::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  std::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
};

class AgeCheckServiceProcessor : public ::apache::thrift::TDispatchProcessor {
 protected:
  ::std::shared_ptr<AgeCheckServiceIf> iface_;
  virtual bool dispatchCall(::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, const std::string& fname, int32_t seqid, void* callContext);
 private:
  typedef  void (AgeCheckServiceProcessor::*ProcessFunction)(int32_t, ::apache::thrift::protocol::TProtocol*, ::apache::thrift::protocol::TProtocol*, void*);
  typedef std::map<std::string, ProcessFunction> ProcessMap;
  ProcessMap processMap_;
  void process_checkUserAge(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
  void process_checkUserAgeWithDocomo(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
  void process_retrieveOpenIdAuthUrlWithDocomo(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
  void process_retrieveRequestToken(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
 public:
  AgeCheckServiceProcessor(::std::shared_ptr<AgeCheckServiceIf> iface) :
    iface_(iface) {
    processMap_["checkUserAge"] = &AgeCheckServiceProcessor::process_checkUserAge;
    processMap_["checkUserAgeWithDocomo"] = &AgeCheckServiceProcessor::process_checkUserAgeWithDocomo;
    processMap_["retrieveOpenIdAuthUrlWithDocomo"] = &AgeCheckServiceProcessor::process_retrieveOpenIdAuthUrlWithDocomo;
    processMap_["retrieveRequestToken"] = &AgeCheckServiceProcessor::process_retrieveRequestToken;
  }

  virtual ~AgeCheckServiceProcessor() {}
};

class AgeCheckServiceProcessorFactory : public ::apache::thrift::TProcessorFactory {
 public:
  AgeCheckServiceProcessorFactory(const ::std::shared_ptr< AgeCheckServiceIfFactory >& handlerFactory) :
      handlerFactory_(handlerFactory) {}

  ::std::shared_ptr< ::apache::thrift::TProcessor > getProcessor(const ::apache::thrift::TConnectionInfo& connInfo);

 protected:
  ::std::shared_ptr< AgeCheckServiceIfFactory > handlerFactory_;
};

class AgeCheckServiceMultiface : virtual public AgeCheckServiceIf {
 public:
  AgeCheckServiceMultiface(std::vector<std::shared_ptr<AgeCheckServiceIf> >& ifaces) : ifaces_(ifaces) {
  }
  virtual ~AgeCheckServiceMultiface() {}
 protected:
  std::vector<std::shared_ptr<AgeCheckServiceIf> > ifaces_;
  AgeCheckServiceMultiface() {}
  void add(::std::shared_ptr<AgeCheckServiceIf> iface) {
    ifaces_.push_back(iface);
  }
 public:
  UserAgeType::type checkUserAge(const CarrierCode::type carrier, const std::string& sessionId, const std::string& verifier, const int32_t standardAge) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->checkUserAge(carrier, sessionId, verifier, standardAge);
    }
    return ifaces_[i]->checkUserAge(carrier, sessionId, verifier, standardAge);
  }

  void checkUserAgeWithDocomo(AgeCheckDocomoResult& _return, const std::string& openIdRedirectUrl, const int32_t standardAge, const std::string& verifier) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->checkUserAgeWithDocomo(_return, openIdRedirectUrl, standardAge, verifier);
    }
    ifaces_[i]->checkUserAgeWithDocomo(_return, openIdRedirectUrl, standardAge, verifier);
    return;
  }

  void retrieveOpenIdAuthUrlWithDocomo(std::string& _return) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->retrieveOpenIdAuthUrlWithDocomo(_return);
    }
    ifaces_[i]->retrieveOpenIdAuthUrlWithDocomo(_return);
    return;
  }

  void retrieveRequestToken(AgeCheckRequestResult& _return, const CarrierCode::type carrier) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->retrieveRequestToken(_return, carrier);
    }
    ifaces_[i]->retrieveRequestToken(_return, carrier);
    return;
  }

};

// The 'concurrent' client is a thread safe client that correctly handles
// out of order responses.  It is slower than the regular client, so should
// only be used when you need to share a connection among multiple threads
class AgeCheckServiceConcurrentClient : virtual public AgeCheckServiceIf {
 public:
  AgeCheckServiceConcurrentClient(std::shared_ptr< ::apache::thrift::protocol::TProtocol> prot, std::shared_ptr<::apache::thrift::async::TConcurrentClientSyncInfo> sync) : sync_(sync)
{
    setProtocol(prot);
  }
  AgeCheckServiceConcurrentClient(std::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, std::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot, std::shared_ptr<::apache::thrift::async::TConcurrentClientSyncInfo> sync) : sync_(sync)
{
    setProtocol(iprot,oprot);
  }
 private:
  void setProtocol(std::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
  setProtocol(prot,prot);
  }
  void setProtocol(std::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, std::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    piprot_=iprot;
    poprot_=oprot;
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
 public:
  std::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  std::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  UserAgeType::type checkUserAge(const CarrierCode::type carrier, const std::string& sessionId, const std::string& verifier, const int32_t standardAge);
  int32_t send_checkUserAge(const CarrierCode::type carrier, const std::string& sessionId, const std::string& verifier, const int32_t standardAge);
  UserAgeType::type recv_checkUserAge(const int32_t seqid);
  void checkUserAgeWithDocomo(AgeCheckDocomoResult& _return, const std::string& openIdRedirectUrl, const int32_t standardAge, const std::string& verifier);
  int32_t send_checkUserAgeWithDocomo(const std::string& openIdRedirectUrl, const int32_t standardAge, const std::string& verifier);
  void recv_checkUserAgeWithDocomo(AgeCheckDocomoResult& _return, const int32_t seqid);
  void retrieveOpenIdAuthUrlWithDocomo(std::string& _return);
  int32_t send_retrieveOpenIdAuthUrlWithDocomo();
  void recv_retrieveOpenIdAuthUrlWithDocomo(std::string& _return, const int32_t seqid);
  void retrieveRequestToken(AgeCheckRequestResult& _return, const CarrierCode::type carrier);
  int32_t send_retrieveRequestToken(const CarrierCode::type carrier);
  void recv_retrieveRequestToken(AgeCheckRequestResult& _return, const int32_t seqid);
 protected:
  std::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  std::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
  std::shared_ptr<::apache::thrift::async::TConcurrentClientSyncInfo> sync_;
};

#ifdef _MSC_VER
  #pragma warning( pop )
#endif



#endif
