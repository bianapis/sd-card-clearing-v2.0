package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationRetrieveOutputModelCaptureInstanceRecord;
import org.bian.dto.BQReconciliationRetrieveOutputModelCardClearingProcedureInstanceRecord;
import org.bian.dto.BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis;
import org.bian.dto.BQReconciliationRetrieveOutputModelReconciliationInstanceRecord;
import org.bian.dto.BQReconciliationRetrieveOutputModelReconciliationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReconciliationRetrieveOutputModel
 */
public class BQReconciliationRetrieveOutputModel   {
  private BQReconciliationRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;

  private BQReconciliationRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQReconciliationRetrieveOutputModelReconciliationInstanceRecord reconciliationInstanceRecord = null;

  private String reconciliationRetrieveActionTaskReference = null;

  private Object reconciliationRetrieveActionTaskRecord = null;

  private String reconciliationRetrieveActionResponse = null;

  private BQReconciliationRetrieveOutputModelReconciliationInstanceReport reconciliationInstanceReport = null;

  private BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis reconciliationInstanceAnalysis = null;


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public BQReconciliationRetrieveOutputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(BQReconciliationRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQReconciliationRetrieveOutputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQReconciliationRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get reconciliationInstanceRecord
   * @return reconciliationInstanceRecord
  **/

  public BQReconciliationRetrieveOutputModelReconciliationInstanceRecord getReconciliationInstanceRecord() {
    return reconciliationInstanceRecord;
  }

  public void setReconciliationInstanceRecord(BQReconciliationRetrieveOutputModelReconciliationInstanceRecord reconciliationInstanceRecord) {
    this.reconciliationInstanceRecord = reconciliationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reconciliation instance retrieve service call 
   * @return reconciliationRetrieveActionTaskReference
  **/

  public String getReconciliationRetrieveActionTaskReference() {
    return reconciliationRetrieveActionTaskReference;
  }

  public void setReconciliationRetrieveActionTaskReference(String reconciliationRetrieveActionTaskReference) {
    this.reconciliationRetrieveActionTaskReference = reconciliationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return reconciliationRetrieveActionTaskRecord
  **/

  public Object getReconciliationRetrieveActionTaskRecord() {
    return reconciliationRetrieveActionTaskRecord;
  }

  public void setReconciliationRetrieveActionTaskRecord(Object reconciliationRetrieveActionTaskRecord) {
    this.reconciliationRetrieveActionTaskRecord = reconciliationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return reconciliationRetrieveActionResponse
  **/

  public String getReconciliationRetrieveActionResponse() {
    return reconciliationRetrieveActionResponse;
  }

  public void setReconciliationRetrieveActionResponse(String reconciliationRetrieveActionResponse) {
    this.reconciliationRetrieveActionResponse = reconciliationRetrieveActionResponse;
  }


  /**
   * Get reconciliationInstanceReport
   * @return reconciliationInstanceReport
  **/

  public BQReconciliationRetrieveOutputModelReconciliationInstanceReport getReconciliationInstanceReport() {
    return reconciliationInstanceReport;
  }

  public void setReconciliationInstanceReport(BQReconciliationRetrieveOutputModelReconciliationInstanceReport reconciliationInstanceReport) {
    this.reconciliationInstanceReport = reconciliationInstanceReport;
  }


  /**
   * Get reconciliationInstanceAnalysis
   * @return reconciliationInstanceAnalysis
  **/

  public BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis getReconciliationInstanceAnalysis() {
    return reconciliationInstanceAnalysis;
  }

  public void setReconciliationInstanceAnalysis(BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis reconciliationInstanceAnalysis) {
    this.reconciliationInstanceAnalysis = reconciliationInstanceAnalysis;
  }


}

