%%
%% Autogenerated by Thrift Compiler (0.14.0)
%%
%% DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
%%

-module(shop_service_thrift).
-behaviour(thrift_service).


-include("shop_service_thrift.hrl").

-export([struct_info/1, function_info/2, function_names/0]).

struct_info(_) -> erlang:error(function_clause).
%%% interface
% buyCoinProduct(This, PaymentReservation)
function_info('buyCoinProduct', params_type) ->
  {struct, [{2, {struct, {'line_types', 'PaymentReservation'}}}]}
;
function_info('buyCoinProduct', reply_type) ->
  {struct, []};
function_info('buyCoinProduct', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% buyFreeProduct(This, ReceiverMid, ProductId, MessageTemplate, Language, Country, PackageId)
function_info('buyFreeProduct', params_type) ->
  {struct, [{2, string},
          {3, string},
          {4, i32},
          {5, string},
          {6, string},
          {7, i64}]}
;
function_info('buyFreeProduct', reply_type) ->
  {struct, []};
function_info('buyFreeProduct', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% buyMustbuyProduct(This, ReceiverMid, ProductId, MessageTemplate, Language, Country, PackageId, SerialNumber)
function_info('buyMustbuyProduct', params_type) ->
  {struct, [{2, string},
          {3, string},
          {4, i32},
          {5, string},
          {6, string},
          {7, i64},
          {8, string}]}
;
function_info('buyMustbuyProduct', reply_type) ->
  {struct, []};
function_info('buyMustbuyProduct', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% checkCanReceivePresent(This, RecipientMid, PackageId, Language, Country)
function_info('checkCanReceivePresent', params_type) ->
  {struct, [{2, string},
          {3, i64},
          {4, string},
          {5, string}]}
;
function_info('checkCanReceivePresent', reply_type) ->
  {struct, []};
function_info('checkCanReceivePresent', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getActivePurchases(This, Start, Size, Language, Country)
function_info('getActivePurchases', params_type) ->
  {struct, [{2, i64},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getActivePurchases', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getActivePurchases', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getActivePurchaseVersions(This, Start, Size, Language, Country)
function_info('getActivePurchaseVersions', params_type) ->
  {struct, [{2, i64},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getActivePurchaseVersions', reply_type) ->
  {struct, {'line_types', 'ProductSimpleList'}};
function_info('getActivePurchaseVersions', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getCoinProducts(This, AppStoreCode, Country, Language)
function_info('getCoinProducts', params_type) ->
  {struct, [{2, i32},
          {3, string},
          {4, string}]}
;
function_info('getCoinProducts', reply_type) ->
  {list, {struct, {'line_types', 'CoinProductItem'}}};
function_info('getCoinProducts', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getCoinProductsByPgCode(This, AppStoreCode, PgCode, Country, Language)
function_info('getCoinProductsByPgCode', params_type) ->
  {struct, [{2, i32},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getCoinProductsByPgCode', reply_type) ->
  {list, {struct, {'line_types', 'CoinProductItem'}}};
function_info('getCoinProductsByPgCode', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getCoinPurchaseHistory(This, Request)
function_info('getCoinPurchaseHistory', params_type) ->
  {struct, [{2, {struct, {'line_types', 'CoinHistoryCondition'}}}]}
;
function_info('getCoinPurchaseHistory', reply_type) ->
  {struct, {'line_types', 'CoinHistoryResult'}};
function_info('getCoinPurchaseHistory', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getCoinUseAndRefundHistory(This, Request)
function_info('getCoinUseAndRefundHistory', params_type) ->
  {struct, [{2, {struct, {'line_types', 'CoinHistoryCondition'}}}]}
;
function_info('getCoinUseAndRefundHistory', reply_type) ->
  {struct, {'line_types', 'CoinHistoryResult'}};
function_info('getCoinUseAndRefundHistory', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getDownloads(This, Start, Size, Language, Country)
function_info('getDownloads', params_type) ->
  {struct, [{2, i64},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getDownloads', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getDownloads', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getEventPackages(This, Start, Size, Language, Country)
function_info('getEventPackages', params_type) ->
  {struct, [{2, i64},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getEventPackages', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getEventPackages', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getNewlyReleasedPackages(This, Start, Size, Language, Country)
function_info('getNewlyReleasedPackages', params_type) ->
  {struct, [{2, i64},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getNewlyReleasedPackages', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getNewlyReleasedPackages', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getPopularPackages(This, Start, Size, Language, Country)
function_info('getPopularPackages', params_type) ->
  {struct, [{2, i64},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getPopularPackages', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getPopularPackages', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getPresentsReceived(This, Start, Size, Language, Country)
function_info('getPresentsReceived', params_type) ->
  {struct, [{2, i64},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getPresentsReceived', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getPresentsReceived', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getPresentsSent(This, Start, Size, Language, Country)
function_info('getPresentsSent', params_type) ->
  {struct, [{2, i64},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getPresentsSent', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getPresentsSent', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getProduct(This, PackageID, Language, Country)
function_info('getProduct', params_type) ->
  {struct, [{2, i64},
          {3, string},
          {4, string}]}
;
function_info('getProduct', reply_type) ->
  {struct, {'line_types', 'Product'}};
function_info('getProduct', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getProductList(This, ProductIdList, Language, Country)
function_info('getProductList', params_type) ->
  {struct, [{2, {list, string}},
          {3, string},
          {4, string}]}
;
function_info('getProductList', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getProductList', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getProductListWithCarrier(This, ProductIdList, Language, Country, CarrierCode)
function_info('getProductListWithCarrier', params_type) ->
  {struct, [{2, {list, string}},
          {3, string},
          {4, string},
          {5, string}]}
;
function_info('getProductListWithCarrier', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getProductListWithCarrier', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getProductWithCarrier(This, PackageID, Language, Country, CarrierCode)
function_info('getProductWithCarrier', params_type) ->
  {struct, [{2, i64},
          {3, string},
          {4, string},
          {5, string}]}
;
function_info('getProductWithCarrier', reply_type) ->
  {struct, {'line_types', 'Product'}};
function_info('getProductWithCarrier', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getPurchaseHistory(This, Start, Size, Language, Country)
function_info('getPurchaseHistory', params_type) ->
  {struct, [{2, i64},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('getPurchaseHistory', reply_type) ->
  {struct, {'line_types', 'ProductList'}};
function_info('getPurchaseHistory', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getTotalBalance(This, AppStoreCode)
function_info('getTotalBalance', params_type) ->
  {struct, [{2, i32}]}
;
function_info('getTotalBalance', reply_type) ->
  {struct, {'line_types', 'Coin'}};
function_info('getTotalBalance', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% notifyDownloaded(This, PackageId, Language)
function_info('notifyDownloaded', params_type) ->
  {struct, [{2, i64},
          {3, string}]}
;
function_info('notifyDownloaded', reply_type) ->
  i64;
function_info('notifyDownloaded', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% reserveCoinPurchase(This, Request)
function_info('reserveCoinPurchase', params_type) ->
  {struct, [{2, {struct, {'line_types', 'CoinPurchaseReservation'}}}]}
;
function_info('reserveCoinPurchase', reply_type) ->
  {struct, {'line_types', 'PaymentReservationResult'}};
function_info('reserveCoinPurchase', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% reservePayment(This, PaymentReservation)
function_info('reservePayment', params_type) ->
  {struct, [{2, {struct, {'line_types', 'PaymentReservation'}}}]}
;
function_info('reservePayment', reply_type) ->
  {struct, {'line_types', 'PaymentReservationResult'}};
function_info('reservePayment', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
function_info(_Func, _Info) -> erlang:error(function_clause).

function_names() -> 
  ['buyCoinProduct', 'buyFreeProduct', 'buyMustbuyProduct', 'checkCanReceivePresent', 'getActivePurchases', 'getActivePurchaseVersions', 'getCoinProducts', 'getCoinProductsByPgCode', 'getCoinPurchaseHistory', 'getCoinUseAndRefundHistory', 'getDownloads', 'getEventPackages', 'getNewlyReleasedPackages', 'getPopularPackages', 'getPresentsReceived', 'getPresentsSent', 'getProduct', 'getProductList', 'getProductListWithCarrier', 'getProductWithCarrier', 'getPurchaseHistory', 'getTotalBalance', 'notifyDownloaded', 'reserveCoinPurchase', 'reservePayment'].

