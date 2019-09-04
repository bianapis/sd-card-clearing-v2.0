package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceReportRecord
 */
public class CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceReportRecord   {
  private String cardClearingProcedureInstanceReportData = null;

  private String cardClearingProcedureInstanceReportType = null;

  private Object cardClearingProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardClearingProcedureInstanceReportData
  **/

  public String getCardClearingProcedureInstanceReportData() {
    return cardClearingProcedureInstanceReportData;
  }

  public void setCardClearingProcedureInstanceReportData(String cardClearingProcedureInstanceReportData) {
    this.cardClearingProcedureInstanceReportData = cardClearingProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardClearingProcedureInstanceReportType
  **/

  public String getCardClearingProcedureInstanceReportType() {
    return cardClearingProcedureInstanceReportType;
  }

  public void setCardClearingProcedureInstanceReportType(String cardClearingProcedureInstanceReportType) {
    this.cardClearingProcedureInstanceReportType = cardClearingProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardClearingProcedureInstanceReport
  **/

  public Object getCardClearingProcedureInstanceReport() {
    return cardClearingProcedureInstanceReport;
  }

  public void setCardClearingProcedureInstanceReport(Object cardClearingProcedureInstanceReport) {
    this.cardClearingProcedureInstanceReport = cardClearingProcedureInstanceReport;
  }


}

