/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
module BuddyService;

import thrift.base;
import thrift.codegen.base;
import thrift.util.hashset;

import line_types;

interface BuddyService {
  BuddySearchResult[] findBuddyContactsByQuery(string language, string country, string query, int fromIndex, int count, BuddySearchRequestSource requestSource);
  Contact[] getBuddyContacts(string language, string country, string classification, int fromIndex, int count);
  BuddyDetail getBuddyDetail(string buddyMid);
  BuddyOnAir getBuddyOnAir(string buddyMid);
  string[] getCountriesHavingBuddy();
  long[string] getNewlyReleasedBuddyIds(string country);
  BuddyBanner getPopularBuddyBanner(string language, string country, ApplicationType applicationType, string resourceSpecification);
  BuddyList[] getPopularBuddyLists(string language, string country);
  Contact[] getPromotedBuddyContacts(string language, string country);

  alias line_types.TalkException TalkException;

  enum methodMeta = [
    TMethodMeta(`findBuddyContactsByQuery`, 
      [TParamMeta(`language`, 2), TParamMeta(`country`, 3), TParamMeta(`query`, 4), TParamMeta(`fromIndex`, 5), TParamMeta(`count`, 6), TParamMeta(`requestSource`, 7)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getBuddyContacts`, 
      [TParamMeta(`language`, 2), TParamMeta(`country`, 3), TParamMeta(`classification`, 4), TParamMeta(`fromIndex`, 5), TParamMeta(`count`, 6)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getBuddyDetail`, 
      [TParamMeta(`buddyMid`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getBuddyOnAir`, 
      [TParamMeta(`buddyMid`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getCountriesHavingBuddy`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getNewlyReleasedBuddyIds`, 
      [TParamMeta(`country`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPopularBuddyBanner`, 
      [TParamMeta(`language`, 2), TParamMeta(`country`, 3), TParamMeta(`applicationType`, 4), TParamMeta(`resourceSpecification`, 5)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPopularBuddyLists`, 
      [TParamMeta(`language`, 2), TParamMeta(`country`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPromotedBuddyContacts`, 
      [TParamMeta(`language`, 2), TParamMeta(`country`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    )
  ];
}
