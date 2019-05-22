/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module ShopService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import ShopService;
import line_types;


class ShopServiceHandler : ShopService {
  this() {
    // Your initialization goes here.
  }

  void buyCoinProduct(ref const(PaymentReservation) paymentReservation) {
    // Your implementation goes here.
    writeln("buyCoinProduct called");
  }

  void buyFreeProduct(string receiverMid, string productId, int messageTemplate, string language, string country, long packageId) {
    // Your implementation goes here.
    writeln("buyFreeProduct called");
  }

  void buyMustbuyProduct(string receiverMid, string productId, int messageTemplate, string language, string country, long packageId, string serialNumber) {
    // Your implementation goes here.
    writeln("buyMustbuyProduct called");
  }

  void checkCanReceivePresent(string recipientMid, long packageId, string language, string country) {
    // Your implementation goes here.
    writeln("checkCanReceivePresent called");
  }

  ProductList getActivePurchases(long start, int size, string language, string country) {
    // Your implementation goes here.
    writeln("getActivePurchases called");
    return typeof(return).init;
  }

  ProductSimpleList getActivePurchaseVersions(long start, int size, string language, string country) {
    // Your implementation goes here.
    writeln("getActivePurchaseVersions called");
    return typeof(return).init;
  }

  CoinProductItem[] getCoinProducts(PaymentType appStoreCode, string country, string language) {
    // Your implementation goes here.
    writeln("getCoinProducts called");
    return typeof(return).init;
  }

  CoinProductItem[] getCoinProductsByPgCode(PaymentType appStoreCode, PaymentPgType pgCode, string country, string language) {
    // Your implementation goes here.
    writeln("getCoinProductsByPgCode called");
    return typeof(return).init;
  }

  CoinHistoryResult getCoinPurchaseHistory(ref const(CoinHistoryCondition) request) {
    // Your implementation goes here.
    writeln("getCoinPurchaseHistory called");
    return typeof(return).init;
  }

  CoinHistoryResult getCoinUseAndRefundHistory(ref const(CoinHistoryCondition) request) {
    // Your implementation goes here.
    writeln("getCoinUseAndRefundHistory called");
    return typeof(return).init;
  }

  ProductList getDownloads(long start, int size, string language, string country) {
    // Your implementation goes here.
    writeln("getDownloads called");
    return typeof(return).init;
  }

  ProductList getEventPackages(long start, int size, string language, string country) {
    // Your implementation goes here.
    writeln("getEventPackages called");
    return typeof(return).init;
  }

  ProductList getNewlyReleasedPackages(long start, int size, string language, string country) {
    // Your implementation goes here.
    writeln("getNewlyReleasedPackages called");
    return typeof(return).init;
  }

  ProductList getPopularPackages(long start, int size, string language, string country) {
    // Your implementation goes here.
    writeln("getPopularPackages called");
    return typeof(return).init;
  }

  ProductList getPresentsReceived(long start, int size, string language, string country) {
    // Your implementation goes here.
    writeln("getPresentsReceived called");
    return typeof(return).init;
  }

  ProductList getPresentsSent(long start, int size, string language, string country) {
    // Your implementation goes here.
    writeln("getPresentsSent called");
    return typeof(return).init;
  }

  Product getProduct(long packageID, string language, string country) {
    // Your implementation goes here.
    writeln("getProduct called");
    return typeof(return).init;
  }

  ProductList getProductList(string[] productIdList, string language, string country) {
    // Your implementation goes here.
    writeln("getProductList called");
    return typeof(return).init;
  }

  ProductList getProductListWithCarrier(string[] productIdList, string language, string country, string carrierCode) {
    // Your implementation goes here.
    writeln("getProductListWithCarrier called");
    return typeof(return).init;
  }

  Product getProductWithCarrier(long packageID, string language, string country, string carrierCode) {
    // Your implementation goes here.
    writeln("getProductWithCarrier called");
    return typeof(return).init;
  }

  ProductList getPurchaseHistory(long start, int size, string language, string country) {
    // Your implementation goes here.
    writeln("getPurchaseHistory called");
    return typeof(return).init;
  }

  Coin getTotalBalance(PaymentType appStoreCode) {
    // Your implementation goes here.
    writeln("getTotalBalance called");
    return typeof(return).init;
  }

  long notifyDownloaded(long packageId, string language) {
    // Your implementation goes here.
    writeln("notifyDownloaded called");
    return typeof(return).init;
  }

  PaymentReservationResult reserveCoinPurchase(ref const(CoinPurchaseReservation) request) {
    // Your implementation goes here.
    writeln("reserveCoinPurchase called");
    return typeof(return).init;
  }

  PaymentReservationResult reservePayment(ref const(PaymentReservation) paymentReservation) {
    // Your implementation goes here.
    writeln("reservePayment called");
    return typeof(return).init;
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!ShopService(new ShopServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
