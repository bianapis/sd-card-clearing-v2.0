package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXConversionRetrieveInputModelFXConversionInstanceAnalysis
 */
public class BQFXConversionRetrieveInputModelFXConversionInstanceAnalysis   {
  private String fXConversionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fXConversionInstanceAnalysisReference
  **/

  public String getFXConversionInstanceAnalysisReference() {
    return fXConversionInstanceAnalysisReference;
  }

  public void setFXConversionInstanceAnalysisReference(String fXConversionInstanceAnalysisReference) {
    this.fXConversionInstanceAnalysisReference = fXConversionInstanceAnalysisReference;
  }


}

