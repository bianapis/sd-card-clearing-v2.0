package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMatchingRetrieveOutputModelMatchingInstanceReport
 */
public class BQMatchingRetrieveOutputModelMatchingInstanceReport   {
  private Object matchingInstanceReportRecord = null;

  private String matchingInstanceReportType = null;

  private String matchingInstanceReportParameters = null;

  private Object matchingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return matchingInstanceReportRecord
  **/

  public Object getMatchingInstanceReportRecord() {
    return matchingInstanceReportRecord;
  }

  public void setMatchingInstanceReportRecord(Object matchingInstanceReportRecord) {
    this.matchingInstanceReportRecord = matchingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return matchingInstanceReportType
  **/

  public String getMatchingInstanceReportType() {
    return matchingInstanceReportType;
  }

  public void setMatchingInstanceReportType(String matchingInstanceReportType) {
    this.matchingInstanceReportType = matchingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return matchingInstanceReportParameters
  **/

  public String getMatchingInstanceReportParameters() {
    return matchingInstanceReportParameters;
  }

  public void setMatchingInstanceReportParameters(String matchingInstanceReportParameters) {
    this.matchingInstanceReportParameters = matchingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return matchingInstanceReport
  **/

  public Object getMatchingInstanceReport() {
    return matchingInstanceReport;
  }

  public void setMatchingInstanceReport(Object matchingInstanceReport) {
    this.matchingInstanceReport = matchingInstanceReport;
  }


}

