
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudySubjectInterventionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Subject Intervention</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionInterventionCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionInterventionSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionDoseAdjustmentReasonAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Dose Adjustment Reason Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionElementOrderAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Element Order Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionInterventionRegimenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Regimen Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionInterventionIndicationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Indication Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Association Intervention Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Association Intervention Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Association Dose Adjustment Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationElementOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Association Element Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Association Exposure Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Association Intervention Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StudySubjectInterventionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionTemplateId() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionTemplateIdTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionTemplateId(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionClassCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionClassCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionClassCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionDoseQuantity() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionDoseQuantityTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionDoseQuantity(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateStudySubjectInterventionEffectiveTime() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionEffectiveTimeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
         					
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionEffectiveTime(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionId() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionIdTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionId(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionMoodCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionMoodCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionMoodCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionRouteCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionRouteCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionRouteCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionRouteCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionRouteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionMaxDoseQuantity() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionMaxDoseQuantityTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionMaxDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionMaxDoseQuantity(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionMaxDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionText() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionTextTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionText",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionText(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionApproachSiteCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionApproachSiteCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionApproachSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionApproachSiteCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionApproachSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionStatusCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionStatusCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionStatusCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionGroupIdentifier() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionGroupIdentifierTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionGroupIdentifier(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionConsumable() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionConsumableTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionConsumable",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionConsumable(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionConsumableTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionInterventionCategoryAssociation() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionInterventionCategoryAssociationTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionInterventionCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionInterventionCategoryAssociation(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionInterventionCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionInterventionSubCategoryAssociation() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionInterventionSubCategoryAssociationTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionInterventionSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionInterventionSubCategoryAssociation(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionInterventionSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionDoseAdjustmentReasonAssociation() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionDoseAdjustmentReasonAssociationTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionDoseAdjustmentReasonAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionDoseAdjustmentReasonAssociation(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionDoseAdjustmentReasonAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionStudyEpoch() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionStudyEpochTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionStudyEpoch",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionStudyEpoch(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionStudyEpochTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionElementOrderAssociation() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionElementOrderAssociationTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionElementOrderAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionElementOrderAssociation(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionElementOrderAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionTimingReference() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionTimingReferenceTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionTimingReference(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionStudyDayPeriod() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionStudyDayPeriodTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionStudyDayPeriod(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionInterventionRegimenAssociation() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionInterventionRegimenAssociationTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionInterventionRegimenAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionInterventionRegimenAssociation(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionInterventionRegimenAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionPreSpecifiedEvent() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionPreSpecifiedEventTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionPreSpecifiedEvent",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionPreSpecifiedEvent(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionPreSpecifiedEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionDataCollection() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionDataCollectionTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionDataCollection(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionNonPerformanceReason() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionNonPerformanceReasonTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionNonPerformanceReason(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionInterventionIndicationAssociation() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionInterventionIndicationAssociationTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionInterventionIndicationAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_INDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionInterventionIndicationAssociation(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionInterventionIndicationAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValueTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
       
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionCategoryAssociationTypeCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionCategoryAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategoryTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_INTERVENTION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValueTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
       
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategoryTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_INTERVENTION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodePTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValueTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReasonTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionelementOrderAssociationelementOrderClassCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionelementOrderAssociationelementOrderClassCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionelementOrderAssociationelementOrderClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionelementOrderAssociationelementOrderCodeP() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionelementOrderAssociationelementOrderCodePTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionelementOrderAssociationelementOrderCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionelementOrderAssociationelementOrderCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionelementOrderAssociationelementOrderCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionelementOrderAssociationelementOrderCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionelementOrderAssociationelementOrderCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateStudySubjectInterventionelementOrderAssociationelementOrderValue() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionelementOrderAssociationelementOrderValueTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionelementOrderAssociationelementOrderValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderValue(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionelementOrderAssociationelementOrderValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionelementOrderAssociationTypeCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionelementOrderAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionelementOrderAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationTypeCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionelementOrderAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventionelementOrderAssociationElementOrder() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventionelementOrderAssociationElementOrderTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventionelementOrderAssociationElementOrder",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationElementOrder(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventionelementOrderAssociationElementOrderTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValueTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
    
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionRegimenAssociationTypeCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionRegimenAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionRegimenAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionRegimenAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimenTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimenTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodePTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValueTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
       
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionIndicationAssociationTypeCode() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionIndicationAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionIndicationAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionIndicationAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication() {
      OperationsTestCase<StudySubjectIntervention> validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndicationTestCase = new OperationsTestCase<StudySubjectIntervention>(
      "validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_INTERVENTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectIntervention target) {

      }

      @Override
      protected void updateToPass(StudySubjectIntervention target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(
          (StudySubjectIntervention) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndicationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


StudySubjectIntervention target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyEpoch() {


StudySubjectIntervention target = objectFactory.create();
target.getStudyEpoch();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


StudySubjectIntervention target = objectFactory.create();
target.getTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


StudySubjectIntervention target = objectFactory.create();
target.getStudyDayPeriod();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPreSpecifiedEvent() {


StudySubjectIntervention target = objectFactory.create();
target.getPreSpecifiedEvent();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


StudySubjectIntervention target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


StudySubjectIntervention target = objectFactory.create();
target.getNonPerformanceReason();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends StudySubjectInterventionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}
	
/**
*
* @generated
*/
	private static class ObjectFactory implements TestObjectFactory<StudySubjectIntervention> {
		public StudySubjectIntervention create() {		
			return SdtmFactory.eINSTANCE.createStudySubjectIntervention();
		}
	}


/**
*
* @generated
*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

/**
*
* @generated
*/
	private static ObjectFactory objectFactory = new ObjectFactory();


		/**
* Tests Operations Constructor for 100% coverage
* @generated
*/	
	private static class ConstructorTestClass extends StudySubjectInterventionOperations {};
	
		/**
* Tests Operations Constructor for 100% coverage
* @generated
*/	
		@Test
	public void testConstructor() {
          @SuppressWarnings("unused")
      ConstructorTestClass constructorTestClass = new ConstructorTestClass();		
  } // testConstructor
	
	
	
	/**
*
* @generated
*/
	@Override
	protected EObject getObjectToTest() {		
    return null;
  }
	
	

	
	
} // StudySubjectInterventionOperations