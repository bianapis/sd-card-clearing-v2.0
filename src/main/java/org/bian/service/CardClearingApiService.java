/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardClearingApiService {

	SDCardClearingActivateOutputModel activate(SDCardClearingActivateInputModel request);
	
	SDCardClearingConfigureOutputModel configure(String sdReferenceId, SDCardClearingConfigureInputModel request);
	
	SDCardClearingFeedbackOutputModel feedback(String sdReferenceId, SDCardClearingFeedbackInputModel request);
	
	CRCardClearingProcedureInitiateOutputModel initiate(String sdReferenceId, CRCardClearingProcedureInitiateInputModel request);
	
	CRCardClearingProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQAddressingRetrieveOutputModel retrieveAddressing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCaptureRetrieveOutputModel retrieveCapture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFXConversionRetrieveOutputModel retrieveFxconversion(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMatchingRetrieveOutputModel retrieveMatching(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReconciliationRetrieveOutputModel retrieveReconciliation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRoutingRetrieveOutputModel retrieveRouting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCardClearingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCardClearingProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardClearingProcedureUpdateInputModel request);
	
	BQCaptureUpdateOutputModel updateCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureUpdateInputModel request);
	
	BQFeesUpdateOutputModel updateFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesUpdateInputModel request);
	
}
