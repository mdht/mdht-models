/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentServiceEventRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentLanguageCodeFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentNoTemplateIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document No Template Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasEffectiveTimeSeconds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Seconds</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasEffectiveTimeZone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Zone</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentOneOrTwoRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document One Or Two Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHealthcareProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Healthcare Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocumentOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentServiceEventRequired(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentServiceEventRequired(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(doc : cda::DocumentationOf | not doc.serviceEvent.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentServiceEventRequired(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentServiceEventRequired(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(doc : cda::DocumentationOf | not doc.serviceEvent.oclIsUndefined())
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentServiceEventRequired(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentServiceEventRequired"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentServiceEventClassCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentServiceEventClassCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(doc : cda::DocumentationOf | doc.serviceEvent.classCode = vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentServiceEventClassCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentServiceEventClassCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(doc : cda::DocumentationOf | doc.serviceEvent.classCode = vocab::ActClassRoot::PCPR)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentServiceEventClassCode(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentServiceEventClassCode"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentServiceEventEffectiveTime(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentServiceEventEffectiveTime(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(doc : cda::DocumentationOf | "
			+ "   not doc.serviceEvent.effectiveTime.low.oclIsUndefined() and not doc.serviceEvent.effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentServiceEventEffectiveTime(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentServiceEventEffectiveTime(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(doc : cda::DocumentationOf | 
	 *    not doc.serviceEvent.effectiveTime.low.oclIsUndefined() and not doc.serviceEvent.effectiveTime.high.oclIsUndefined())
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentServiceEventEffectiveTime(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentServiceEventEffectiveTime"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentLanguageCodeFormat(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentLanguageCodeFormat(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentLanguageCodeFormat(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentLanguageCodeFormat(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentLanguageCodeFormat(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentLanguageCodeFormat"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentNoTemplateIdExtension(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document No Template Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentNoTemplateIdExtension(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->forAll(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1' implies id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentNoTemplateIdExtension(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document No Template Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentNoTemplateIdExtension(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->forAll(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1' implies id.extension.oclIsUndefined())
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentNoTemplateIdExtension(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentNoTemplateIdExtension"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentHasEffectiveTimeSeconds(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Seconds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasEffectiveTimeSeconds(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.value.size() >= 4";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentHasEffectiveTimeSeconds(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Seconds</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasEffectiveTimeSeconds(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.value.size() >= 4
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentHasEffectiveTimeSeconds(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentHasEffectiveTimeSeconds"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentHasEffectiveTimeZone(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasEffectiveTimeZone(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.value.size() >= 19";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentHasEffectiveTimeZone(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Zone</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasEffectiveTimeZone(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.value.size() >= 19
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentHasEffectiveTimeZone(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentHasEffectiveTimeZone"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentOneOrTwoRecordTarget(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document One Or Two Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentOneOrTwoRecordTarget(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() = 1 or self.recordTarget->size() =2";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentOneOrTwoRecordTarget(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document One Or Two Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentOneOrTwoRecordTarget(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() = 1 or self.recordTarget->size() =2
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentOneOrTwoRecordTarget(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentOneOrTwoRecordTarget"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentHasAssignedAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasAssignedAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.representedOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentHasAssignedAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasAssignedAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.representedOrganization.oclIsUndefined())
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentHasAssignedAuthor(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentHasAssignedAuthor"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | (not author.assignedAuthor.representedOrganization.oclIsUndefined()"
			+ "      and author.assignedAuthor.assignedPerson.oclIsUndefined() and author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())"
			+ "   implies author.assignedAuthor.id->one(id : datatypes::II | id.nullFlavor = vocab::NullFlavor::NA))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | (not author.assignedAuthor.representedOrganization.oclIsUndefined()
	 *       and author.assignedAuthor.assignedPerson.oclIsUndefined() and author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 *    implies author.assignedAuthor.id->one(id : datatypes::II | id.nullFlavor = vocab::NullFlavor::NA))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentHasAssignedAuthorNullFlavor"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentHasInformationRecipient(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasInformationRecipient(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentHasInformationRecipient(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHasInformationRecipient(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informationRecipient->size() > 0
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentHasInformationRecipient(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentHasInformationRecipient"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentHealthcareProvider(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Healthcare Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHealthcareProvider(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf.serviceEvent.performer->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentHealthcareProvider(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Healthcare Provider</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentHealthcareProvider(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf.serviceEvent.performer->size() > 0
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentHealthcareProvider(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HEALTHCARE_PROVIDER,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentHealthcareProvider"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentLanguageCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentLanguageCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentLanguageCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentLanguageCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentLanguageCode(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentLanguageCode"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentAdvanceDirectivesSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentAdvanceDirectivesSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAllergiesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Allergies Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAllergiesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAllergiesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Allergies Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAllergiesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentAllergiesSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentAllergiesSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentEncountersSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentEncountersSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentImmunizationsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentImmunizationsSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentPayersSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentPayersSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentMedicationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentMedicationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentMedicationsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentMedicationsSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentPlanOfCareSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentPlanOfCareSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentProceduresSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentProceduresSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentVitalSignsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentVitalSignsSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentFamilyHistorySection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentFamilyHistorySection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentSocialHistorySection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentSocialHistorySection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentResultsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentResultsSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentMedicalEquipmentSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentMedicalEquipmentSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentFunctionalStatusSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentFunctionalStatusSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContinuityOfCareDocumentProblemSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentProblemSection"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSection(ContinuityOfCareDocument) <em>Get Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSection(ContinuityOfCareDocument) <em>Get Advance Directives Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSection(
			ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(135));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY);
		return (AdvanceDirectivesSectionEntriesOptional) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSection(ContinuityOfCareDocument) <em>Get Allergies Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->first().oclAsType(consol::AllergiesSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSection(ContinuityOfCareDocument) <em>Get Allergies Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->first().oclAsType(consol::AllergiesSection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergiesSection getAllergiesSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_ALLERGIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(136));
			try {
				GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
		return (AllergiesSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersSection(ContinuityOfCareDocument) <em>Get Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(consol::EncountersSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getEncountersSection(ContinuityOfCareDocument) <em>Get Encounters Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(consol::EncountersSectionEntriesOptional)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EncountersSectionEntriesOptional getEncountersSection(
			ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_ENCOUNTERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(137));
			try {
				GET_ENCOUNTERS_SECTION__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_SECTION__EOCL_QRY);
		return (EncountersSectionEntriesOptional) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(ContinuityOfCareDocument) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(ContinuityOfCareDocument) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ImmunizationsSectionEntriesOptional getImmunizationsSection(
			ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(138));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayersSection(ContinuityOfCareDocument) <em>Get Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)";

	/**
	 * The cached OCL query for the '{@link #getPayersSection(ContinuityOfCareDocument) <em>Get Payers Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PayersSection getPayersSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_PAYERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(139));
			try {
				GET_PAYERS_SECTION__EOCL_QRY = helper.createQuery(GET_PAYERS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYERS_SECTION__EOCL_QRY);
		return (PayersSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(ContinuityOfCareDocument) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(ContinuityOfCareDocument) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationsSection getMedicationsSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(140));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(ContinuityOfCareDocument) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(ContinuityOfCareDocument) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PlanOfCareSection getPlanOfCareSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(141));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection(ContinuityOfCareDocument) <em>Get Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))->asSequence()->first().oclAsType(consol::ProceduresSection)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection(ContinuityOfCareDocument) <em>Get Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))->asSequence()->first().oclAsType(consol::ProceduresSection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProceduresSection getProceduresSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(142));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (ProceduresSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(ContinuityOfCareDocument) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(ContinuityOfCareDocument) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static VitalSignsSectionEntriesOptional getVitalSignsSection(
			ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(143));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(ContinuityOfCareDocument) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(ContinuityOfCareDocument) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FamilyHistorySection getFamilyHistorySection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(144));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(ContinuityOfCareDocument) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(ContinuityOfCareDocument) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SocialHistorySection getSocialHistorySection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(145));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection(ContinuityOfCareDocument) <em>Get Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->first().oclAsType(consol::ResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection(ContinuityOfCareDocument) <em>Get Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->first().oclAsType(consol::ResultsSection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ResultsSection getResultsSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(146));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(ContinuityOfCareDocument) <em>Get Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection(ContinuityOfCareDocument) <em>Get Medical Equipment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicalEquipmentSection getMedicalEquipmentSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(147));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY);
		return (MedicalEquipmentSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(ContinuityOfCareDocument) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(ContinuityOfCareDocument) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FunctionalStatusSection getFunctionalStatusSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(148));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(ContinuityOfCareDocument) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->first().oclAsType(consol::ProblemSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(ContinuityOfCareDocument) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->first().oclAsType(consol::ProblemSection)
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemSection getProblemSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(149));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.2')
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument continuityOfCareDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"GeneralHeaderConstraintsTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									continuityOfCareDocument, context) }), new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsCode(ContinuityOfCareDocument continuityOfCareDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__GENERAL_HEADER_CONSTRAINTS_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
					new Object[] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

} // ContinuityOfCareDocumentOperations
