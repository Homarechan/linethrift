{-# LANGUAGE DeriveDataTypeable #-}
{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-missing-fields #-}
{-# OPTIONS_GHC -fno-warn-missing-signatures #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing #-}
{-# OPTIONS_GHC -fno-warn-unused-imports #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}

-----------------------------------------------------------------
-- Autogenerated by Thrift Compiler (0.11.0)                      --
--                                                             --
-- DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING --
-----------------------------------------------------------------

module AccountSupervisorService_Client(getRSAKey,notifyEmailConfirmationResult,registerVirtualAccount,requestVirtualAccountPasswordChange,requestVirtualAccountPasswordSet,unregisterVirtualAccount) where
import qualified Data.IORef as R
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
import AccountSupervisorService
seqid = R.newIORef 0
getRSAKey (ip,op) = do
  send_getRSAKey op
  recv_getRSAKey ip
send_getRSAKey op = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getRSAKey", T.M_CALL, seqn) $
    write_GetRSAKey_args op (GetRSAKey_args{})
recv_getRSAKey ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetRSAKey_result ip
    P.maybe (P.return ()) X.throw (getRSAKey_result_e res)
    P.return $ getRSAKey_result_success res
notifyEmailConfirmationResult (ip,op) arg_parameterMap = do
  send_notifyEmailConfirmationResult op arg_parameterMap
  recv_notifyEmailConfirmationResult ip
send_notifyEmailConfirmationResult op arg_parameterMap = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("notifyEmailConfirmationResult", T.M_CALL, seqn) $
    write_NotifyEmailConfirmationResult_args op (NotifyEmailConfirmationResult_args{notifyEmailConfirmationResult_args_parameterMap=arg_parameterMap})
recv_notifyEmailConfirmationResult ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_NotifyEmailConfirmationResult_result ip
    P.maybe (P.return ()) X.throw (notifyEmailConfirmationResult_result_e res)
    P.return ()
registerVirtualAccount (ip,op) arg_locale arg_encryptedVirtualUserId arg_encryptedPassword = do
  send_registerVirtualAccount op arg_locale arg_encryptedVirtualUserId arg_encryptedPassword
  recv_registerVirtualAccount ip
send_registerVirtualAccount op arg_locale arg_encryptedVirtualUserId arg_encryptedPassword = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("registerVirtualAccount", T.M_CALL, seqn) $
    write_RegisterVirtualAccount_args op (RegisterVirtualAccount_args{registerVirtualAccount_args_locale=arg_locale,registerVirtualAccount_args_encryptedVirtualUserId=arg_encryptedVirtualUserId,registerVirtualAccount_args_encryptedPassword=arg_encryptedPassword})
recv_registerVirtualAccount ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_RegisterVirtualAccount_result ip
    P.maybe (P.return ()) X.throw (registerVirtualAccount_result_e res)
    P.return $ registerVirtualAccount_result_success res
requestVirtualAccountPasswordChange (ip,op) arg_virtualMid arg_encryptedVirtualUserId arg_encryptedOldPassword arg_encryptedNewPassword = do
  send_requestVirtualAccountPasswordChange op arg_virtualMid arg_encryptedVirtualUserId arg_encryptedOldPassword arg_encryptedNewPassword
  recv_requestVirtualAccountPasswordChange ip
send_requestVirtualAccountPasswordChange op arg_virtualMid arg_encryptedVirtualUserId arg_encryptedOldPassword arg_encryptedNewPassword = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("requestVirtualAccountPasswordChange", T.M_CALL, seqn) $
    write_RequestVirtualAccountPasswordChange_args op (RequestVirtualAccountPasswordChange_args{requestVirtualAccountPasswordChange_args_virtualMid=arg_virtualMid,requestVirtualAccountPasswordChange_args_encryptedVirtualUserId=arg_encryptedVirtualUserId,requestVirtualAccountPasswordChange_args_encryptedOldPassword=arg_encryptedOldPassword,requestVirtualAccountPasswordChange_args_encryptedNewPassword=arg_encryptedNewPassword})
recv_requestVirtualAccountPasswordChange ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_RequestVirtualAccountPasswordChange_result ip
    P.maybe (P.return ()) X.throw (requestVirtualAccountPasswordChange_result_e res)
    P.return ()
requestVirtualAccountPasswordSet (ip,op) arg_virtualMid arg_encryptedVirtualUserId arg_encryptedNewPassword = do
  send_requestVirtualAccountPasswordSet op arg_virtualMid arg_encryptedVirtualUserId arg_encryptedNewPassword
  recv_requestVirtualAccountPasswordSet ip
send_requestVirtualAccountPasswordSet op arg_virtualMid arg_encryptedVirtualUserId arg_encryptedNewPassword = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("requestVirtualAccountPasswordSet", T.M_CALL, seqn) $
    write_RequestVirtualAccountPasswordSet_args op (RequestVirtualAccountPasswordSet_args{requestVirtualAccountPasswordSet_args_virtualMid=arg_virtualMid,requestVirtualAccountPasswordSet_args_encryptedVirtualUserId=arg_encryptedVirtualUserId,requestVirtualAccountPasswordSet_args_encryptedNewPassword=arg_encryptedNewPassword})
recv_requestVirtualAccountPasswordSet ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_RequestVirtualAccountPasswordSet_result ip
    P.maybe (P.return ()) X.throw (requestVirtualAccountPasswordSet_result_e res)
    P.return ()
unregisterVirtualAccount (ip,op) arg_virtualMid = do
  send_unregisterVirtualAccount op arg_virtualMid
  recv_unregisterVirtualAccount ip
send_unregisterVirtualAccount op arg_virtualMid = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("unregisterVirtualAccount", T.M_CALL, seqn) $
    write_UnregisterVirtualAccount_args op (UnregisterVirtualAccount_args{unregisterVirtualAccount_args_virtualMid=arg_virtualMid})
recv_unregisterVirtualAccount ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_UnregisterVirtualAccount_result ip
    P.maybe (P.return ()) X.throw (unregisterVirtualAccount_result_e res)
    P.return ()
