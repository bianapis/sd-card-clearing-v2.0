package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFXConversionRetrieveOutputModelCaptureInstanceRecord;
import org.bian.dto.BQFXConversionRetrieveOutputModelCardClearingProcedureInstanceRecord;
import org.bian.dto.BQFXConversionRetrieveOutputModelFXConversionInstanceAnalysis;
import org.bian.dto.BQFXConversionRetrieveOutputModelFXConversionInstanceRecord;
import org.bian.dto.BQFXConversionRetrieveOutputModelFXConversionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFXConversionRetrieveOutputModel
 */
public class BQFXConversionRetrieveOutputModel   {
  private BQFXConversionRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;

  private BQFXConversionRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord = null;

  private BQFXConversionRetrieveOutputModelFXConversionInstanceRecord fXConversionInstanceRecord = null;

  private String fXConversionRetrieveActionTaskReference = null;

  private Object fXConversionRetrieveActionTaskRecord = null;

  private String fXConversionRetrieveActionResponse = null;

  private BQFXConversionRetrieveOutputModelFXConversionInstanceReport fXConversionInstanceReport = null;

  private BQFXConversionRetrieveOutputModelFXConversionInstanceAnalysis fXConversionInstanceAnalysis = null;


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public BQFXConversionRetrieveOutputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(BQFXConversionRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


  /**
   * Get captureInstanceRecord
   * @return captureInstanceRecord
  **/

  public BQFXConversionRetrieveOutputModelCaptureInstanceRecord getCaptureInstanceRecord() {
    return captureInstanceRecord;
  }

  public void setCaptureInstanceRecord(BQFXConversionRetrieveOutputModelCaptureInstanceRecord captureInstanceRecord) {
    this.captureInstanceRecord = captureInstanceRecord;
  }


  /**
   * Get fXConversionInstanceRecord
   * @return fXConversionInstanceRecord
  **/

  public BQFXConversionRetrieveOutputModelFXConversionInstanceRecord getFXConversionInstanceRecord() {
    return fXConversionInstanceRecord;
  }

  public void setFXConversionInstanceRecord(BQFXConversionRetrieveOutputModelFXConversionInstanceRecord fXConversionInstanceRecord) {
    this.fXConversionInstanceRecord = fXConversionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a FX Conversion instance retrieve service call 
   * @return fXConversionRetrieveActionTaskReference
  **/

  public String getFXConversionRetrieveActionTaskReference() {
    return fXConversionRetrieveActionTaskReference;
  }

  public void setFXConversionRetrieveActionTaskReference(String fXConversionRetrieveActionTaskReference) {
    this.fXConversionRetrieveActionTaskReference = fXConversionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fXConversionRetrieveActionResponse
  **/

  public String getFXConversionRetrieveActionResponse() {
    return fXConversionRetrieveActionResponse;
  }

  public void setFXConversionRetrieveActionResponse(String fXConversionRetrieveActionResponse) {
    this.fXConversionRetrieveActionResponse = fXConversionRetrieveActionResponse;
  }


  /**
   * Get fXConversionInstanceReport
   * @return fXConversionInstanceReport
  **/

  public BQFXConversionRetrieveOutputModelFXConversionInstanceReport getFXConversionInstanceReport() {
    return fXConversionInstanceReport;
  }

  public void setFXConversionInstanceReport(BQFXConversionRetrieveOutputModelFXConversionInstanceReport fXConversionInstanceReport) {
    this.fXConversionInstanceReport = fXConversionInstanceReport;
  }


  /**
   * Get fXConversionInstanceAnalysis
   * @return fXConversionInstanceAnalysis
  **/

  public BQFXConversionRetrieveOutputModelFXConversionInstanceAnalysis getFXConversionInstanceAnalysis() {
    return fXConversionInstanceAnalysis;
  }

  public void setFXConversionInstanceAnalysis(BQFXConversionRetrieveOutputModelFXConversionInstanceAnalysis fXConversionInstanceAnalysis) {
    this.fXConversionInstanceAnalysis = fXConversionInstanceAnalysis;
  }


}

