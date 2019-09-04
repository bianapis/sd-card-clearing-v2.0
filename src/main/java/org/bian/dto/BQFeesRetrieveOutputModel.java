package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFeesRetrieveOutputModelCaptureInstanceRecord;
import org.bian.dto.BQFeesRetrieveOutputModelCardClearingProcedureInstanceRecord;
import org.bian.dto.BQFeesRetrieveOutputModelFeesInstanceAnalysis;
import org.bian.dto.BQFeesRetrieveOutputModelFeesInstanceReport;
import org.bian.dto.BQFeesUpdateInputModelFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFeesRetrieveOutputModel
 */
public class BQFeesRetrieveOutputModel   {
  private BQFeesRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;

  private BQFeesRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQFeesUpdateInputModelFeesInstanceRecord feesInstanceRecord = null;

  private String feesRetrieveActionTaskReference = null;

  private Object feesRetrieveActionTaskRecord = null;

  private String feesRetrieveActionResponse = null;

  private BQFeesRetrieveOutputModelFeesInstanceReport feesInstanceReport = null;

  private BQFeesRetrieveOutputModelFeesInstanceAnalysis feesInstanceAnalysis = null;


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public BQFeesRetrieveOutputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(BQFeesRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQFeesRetrieveOutputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQFeesRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get feesInstanceRecord
   * @return feesInstanceRecord
  **/

  public BQFeesUpdateInputModelFeesInstanceRecord getFeesInstanceRecord() {
    return feesInstanceRecord;
  }

  public void setFeesInstanceRecord(BQFeesUpdateInputModelFeesInstanceRecord feesInstanceRecord) {
    this.feesInstanceRecord = feesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fees instance retrieve service call 
   * @return feesRetrieveActionTaskReference
  **/

  public String getFeesRetrieveActionTaskReference() {
    return feesRetrieveActionTaskReference;
  }

  public void setFeesRetrieveActionTaskReference(String feesRetrieveActionTaskReference) {
    this.feesRetrieveActionTaskReference = feesRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return feesRetrieveActionTaskRecord
  **/

  public Object getFeesRetrieveActionTaskRecord() {
    return feesRetrieveActionTaskRecord;
  }

  public void setFeesRetrieveActionTaskRecord(Object feesRetrieveActionTaskRecord) {
    this.feesRetrieveActionTaskRecord = feesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return feesRetrieveActionResponse
  **/

  public String getFeesRetrieveActionResponse() {
    return feesRetrieveActionResponse;
  }

  public void setFeesRetrieveActionResponse(String feesRetrieveActionResponse) {
    this.feesRetrieveActionResponse = feesRetrieveActionResponse;
  }


  /**
   * Get feesInstanceReport
   * @return feesInstanceReport
  **/

  public BQFeesRetrieveOutputModelFeesInstanceReport getFeesInstanceReport() {
    return feesInstanceReport;
  }

  public void setFeesInstanceReport(BQFeesRetrieveOutputModelFeesInstanceReport feesInstanceReport) {
    this.feesInstanceReport = feesInstanceReport;
  }


  /**
   * Get feesInstanceAnalysis
   * @return feesInstanceAnalysis
  **/

  public BQFeesRetrieveOutputModelFeesInstanceAnalysis getFeesInstanceAnalysis() {
    return feesInstanceAnalysis;
  }

  public void setFeesInstanceAnalysis(BQFeesRetrieveOutputModelFeesInstanceAnalysis feesInstanceAnalysis) {
    this.feesInstanceAnalysis = feesInstanceAnalysis;
  }


}

