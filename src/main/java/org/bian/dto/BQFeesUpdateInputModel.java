package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFeesUpdateInputModelFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFeesUpdateInputModel
 */
public class BQFeesUpdateInputModel   {
  private String cardClearingProcedureInstanceReference = null;

  private String feesInstanceReference = null;

  private BQFeesUpdateInputModelFeesInstanceRecord feesInstanceRecord = null;

  private Object feesUpdateActionTaskRecord = null;

  private String feesUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card Clearing Procedure instance 
   * @return cardClearingProcedureInstanceReference
  **/

  public String getCardClearingProcedureInstanceReference() {
    return cardClearingProcedureInstanceReference;
  }

  public void setCardClearingProcedureInstanceReference(String cardClearingProcedureInstanceReference) {
    this.cardClearingProcedureInstanceReference = cardClearingProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fees instance 
   * @return feesInstanceReference
  **/

  public String getFeesInstanceReference() {
    return feesInstanceReference;
  }

  public void setFeesInstanceReference(String feesInstanceReference) {
    this.feesInstanceReference = feesInstanceReference;
  }


  /**
   * Get feesInstanceRecord
   * @return feesInstanceRecord
  **/

  public BQFeesUpdateInputModelFeesInstanceRecord getFeesInstanceRecord() {
    return feesInstanceRecord;
  }

  public void setFeesInstanceRecord(BQFeesUpdateInputModelFeesInstanceRecord feesInstanceRecord) {
    this.feesInstanceRecord = feesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return feesUpdateActionTaskRecord
  **/

  public Object getFeesUpdateActionTaskRecord() {
    return feesUpdateActionTaskRecord;
  }

  public void setFeesUpdateActionTaskRecord(Object feesUpdateActionTaskRecord) {
    this.feesUpdateActionTaskRecord = feesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return feesUpdateActionRequest
  **/

  public String getFeesUpdateActionRequest() {
    return feesUpdateActionRequest;
  }

  public void setFeesUpdateActionRequest(String feesUpdateActionRequest) {
    this.feesUpdateActionRequest = feesUpdateActionRequest;
  }


}

