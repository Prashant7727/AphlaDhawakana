package APK_Config;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Analytics.Analytics;
import ClinicProductManagement.ClinicProductManagement;
import EconsultHistory.EconsultHistory;
import ForgotPassword.ForgotPassword;
import HazardReport.HazardReport;
import ImportData.ImportData;
import ManageMasterData.Analytics_Information;
import ManageMasterData.AssignClinicDeviceInformation;
import ManageMasterData.AssignClinicShiftInformation;
import ManageMasterData.AssignFacilityIssue;
import ManageMasterData.ChronicalDisease;
import ManageMasterData.ConsentInformation;
import ManageMasterData.ConsultationFeedback;
import ManageMasterData.DeviceInformationMaster;
import ManageMasterData.Diagnosis;
import ManageMasterData.Examination;
import ManageMasterData.FamailyCategoryReason;
import ManageMasterData.Immunizations;
import ManageMasterData.LabTestReportMaster;
import ManageMasterData.ManagAreaCode;
import ManageMasterData.ManageCamChiefComplain;
import ManageMasterData.ManageCensusData;
import ManageMasterData.ManageClinicHubDoctor;
import ManageMasterData.ManageEquipment;
import ManageMasterData.ManageFacilityIssue;
import ManageMasterData.ManageFamailyScheme;
import ManageMasterData.ManageGoveronmentScheme;
import ManageMasterData.ManageHelpScreens;
import ManageMasterData.ManageInstructionInformation;
import ManageMasterData.ManageLabBill;
import ManageMasterData.ManageOccupation;
import ManageMasterData.ManagePatientInvestigation;
import ManageMasterData.ManageRelationType;
import ManageMasterData.ManageRiskFactor;
import ManageMasterData.ManageRoleInformation;
import ManageMasterData.ManageSnomedAlert;
import ManageMasterData.Manage_Education;
import ManageMasterData.Manage_FamilyCategory;
import ManageMasterData.Manage_Referral_Reason;
import ManageMasterData.Manage_ReferralsFromList;
import ManageMasterData.Physiotheraphy;
import ManageMasterData.PostalCode;
import ManageMasterData.Referrals;
import ManageMasterData.Screening_Data;
import ManageMasterData.Services;
import ManageMasterData.ShiftInfomation;
import ManageMasterData.Speciality_Referral;
import ManageMasterData.Symptoms;
import ManageMasterData.Tests;
import ManageMasterData.UploadDistrict;
import ManageMasterData.UploadVerificationStaff;
import ManageMasterData.Vital_Range_Information;
import ManageMasterData.managePreventiveAreaCode;
import ManageMasterData.manage_Speciality;
import Reports.AttendanceReport;
import Reports.BeneficiaryFrequencyReport;
import Reports.CompiledReport;
import Reports.ConsultationCount;
import Reports.ConsultationLogReport;
import Reports.CummulativeOPReport;
import Reports.DailyPatientReport;
import Reports.DiseaseProfile;
import Reports.DoctorsHubReport;
import Reports.FollowUpPatientReport;
import Reports.InventoryConsumptionReport;
import Reports.InventoryReport;
import Reports.LabTestCountReport;
import Reports.LeaveReport;
import Reports.LoopClosureReport;
import Reports.MedicineDispenceReport;
import Reports.OperatorFeedbackReport;
import Reports.PMPReport;
import Reports.PatientPrescriptionReport;
import Reports.PatientScreeningReport;
import Reports.PatientTestReport;
import Reports.PaymentReport;
import Reports.ReferralCountReport;
import Reports.StaffAttendanceGeoReport;
import Reports.StaffAttendenceDetailReport;
import Reports.StockBalanceReport;
import Reports.SummaryReport;
import Reports.TestReport;
import Reports.ThaneBillingReport;
import Reports.ThaneReport;
import Reports.TotalBalanceStockReport;
import Reports.ViewHealthHazardImages;
import Reports.vmDispenceReport;
import TodaysPatients.TodaysPatients;
import UpdateConsultInfo.UpdateConsultInfo;
import UpdateInventory.UpdateInventory;
import UpdateLotInventory.UpdateLotInventory;
import UpdatePatientContent.UpdatePatientContent;
import UploadClinicLogo.UploadClinicLogo;
import UploadHistory.UploadHistory;
import UploadStock.UploadStock;
import adhocReportData.adhocReportData;
import data.ainaReport;
import data.clinicDashboard;
import data.teleConsultDashboard;

