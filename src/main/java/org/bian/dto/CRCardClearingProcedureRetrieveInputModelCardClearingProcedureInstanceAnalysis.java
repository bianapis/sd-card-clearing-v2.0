package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceAnalysis
 */
public class CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceAnalysis   {
  private String cardClearingProcedureInstanceAnalysisReference = null;

  private String cardClearingProcedureInstanceAnalysisReportType = null;

  private String cardClearingProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardClearingProcedureInstanceAnalysisReference
  **/

  public String getCardClearingProcedureInstanceAnalysisReference() {
    return cardClearingProcedureInstanceAnalysisReference;
  }

  public void setCardClearingProcedureInstanceAnalysisReference(String cardClearingProcedureInstanceAnalysisReference) {
    this.cardClearingProcedureInstanceAnalysisReference = cardClearingProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardClearingProcedureInstanceAnalysisParameters
  **/

  public String getCardClearingProcedureInstanceAnalysisParameters() {
    return cardClearingProcedureInstanceAnalysisParameters;
  }

  public void setCardClearingProcedureInstanceAnalysisParameters(String cardClearingProcedureInstanceAnalysisParameters) {
    this.cardClearingProcedureInstanceAnalysisParameters = cardClearingProcedureInstanceAnalysisParameters;
  }


}

