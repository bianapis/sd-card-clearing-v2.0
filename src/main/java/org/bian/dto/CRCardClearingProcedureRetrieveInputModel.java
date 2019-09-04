package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceAnalysis;
import org.bian.dto.CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureRetrieveInputModel
 */
public class CRCardClearingProcedureRetrieveInputModel   {
  private Object cardClearingProcedureRetrieveActionTaskRecord = null;

  private String cardClearingProcedureRetrieveActionRequest = null;

  private CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceReportRecord cardClearingProcedureInstanceReportRecord = null;

  private CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceAnalysis cardClearingProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardClearingProcedureRetrieveActionRequest
  **/

  public String getCardClearingProcedureRetrieveActionRequest() {
    return cardClearingProcedureRetrieveActionRequest;
  }

  public void setCardClearingProcedureRetrieveActionRequest(String cardClearingProcedureRetrieveActionRequest) {
    this.cardClearingProcedureRetrieveActionRequest = cardClearingProcedureRetrieveActionRequest;
  }


  /**
   * Get cardClearingProcedureInstanceReportRecord
   * @return cardClearingProcedureInstanceReportRecord
  **/

  public CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceReportRecord getCardClearingProcedureInstanceReportRecord() {
    return cardClearingProcedureInstanceReportRecord;
  }

  public void setCardClearingProcedureInstanceReportRecord(CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceReportRecord cardClearingProcedureInstanceReportRecord) {
    this.cardClearingProcedureInstanceReportRecord = cardClearingProcedureInstanceReportRecord;
  }


  /**
   * Get cardClearingProcedureInstanceAnalysis
   * @return cardClearingProcedureInstanceAnalysis
  **/

  public CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceAnalysis getCardClearingProcedureInstanceAnalysis() {
    return cardClearingProcedureInstanceAnalysis;
  }

  public void setCardClearingProcedureInstanceAnalysis(CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceAnalysis cardClearingProcedureInstanceAnalysis) {
    this.cardClearingProcedureInstanceAnalysis = cardClearingProcedureInstanceAnalysis;
  }


}

