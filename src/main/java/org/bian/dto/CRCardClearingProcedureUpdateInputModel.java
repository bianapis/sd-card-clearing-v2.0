package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardClearingProcedureUpdateInputModelCardClearingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureUpdateInputModel
 */
public class CRCardClearingProcedureUpdateInputModel   {
  private String cardClearingServicingSessionReference = null;

  private String cardClearingProcedureInstanceReference = null;

  private CRCardClearingProcedureUpdateInputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;

  private Object cardClearingProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardClearingServicingSessionReference
  **/

  public String getCardClearingServicingSessionReference() {
    return cardClearingServicingSessionReference;
  }

  public void setCardClearingServicingSessionReference(String cardClearingServicingSessionReference) {
    this.cardClearingServicingSessionReference = cardClearingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Clearing Procedure instance 
   * @return cardClearingProcedureInstanceReference
  **/

  public String getCardClearingProcedureInstanceReference() {
    return cardClearingProcedureInstanceReference;
  }

  public void setCardClearingProcedureInstanceReference(String cardClearingProcedureInstanceReference) {
    this.cardClearingProcedureInstanceReference = cardClearingProcedureInstanceReference;
  }


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public CRCardClearingProcedureUpdateInputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(CRCardClearingProcedureUpdateInputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardClearingProcedureUpdateActionTaskRecord
  **/

  public Object getCardClearingProcedureUpdateActionTaskRecord() {
    return cardClearingProcedureUpdateActionTaskRecord;
  }

  public void setCardClearingProcedureUpdateActionTaskRecord(Object cardClearingProcedureUpdateActionTaskRecord) {
    this.cardClearingProcedureUpdateActionTaskRecord = cardClearingProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

