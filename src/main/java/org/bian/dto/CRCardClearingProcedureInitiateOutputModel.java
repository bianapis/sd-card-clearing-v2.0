package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardClearingProcedureInitiateOutputModelCardClearingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureInitiateOutputModel
 */
public class CRCardClearingProcedureInitiateOutputModel   {
  private String cardClearingProcedureInstanceReference = null;

  private String cardClearingProcedureInitiateActionReference = null;

  private Object cardClearingProcedureInitiateActionRecord = null;

  private String cardClearingProcedureInstanceStatus = null;

  private CRCardClearingProcedureInitiateOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cardClearingProcedureInitiateActionReference
  **/

  public String getCardClearingProcedureInitiateActionReference() {
    return cardClearingProcedureInitiateActionReference;
  }

  public void setCardClearingProcedureInitiateActionReference(String cardClearingProcedureInitiateActionReference) {
    this.cardClearingProcedureInitiateActionReference = cardClearingProcedureInitiateActionReference;
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

  public CRCardClearingProcedureInitiateOutputModelCardClearingProcedureInstanceRecord getCardClearingProcedureInstanceRecord() {
    return cardClearingProcedureInstanceRecord;
  }

  public void setCardClearingProcedureInstanceRecord(CRCardClearingProcedureInitiateOutputModelCardClearingProcedureInstanceRecord cardClearingProcedureInstanceRecord) {
    this.cardClearingProcedureInstanceRecord = cardClearingProcedureInstanceRecord;
  }


}

