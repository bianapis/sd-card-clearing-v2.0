package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMatchingRetrieveInputModelMatchingInstanceAnalysis
 */
public class BQMatchingRetrieveInputModelMatchingInstanceAnalysis   {
  private String matchingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return matchingInstanceAnalysisReference
  **/

  public String getMatchingInstanceAnalysisReference() {
    return matchingInstanceAnalysisReference;
  }

  public void setMatchingInstanceAnalysisReference(String matchingInstanceAnalysisReference) {
    this.matchingInstanceAnalysisReference = matchingInstanceAnalysisReference;
  }


}

