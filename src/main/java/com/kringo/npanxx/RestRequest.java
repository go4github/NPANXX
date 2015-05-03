package com.kringo.npanxx;

import org.springframework.web.bind.annotation.ResponseBody;



/**
 * Created by gp522s on 4/16/2015.
 */

public class RestRequest {

    private NpaNxx npaNxx;

    public RestRequest(NpaNxx npaNxx)
    {
        this.npaNxx = npaNxx;
    }

    public NpaNxx getNpaNxx() {
        return npaNxx;
    }

    public void setNpaNxx(NpaNxx npaNxx) {
        this.npaNxx = npaNxx;
    }

}
