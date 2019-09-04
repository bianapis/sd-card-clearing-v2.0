package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceAnalysis;
import org.bian.dto.CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceRecord;
import org.bian.dto.CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureRetrieveOutputModel
 */
public class CRCardClearingProcedureRetrieveOutputModel   {
  private CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;

  private String cardClearingProcedureRetrieveActionTaskReference = null;

  private Object cardClearingProcedureRetrieveActionTaskRecord = null;

  private String cardClearingProcedureRetrieveActionResponse = null;

  private CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceReportRecord cardClearingProcedureInstanceReportRecord = null;

  private CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceAnalysis cardClearingProcedureInstanceAnalysis = null;


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Clearing Procedure instance retrieve service call 
   * @return cardClearingProcedureRetrieveActionTaskReference
  **/

  public String getCardClearingProcedureRetrieveActionTaskReference() {
    return cardClearingProcedureRetrieveActionTaskReference;
  }

  public void setCardClearingProcedureRetrieveActionTaskReference(String cardClearingProcedureRetrieveActionTaskReference) {
    this.cardClearingProcedureRetrieveActionTaskReference = cardClearingProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardClearingProcedureRetrieveActionTaskRecord
  **/

  public Object getCardClearingProcedureRetrieveActionTaskRecord() {
    return cardClearingProcedureRetrieveActionTaskRecord;
  }

  public void setCardClearingProcedureRetrieveActionTaskRecord(Object cardClearingProcedureRetrieveActionTaskRecord) {
    this.cardClearingProcedureRetrieveActionTaskRecord = cardClearingProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardClearingProcedureRetrieveActionResponse
  **/

  public String getCardClearingProcedureRetrieveActionResponse() {
    return cardClearingProcedureRetrieveActionResponse;
  }

  public void setCardClearingProcedureRetrieveActionResponse(String cardClearingProcedureRetrieveActionResponse) {
    this.cardClearingProcedureRetrieveActionResponse = cardClearingProcedureRetrieveActionResponse;
  }


  /**
   * Get cardClearingProcedureInstanceReportRecord
   * @return cardClearingProcedureInstanceReportRecord
  **/

  public CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceReportRecord getCardClearingProcedureInstanceReportRecord() {
    return cardClearingProcedureInstanceReportRecord;
  }

  public void setCardClearingProcedureInstanceReportRecord(CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceReportRecord cardClearingProcedureInstanceReportRecord) {
    this.cardClearingProcedureInstanceReportRecord = cardClearingProcedureInstanceReportRecord;
  }


  /**
   * Get cardClearingProcedureInstanceAnalysis
   * @return cardClearingProcedureInstanceAnalysis
  **/

  public CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceAnalysis getCardClearingProcedureInstanceAnalysis() {
    return cardClearingProcedureInstanceAnalysis;
  }

  public void setCardClearingProcedureInstanceAnalysis(CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceAnalysis cardClearingProcedureInstanceAnalysis) {
    this.cardClearingProcedureInstanceAnalysis = cardClearingProcedureInstanceAnalysis;
  }


}

