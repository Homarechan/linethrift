<?php
/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

interface BuddyManagementServiceIf
{
    /**
     * @param string $requestId
     * @param string $userMid
     * @throws \TalkException
     */
    public function addBuddyMember($requestId, $userMid);
    /**
     * @param string $requestId
     * @param string[] $userMids
     * @throws \TalkException
     */
    public function addBuddyMembers($requestId, array $userMids);
    /**
     * @param string $requestId
     * @param string $mid
     * @throws \TalkException
     */
    public function blockBuddyMember($requestId, $mid);
    /**
     * @param string[] $requestIdList
     * @return \SendBuddyMessageResult[]
     * @throws \TalkException
     */
    public function commitSendMessagesToAll(array $requestIdList);
    /**
     * @param string[] $requestIdList
     * @param string[] $mids
     * @return \SendBuddyMessageResult[]
     * @throws \TalkException
     */
    public function commitSendMessagesToMids(array $requestIdList, array $mids);
    /**
     * @param string $requestId
     * @param string $userMid
     * @return bool
     * @throws \TalkException
     */
    public function containsBuddyMember($requestId, $userMid);
    /**
     * @param string $requestId
     * @param string $messageId
     * @return string
     * @throws \TalkException
     */
    public function downloadMessageContent($requestId, $messageId);
    /**
     * @param string $requestId
     * @param string $messageId
     * @return string
     * @throws \TalkException
     */
    public function downloadMessageContentPreview($requestId, $messageId);
    /**
     * @param string $requestId
     * @return string
     * @throws \TalkException
     */
    public function downloadProfileImage($requestId);
    /**
     * @param string $requestId
     * @return string
     * @throws \TalkException
     */
    public function downloadProfileImagePreview($requestId);
    /**
     * @param string $buddyMid
     * @return int
     * @throws \TalkException
     */
    public function getActiveMemberCountByBuddyMid($buddyMid);
    /**
     * @param string $buddyMid
     * @return string[]
     * @throws \TalkException
     */
    public function getActiveMemberMidsByBuddyMid($buddyMid);
    /**
     * @return string[]
     * @throws \TalkException
     */
    public function getAllBuddyMembers();
    /**
     * @return string[]
     * @throws \TalkException
     */
    public function getBlockedBuddyMembers();
    /**
     * @param string $buddyMid
     * @return int
     * @throws \TalkException
     */
    public function getBlockerCountByBuddyMid($buddyMid);
    /**
     * @param string $buddyMid
     * @return \BuddyDetail
     * @throws \TalkException
     */
    public function getBuddyDetailByMid($buddyMid);
    /**
     * @return \BuddyProfile
     * @throws \TalkException
     */
    public function getBuddyProfile();
    /**
     * @return \Ticket
     * @throws \TalkException
     */
    public function getContactTicket();
    /**
     * @param string $buddyMid
     * @return int
     * @throws \TalkException
     */
    public function getMemberCountByBuddyMid($buddyMid);
    /**
     * @param string $sendBuddyMessageRequestId
     * @return \SendBuddyMessageResult
     * @throws \TalkException
     */
    public function getSendBuddyMessageResult($sendBuddyMessageRequestId);
    /**
     * @param string $setBuddyOnAirRequestId
     * @return \SetBuddyOnAirResult
     * @throws \TalkException
     */
    public function getSetBuddyOnAirResult($setBuddyOnAirRequestId);
    /**
     * @param string $updateBuddyProfileRequestId
     * @return \UpdateBuddyProfileResult
     * @throws \TalkException
     */
    public function getUpdateBuddyProfileResult($updateBuddyProfileRequestId);
    /**
     * @param string $buddyMid
     * @return bool
     * @throws \TalkException
     */
    public function isBuddyOnAirByMid($buddyMid);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @param string $sourceContentId
     * @return string
     * @throws \TalkException
     */
    public function linkAndSendBuddyContentMessageToAllAsync($requestId, \Message $msg, $sourceContentId);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @param string $sourceContentId
     * @param string[] $mids
     * @return \SendBuddyMessageResult
     * @throws \TalkException
     */
    public function linkAndSendBuddyContentMessageToMids($requestId, \Message $msg, $sourceContentId, array $mids);
    /**
     * @param string $buddyMid
     * @param string $blockerMid
     * @throws \TalkException
     */
    public function notifyBuddyBlocked($buddyMid, $blockerMid);
    /**
     * @param string $buddyMid
     * @param string $blockerMid
     * @throws \TalkException
     */
    public function notifyBuddyUnblocked($buddyMid, $blockerMid);
    /**
     * @param string $buddyId
     * @param string $searchId
     * @param string $displayName
     * @param string $statusMeessage
     * @param string $picture
     * @param array $settings
     * @return string
     * @throws \TalkException
     */
    public function registerBuddy($buddyId, $searchId, $displayName, $statusMeessage, $picture, array $settings);
    /**
     * @param string $buddyId
     * @param string $searchId
     * @param string $displayName
     * @param string $statusMessage
     * @param string $picture
     * @return string
     * @throws \TalkException
     */
    public function registerBuddyAdmin($buddyId, $searchId, $displayName, $statusMessage, $picture);
    /**
     * @param int $expirationTime
     * @param int $maxUseCount
     * @return string
     * @throws \TalkException
     */
    public function reissueContactTicket($expirationTime, $maxUseCount);
    /**
     * @param string $requestId
     * @param string $userMid
     * @throws \TalkException
     */
    public function removeBuddyMember($requestId, $userMid);
    /**
     * @param string $requestId
     * @param string[] $userMids
     * @throws \TalkException
     */
    public function removeBuddyMembers($requestId, array $userMids);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @param string $content
     * @return \SendBuddyMessageResult
     * @throws \TalkException
     */
    public function sendBuddyContentMessageToAll($requestId, \Message $msg, $content);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @param string $content
     * @return string
     * @throws \TalkException
     */
    public function sendBuddyContentMessageToAllAsync($requestId, \Message $msg, $content);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @param string $content
     * @param string[] $mids
     * @return \SendBuddyMessageResult
     * @throws \TalkException
     */
    public function sendBuddyContentMessageToMids($requestId, \Message $msg, $content, array $mids);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @param string $content
     * @param string[] $mids
     * @return string
     * @throws \TalkException
     */
    public function sendBuddyContentMessageToMidsAsync($requestId, \Message $msg, $content, array $mids);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @return \SendBuddyMessageResult
     * @throws \TalkException
     */
    public function sendBuddyMessageToAll($requestId, \Message $msg);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @return string
     * @throws \TalkException
     */
    public function sendBuddyMessageToAllAsync($requestId, \Message $msg);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @param string[] $mids
     * @return \SendBuddyMessageResult
     * @throws \TalkException
     */
    public function sendBuddyMessageToMids($requestId, \Message $msg, array $mids);
    /**
     * @param string $requestId
     * @param \Message $msg
     * @param string[] $mids
     * @return string
     * @throws \TalkException
     */
    public function sendBuddyMessageToMidsAsync($requestId, \Message $msg, array $mids);
    /**
     * @param string $requestId
     * @param string $buddyMid
     * @param int $notificationStatus
     * @throws \TalkException
     */
    public function sendIndividualEventToAllAsync($requestId, $buddyMid, $notificationStatus);
    /**
     * @param string $requestId
     * @param bool $onAir
     * @return \SetBuddyOnAirResult
     * @throws \TalkException
     */
    public function setBuddyOnAir($requestId, $onAir);
    /**
     * @param string $requestId
     * @param bool $onAir
     * @return string
     * @throws \TalkException
     */
    public function setBuddyOnAirAsync($requestId, $onAir);
    /**
     * @param string $requestId
     * @param \BuddyMessageRequest $messageRequest
     * @return \SendBuddyMessageResult
     * @throws \TalkException
     */
    public function storeMessage($requestId, \BuddyMessageRequest $messageRequest);
    /**
     * @param string $requestId
     * @param string $mid
     * @throws \TalkException
     */
    public function unblockBuddyMember($requestId, $mid);
    /**
     * @param string $requestId
     * @throws \TalkException
     */
    public function unregisterBuddy($requestId);
    /**
     * @param string $requestId
     * @throws \TalkException
     */
    public function unregisterBuddyAdmin($requestId);
    /**
     * @param string $requestId
     * @param array $attributes
     * @throws \TalkException
     */
    public function updateBuddyAdminProfileAttribute($requestId, array $attributes);
    /**
     * @param string $requestId
     * @param string $picture
     * @throws \TalkException
     */
    public function updateBuddyAdminProfileImage($requestId, $picture);
    /**
     * @param string $requestId
     * @param array $attributes
     * @return \UpdateBuddyProfileResult
     * @throws \TalkException
     */
    public function updateBuddyProfileAttributes($requestId, array $attributes);
    /**
     * @param string $requestId
     * @param array $attributes
     * @return string
     * @throws \TalkException
     */
    public function updateBuddyProfileAttributesAsync($requestId, array $attributes);
    /**
     * @param string $requestId
     * @param string $image
     * @return \UpdateBuddyProfileResult
     * @throws \TalkException
     */
    public function updateBuddyProfileImage($requestId, $image);
    /**
     * @param string $requestId
     * @param string $image
     * @return string
     * @throws \TalkException
     */
    public function updateBuddyProfileImageAsync($requestId, $image);
    /**
     * @param string $requestId
     * @param string $searchId
     * @throws \TalkException
     */
    public function updateBuddySearchId($requestId, $searchId);
    /**
     * @param array $settings
     * @throws \TalkException
     */
    public function updateBuddySettings(array $settings);
    /**
     * @param int $contentType
     * @param string $content
     * @return string
     * @throws \TalkException
     */
    public function uploadBuddyContent($contentType, $content);
}