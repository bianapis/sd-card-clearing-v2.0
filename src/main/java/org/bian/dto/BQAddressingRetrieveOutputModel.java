package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAddressingRetrieveOutputModelAddressingInstanceAnalysis;
import org.bian.dto.BQAddressingRetrieveOutputModelAddressingInstanceRecord;
import org.bian.dto.BQAddressingRetrieveOutputModelAddressingInstanceReport;
import org.bian.dto.BQAddressingRetrieveOutputModelCaptureInstanceRecord;
import org.bian.dto.BQAddressingRetrieveOutputModelCardClearingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAddressingRetrieveOutputModel
 */
public class BQAddressingRetrieveOutputModel   {
  private BQAddressingRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;

  private BQAddressingRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQAddressingRetrieveOutputModelAddressingInstanceRecord addressingInstanceRecord = null;

  private String addressingRetrieveActionTaskReference = null;

  private Object addressingRetrieveActionTaskRecord = null;

  private String addressingRetrieveActionResponse = null;

  private BQAddressingRetrieveOutputModelAddressingInstanceReport addressingInstanceReport = null;

  private BQAddressingRetrieveOutputModelAddressingInstanceAnalysis addressingInstanceAnalysis = null;


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public BQAddressingRetrieveOutputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(BQAddressingRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQAddressingRetrieveOutputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQAddressingRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get addressingInstanceRecord
   * @return addressingInstanceRecord
  **/

  public BQAddressingRetrieveOutputModelAddressingInstanceRecord getAddressingInstanceRecord() {
    return addressingInstanceRecord;
  }

  public void setAddressingInstanceRecord(BQAddressingRetrieveOutputModelAddressingInstanceRecord addressingInstanceRecord) {
    this.addressingInstanceRecord = addressingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Addressing instance retrieve service call 
   * @return addressingRetrieveActionTaskReference
  **/

  public String getAddressingRetrieveActionTaskReference() {
    return addressingRetrieveActionTaskReference;
  }

  public void setAddressingRetrieveActionTaskReference(String addressingRetrieveActionTaskReference) {
    this.addressingRetrieveActionTaskReference = addressingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return addressingRetrieveActionResponse
  **/

  public String getAddressingRetrieveActionResponse() {
    return addressingRetrieveActionResponse;
  }

  public void setAddressingRetrieveActionResponse(String addressingRetrieveActionResponse) {
    this.addressingRetrieveActionResponse = addressingRetrieveActionResponse;
  }


  /**
   * Get addressingInstanceReport
   * @return addressingInstanceReport
  **/

  public BQAddressingRetrieveOutputModelAddressingInstanceReport getAddressingInstanceReport() {
    return addressingInstanceReport;
  }

  public void setAddressingInstanceReport(BQAddressingRetrieveOutputModelAddressingInstanceReport addressingInstanceReport) {
    this.addressingInstanceReport = addressingInstanceReport;
  }


  /**
   * Get addressingInstanceAnalysis
   * @return addressingInstanceAnalysis
  **/

  public BQAddressingRetrieveOutputModelAddressingInstanceAnalysis getAddressingInstanceAnalysis() {
    return addressingInstanceAnalysis;
  }

  public void setAddressingInstanceAnalysis(BQAddressingRetrieveOutputModelAddressingInstanceAnalysis addressingInstanceAnalysis) {
    this.addressingInstanceAnalysis = addressingInstanceAnalysis;
  }


}

