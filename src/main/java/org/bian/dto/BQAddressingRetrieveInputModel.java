package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAddressingRetrieveInputModelAddressingInstanceAnalysis;
import org.bian.dto.BQAddressingRetrieveInputModelAddressingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAddressingRetrieveInputModel
 */
public class BQAddressingRetrieveInputModel   {
  private Object addressingRetrieveActionTaskRecord = null;

  private String addressingRetrieveActionRequest = null;

  private BQAddressingRetrieveInputModelAddressingInstanceReport addressingInstanceReport = null;

  private BQAddressingRetrieveInputModelAddressingInstanceAnalysis addressingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return addressingRetrieveActionTaskRecord
  **/

  public Object getAddressingRetrieveActionTaskRecord() {
    return addressingRetrieveActionTaskRecord;
  }

  public void setAddressingRetrieveActionTaskRecord(Object addressingRetrieveActionTaskRecord) {
    this.addressingRetrieveActionTaskRecord = addressingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return addressingRetrieveActionRequest
  **/

  public String getAddressingRetrieveActionRequest() {
    return addressingRetrieveActionRequest;
  }

  public void setAddressingRetrieveActionRequest(String addressingRetrieveActionRequest) {
    this.addressingRetrieveActionRequest = addressingRetrieveActionRequest;
  }


  /**
   * Get addressingInstanceReport
   * @return addressingInstanceReport
  **/

  public BQAddressingRetrieveInputModelAddressingInstanceReport getAddressingInstanceReport() {
    return addressingInstanceReport;
  }

  public void setAddressingInstanceReport(BQAddressingRetrieveInputModelAddressingInstanceReport addressingInstanceReport) {
    this.addressingInstanceReport = addressingInstanceReport;
  }


  /**
   * Get addressingInstanceAnalysis
   * @return addressingInstanceAnalysis
  **/

  public BQAddressingRetrieveInputModelAddressingInstanceAnalysis getAddressingInstanceAnalysis() {
    return addressingInstanceAnalysis;
  }

  public void setAddressingInstanceAnalysis(BQAddressingRetrieveInputModelAddressingInstanceAnalysis addressingInstanceAnalysis) {
    this.addressingInstanceAnalysis = addressingInstanceAnalysis;
  }


}

