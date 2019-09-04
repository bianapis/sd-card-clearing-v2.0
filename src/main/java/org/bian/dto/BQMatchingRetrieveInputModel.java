package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMatchingRetrieveInputModelMatchingInstanceAnalysis;
import org.bian.dto.BQMatchingRetrieveInputModelMatchingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMatchingRetrieveInputModel
 */
public class BQMatchingRetrieveInputModel   {
  private Object matchingRetrieveActionTaskRecord = null;

  private String matchingRetrieveActionRequest = null;

  private BQMatchingRetrieveInputModelMatchingInstanceReport matchingInstanceReport = null;

  private BQMatchingRetrieveInputModelMatchingInstanceAnalysis matchingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return matchingRetrieveActionTaskRecord
  **/

  public Object getMatchingRetrieveActionTaskRecord() {
    return matchingRetrieveActionTaskRecord;
  }

  public void setMatchingRetrieveActionTaskRecord(Object matchingRetrieveActionTaskRecord) {
    this.matchingRetrieveActionTaskRecord = matchingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return matchingRetrieveActionRequest
  **/

  public String getMatchingRetrieveActionRequest() {
    return matchingRetrieveActionRequest;
  }

  public void setMatchingRetrieveActionRequest(String matchingRetrieveActionRequest) {
    this.matchingRetrieveActionRequest = matchingRetrieveActionRequest;
  }


  /**
   * Get matchingInstanceReport
   * @return matchingInstanceReport
  **/

  public BQMatchingRetrieveInputModelMatchingInstanceReport getMatchingInstanceReport() {
    return matchingInstanceReport;
  }

  public void setMatchingInstanceReport(BQMatchingRetrieveInputModelMatchingInstanceReport matchingInstanceReport) {
    this.matchingInstanceReport = matchingInstanceReport;
  }


  /**
   * Get matchingInstanceAnalysis
   * @return matchingInstanceAnalysis
  **/

  public BQMatchingRetrieveInputModelMatchingInstanceAnalysis getMatchingInstanceAnalysis() {
    return matchingInstanceAnalysis;
  }

  public void setMatchingInstanceAnalysis(BQMatchingRetrieveInputModelMatchingInstanceAnalysis matchingInstanceAnalysis) {
    this.matchingInstanceAnalysis = matchingInstanceAnalysis;
  }


}

