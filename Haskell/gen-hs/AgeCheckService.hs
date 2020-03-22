{-# LANGUAGE DeriveDataTypeable #-}
{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-missing-fields #-}
{-# OPTIONS_GHC -fno-warn-missing-signatures #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing #-}
{-# OPTIONS_GHC -fno-warn-unused-imports #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}

-----------------------------------------------------------------
-- Autogenerated by Thrift Compiler (0.14.0)                      --
--                                                             --
-- DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING --
-----------------------------------------------------------------

module AgeCheckService where
import Prelude (($), (.), (>>=), (==), (++))
import qualified Prelude as P
import qualified Control.Exception as X
import qualified Control.Monad as M ( liftM, ap, when )
import Data.Functor ( (<$>) )
import qualified Data.ByteString.Lazy as LBS
import qualified Data.Hashable as H
import qualified Data.Int as I
import qualified Data.Maybe as M (catMaybes)
import qualified Data.Text.Lazy.Encoding as E ( decodeUtf8, encodeUtf8 )
import qualified Data.Text.Lazy as LT
import qualified GHC.Generics as G (Generic)
import qualified Data.Typeable as TY ( Typeable )
import qualified Data.HashMap.Strict as Map
import qualified Data.HashSet as Set
import qualified Data.Vector as Vector
import qualified Test.QuickCheck.Arbitrary as QC ( Arbitrary(..) )
import qualified Test.QuickCheck as QC ( elements )

import qualified Thrift as T
import qualified Thrift.Types as T
import qualified Thrift.Arbitraries as T


import Line_Types
import qualified AgeCheckService_Iface as Iface
-- HELPER FUNCTIONS AND STRUCTURES --

data CheckUserAge_args = CheckUserAge_args  { checkUserAge_args_carrier :: CarrierCode
  , checkUserAge_args_sessionId :: LT.Text
  , checkUserAge_args_verifier :: LT.Text
  , checkUserAge_args_standardAge :: I.Int32
  } deriving (P.Show,P.Eq,G.Generic,TY.Typeable)
instance H.Hashable CheckUserAge_args where
  hashWithSalt salt record = salt   `H.hashWithSalt` checkUserAge_args_carrier record   `H.hashWithSalt` checkUserAge_args_sessionId record   `H.hashWithSalt` checkUserAge_args_verifier record   `H.hashWithSalt` checkUserAge_args_standardAge record  
instance QC.Arbitrary CheckUserAge_args where 
  arbitrary = M.liftM CheckUserAge_args (QC.arbitrary)
          `M.ap`(QC.arbitrary)
          `M.ap`(QC.arbitrary)
          `M.ap`(QC.arbitrary)
  shrink obj | obj == default_CheckUserAge_args = []
             | P.otherwise = M.catMaybes
    [ if obj == default_CheckUserAge_args{checkUserAge_args_carrier = checkUserAge_args_carrier obj} then P.Nothing else P.Just $ default_CheckUserAge_args{checkUserAge_args_carrier = checkUserAge_args_carrier obj}
    , if obj == default_CheckUserAge_args{checkUserAge_args_sessionId = checkUserAge_args_sessionId obj} then P.Nothing else P.Just $ default_CheckUserAge_args{checkUserAge_args_sessionId = checkUserAge_args_sessionId obj}
    , if obj == default_CheckUserAge_args{checkUserAge_args_verifier = checkUserAge_args_verifier obj} then P.Nothing else P.Just $ default_CheckUserAge_args{checkUserAge_args_verifier = checkUserAge_args_verifier obj}
    , if obj == default_CheckUserAge_args{checkUserAge_args_standardAge = checkUserAge_args_standardAge obj} then P.Nothing else P.Just $ default_CheckUserAge_args{checkUserAge_args_standardAge = checkUserAge_args_standardAge obj}
    ]
from_CheckUserAge_args :: CheckUserAge_args -> T.ThriftVal
from_CheckUserAge_args record = T.TStruct $ Map.fromList $ M.catMaybes
  [ (\_v3609 -> P.Just (2, ("carrier",T.TI32 $ P.fromIntegral $ P.fromEnum _v3609))) $ checkUserAge_args_carrier record
  , (\_v3609 -> P.Just (3, ("sessionId",T.TString $ E.encodeUtf8 _v3609))) $ checkUserAge_args_sessionId record
  , (\_v3609 -> P.Just (4, ("verifier",T.TString $ E.encodeUtf8 _v3609))) $ checkUserAge_args_verifier record
  , (\_v3609 -> P.Just (5, ("standardAge",T.TI32 _v3609))) $ checkUserAge_args_standardAge record
  ]
write_CheckUserAge_args :: T.Protocol p => p -> CheckUserAge_args -> P.IO ()
write_CheckUserAge_args oprot record = T.writeVal oprot $ from_CheckUserAge_args record
encode_CheckUserAge_args :: T.StatelessProtocol p => p -> CheckUserAge_args -> LBS.ByteString
encode_CheckUserAge_args oprot record = T.serializeVal oprot $ from_CheckUserAge_args record
to_CheckUserAge_args :: T.ThriftVal -> CheckUserAge_args
to_CheckUserAge_args (T.TStruct fields) = CheckUserAge_args{
  checkUserAge_args_carrier = P.maybe (checkUserAge_args_carrier default_CheckUserAge_args) (\(_,_val3611) -> (case _val3611 of {T.TI32 _val3612 -> P.toEnum $ P.fromIntegral _val3612; _ -> P.error "wrong type"})) (Map.lookup (2) fields),
  checkUserAge_args_sessionId = P.maybe (checkUserAge_args_sessionId default_CheckUserAge_args) (\(_,_val3611) -> (case _val3611 of {T.TString _val3613 -> E.decodeUtf8 _val3613; _ -> P.error "wrong type"})) (Map.lookup (3) fields),
  checkUserAge_args_verifier = P.maybe (checkUserAge_args_verifier default_CheckUserAge_args) (\(_,_val3611) -> (case _val3611 of {T.TString _val3614 -> E.decodeUtf8 _val3614; _ -> P.error "wrong type"})) (Map.lookup (4) fields),
  checkUserAge_args_standardAge = P.maybe (checkUserAge_args_standardAge default_CheckUserAge_args) (\(_,_val3611) -> (case _val3611 of {T.TI32 _val3615 -> _val3615; _ -> P.error "wrong type"})) (Map.lookup (5) fields)
  }
to_CheckUserAge_args _ = P.error "not a struct"
read_CheckUserAge_args :: T.Protocol p => p -> P.IO CheckUserAge_args
read_CheckUserAge_args iprot = to_CheckUserAge_args <$> T.readVal iprot (T.T_STRUCT typemap_CheckUserAge_args)
decode_CheckUserAge_args :: T.StatelessProtocol p => p -> LBS.ByteString -> CheckUserAge_args
decode_CheckUserAge_args iprot bs = to_CheckUserAge_args $ T.deserializeVal iprot (T.T_STRUCT typemap_CheckUserAge_args) bs
typemap_CheckUserAge_args :: T.TypeMap
typemap_CheckUserAge_args = Map.fromList [(2,("carrier",T.T_I32)),(3,("sessionId",T.T_STRING)),(4,("verifier",T.T_STRING)),(5,("standardAge",T.T_I32))]
default_CheckUserAge_args :: CheckUserAge_args
default_CheckUserAge_args = CheckUserAge_args{
  checkUserAge_args_carrier = (P.toEnum 0),
  checkUserAge_args_sessionId = "",
  checkUserAge_args_verifier = "",
  checkUserAge_args_standardAge = 0}
data CheckUserAge_result = CheckUserAge_result  { checkUserAge_result_success :: UserAgeType
  , checkUserAge_result_e :: P.Maybe TalkException
  } deriving (P.Show,P.Eq,G.Generic,TY.Typeable)
instance H.Hashable CheckUserAge_result where
  hashWithSalt salt record = salt   `H.hashWithSalt` checkUserAge_result_success record   `H.hashWithSalt` checkUserAge_result_e record  
instance QC.Arbitrary CheckUserAge_result where 
  arbitrary = M.liftM CheckUserAge_result (QC.arbitrary)
          `M.ap`(M.liftM P.Just QC.arbitrary)
  shrink obj | obj == default_CheckUserAge_result = []
             | P.otherwise = M.catMaybes
    [ if obj == default_CheckUserAge_result{checkUserAge_result_success = checkUserAge_result_success obj} then P.Nothing else P.Just $ default_CheckUserAge_result{checkUserAge_result_success = checkUserAge_result_success obj}
    , if obj == default_CheckUserAge_result{checkUserAge_result_e = checkUserAge_result_e obj} then P.Nothing else P.Just $ default_CheckUserAge_result{checkUserAge_result_e = checkUserAge_result_e obj}
    ]
from_CheckUserAge_result :: CheckUserAge_result -> T.ThriftVal
from_CheckUserAge_result record = T.TStruct $ Map.fromList 
  (let exns = M.catMaybes [ (\_v3618 -> (1, ("e",from_TalkException _v3618))) <$> checkUserAge_result_e record]
  in if P.not (P.null exns) then exns else M.catMaybes
    [ (\_v3618 -> P.Just (0, ("success",T.TI32 $ P.fromIntegral $ P.fromEnum _v3618))) $ checkUserAge_result_success record
    , (\_v3618 -> (1, ("e",from_TalkException _v3618))) <$> checkUserAge_result_e record
    ]
    )
write_CheckUserAge_result :: T.Protocol p => p -> CheckUserAge_result -> P.IO ()
write_CheckUserAge_result oprot record = T.writeVal oprot $ from_CheckUserAge_result record
encode_CheckUserAge_result :: T.StatelessProtocol p => p -> CheckUserAge_result -> LBS.ByteString
encode_CheckUserAge_result oprot record = T.serializeVal oprot $ from_CheckUserAge_result record
to_CheckUserAge_result :: T.ThriftVal -> CheckUserAge_result
to_CheckUserAge_result (T.TStruct fields) = CheckUserAge_result{
  checkUserAge_result_success = P.maybe (checkUserAge_result_success default_CheckUserAge_result) (\(_,_val3620) -> (case _val3620 of {T.TI32 _val3621 -> P.toEnum $ P.fromIntegral _val3621; _ -> P.error "wrong type"})) (Map.lookup (0) fields),
  checkUserAge_result_e = P.maybe (P.Nothing) (\(_,_val3620) -> P.Just (case _val3620 of {T.TStruct _val3622 -> (to_TalkException (T.TStruct _val3622)); _ -> P.error "wrong type"})) (Map.lookup (1) fields)
  }
to_CheckUserAge_result _ = P.error "not a struct"
read_CheckUserAge_result :: T.Protocol p => p -> P.IO CheckUserAge_result
read_CheckUserAge_result iprot = to_CheckUserAge_result <$> T.readVal iprot (T.T_STRUCT typemap_CheckUserAge_result)
decode_CheckUserAge_result :: T.StatelessProtocol p => p -> LBS.ByteString -> CheckUserAge_result
decode_CheckUserAge_result iprot bs = to_CheckUserAge_result $ T.deserializeVal iprot (T.T_STRUCT typemap_CheckUserAge_result) bs
typemap_CheckUserAge_result :: T.TypeMap
typemap_CheckUserAge_result = Map.fromList [(0,("success",T.T_I32)),(1,("e",(T.T_STRUCT typemap_TalkException)))]
default_CheckUserAge_result :: CheckUserAge_result
default_CheckUserAge_result = CheckUserAge_result{
  checkUserAge_result_success = (P.toEnum 0),
  checkUserAge_result_e = P.Nothing}
data CheckUserAgeWithDocomo_args = CheckUserAgeWithDocomo_args  { checkUserAgeWithDocomo_args_openIdRedirectUrl :: LT.Text
  , checkUserAgeWithDocomo_args_standardAge :: I.Int32
  , checkUserAgeWithDocomo_args_verifier :: LT.Text
  } deriving (P.Show,P.Eq,G.Generic,TY.Typeable)
instance H.Hashable CheckUserAgeWithDocomo_args where
  hashWithSalt salt record = salt   `H.hashWithSalt` checkUserAgeWithDocomo_args_openIdRedirectUrl record   `H.hashWithSalt` checkUserAgeWithDocomo_args_standardAge record   `H.hashWithSalt` checkUserAgeWithDocomo_args_verifier record  
instance QC.Arbitrary CheckUserAgeWithDocomo_args where 
  arbitrary = M.liftM CheckUserAgeWithDocomo_args (QC.arbitrary)
          `M.ap`(QC.arbitrary)
          `M.ap`(QC.arbitrary)
  shrink obj | obj == default_CheckUserAgeWithDocomo_args = []
             | P.otherwise = M.catMaybes
    [ if obj == default_CheckUserAgeWithDocomo_args{checkUserAgeWithDocomo_args_openIdRedirectUrl = checkUserAgeWithDocomo_args_openIdRedirectUrl obj} then P.Nothing else P.Just $ default_CheckUserAgeWithDocomo_args{checkUserAgeWithDocomo_args_openIdRedirectUrl = checkUserAgeWithDocomo_args_openIdRedirectUrl obj}
    , if obj == default_CheckUserAgeWithDocomo_args{checkUserAgeWithDocomo_args_standardAge = checkUserAgeWithDocomo_args_standardAge obj} then P.Nothing else P.Just $ default_CheckUserAgeWithDocomo_args{checkUserAgeWithDocomo_args_standardAge = checkUserAgeWithDocomo_args_standardAge obj}
    , if obj == default_CheckUserAgeWithDocomo_args{checkUserAgeWithDocomo_args_verifier = checkUserAgeWithDocomo_args_verifier obj} then P.Nothing else P.Just $ default_CheckUserAgeWithDocomo_args{checkUserAgeWithDocomo_args_verifier = checkUserAgeWithDocomo_args_verifier obj}
    ]
from_CheckUserAgeWithDocomo_args :: CheckUserAgeWithDocomo_args -> T.ThriftVal
from_CheckUserAgeWithDocomo_args record = T.TStruct $ Map.fromList $ M.catMaybes
  [ (\_v3625 -> P.Just (2, ("openIdRedirectUrl",T.TString $ E.encodeUtf8 _v3625))) $ checkUserAgeWithDocomo_args_openIdRedirectUrl record
  , (\_v3625 -> P.Just (3, ("standardAge",T.TI32 _v3625))) $ checkUserAgeWithDocomo_args_standardAge record
  , (\_v3625 -> P.Just (4, ("verifier",T.TString $ E.encodeUtf8 _v3625))) $ checkUserAgeWithDocomo_args_verifier record
  ]
write_CheckUserAgeWithDocomo_args :: T.Protocol p => p -> CheckUserAgeWithDocomo_args -> P.IO ()
write_CheckUserAgeWithDocomo_args oprot record = T.writeVal oprot $ from_CheckUserAgeWithDocomo_args record
encode_CheckUserAgeWithDocomo_args :: T.StatelessProtocol p => p -> CheckUserAgeWithDocomo_args -> LBS.ByteString
encode_CheckUserAgeWithDocomo_args oprot record = T.serializeVal oprot $ from_CheckUserAgeWithDocomo_args record
to_CheckUserAgeWithDocomo_args :: T.ThriftVal -> CheckUserAgeWithDocomo_args
to_CheckUserAgeWithDocomo_args (T.TStruct fields) = CheckUserAgeWithDocomo_args{
  checkUserAgeWithDocomo_args_openIdRedirectUrl = P.maybe (checkUserAgeWithDocomo_args_openIdRedirectUrl default_CheckUserAgeWithDocomo_args) (\(_,_val3627) -> (case _val3627 of {T.TString _val3628 -> E.decodeUtf8 _val3628; _ -> P.error "wrong type"})) (Map.lookup (2) fields),
  checkUserAgeWithDocomo_args_standardAge = P.maybe (checkUserAgeWithDocomo_args_standardAge default_CheckUserAgeWithDocomo_args) (\(_,_val3627) -> (case _val3627 of {T.TI32 _val3629 -> _val3629; _ -> P.error "wrong type"})) (Map.lookup (3) fields),
  checkUserAgeWithDocomo_args_verifier = P.maybe (checkUserAgeWithDocomo_args_verifier default_CheckUserAgeWithDocomo_args) (\(_,_val3627) -> (case _val3627 of {T.TString _val3630 -> E.decodeUtf8 _val3630; _ -> P.error "wrong type"})) (Map.lookup (4) fields)
  }
to_CheckUserAgeWithDocomo_args _ = P.error "not a struct"
read_CheckUserAgeWithDocomo_args :: T.Protocol p => p -> P.IO CheckUserAgeWithDocomo_args
read_CheckUserAgeWithDocomo_args iprot = to_CheckUserAgeWithDocomo_args <$> T.readVal iprot (T.T_STRUCT typemap_CheckUserAgeWithDocomo_args)
decode_CheckUserAgeWithDocomo_args :: T.StatelessProtocol p => p -> LBS.ByteString -> CheckUserAgeWithDocomo_args
decode_CheckUserAgeWithDocomo_args iprot bs = to_CheckUserAgeWithDocomo_args $ T.deserializeVal iprot (T.T_STRUCT typemap_CheckUserAgeWithDocomo_args) bs
typemap_CheckUserAgeWithDocomo_args :: T.TypeMap
typemap_CheckUserAgeWithDocomo_args = Map.fromList [(2,("openIdRedirectUrl",T.T_STRING)),(3,("standardAge",T.T_I32)),(4,("verifier",T.T_STRING))]
default_CheckUserAgeWithDocomo_args :: CheckUserAgeWithDocomo_args
default_CheckUserAgeWithDocomo_args = CheckUserAgeWithDocomo_args{
  checkUserAgeWithDocomo_args_openIdRedirectUrl = "",
  checkUserAgeWithDocomo_args_standardAge = 0,
  checkUserAgeWithDocomo_args_verifier = ""}
data CheckUserAgeWithDocomo_result = CheckUserAgeWithDocomo_result  { checkUserAgeWithDocomo_result_success :: AgeCheckDocomoResult
  , checkUserAgeWithDocomo_result_e :: P.Maybe TalkException
  } deriving (P.Show,P.Eq,G.Generic,TY.Typeable)
instance H.Hashable CheckUserAgeWithDocomo_result where
  hashWithSalt salt record = salt   `H.hashWithSalt` checkUserAgeWithDocomo_result_success record   `H.hashWithSalt` checkUserAgeWithDocomo_result_e record  
instance QC.Arbitrary CheckUserAgeWithDocomo_result where 
  arbitrary = M.liftM CheckUserAgeWithDocomo_result (QC.arbitrary)
          `M.ap`(M.liftM P.Just QC.arbitrary)
  shrink obj | obj == default_CheckUserAgeWithDocomo_result = []
             | P.otherwise = M.catMaybes
    [ if obj == default_CheckUserAgeWithDocomo_result{checkUserAgeWithDocomo_result_success = checkUserAgeWithDocomo_result_success obj} then P.Nothing else P.Just $ default_CheckUserAgeWithDocomo_result{checkUserAgeWithDocomo_result_success = checkUserAgeWithDocomo_result_success obj}
    , if obj == default_CheckUserAgeWithDocomo_result{checkUserAgeWithDocomo_result_e = checkUserAgeWithDocomo_result_e obj} then P.Nothing else P.Just $ default_CheckUserAgeWithDocomo_result{checkUserAgeWithDocomo_result_e = checkUserAgeWithDocomo_result_e obj}
    ]
from_CheckUserAgeWithDocomo_result :: CheckUserAgeWithDocomo_result -> T.ThriftVal
from_CheckUserAgeWithDocomo_result record = T.TStruct $ Map.fromList 
  (let exns = M.catMaybes [ (\_v3633 -> (1, ("e",from_TalkException _v3633))) <$> checkUserAgeWithDocomo_result_e record]
  in if P.not (P.null exns) then exns else M.catMaybes
    [ (\_v3633 -> P.Just (0, ("success",from_AgeCheckDocomoResult _v3633))) $ checkUserAgeWithDocomo_result_success record
    , (\_v3633 -> (1, ("e",from_TalkException _v3633))) <$> checkUserAgeWithDocomo_result_e record
    ]
    )
write_CheckUserAgeWithDocomo_result :: T.Protocol p => p -> CheckUserAgeWithDocomo_result -> P.IO ()
write_CheckUserAgeWithDocomo_result oprot record = T.writeVal oprot $ from_CheckUserAgeWithDocomo_result record
encode_CheckUserAgeWithDocomo_result :: T.StatelessProtocol p => p -> CheckUserAgeWithDocomo_result -> LBS.ByteString
encode_CheckUserAgeWithDocomo_result oprot record = T.serializeVal oprot $ from_CheckUserAgeWithDocomo_result record
to_CheckUserAgeWithDocomo_result :: T.ThriftVal -> CheckUserAgeWithDocomo_result
to_CheckUserAgeWithDocomo_result (T.TStruct fields) = CheckUserAgeWithDocomo_result{
  checkUserAgeWithDocomo_result_success = P.maybe (checkUserAgeWithDocomo_result_success default_CheckUserAgeWithDocomo_result) (\(_,_val3635) -> (case _val3635 of {T.TStruct _val3636 -> (to_AgeCheckDocomoResult (T.TStruct _val3636)); _ -> P.error "wrong type"})) (Map.lookup (0) fields),
  checkUserAgeWithDocomo_result_e = P.maybe (P.Nothing) (\(_,_val3635) -> P.Just (case _val3635 of {T.TStruct _val3637 -> (to_TalkException (T.TStruct _val3637)); _ -> P.error "wrong type"})) (Map.lookup (1) fields)
  }
to_CheckUserAgeWithDocomo_result _ = P.error "not a struct"
read_CheckUserAgeWithDocomo_result :: T.Protocol p => p -> P.IO CheckUserAgeWithDocomo_result
read_CheckUserAgeWithDocomo_result iprot = to_CheckUserAgeWithDocomo_result <$> T.readVal iprot (T.T_STRUCT typemap_CheckUserAgeWithDocomo_result)
decode_CheckUserAgeWithDocomo_result :: T.StatelessProtocol p => p -> LBS.ByteString -> CheckUserAgeWithDocomo_result
decode_CheckUserAgeWithDocomo_result iprot bs = to_CheckUserAgeWithDocomo_result $ T.deserializeVal iprot (T.T_STRUCT typemap_CheckUserAgeWithDocomo_result) bs
typemap_CheckUserAgeWithDocomo_result :: T.TypeMap
typemap_CheckUserAgeWithDocomo_result = Map.fromList [(0,("success",(T.T_STRUCT typemap_AgeCheckDocomoResult))),(1,("e",(T.T_STRUCT typemap_TalkException)))]
default_CheckUserAgeWithDocomo_result :: CheckUserAgeWithDocomo_result
default_CheckUserAgeWithDocomo_result = CheckUserAgeWithDocomo_result{
  checkUserAgeWithDocomo_result_success = default_AgeCheckDocomoResult,
  checkUserAgeWithDocomo_result_e = P.Nothing}
data RetrieveOpenIdAuthUrlWithDocomo_args = RetrieveOpenIdAuthUrlWithDocomo_args deriving (P.Show,P.Eq,G.Generic,TY.Typeable)
instance H.Hashable RetrieveOpenIdAuthUrlWithDocomo_args where
  hashWithSalt salt record = salt  
instance QC.Arbitrary RetrieveOpenIdAuthUrlWithDocomo_args where 
  arbitrary = QC.elements [RetrieveOpenIdAuthUrlWithDocomo_args]
from_RetrieveOpenIdAuthUrlWithDocomo_args :: RetrieveOpenIdAuthUrlWithDocomo_args -> T.ThriftVal
from_RetrieveOpenIdAuthUrlWithDocomo_args record = T.TStruct $ Map.fromList $ M.catMaybes
  []
write_RetrieveOpenIdAuthUrlWithDocomo_args :: T.Protocol p => p -> RetrieveOpenIdAuthUrlWithDocomo_args -> P.IO ()
write_RetrieveOpenIdAuthUrlWithDocomo_args oprot record = T.writeVal oprot $ from_RetrieveOpenIdAuthUrlWithDocomo_args record
encode_RetrieveOpenIdAuthUrlWithDocomo_args :: T.StatelessProtocol p => p -> RetrieveOpenIdAuthUrlWithDocomo_args -> LBS.ByteString
encode_RetrieveOpenIdAuthUrlWithDocomo_args oprot record = T.serializeVal oprot $ from_RetrieveOpenIdAuthUrlWithDocomo_args record
to_RetrieveOpenIdAuthUrlWithDocomo_args :: T.ThriftVal -> RetrieveOpenIdAuthUrlWithDocomo_args
to_RetrieveOpenIdAuthUrlWithDocomo_args (T.TStruct fields) = RetrieveOpenIdAuthUrlWithDocomo_args{

  }
to_RetrieveOpenIdAuthUrlWithDocomo_args _ = P.error "not a struct"
read_RetrieveOpenIdAuthUrlWithDocomo_args :: T.Protocol p => p -> P.IO RetrieveOpenIdAuthUrlWithDocomo_args
read_RetrieveOpenIdAuthUrlWithDocomo_args iprot = to_RetrieveOpenIdAuthUrlWithDocomo_args <$> T.readVal iprot (T.T_STRUCT typemap_RetrieveOpenIdAuthUrlWithDocomo_args)
decode_RetrieveOpenIdAuthUrlWithDocomo_args :: T.StatelessProtocol p => p -> LBS.ByteString -> RetrieveOpenIdAuthUrlWithDocomo_args
decode_RetrieveOpenIdAuthUrlWithDocomo_args iprot bs = to_RetrieveOpenIdAuthUrlWithDocomo_args $ T.deserializeVal iprot (T.T_STRUCT typemap_RetrieveOpenIdAuthUrlWithDocomo_args) bs
typemap_RetrieveOpenIdAuthUrlWithDocomo_args :: T.TypeMap
typemap_RetrieveOpenIdAuthUrlWithDocomo_args = Map.fromList []
default_RetrieveOpenIdAuthUrlWithDocomo_args :: RetrieveOpenIdAuthUrlWithDocomo_args
default_RetrieveOpenIdAuthUrlWithDocomo_args = RetrieveOpenIdAuthUrlWithDocomo_args{
}
data RetrieveOpenIdAuthUrlWithDocomo_result = RetrieveOpenIdAuthUrlWithDocomo_result  { retrieveOpenIdAuthUrlWithDocomo_result_success :: LT.Text
  , retrieveOpenIdAuthUrlWithDocomo_result_e :: P.Maybe TalkException
  } deriving (P.Show,P.Eq,G.Generic,TY.Typeable)
instance H.Hashable RetrieveOpenIdAuthUrlWithDocomo_result where
  hashWithSalt salt record = salt   `H.hashWithSalt` retrieveOpenIdAuthUrlWithDocomo_result_success record   `H.hashWithSalt` retrieveOpenIdAuthUrlWithDocomo_result_e record  
instance QC.Arbitrary RetrieveOpenIdAuthUrlWithDocomo_result where 
  arbitrary = M.liftM RetrieveOpenIdAuthUrlWithDocomo_result (QC.arbitrary)
          `M.ap`(M.liftM P.Just QC.arbitrary)
  shrink obj | obj == default_RetrieveOpenIdAuthUrlWithDocomo_result = []
             | P.otherwise = M.catMaybes
    [ if obj == default_RetrieveOpenIdAuthUrlWithDocomo_result{retrieveOpenIdAuthUrlWithDocomo_result_success = retrieveOpenIdAuthUrlWithDocomo_result_success obj} then P.Nothing else P.Just $ default_RetrieveOpenIdAuthUrlWithDocomo_result{retrieveOpenIdAuthUrlWithDocomo_result_success = retrieveOpenIdAuthUrlWithDocomo_result_success obj}
    , if obj == default_RetrieveOpenIdAuthUrlWithDocomo_result{retrieveOpenIdAuthUrlWithDocomo_result_e = retrieveOpenIdAuthUrlWithDocomo_result_e obj} then P.Nothing else P.Just $ default_RetrieveOpenIdAuthUrlWithDocomo_result{retrieveOpenIdAuthUrlWithDocomo_result_e = retrieveOpenIdAuthUrlWithDocomo_result_e obj}
    ]
from_RetrieveOpenIdAuthUrlWithDocomo_result :: RetrieveOpenIdAuthUrlWithDocomo_result -> T.ThriftVal
from_RetrieveOpenIdAuthUrlWithDocomo_result record = T.TStruct $ Map.fromList 
  (let exns = M.catMaybes [ (\_v3645 -> (1, ("e",from_TalkException _v3645))) <$> retrieveOpenIdAuthUrlWithDocomo_result_e record]
  in if P.not (P.null exns) then exns else M.catMaybes
    [ (\_v3645 -> P.Just (0, ("success",T.TString $ E.encodeUtf8 _v3645))) $ retrieveOpenIdAuthUrlWithDocomo_result_success record
    , (\_v3645 -> (1, ("e",from_TalkException _v3645))) <$> retrieveOpenIdAuthUrlWithDocomo_result_e record
    ]
    )
write_RetrieveOpenIdAuthUrlWithDocomo_result :: T.Protocol p => p -> RetrieveOpenIdAuthUrlWithDocomo_result -> P.IO ()
write_RetrieveOpenIdAuthUrlWithDocomo_result oprot record = T.writeVal oprot $ from_RetrieveOpenIdAuthUrlWithDocomo_result record
encode_RetrieveOpenIdAuthUrlWithDocomo_result :: T.StatelessProtocol p => p -> RetrieveOpenIdAuthUrlWithDocomo_result -> LBS.ByteString
encode_RetrieveOpenIdAuthUrlWithDocomo_result oprot record = T.serializeVal oprot $ from_RetrieveOpenIdAuthUrlWithDocomo_result record
to_RetrieveOpenIdAuthUrlWithDocomo_result :: T.ThriftVal -> RetrieveOpenIdAuthUrlWithDocomo_result
to_RetrieveOpenIdAuthUrlWithDocomo_result (T.TStruct fields) = RetrieveOpenIdAuthUrlWithDocomo_result{
  retrieveOpenIdAuthUrlWithDocomo_result_success = P.maybe (retrieveOpenIdAuthUrlWithDocomo_result_success default_RetrieveOpenIdAuthUrlWithDocomo_result) (\(_,_val3647) -> (case _val3647 of {T.TString _val3648 -> E.decodeUtf8 _val3648; _ -> P.error "wrong type"})) (Map.lookup (0) fields),
  retrieveOpenIdAuthUrlWithDocomo_result_e = P.maybe (P.Nothing) (\(_,_val3647) -> P.Just (case _val3647 of {T.TStruct _val3649 -> (to_TalkException (T.TStruct _val3649)); _ -> P.error "wrong type"})) (Map.lookup (1) fields)
  }
to_RetrieveOpenIdAuthUrlWithDocomo_result _ = P.error "not a struct"
read_RetrieveOpenIdAuthUrlWithDocomo_result :: T.Protocol p => p -> P.IO RetrieveOpenIdAuthUrlWithDocomo_result
read_RetrieveOpenIdAuthUrlWithDocomo_result iprot = to_RetrieveOpenIdAuthUrlWithDocomo_result <$> T.readVal iprot (T.T_STRUCT typemap_RetrieveOpenIdAuthUrlWithDocomo_result)
decode_RetrieveOpenIdAuthUrlWithDocomo_result :: T.StatelessProtocol p => p -> LBS.ByteString -> RetrieveOpenIdAuthUrlWithDocomo_result
decode_RetrieveOpenIdAuthUrlWithDocomo_result iprot bs = to_RetrieveOpenIdAuthUrlWithDocomo_result $ T.deserializeVal iprot (T.T_STRUCT typemap_RetrieveOpenIdAuthUrlWithDocomo_result) bs
typemap_RetrieveOpenIdAuthUrlWithDocomo_result :: T.TypeMap
typemap_RetrieveOpenIdAuthUrlWithDocomo_result = Map.fromList [(0,("success",T.T_STRING)),(1,("e",(T.T_STRUCT typemap_TalkException)))]
default_RetrieveOpenIdAuthUrlWithDocomo_result :: RetrieveOpenIdAuthUrlWithDocomo_result
default_RetrieveOpenIdAuthUrlWithDocomo_result = RetrieveOpenIdAuthUrlWithDocomo_result{
  retrieveOpenIdAuthUrlWithDocomo_result_success = "",
  retrieveOpenIdAuthUrlWithDocomo_result_e = P.Nothing}
data RetrieveRequestToken_args = RetrieveRequestToken_args  { retrieveRequestToken_args_carrier :: CarrierCode
  } deriving (P.Show,P.Eq,G.Generic,TY.Typeable)
instance H.Hashable RetrieveRequestToken_args where
  hashWithSalt salt record = salt   `H.hashWithSalt` retrieveRequestToken_args_carrier record  
instance QC.Arbitrary RetrieveRequestToken_args where 
  arbitrary = M.liftM RetrieveRequestToken_args (QC.arbitrary)
  shrink obj | obj == default_RetrieveRequestToken_args = []
             | P.otherwise = M.catMaybes
    [ if obj == default_RetrieveRequestToken_args{retrieveRequestToken_args_carrier = retrieveRequestToken_args_carrier obj} then P.Nothing else P.Just $ default_RetrieveRequestToken_args{retrieveRequestToken_args_carrier = retrieveRequestToken_args_carrier obj}
    ]
from_RetrieveRequestToken_args :: RetrieveRequestToken_args -> T.ThriftVal
from_RetrieveRequestToken_args record = T.TStruct $ Map.fromList $ M.catMaybes
  [ (\_v3652 -> P.Just (2, ("carrier",T.TI32 $ P.fromIntegral $ P.fromEnum _v3652))) $ retrieveRequestToken_args_carrier record
  ]
write_RetrieveRequestToken_args :: T.Protocol p => p -> RetrieveRequestToken_args -> P.IO ()
write_RetrieveRequestToken_args oprot record = T.writeVal oprot $ from_RetrieveRequestToken_args record
encode_RetrieveRequestToken_args :: T.StatelessProtocol p => p -> RetrieveRequestToken_args -> LBS.ByteString
encode_RetrieveRequestToken_args oprot record = T.serializeVal oprot $ from_RetrieveRequestToken_args record
to_RetrieveRequestToken_args :: T.ThriftVal -> RetrieveRequestToken_args
to_RetrieveRequestToken_args (T.TStruct fields) = RetrieveRequestToken_args{
  retrieveRequestToken_args_carrier = P.maybe (retrieveRequestToken_args_carrier default_RetrieveRequestToken_args) (\(_,_val3654) -> (case _val3654 of {T.TI32 _val3655 -> P.toEnum $ P.fromIntegral _val3655; _ -> P.error "wrong type"})) (Map.lookup (2) fields)
  }
to_RetrieveRequestToken_args _ = P.error "not a struct"
read_RetrieveRequestToken_args :: T.Protocol p => p -> P.IO RetrieveRequestToken_args
read_RetrieveRequestToken_args iprot = to_RetrieveRequestToken_args <$> T.readVal iprot (T.T_STRUCT typemap_RetrieveRequestToken_args)
decode_RetrieveRequestToken_args :: T.StatelessProtocol p => p -> LBS.ByteString -> RetrieveRequestToken_args
decode_RetrieveRequestToken_args iprot bs = to_RetrieveRequestToken_args $ T.deserializeVal iprot (T.T_STRUCT typemap_RetrieveRequestToken_args) bs
typemap_RetrieveRequestToken_args :: T.TypeMap
typemap_RetrieveRequestToken_args = Map.fromList [(2,("carrier",T.T_I32))]
default_RetrieveRequestToken_args :: RetrieveRequestToken_args
default_RetrieveRequestToken_args = RetrieveRequestToken_args{
  retrieveRequestToken_args_carrier = (P.toEnum 0)}
data RetrieveRequestToken_result = RetrieveRequestToken_result  { retrieveRequestToken_result_success :: AgeCheckRequestResult
  , retrieveRequestToken_result_e :: P.Maybe TalkException
  } deriving (P.Show,P.Eq,G.Generic,TY.Typeable)
instance H.Hashable RetrieveRequestToken_result where
  hashWithSalt salt record = salt   `H.hashWithSalt` retrieveRequestToken_result_success record   `H.hashWithSalt` retrieveRequestToken_result_e record  
instance QC.Arbitrary RetrieveRequestToken_result where 
  arbitrary = M.liftM RetrieveRequestToken_result (QC.arbitrary)
          `M.ap`(M.liftM P.Just QC.arbitrary)
  shrink obj | obj == default_RetrieveRequestToken_result = []
             | P.otherwise = M.catMaybes
    [ if obj == default_RetrieveRequestToken_result{retrieveRequestToken_result_success = retrieveRequestToken_result_success obj} then P.Nothing else P.Just $ default_RetrieveRequestToken_result{retrieveRequestToken_result_success = retrieveRequestToken_result_success obj}
    , if obj == default_RetrieveRequestToken_result{retrieveRequestToken_result_e = retrieveRequestToken_result_e obj} then P.Nothing else P.Just $ default_RetrieveRequestToken_result{retrieveRequestToken_result_e = retrieveRequestToken_result_e obj}
    ]
from_RetrieveRequestToken_result :: RetrieveRequestToken_result -> T.ThriftVal
from_RetrieveRequestToken_result record = T.TStruct $ Map.fromList 
  (let exns = M.catMaybes [ (\_v3658 -> (1, ("e",from_TalkException _v3658))) <$> retrieveRequestToken_result_e record]
  in if P.not (P.null exns) then exns else M.catMaybes
    [ (\_v3658 -> P.Just (0, ("success",from_AgeCheckRequestResult _v3658))) $ retrieveRequestToken_result_success record
    , (\_v3658 -> (1, ("e",from_TalkException _v3658))) <$> retrieveRequestToken_result_e record
    ]
    )
write_RetrieveRequestToken_result :: T.Protocol p => p -> RetrieveRequestToken_result -> P.IO ()
write_RetrieveRequestToken_result oprot record = T.writeVal oprot $ from_RetrieveRequestToken_result record
encode_RetrieveRequestToken_result :: T.StatelessProtocol p => p -> RetrieveRequestToken_result -> LBS.ByteString
encode_RetrieveRequestToken_result oprot record = T.serializeVal oprot $ from_RetrieveRequestToken_result record
to_RetrieveRequestToken_result :: T.ThriftVal -> RetrieveRequestToken_result
to_RetrieveRequestToken_result (T.TStruct fields) = RetrieveRequestToken_result{
  retrieveRequestToken_result_success = P.maybe (retrieveRequestToken_result_success default_RetrieveRequestToken_result) (\(_,_val3660) -> (case _val3660 of {T.TStruct _val3661 -> (to_AgeCheckRequestResult (T.TStruct _val3661)); _ -> P.error "wrong type"})) (Map.lookup (0) fields),
  retrieveRequestToken_result_e = P.maybe (P.Nothing) (\(_,_val3660) -> P.Just (case _val3660 of {T.TStruct _val3662 -> (to_TalkException (T.TStruct _val3662)); _ -> P.error "wrong type"})) (Map.lookup (1) fields)
  }
to_RetrieveRequestToken_result _ = P.error "not a struct"
read_RetrieveRequestToken_result :: T.Protocol p => p -> P.IO RetrieveRequestToken_result
read_RetrieveRequestToken_result iprot = to_RetrieveRequestToken_result <$> T.readVal iprot (T.T_STRUCT typemap_RetrieveRequestToken_result)
decode_RetrieveRequestToken_result :: T.StatelessProtocol p => p -> LBS.ByteString -> RetrieveRequestToken_result
decode_RetrieveRequestToken_result iprot bs = to_RetrieveRequestToken_result $ T.deserializeVal iprot (T.T_STRUCT typemap_RetrieveRequestToken_result) bs
typemap_RetrieveRequestToken_result :: T.TypeMap
typemap_RetrieveRequestToken_result = Map.fromList [(0,("success",(T.T_STRUCT typemap_AgeCheckRequestResult))),(1,("e",(T.T_STRUCT typemap_TalkException)))]
default_RetrieveRequestToken_result :: RetrieveRequestToken_result
default_RetrieveRequestToken_result = RetrieveRequestToken_result{
  retrieveRequestToken_result_success = default_AgeCheckRequestResult,
  retrieveRequestToken_result_e = P.Nothing}
process_checkUserAge (seqid, iprot, oprot, handler) = do
  args <- read_CheckUserAge_args iprot
  (X.catch
    (X.catch
      (do
        val <- Iface.checkUserAge handler (checkUserAge_args_carrier args) (checkUserAge_args_sessionId args) (checkUserAge_args_verifier args) (checkUserAge_args_standardAge args)
        let res = default_CheckUserAge_result{checkUserAge_result_success = val}
        T.writeMessage oprot ("checkUserAge", T.M_REPLY, seqid) $
          write_CheckUserAge_result oprot res)
      (\e  -> do
        let res = default_CheckUserAge_result{checkUserAge_result_e = P.Just e}
        T.writeMessage oprot ("checkUserAge", T.M_REPLY, seqid) $
          write_CheckUserAge_result oprot res))
    ((\_ -> do
      T.writeMessage oprot ("checkUserAge", T.M_EXCEPTION, seqid) $
        T.writeAppExn oprot (T.AppExn T.AE_UNKNOWN "")) :: X.SomeException -> P.IO ()))
process_checkUserAgeWithDocomo (seqid, iprot, oprot, handler) = do
  args <- read_CheckUserAgeWithDocomo_args iprot
  (X.catch
    (X.catch
      (do
        val <- Iface.checkUserAgeWithDocomo handler (checkUserAgeWithDocomo_args_openIdRedirectUrl args) (checkUserAgeWithDocomo_args_standardAge args) (checkUserAgeWithDocomo_args_verifier args)
        let res = default_CheckUserAgeWithDocomo_result{checkUserAgeWithDocomo_result_success = val}
        T.writeMessage oprot ("checkUserAgeWithDocomo", T.M_REPLY, seqid) $
          write_CheckUserAgeWithDocomo_result oprot res)
      (\e  -> do
        let res = default_CheckUserAgeWithDocomo_result{checkUserAgeWithDocomo_result_e = P.Just e}
        T.writeMessage oprot ("checkUserAgeWithDocomo", T.M_REPLY, seqid) $
          write_CheckUserAgeWithDocomo_result oprot res))
    ((\_ -> do
      T.writeMessage oprot ("checkUserAgeWithDocomo", T.M_EXCEPTION, seqid) $
        T.writeAppExn oprot (T.AppExn T.AE_UNKNOWN "")) :: X.SomeException -> P.IO ()))
process_retrieveOpenIdAuthUrlWithDocomo (seqid, iprot, oprot, handler) = do
  args <- read_RetrieveOpenIdAuthUrlWithDocomo_args iprot
  (X.catch
    (X.catch
      (do
        val <- Iface.retrieveOpenIdAuthUrlWithDocomo handler
        let res = default_RetrieveOpenIdAuthUrlWithDocomo_result{retrieveOpenIdAuthUrlWithDocomo_result_success = val}
        T.writeMessage oprot ("retrieveOpenIdAuthUrlWithDocomo", T.M_REPLY, seqid) $
          write_RetrieveOpenIdAuthUrlWithDocomo_result oprot res)
      (\e  -> do
        let res = default_RetrieveOpenIdAuthUrlWithDocomo_result{retrieveOpenIdAuthUrlWithDocomo_result_e = P.Just e}
        T.writeMessage oprot ("retrieveOpenIdAuthUrlWithDocomo", T.M_REPLY, seqid) $
          write_RetrieveOpenIdAuthUrlWithDocomo_result oprot res))
    ((\_ -> do
      T.writeMessage oprot ("retrieveOpenIdAuthUrlWithDocomo", T.M_EXCEPTION, seqid) $
        T.writeAppExn oprot (T.AppExn T.AE_UNKNOWN "")) :: X.SomeException -> P.IO ()))
process_retrieveRequestToken (seqid, iprot, oprot, handler) = do
  args <- read_RetrieveRequestToken_args iprot
  (X.catch
    (X.catch
      (do
        val <- Iface.retrieveRequestToken handler (retrieveRequestToken_args_carrier args)
        let res = default_RetrieveRequestToken_result{retrieveRequestToken_result_success = val}
        T.writeMessage oprot ("retrieveRequestToken", T.M_REPLY, seqid) $
          write_RetrieveRequestToken_result oprot res)
      (\e  -> do
        let res = default_RetrieveRequestToken_result{retrieveRequestToken_result_e = P.Just e}
        T.writeMessage oprot ("retrieveRequestToken", T.M_REPLY, seqid) $
          write_RetrieveRequestToken_result oprot res))
    ((\_ -> do
      T.writeMessage oprot ("retrieveRequestToken", T.M_EXCEPTION, seqid) $
        T.writeAppExn oprot (T.AppExn T.AE_UNKNOWN "")) :: X.SomeException -> P.IO ()))
proc_ handler (iprot,oprot) (name,typ,seqid) = case name of
  "checkUserAge" -> process_checkUserAge (seqid,iprot,oprot,handler)
  "checkUserAgeWithDocomo" -> process_checkUserAgeWithDocomo (seqid,iprot,oprot,handler)
  "retrieveOpenIdAuthUrlWithDocomo" -> process_retrieveOpenIdAuthUrlWithDocomo (seqid,iprot,oprot,handler)
  "retrieveRequestToken" -> process_retrieveRequestToken (seqid,iprot,oprot,handler)
  _ -> do
    _ <- T.readVal iprot (T.T_STRUCT Map.empty)
    T.writeMessage oprot (name,T.M_EXCEPTION,seqid) $
      T.writeAppExn oprot (T.AppExn T.AE_UNKNOWN_METHOD ("Unknown function " ++ LT.unpack name))
process handler (iprot, oprot) = do
  T.readMessage iprot (
    proc_ handler (iprot,oprot))
  P.return P.True
