package com.kringo.npanxx;

import java.net.UnknownHostException;

import com.mongodb.*;


import org.slf4j.LoggerFactory;


/**
 * Created by gp522s on 4/19/2015.
 */
public class NpaNxxProcessor {

    private String cameAsInput;
    private MongoClientURI uri;
    private MongoClient client;
    private DBCollection npaNxxDB = null;
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(NpaNxxProcessor.class);

    public NpaNxxProcessor(String input)
    {
        cameAsInput = input;
    }

    public NpaNxx process() {
        return queryProcessorForInput();
    }

    private NpaNxx queryProcessorForInput() {
        
    	NpaNxx returnObj = new NpaNxx();
    	
    	try
        {
            logger.debug("Inside..queryProcessorForInput");
            npaNxxDB = getDBCollection();
            logger.debug("cameAsInput = " + cameAsInput);
            BasicDBObject findQuery = new BasicDBObject("npaNxx",cameAsInput);
            logger.debug("findQuery = " + findQuery.toString());
            
            if(npaNxxDB != null)
            {
	            DBCursor docs = npaNxxDB.find(findQuery);
	            while(docs.hasNext()){
	                DBObject doc = docs.next();
	                logger.debug("test1");
	                logger.debug("Returned:"+doc.toString());
	                
	                returnObj.setId(doc.get("_id").toString());
	                returnObj.setState(doc.get("state").toString());
	                returnObj.setNpanxx(doc.get("npaNxx").toString());
	                returnObj.setOperatingCompanyNumber(doc.get("operationCompanyNumber").toString());
	                returnObj.setCompany(doc.get("company").toString());
	                returnObj.setRateCenter(doc.get("rateCenter").toString());	                
	                returnObj.setEffectiveDate(doc.get("effectiveDate").toString());
	                returnObj.setStatus(doc.get("status").toString());
	                returnObj.setAssignDate(doc.get("assignDate").toString());
	                returnObj.setType(doc.get("type").toString());
	                
	                logger.debug("test");
	            }
            }
        }catch (Exception e)
        {
        	//logger.debug(e);
        	//logger.error(e);
            e.printStackTrace();
        }finally {
            if(client != null)
            {
                client.close();
            }
        }


        return returnObj;
    }

    private DBCollection getDBCollection() {

        try
        {
        	uri = new MongoClientURI("mongodb://GKV:indian@ds061731.mongolab.com:61731/npa_nxx_db");
        	client = new MongoClient(uri);
     		DB db = client.getDB(uri.getDatabase());
     		npaNxxDB = db.getCollection("npa_nxx_data");        
            
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
       
        return npaNxxDB;
    }


}
