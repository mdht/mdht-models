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

import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Exposure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureElementOrderAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Element Order Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureIntendedRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureDoseAdjustmentReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Adjustment Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureEventDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Event Duration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationElementOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Element Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getIntendedRegimen() <em>Get Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getDoseAdjustmentReason() <em>Get Dose Adjustment Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getEventDuration() <em>Get Event Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanClinicalExposureOperations extends SubstanceAdministrationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanClinicalExposureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureTemplateId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureTemplateId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.44')";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureTemplateId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureTemplateId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureTemplateId(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureClassCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureId(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureMoodCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureRouteCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureRouteCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureRouteCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureRouteCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureRouteCodeP(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureRouteCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureRouteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureRouteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureRouteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureRouteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureRouteCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureRouteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureMaxDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureText(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureText(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureText(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureText(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureText(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureApproachSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureApproachSiteCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureApproachSiteCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureApproachSiteCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureApproachSiteCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureApproachSiteCodeP(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureApproachSiteCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Consumable Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(sdtm::ConsumableMaterial))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Consumable Material</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureConsumableMaterial", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Epoch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::StudyEpoch) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Epoch</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureStudyEpoch", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Element Order Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Element Order Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureElementOrderAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureTimingReference(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureTimingReference(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::TimingReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureTimingReference(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Timing Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureTimingReference(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureTimingReference(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyDayPeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Day Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureComment(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureComment(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureComment(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureComment(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureComment(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureDomainAssignment(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureDomainAssignment(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureDomainAssignment(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureDomainAssignment(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureDomainAssignment(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureRelatedRecord(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureRelatedRecord(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureRelatedRecord(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureRelatedRecord(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureRelatedRecord(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureSupplementalValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureSupplementalValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureSupplementalValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureSupplementalValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureSupplementalValue(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureIntendedRegimen(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Intended Regimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureIntendedRegimen(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::IntendedRegimen) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureIntendedRegimen(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Intended Regimen</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureIntendedRegimen(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureIntendedRegimen(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_INTENDED_REGIMEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureIntendedRegimen", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureDoseAdjustmentReason(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Adjustment Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureDoseAdjustmentReason(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DoseAdjustmentReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureDoseAdjustmentReason(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Adjustment Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureDoseAdjustmentReason(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureDoseAdjustmentReason(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureDoseAdjustmentReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureCategory(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureSubCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureSubCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureSubCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureSubCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureSubCategory(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureFindingAbout(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureFindingAbout(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureFindingAbout(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureFindingAbout(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureFindingAbout(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureEventDuration(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureEventDuration(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventDuration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureEventDuration(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Event Duration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureEventDuration(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureEventDuration(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSURE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_EVENT_DURATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureEventDuration", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Element Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Element Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationElementOrder", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
						 new Object [] { humanClinicalExposure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(HumanClinicalExposure) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(HumanClinicalExposure) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(HumanClinicalExposure humanClinicalExposure) {
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(87));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(humanClinicalExposure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyEpoch(HumanClinicalExposure) <em>Get Study Epoch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEpoch(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_EPOCH__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::StudyEpoch))->asSequence()->any(true).oclAsType(sdtm::StudyEpoch)";

	/**
	 * The cached OCL query for the '{@link #getStudyEpoch(HumanClinicalExposure) <em>Get Study Epoch</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEpoch(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_EPOCH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyEpoch getStudyEpoch(HumanClinicalExposure humanClinicalExposure) {
		if (GET_STUDY_EPOCH__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(88));
			try {
				GET_STUDY_EPOCH__EOCL_QRY = helper.createQuery(GET_STUDY_EPOCH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_EPOCH__EOCL_QRY);
		return (StudyEpoch) query.evaluate(humanClinicalExposure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTimingReference(HumanClinicalExposure) <em>Get Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::TimingReference))->asSequence()->any(true).oclAsType(sdtm::TimingReference)";

	/**
	 * The cached OCL query for the '{@link #getTimingReference(HumanClinicalExposure) <em>Get Timing Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TimingReference getTimingReference(HumanClinicalExposure humanClinicalExposure) {
		if (GET_TIMING_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(89));
			try {
				GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
		return (TimingReference) query.evaluate(humanClinicalExposure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyDayPeriod(HumanClinicalExposure) <em>Get Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyDayPeriod))->asSequence()->any(true).oclAsType(sdtm::StudyDayPeriod)";

	/**
	 * The cached OCL query for the '{@link #getStudyDayPeriod(HumanClinicalExposure) <em>Get Study Day Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyDayPeriod getStudyDayPeriod(HumanClinicalExposure humanClinicalExposure) {
		if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(90));
			try {
				GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
		return (StudyDayPeriod) query.evaluate(humanClinicalExposure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(HumanClinicalExposure) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(HumanClinicalExposure) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(HumanClinicalExposure humanClinicalExposure) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(91));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(humanClinicalExposure);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(HumanClinicalExposure) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(HumanClinicalExposure) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(HumanClinicalExposure humanClinicalExposure) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(92));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(humanClinicalExposure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(HumanClinicalExposure) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(HumanClinicalExposure) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(HumanClinicalExposure humanClinicalExposure) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(93));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(humanClinicalExposure);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(HumanClinicalExposure) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(HumanClinicalExposure) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(HumanClinicalExposure humanClinicalExposure) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(94));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(humanClinicalExposure);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getIntendedRegimen(HumanClinicalExposure) <em>Get Intended Regimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedRegimen(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTENDED_REGIMEN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::IntendedRegimen))->asSequence()->any(true).oclAsType(sdtm::IntendedRegimen)";

	/**
	 * The cached OCL query for the '{@link #getIntendedRegimen(HumanClinicalExposure) <em>Get Intended Regimen</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedRegimen(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTENDED_REGIMEN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  IntendedRegimen getIntendedRegimen(HumanClinicalExposure humanClinicalExposure) {
		if (GET_INTENDED_REGIMEN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(95));
			try {
				GET_INTENDED_REGIMEN__EOCL_QRY = helper.createQuery(GET_INTENDED_REGIMEN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTENDED_REGIMEN__EOCL_QRY);
		return (IntendedRegimen) query.evaluate(humanClinicalExposure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDoseAdjustmentReason(HumanClinicalExposure) <em>Get Dose Adjustment Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseAdjustmentReason(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOSE_ADJUSTMENT_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DoseAdjustmentReason))->asSequence()->any(true).oclAsType(sdtm::DoseAdjustmentReason)";

	/**
	 * The cached OCL query for the '{@link #getDoseAdjustmentReason(HumanClinicalExposure) <em>Get Dose Adjustment Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseAdjustmentReason(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOSE_ADJUSTMENT_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DoseAdjustmentReason getDoseAdjustmentReason(HumanClinicalExposure humanClinicalExposure) {
		if (GET_DOSE_ADJUSTMENT_REASON__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(96));
			try {
				GET_DOSE_ADJUSTMENT_REASON__EOCL_QRY = helper.createQuery(GET_DOSE_ADJUSTMENT_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOSE_ADJUSTMENT_REASON__EOCL_QRY);
		return (DoseAdjustmentReason) query.evaluate(humanClinicalExposure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(HumanClinicalExposure) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(HumanClinicalExposure) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(HumanClinicalExposure humanClinicalExposure) {
		if (GET_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(97));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(humanClinicalExposure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(HumanClinicalExposure) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(HumanClinicalExposure) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(HumanClinicalExposure humanClinicalExposure) {
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(98));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(humanClinicalExposure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(HumanClinicalExposure) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(HumanClinicalExposure) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(HumanClinicalExposure humanClinicalExposure) {
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(99));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(humanClinicalExposure);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventDuration(HumanClinicalExposure) <em>Get Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_DURATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventDuration))->asSequence()->any(true).oclAsType(sdtm::EventDuration)";

	/**
	 * The cached OCL query for the '{@link #getEventDuration(HumanClinicalExposure) <em>Get Event Duration</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(HumanClinicalExposure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_DURATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventDuration getEventDuration(HumanClinicalExposure humanClinicalExposure) {
		if (GET_EVENT_DURATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(100));
			try {
				GET_EVENT_DURATION__EOCL_QRY = helper.createQuery(GET_EVENT_DURATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_DURATION__EOCL_QRY);
		return (EventDuration) query.evaluate(humanClinicalExposure);
	}

} // HumanClinicalExposureOperations