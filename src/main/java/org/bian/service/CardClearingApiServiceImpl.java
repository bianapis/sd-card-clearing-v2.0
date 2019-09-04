/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardClearingApiServiceImpl implements CardClearingApiService {

	public SDCardClearingActivateOutputModel activate(SDCardClearingActivateInputModel request){
		return JsonReader.read("activate-SDCardClearingActivateOutputModel.json",new TypeReference<SDCardClearingActivateOutputModel>(){});
	}
	
	public SDCardClearingConfigureOutputModel configure(String sdReferenceId, SDCardClearingConfigureInputModel request){
		return JsonReader.read("configure-SDCardClearingConfigureOutputModel.json",new TypeReference<SDCardClearingConfigureOutputModel>(){});
	}
	
	public SDCardClearingFeedbackOutputModel feedback(String sdReferenceId, SDCardClearingFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardClearingFeedbackOutputModel.json",new TypeReference<SDCardClearingFeedbackOutputModel>(){});
	}
	
	public CRCardClearingProcedureInitiateOutputModel initiate(String sdReferenceId, CRCardClearingProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCardClearingProcedureInitiateOutputModel.json",new TypeReference<CRCardClearingProcedureInitiateOutputModel>(){});
	}
	
	public CRCardClearingProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCardClearingProcedureRetrieveOutputModel.json",new TypeReference<CRCardClearingProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAddressingRetrieveOutputModel retrieveAddressing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAddressingRetrieveOutputModel.json",new TypeReference<BQAddressingRetrieveOutputModel>(){});
	}
	
	public BQCaptureRetrieveOutputModel retrieveCapture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCaptureRetrieveOutputModel.json",new TypeReference<BQCaptureRetrieveOutputModel>(){});
	}
	
	public BQFXConversionRetrieveOutputModel retrieveFxconversion(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFXConversionRetrieveOutputModel.json",new TypeReference<BQFXConversionRetrieveOutputModel>(){});
	}
	
	public BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFeesRetrieveOutputModel.json",new TypeReference<BQFeesRetrieveOutputModel>(){});
	}
	
	public BQMatchingRetrieveOutputModel retrieveMatching(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMatchingRetrieveOutputModel.json",new TypeReference<BQMatchingRetrieveOutputModel>(){});
	}
	
	public BQReconciliationRetrieveOutputModel retrieveReconciliation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReconciliationRetrieveOutputModel.json",new TypeReference<BQReconciliationRetrieveOutputModel>(){});
	}
	
	public BQRoutingRetrieveOutputModel retrieveRouting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRoutingRetrieveOutputModel.json",new TypeReference<BQRoutingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCardClearingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardClearingRetrieveOutputModel.json",new TypeReference<SDCardClearingRetrieveOutputModel>(){});
	}
	
	public CRCardClearingProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardClearingProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCardClearingProcedureUpdateOutputModel.json",new TypeReference<CRCardClearingProcedureUpdateOutputModel>(){});
	}
	
	public BQCaptureUpdateOutputModel updateCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureUpdateInputModel request){
		return JsonReader.read("update-BQCaptureUpdateOutputModel.json",new TypeReference<BQCaptureUpdateOutputModel>(){});
	}
	
	public BQFeesUpdateOutputModel updateFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesUpdateInputModel request){
		return JsonReader.read("update-BQFeesUpdateOutputModel.json",new TypeReference<BQFeesUpdateOutputModel>(){});
	}
	
}
