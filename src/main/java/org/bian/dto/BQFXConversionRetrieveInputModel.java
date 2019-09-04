package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFXConversionRetrieveInputModelFXConversionInstanceAnalysis;
import org.bian.dto.BQFXConversionRetrieveInputModelFXConversionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFXConversionRetrieveInputModel
 */
public class BQFXConversionRetrieveInputModel   {
  private Object fXConversionRetrieveActionTaskRecord = null;

  private String fXConversionRetrieveActionRequest = null;

  private BQFXConversionRetrieveInputModelFXConversionInstanceReport fXConversionInstanceReport = null;

  private BQFXConversionRetrieveInputModelFXConversionInstanceAnalysis fXConversionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fXConversionRetrieveActionTaskRecord
  **/

  public Object getFXConversionRetrieveActionTaskRecord() {
    return fXConversionRetrieveActionTaskRecord;
  }

  public void setFXConversionRetrieveActionTaskRecord(Object fXConversionRetrieveActionTaskRecord) {
    this.fXConversionRetrieveActionTaskRecord = fXConversionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fXConversionRetrieveActionRequest
  **/

  public String getFXConversionRetrieveActionRequest() {
    return fXConversionRetrieveActionRequest;
  }

  public void setFXConversionRetrieveActionRequest(String fXConversionRetrieveActionRequest) {
    this.fXConversionRetrieveActionRequest = fXConversionRetrieveActionRequest;
  }


  /**
   * Get fXConversionInstanceReport
   * @return fXConversionInstanceReport
  **/

  public BQFXConversionRetrieveInputModelFXConversionInstanceReport getFXConversionInstanceReport() {
    return fXConversionInstanceReport;
  }

  public void setFXConversionInstanceReport(BQFXConversionRetrieveInputModelFXConversionInstanceReport fXConversionInstanceReport) {
    this.fXConversionInstanceReport = fXConversionInstanceReport;
  }


  /**
   * Get fXConversionInstanceAnalysis
   * @return fXConversionInstanceAnalysis
  **/

  public BQFXConversionRetrieveInputModelFXConversionInstanceAnalysis getFXConversionInstanceAnalysis() {
    return fXConversionInstanceAnalysis;
  }

  public void setFXConversionInstanceAnalysis(BQFXConversionRetrieveInputModelFXConversionInstanceAnalysis fXConversionInstanceAnalysis) {
    this.fXConversionInstanceAnalysis = fXConversionInstanceAnalysis;
  }


}

