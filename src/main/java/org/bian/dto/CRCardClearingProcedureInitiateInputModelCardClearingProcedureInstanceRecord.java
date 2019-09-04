package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardClearingProcedureInitiateInputModelCardClearingProcedureInstanceRecord
 */
public class CRCardClearingProcedureInitiateInputModelCardClearingProcedureInstanceRecord   {
  private String networkReference = null;

  private String participantAcquirerBankReference = null;

  private String participantIssuerBankReference = null;

  private String cardClearingProcessType = null;

  private String cardClearingProcessDateTime = null;

  private String cardClearingServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the card network 
   * @return networkReference
  **/

  public String getNetworkReference() {
    return networkReference;
  }

  public void setNetworkReference(String networkReference) {
    this.networkReference = networkReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Acquiring bank for which the Network orchestrates clearing processing 
   * @return participantAcquirerBankReference
  **/

  public String getParticipantAcquirerBankReference() {
    return participantAcquirerBankReference;
  }

  public void setParticipantAcquirerBankReference(String participantAcquirerBankReference) {
    this.participantAcquirerBankReference = participantAcquirerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issuing bank for which the Network orchestrates clearing processing 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of clearing process - e.g. capture, batch, chargeback between combinations of N,I&A 
   * @return cardClearingProcessType
  **/

  public String getCardClearingProcessType() {
    return cardClearingProcessType;
  }

  public void setCardClearingProcessType(String cardClearingProcessType) {
    this.cardClearingProcessType = cardClearingProcessType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The scheduled time for the process - likely initiation time 
   * @return cardClearingProcessDateTime
  **/

  public String getCardClearingProcessDateTime() {
    return cardClearingProcessDateTime;
  }

  public void setCardClearingProcessDateTime(String cardClearingProcessDateTime) {
    this.cardClearingProcessDateTime = cardClearingProcessDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule of activities for card clearing 
   * @return cardClearingServiceSchedule
  **/

  public String getCardClearingServiceSchedule() {
    return cardClearingServiceSchedule;
  }

  public void setCardClearingServiceSchedule(String cardClearingServiceSchedule) {
    this.cardClearingServiceSchedule = cardClearingServiceSchedule;
  }


}

