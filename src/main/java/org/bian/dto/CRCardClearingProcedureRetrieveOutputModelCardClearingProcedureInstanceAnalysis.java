package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceAnalysis
 */
public class CRCardClearingProcedureRetrieveOutputModelCardClearingProcedureInstanceAnalysis   {
  private String cardClearingProcedureInstanceAnalysisData = null;

  private String cardClearingProcedureInstanceAnalysisReportType = null;

  private Object cardClearingProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardClearingProcedureInstanceAnalysisData
  **/

  public String getCardClearingProcedureInstanceAnalysisData() {
    return cardClearingProcedureInstanceAnalysisData;
  }

  public void setCardClearingProcedureInstanceAnalysisData(String cardClearingProcedureInstanceAnalysisData) {
    this.cardClearingProcedureInstanceAnalysisData = cardClearingProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardClearingProcedureInstanceAnalysisReportType
  **/

  public String getCardClearingProcedureInstanceAnalysisReportType() {
    return cardClearingProcedureInstanceAnalysisReportType;
  }

  public void setCardClearingProcedureInstanceAnalysisReportType(String cardClearingProcedureInstanceAnalysisReportType) {
    this.cardClearingProcedureInstanceAnalysisReportType = cardClearingProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardClearingProcedureInstanceAnalysisReport
  **/

  public Object getCardClearingProcedureInstanceAnalysisReport() {
    return cardClearingProcedureInstanceAnalysisReport;
  }

  public void setCardClearingProcedureInstanceAnalysisReport(Object cardClearingProcedureInstanceAnalysisReport) {
    this.cardClearingProcedureInstanceAnalysisReport = cardClearingProcedureInstanceAnalysisReport;
  }


}

