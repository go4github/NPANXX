-------Service is Deprecated---

This API provides the details NPA-NXX for requested input.

Version 0.1 : It supports get request for NPA-NXX

Rest URL : http://kringo-npanxx.rhcloud.com/npanxx

Query parameter : value

Example : http://kringo-npanxx.rhcloud.com/npanxx?value=907-200

Returns JSON output of NPA-NXX details

{
   "npaNxx":{
      "id":"1",
      "state":"AK",
      "npanxx":"907-200",
      "operatingCompanyNumber":"6304",
      "company":"ACS WIRELESS, INC.",
      "rateCenter":"VALDEZ",
      "effectiveDate":"",
      "status":"Assigned to Service Provider",
      "assignDate":"02/21/2006",
      "type":"I"
   }
