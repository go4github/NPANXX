package com.kringo.npanxx;

/**
 * Created by gp522s on 4/16/2015.
 */
public class NpaNxx {

    private String id;
	private String state;
    private String npanxx;
    private String operatingCompanyNumber;
    private String company;
    private String rateCenter;
    private String effectiveDate;
    private String status;
    private String assignDate;
    private String type;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNpanxx() {
        return npanxx;
    }

    public void setNpanxx(String npanxx) {
        this.npanxx = npanxx;
    }

    public String getOperatingCompanyNumber() {
        return operatingCompanyNumber;
    }

    public void setOperatingCompanyNumber(String operatingCompanyNumber) {
        this.operatingCompanyNumber = operatingCompanyNumber;
    }

    public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRateCenter() {
        return rateCenter;
    }

    public void setRateCenter(String rateCenter) {
        this.rateCenter = rateCenter;
    }

    public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(String assignDate) {
        this.assignDate = assignDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id+" "+state+" "+npanxx+" "+operatingCompanyNumber+" "+rateCenter+" "+assignDate+" "+type;

    }

}
