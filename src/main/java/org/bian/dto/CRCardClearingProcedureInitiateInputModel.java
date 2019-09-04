package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardClearingProcedureInitiateInputModelCardClearingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureInitiateInputModel
 */
public class CRCardClearingProcedureInitiateInputModel   {
  private String cardClearingServicingSessionReference = null;

  private Object cardClearingProcedureInitiateActionRecord = null;

  private String cardClearingProcedureInstanceStatus = null;

  private CRCardClearingProcedureInitiateInputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardClearingProcedureInitiateActionRecord
  **/

  public Object getCardClearingProcedureInitiateActionRecord() {
    return cardClearingProcedureInitiateActionRecord;
  }

  public void setCardClearingProcedureInitiateActionRecord(Object cardClearingProcedureInitiateActionRecord) {
    this.cardClearingProcedureInitiateActionRecord = cardClearingProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card Clearing Procedure instance (e.g. initialised, pending, active) 
   * @return cardClearingProcedureInstanceStatus
  **/

  public String getCardClearingProcedureInstanceStatus() {
    return cardClearingProcedureInstanceStatus;
  }

  public void setCardClearingProcedureInstanceStatus(String cardClearingProcedureInstanceStatus) {
    this.cardClearingProcedureInstanceStatus = cardClearingProcedureInstanceStatus;
  }


  /**
   * Get cardClearingProcedureInstanceRecord
   * @return cardClearingProcedureInstanceRecord
  **/

  public CRCardClearingProcedureInitiateInputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(CRCardClearingProcedureInitiateInputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


}