@RunWith(Suite.class)
@Suite.SuiteClasses({

//        DataRequest.class,
//        adhocReportData.class,
//        Analytics.class,
//        ClinicProductManagement.class,
//	      ainaReport.class,
//	      clinicDashboard.class,                                        
//	HazardReport.class,
//	ImportData.class,
//	UpdateConsultInfo.class,
//	UpdateInventory.class,
//	UpdateLotInventory.class,
//	UpdatePatientContent.class,
//	UploadStock.class,

	
//	OperatorFeedbackReport.class,
	
	
	//..........Manage Master Data..................//
//	Analytics_Information.class,
//	AssignClinicDeviceInformation.class,
//	AssignClinicShiftInformation.class,
//	ChronicalDisease.class,
//	ConsentInformation.class,
//	ConsultationFeedback.class,
//	DeviceInformationMaster.class,
//	Diagnosis.class,
//	Examination.class,
//	FamailyCategoryReason.class,
//	LabTestReportMaster.class,
//	ManagAreaCode.class,
//	Manage_Education.class,
//	Manage_FamilyCategory.class,
//	Manage_Referral_Reason.class,
//	Manage_ReferralsFromList.class,	                     
//	ManageCamChiefComplain.class,
//	ManageCensusData.class,
//	ManageClinicHubDoctor.class,
//	ManageEquipment.class,
//	ManageFacilityIssue.class,
//	ManageFamailyScheme.class,
//	ManageGoveronmentScheme.class,
//	ManageHelpScreens.class,
//	ManageInstructionInformation.class,
//	ManageLabBill.class,
//	ManageOccupation.class,
//	ManagePatientInvestigation.class,	                                        
//	ManageRelationType.class,
//	ManageRiskFactor.class,
//	ManageRoleInformation.class,
//	ManageSnomedAlert.class,	                                 
//	PostalCode.class,
//	Referrals.class,                        
//	ShiftInfomation.class,	                       
//	Symptoms.class,                          
//	UploadDistrict.class,
//	UploadVerificationStaff.class,
	
	
	//report..................
//      AttendanceReport.class,
//      BeneficiaryFrequencyReport.class,
//      CompiledReport.class,
//      ConsultationCount.class, 
//      ConsultationLogReport.class,
//      CummulativeOPReport.class,
//      DailyPatientReport.class,
//      DiseaseProfile.class,
//      DoctorsHubReport.class,
//      FollowUpPatientReport.class,
//      InventoryConsumptionReport.class,
//      InventoryReport.class,
//      LabTestCountReport.class,
//      LeaveReport.class, 
//      LoopClosureReport.class,
//      MedicineDispenceReport.class,
//      OperatorFeedbackReport.class,
//      PatientPrescriptionReport.class, 
//      PatientScreeningReport.class, 
//      PatientTestReport.class, 
//      PaymentReport.class,
//      PMPReport.class, 
//      ReferralCountReport.class,    
//      StaffAttendenceDetailReport.class,
//      SummaryReport.class,
//      TestReport.class, 
//      ThaneBillingReport.class, 
//      ThaneReport.class,
//      StaffAttendanceGeoReport.class,
//      ViewHealthHazardImages.class,
//      vmDispenceReport.class,
//	    StockBalanceReport.class,
	

})
public class TestSuite {
    // This class doesn't need any code
}