
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
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ConcomitantMedicationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Concomitant Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationConcomitantMedicationCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Concomitant Medication Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationindicationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationindication Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Concomitant Medication Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationActivityStartTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationActivtyEndTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Activty End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Concomitant Medication Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Association Concomitant Medication Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getActivityStartTimingReference() <em>Get Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getActivtyEndTimingReference() <em>Get Activty End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ConcomitantMedicationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationTemplateId() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationTemplateIdTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationTemplateId(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationClassCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationClassCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationClassCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationDoseQuantity() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationDoseQuantityTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationDoseQuantity(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateConcomitantMedicationEffectiveTime() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationEffectiveTimeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
      					
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationEffectiveTime(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationRouteCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationRouteCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationRouteCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationRouteCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationRouteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationId() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationIdTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationId",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationId(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationMoodCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationMoodCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationMoodCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationStatusCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationStatusCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationStatusCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationText() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationTextTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationText",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationText(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationMaxDoseQuantity() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationMaxDoseQuantityTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationMaxDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationMaxDoseQuantity(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationMaxDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationGroupIdentifier() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationGroupIdentifierTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationGroupIdentifier(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationConcomitantMedicationCategoryAssociation() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationConcomitantMedicationCategoryAssociationTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationConcomitantMedicationCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationConcomitantMedicationCategoryAssociation(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationConcomitantMedicationCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationNonPerformanceReason() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationNonPerformanceReasonTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationNonPerformanceReason(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationindicationAssociation() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationindicationAssociationTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationindicationAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONINDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationindicationAssociation(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationindicationAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationConsumableMaterial() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationConsumableMaterialTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationConsumableMaterial",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationConsumableMaterial(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationConsumableMaterialTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationConcomitantMedicationSubCategoryAssociation() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationConcomitantMedicationSubCategoryAssociationTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationConcomitantMedicationSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationIntendedRegimenAssociation() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationIntendedRegimenAssociationTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationIntendedRegimenAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociation(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationIntendedRegimenAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationActivityStartTimingReference() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationActivityStartTimingReferenceTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationActivityStartTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationActivityStartTimingReference(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationActivityStartTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationActivtyEndTimingReference() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationActivtyEndTimingReferenceTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationActivtyEndTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_ACTIVTY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationActivtyEndTimingReference(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationActivtyEndTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationPreSpecifiedEvent() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationPreSpecifiedEventTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationPreSpecifiedEvent",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationPreSpecifiedEvent(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationPreSpecifiedEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationDataCollection() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationDataCollectionTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationDataCollection(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationStudyDayPeriod() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationStudyDayPeriodTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationStudyDayPeriod(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodePTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValueTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
       
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodePTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValueTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
     
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociationTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategoryTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodePTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValueTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndicationTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndicationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodePTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValueTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
       
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodePTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValueTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationIntendedRegimenAssociationTypeCode() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationIntendedRegimenAssociationTypeCodeTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationIntendedRegimenAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationTypeCode(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationIntendedRegimenAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen() {
      OperationsTestCase<ConcomitantMedication> validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimenTestCase = new OperationsTestCase<ConcomitantMedication>(
      "validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen",
      operationsForOCL.getOCLValue("VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConcomitantMedication target) {

      }

      @Override
      protected void updateToPass(ConcomitantMedication target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(
          (ConcomitantMedication) objectToTest, diagnostician, map);
      }

    };

    validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimenTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


ConcomitantMedication target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


ConcomitantMedication target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetActivityStartTimingReference() {


ConcomitantMedication target = objectFactory.create();
target.getActivityStartTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetActivtyEndTimingReference() {


ConcomitantMedication target = objectFactory.create();
target.getActivtyEndTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPreSpecifiedEvent() {


ConcomitantMedication target = objectFactory.create();
target.getPreSpecifiedEvent();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


ConcomitantMedication target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


ConcomitantMedication target = objectFactory.create();
target.getStudyDayPeriod();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ConcomitantMedicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConcomitantMedication> {
		public ConcomitantMedication create() {		
			return SdtmFactory.eINSTANCE.createConcomitantMedication();
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
	private static class ConstructorTestClass extends ConcomitantMedicationOperations {};
	
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
	
	

	
	
} // ConcomitantMedicationOperations