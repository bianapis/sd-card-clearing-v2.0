package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMatchingRetrieveOutputModelCaptureInstanceRecord;
import org.bian.dto.BQMatchingRetrieveOutputModelCardClearingProcedureInstanceRecord;
import org.bian.dto.BQMatchingRetrieveOutputModelMatchingInstanceAnalysis;
import org.bian.dto.BQMatchingRetrieveOutputModelMatchingInstanceRecord;
import org.bian.dto.BQMatchingRetrieveOutputModelMatchingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMatchingRetrieveOutputModel
 */
public class BQMatchingRetrieveOutputModel   {
  private BQMatchingRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;

  private BQMatchingRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQMatchingRetrieveOutputModelMatchingInstanceRecord matchingInstanceRecord = null;

  private String matchingRetrieveActionTaskReference = null;

  private Object matchingRetrieveActionTaskRecord = null;

  private String matchingRetrieveActionResponse = null;

  private BQMatchingRetrieveOutputModelMatchingInstanceReport matchingInstanceReport = null;

  private BQMatchingRetrieveOutputModelMatchingInstanceAnalysis matchingInstanceAnalysis = null;


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public BQMatchingRetrieveOutputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(BQMatchingRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQMatchingRetrieveOutputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQMatchingRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get matchingInstanceRecord
   * @return matchingInstanceRecord
  **/

  public BQMatchingRetrieveOutputModelMatchingInstanceRecord getMatchingInstanceRecord() {
    return matchingInstanceRecord;
  }

  public void setMatchingInstanceRecord(BQMatchingRetrieveOutputModelMatchingInstanceRecord matchingInstanceRecord) {
    this.matchingInstanceRecord = matchingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Matching instance retrieve service call 
   * @return matchingRetrieveActionTaskReference
  **/

  public String getMatchingRetrieveActionTaskReference() {
    return matchingRetrieveActionTaskReference;
  }

  public void setMatchingRetrieveActionTaskReference(String matchingRetrieveActionTaskReference) {
    this.matchingRetrieveActionTaskReference = matchingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return matchingRetrieveActionResponse
  **/

  public String getMatchingRetrieveActionResponse() {
    return matchingRetrieveActionResponse;
  }

  public void setMatchingRetrieveActionResponse(String matchingRetrieveActionResponse) {
    this.matchingRetrieveActionResponse = matchingRetrieveActionResponse;
  }


  /**
   * Get matchingInstanceReport
   * @return matchingInstanceReport
  **/

  public BQMatchingRetrieveOutputModelMatchingInstanceReport getMatchingInstanceReport() {
    return matchingInstanceReport;
  }

  public void setMatchingInstanceReport(BQMatchingRetrieveOutputModelMatchingInstanceReport matchingInstanceReport) {
    this.matchingInstanceReport = matchingInstanceReport;
  }


  /**
   * Get matchingInstanceAnalysis
   * @return matchingInstanceAnalysis
  **/

  public BQMatchingRetrieveOutputModelMatchingInstanceAnalysis getMatchingInstanceAnalysis() {
    return matchingInstanceAnalysis;
  }

  public void setMatchingInstanceAnalysis(BQMatchingRetrieveOutputModelMatchingInstanceAnalysis matchingInstanceAnalysis) {
    this.matchingInstanceAnalysis = matchingInstanceAnalysis;
  }


}

