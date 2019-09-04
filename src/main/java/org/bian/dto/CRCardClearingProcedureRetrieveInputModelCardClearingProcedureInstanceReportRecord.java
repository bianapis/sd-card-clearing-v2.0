package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceReportRecord
 */
public class CRCardClearingProcedureRetrieveInputModelCardClearingProcedureInstanceReportRecord   {
  private String cardClearingProcedureInstanceReportReference = null;

  private String cardClearingProcedureInstanceReportType = null;

  private String cardClearingProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cardClearingProcedureInstanceReportReference
  **/

  public String getCardClearingProcedureInstanceReportReference() {
    return cardClearingProcedureInstanceReportReference;
  }

  public void setCardClearingProcedureInstanceReportReference(String cardClearingProcedureInstanceReportReference) {
    this.cardClearingProcedureInstanceReportReference = cardClearingProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardClearingProcedureInstanceReportParameters
  **/

  public String getCardClearingProcedureInstanceReportParameters() {
    return cardClearingProcedureInstanceReportParameters;
  }

  public void setCardClearingProcedureInstanceReportParameters(String cardClearingProcedureInstanceReportParameters) {
    this.cardClearingProcedureInstanceReportParameters = cardClearingProcedureInstanceReportParameters;
  }


}

