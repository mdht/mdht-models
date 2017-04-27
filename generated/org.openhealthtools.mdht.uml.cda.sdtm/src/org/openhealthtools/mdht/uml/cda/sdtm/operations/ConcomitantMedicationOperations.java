/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.Indication;
import org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationStartRelativetoReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Start Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationStopRelativetoReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Stop Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationEventDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Event Duration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getStartRelativetoReferencePeriod() <em>Get Start Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getStopRelativetoReferencePeriod() <em>Get Stop Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getIndication() <em>Get Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getIntendedRegimen() <em>Get Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getEventDuration() <em>Get Event Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcomitantMedicationOperations extends org.eclipse.mdht.uml.cda.operations.SubstanceAdministrationOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcomitantMedicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationTemplateId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationTemplateId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.25.24')";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationTemplateId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationTemplateId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationTemplateId(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationClassCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationMoodCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationId(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationStatusCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationStatusCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationStatusCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationStatusCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationStatusCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationText(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationText(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationText(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationText(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationText(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationEffectiveTime(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationEffectiveTime(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationEffectiveTime(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationEffectiveTime(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationEffectiveTime(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationDoseQuantity(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_DOSE_QUANTITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationMaxDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationRouteCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationRouteCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationRouteCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationRouteCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationRouteCodeP(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_ROUTE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationRouteCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationRouteCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationRouteCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationRouteCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationRouteCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationRouteCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_ROUTE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationRouteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationGroupIdentifier(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationGroupIdentifier(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationGroupIdentifier(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationGroupIdentifier(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationGroupIdentifier(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationConsumableMaterial(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Consumable Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationConsumableMaterial(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(sdtm::ConsumableMaterial))";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationConsumableMaterial(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Consumable Material</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationConsumableMaterial(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationConsumableMaterial(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationConsumableMaterial", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PreSpecifiedEvent) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Pre Specified Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationDataCollection(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationDataCollection(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationDataCollection(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationDataCollection(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationDataCollection(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyDayPeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Study Day Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::TimingReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Timing Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationTimingReference(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_TIMING_REFERENCE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationComment(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationComment(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationComment(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationComment(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationComment(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationDomainAssignment(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationDomainAssignment(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationDomainAssignment(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationDomainAssignment(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationDomainAssignment(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationRelatedRecord(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationRelatedRecord(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationRelatedRecord(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationRelatedRecord(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationRelatedRecord(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationSupplementalValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationSupplementalValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationSupplementalValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationSupplementalValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationSupplementalValue(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationStartRelativetoReferencePeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Start Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationStartRelativetoReferencePeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StartRelativetoReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationStartRelativetoReferencePeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Start Relativeto Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationStartRelativetoReferencePeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationStartRelativetoReferencePeriod(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_START_RELATIVETO_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationStartRelativetoReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationStopRelativetoReferencePeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Stop Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationStopRelativetoReferencePeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StopRelativetoReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationStopRelativetoReferencePeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Stop Relativeto Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationStopRelativetoReferencePeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationStopRelativetoReferencePeriod(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_STOP_RELATIVETO_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationStopRelativetoReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationIndication(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationIndication(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationIndication(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationIndication(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationIndication(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INDICATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationIndication", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationIntendedRegimen(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationIntendedRegimen(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::IntendedRegimen) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationIntendedRegimen(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationIntendedRegimen(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationIntendedRegimen(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INTENDED_REGIMEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationIntendedRegimen", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationCategory(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationSubCategory(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationFindingAbout(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationFindingAbout(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationFindingAbout(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationFindingAbout(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationFindingAbout(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationEventDuration(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationEventDuration(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventDuration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationEventDuration(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Event Duration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationEventDuration(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationEventDuration(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_EVENT_DURATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationEventDuration", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C25150' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationTypeCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAge", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C25150' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))))";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Human Clinical Subject Demographics Age Association Subject Age Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
			try {
				VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(concomitantMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
						 new Object [] { concomitantMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(ConcomitantMedication) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(ConcomitantMedication) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(94));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(ConcomitantMedication) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(ConcomitantMedication) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(95));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(ConcomitantMedication) <em>Get Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PreSpecifiedEvent))->asSequence()->any(true).oclAsType(sdtm::PreSpecifiedEvent)";

	/**
	 * The cached OCL query for the '{@link #getPreSpecifiedEvent(ConcomitantMedication) <em>Get Pre Specified Event</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PreSpecifiedEvent getPreSpecifiedEvent(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(96));
			try {
				GET_PRE_SPECIFIED_EVENT__EOCL_QRY = helper.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_QRY);
		return (PreSpecifiedEvent) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(ConcomitantMedication) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(ConcomitantMedication) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(97));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyDayPeriod(ConcomitantMedication) <em>Get Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyDayPeriod))->asSequence()->any(true).oclAsType(sdtm::StudyDayPeriod)";

	/**
	 * The cached OCL query for the '{@link #getStudyDayPeriod(ConcomitantMedication) <em>Get Study Day Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyDayPeriod getStudyDayPeriod(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(98));
			try {
				GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
		return (StudyDayPeriod) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTimingReference(ConcomitantMedication) <em>Get Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::TimingReference))->asSequence()->any(true).oclAsType(sdtm::TimingReference)";

	/**
	 * The cached OCL query for the '{@link #getTimingReference(ConcomitantMedication) <em>Get Timing Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TimingReference getTimingReference(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_TIMING_REFERENCE__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(99));
			try {
				GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
		return (TimingReference) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(ConcomitantMedication) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(ConcomitantMedication) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_COMMENTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(100));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(concomitantMedication);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(ConcomitantMedication) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(ConcomitantMedication) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(101));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(ConcomitantMedication) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(ConcomitantMedication) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(102));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(concomitantMedication);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(ConcomitantMedication) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(ConcomitantMedication) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(103));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(concomitantMedication);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStartRelativetoReferencePeriod(ConcomitantMedication) <em>Get Start Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRelativetoReferencePeriod(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StartRelativetoReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::StartRelativetoReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getStartRelativetoReferencePeriod(ConcomitantMedication) <em>Get Start Relativeto Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRelativetoReferencePeriod(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StartRelativetoReferencePeriod getStartRelativetoReferencePeriod(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(104));
			try {
				GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY);
		return (StartRelativetoReferencePeriod) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStopRelativetoReferencePeriod(ConcomitantMedication) <em>Get Stop Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRelativetoReferencePeriod(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StopRelativetoReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::StopRelativetoReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getStopRelativetoReferencePeriod(ConcomitantMedication) <em>Get Stop Relativeto Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRelativetoReferencePeriod(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StopRelativetoReferencePeriod getStopRelativetoReferencePeriod(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(105));
			try {
				GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY);
		return (StopRelativetoReferencePeriod) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndication(ConcomitantMedication) <em>Get Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Indication))->asSequence()->any(true).oclAsType(sdtm::Indication)";

	/**
	 * The cached OCL query for the '{@link #getIndication(ConcomitantMedication) <em>Get Indication</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Indication getIndication(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_INDICATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(106));
			try {
				GET_INDICATION__EOCL_QRY = helper.createQuery(GET_INDICATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_INDICATION__EOCL_QRY);
		return (Indication) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIntendedRegimen(ConcomitantMedication) <em>Get Intended Regimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedRegimen(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTENDED_REGIMEN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::IntendedRegimen))->asSequence()->any(true).oclAsType(sdtm::IntendedRegimen)";

	/**
	 * The cached OCL query for the '{@link #getIntendedRegimen(ConcomitantMedication) <em>Get Intended Regimen</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedRegimen(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTENDED_REGIMEN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  IntendedRegimen getIntendedRegimen(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_INTENDED_REGIMEN__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(107));
			try {
				GET_INTENDED_REGIMEN__EOCL_QRY = helper.createQuery(GET_INTENDED_REGIMEN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_INTENDED_REGIMEN__EOCL_QRY);
		return (IntendedRegimen) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(ConcomitantMedication) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(ConcomitantMedication) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(108));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(ConcomitantMedication) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(ConcomitantMedication) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(109));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(concomitantMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(ConcomitantMedication) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(ConcomitantMedication) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(110));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(concomitantMedication);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventDuration(ConcomitantMedication) <em>Get Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_DURATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventDuration))->asSequence()->any(true).oclAsType(sdtm::EventDuration)";

	/**
	 * The cached OCL query for the '{@link #getEventDuration(ConcomitantMedication) <em>Get Event Duration</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(ConcomitantMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_DURATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventDuration getEventDuration(ConcomitantMedication concomitantMedication) {
	
	
	
		if (GET_EVENT_DURATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(111));
			try {
				GET_EVENT_DURATION__EOCL_QRY = helper.createQuery(GET_EVENT_DURATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EVENT_DURATION__EOCL_QRY);
		return (EventDuration) query.evaluate(concomitantMedication);
	}

} // ConcomitantMedicationOperations