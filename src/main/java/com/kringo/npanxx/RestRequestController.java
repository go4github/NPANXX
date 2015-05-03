package com.kringo.npanxx;


import org.slf4j.LoggerFactory;
import com.kringo.npanxx.NpaNxx;
import com.kringo.npanxx.RestRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gp522s on 4/16/2015.
 */
@RestController
public class RestRequestController {

	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(RestRequestController.class);
	
    @RequestMapping(value = "/npanxx")
    public RestRequest getNpanxx(@RequestParam(value="value") String value) {

        NpaNxx printReturnValue = new NpaNxxProcessor(value).process();
        logger.debug(printReturnValue.toString());
    	return new RestRequest(printReturnValue);
        
    }

/*    @RequestMapping("/error")
    public String showError() {

        return new String("Welcome to Kringo's NPANXX Service./nYour request seems to have problem.Please refer how to use for help./nThanks");
    }*/

}
