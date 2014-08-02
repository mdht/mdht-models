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

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Subject Demographics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsStudyArm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Study Arm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Location Participation Study Site Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Location Participation Study Site Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsLocationParticipationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Location Participation Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getStudyArms() <em>Get Study Arms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getReferencePeriod() <em>Get Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanClinicalSubjectDemographicsOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanClinicalSubjectDemographicsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.46')";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'DMGtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Study Arm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::StudyArm) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)->size() = 2";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Study Arm</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsStudyArm", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsParticipant(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsParticipant(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsParticipant(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsParticipant(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsParticipant(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_PARTICIPANT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsParticipant", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsComment(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsComment(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsComment(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsComment(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsComment(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsDomainAssignment(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsDomainAssignment(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsDomainAssignment(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsDomainAssignment(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsDomainAssignment(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsRelatedRecord(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsRelatedRecord(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsRelatedRecord(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsRelatedRecord(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsRelatedRecord(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsSupplementalValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsSupplementalValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsSupplementalValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsSupplementalValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsSupplementalValue(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsReferencePeriod(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsReferencePeriod(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::ReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsReferencePeriod(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsReferencePeriod(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsReferencePeriod(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsFindingAbout(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsFindingAbout(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsFindingAbout(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsFindingAbout(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsFindingAbout(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C25150' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAge", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Location Participation Study Site Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(classCode=vocab::RoleClassRoot::SDLOC)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Location Participation Study Site Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Location Participation Study Site Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Location Participation Study Site Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_STUDY_SITE_ADDR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsLocationParticipationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Location Participation Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsLocationParticipationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::LOC)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsLocationParticipationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Location Participation Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDemographicsLocationParticipationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDemographicsLocationParticipationTypeCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_LOCATION_PARTICIPATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsLocationParticipationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
						 new Object [] { humanClinicalSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(HumanClinicalSubjectDemographics) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(HumanClinicalSubjectDemographics) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics) {
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(74));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(humanClinicalSubjectDemographics);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyArms(HumanClinicalSubjectDemographics) <em>Get Study Arms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyArms(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_ARMS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::StudyArm)).oclAsType(sdtm::StudyArm)";

	/**
	 * The cached OCL query for the '{@link #getStudyArms(HumanClinicalSubjectDemographics) <em>Get Study Arms</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyArms(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_ARMS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<StudyArm> getStudyArms(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics) {
		if (GET_STUDY_ARMS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(75));
			try {
				GET_STUDY_ARMS__EOCL_QRY = helper.createQuery(GET_STUDY_ARMS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_ARMS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StudyArm> result = (Collection<StudyArm>) query.evaluate(humanClinicalSubjectDemographics);
		return new BasicEList.UnmodifiableEList<StudyArm>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(HumanClinicalSubjectDemographics) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(HumanClinicalSubjectDemographics) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(76));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(humanClinicalSubjectDemographics);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(HumanClinicalSubjectDemographics) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(HumanClinicalSubjectDemographics) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(77));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(humanClinicalSubjectDemographics);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(HumanClinicalSubjectDemographics) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(HumanClinicalSubjectDemographics) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(78));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(humanClinicalSubjectDemographics);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(HumanClinicalSubjectDemographics) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(HumanClinicalSubjectDemographics) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(79));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(humanClinicalSubjectDemographics);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getReferencePeriod(HumanClinicalSubjectDemographics) <em>Get Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePeriod(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REFERENCE_PERIOD__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::ReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::ReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getReferencePeriod(HumanClinicalSubjectDemographics) <em>Get Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePeriod(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ReferencePeriod getReferencePeriod(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics) {
		if (GET_REFERENCE_PERIOD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(80));
			try {
				GET_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REFERENCE_PERIOD__EOCL_QRY);
		return (ReferencePeriod) query.evaluate(humanClinicalSubjectDemographics);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(HumanClinicalSubjectDemographics) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(HumanClinicalSubjectDemographics) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(HumanClinicalSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics) {
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(81));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(humanClinicalSubjectDemographics);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // HumanClinicalSubjectDemographicsOperations