/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.ConfidentialitySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition;
import org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem;
import org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Information Criteria References Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerInformationDefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Information Definition</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Related Protected Problem</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Confidentiality Code Label</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getInformationDefinitions() <em>Get Information Definitions</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getRelatedProtectedProblems() <em>Get Related Protected Problems</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getConfidentialityCodeLabels() <em>Get Confidentiality Code Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationCriteriaReferencesOrganizerOperations extends OrganizerOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
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
	protected InformationCriteriaReferencesOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInformationCriteriaReferencesOrganizerTemplateId(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerTemplateId(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateInformationCriteriaReferencesOrganizerTemplateId(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerTemplateId(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param informationCriteriaReferencesOrganizer The receiving '<em><b>Information Criteria References Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInformationCriteriaReferencesOrganizerTemplateId(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER);
			try {
				VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				informationCriteriaReferencesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"InformationCriteriaReferencesOrganizerInformationCriteriaReferencesOrganizerTemplateId"),
						new Object[] { informationCriteriaReferencesOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInformationCriteriaReferencesOrganizerMoodCode(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerMoodCode(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateInformationCriteriaReferencesOrganizerMoodCode(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerMoodCode(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param informationCriteriaReferencesOrganizer The receiving '<em><b>Information Criteria References Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInformationCriteriaReferencesOrganizerMoodCode(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER);
			try {
				VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				informationCriteriaReferencesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_MOOD_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"InformationCriteriaReferencesOrganizerInformationCriteriaReferencesOrganizerMoodCode"),
						new Object[] { informationCriteriaReferencesOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInformationCriteriaReferencesOrganizerInformationDefinition(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Information Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerInformationDefinition(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_INFORMATION_DEFINITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consentdirective::CriteriumInformationDefinition))";

	/**
	 * The cached OCL invariant for the '{@link #validateInformationCriteriaReferencesOrganizerInformationDefinition(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Information Definition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerInformationDefinition(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_INFORMATION_DEFINITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param informationCriteriaReferencesOrganizer The receiving '<em><b>Information Criteria References Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInformationCriteriaReferencesOrganizerInformationDefinition(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_INFORMATION_DEFINITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER);
			try {
				VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_INFORMATION_DEFINITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_INFORMATION_DEFINITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_INFORMATION_DEFINITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				informationCriteriaReferencesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_INFORMATION_DEFINITION,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"InformationCriteriaReferencesOrganizerInformationCriteriaReferencesOrganizerInformationDefinition"),
						new Object[] { informationCriteriaReferencesOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Related Protected Problem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_RELATED_PROTECTED_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consentdirective::CriteriumRelatedProtectedProblem))";

	/**
	 * The cached OCL invariant for the '{@link #validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Related Protected Problem</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_RELATED_PROTECTED_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param informationCriteriaReferencesOrganizer The receiving '<em><b>Information Criteria References Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_RELATED_PROTECTED_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER);
			try {
				VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_RELATED_PROTECTED_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_RELATED_PROTECTED_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_RELATED_PROTECTED_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				informationCriteriaReferencesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_RELATED_PROTECTED_PROBLEM,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"InformationCriteriaReferencesOrganizerInformationCriteriaReferencesOrganizerRelatedProtectedProblem"),
						new Object[] { informationCriteriaReferencesOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Confidentiality Code Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_CONFIDENTIALITY_CODE_LABEL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consentdirective::ConfidentialitySecurityObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Confidentiality Code Label</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(InformationCriteriaReferencesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_CONFIDENTIALITY_CODE_LABEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param informationCriteriaReferencesOrganizer The receiving '<em><b>Information Criteria References Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_CONFIDENTIALITY_CODE_LABEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER);
			try {
				VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_CONFIDENTIALITY_CODE_LABEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_CONFIDENTIALITY_CODE_LABEL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INFORMATION_CRITERIA_REFERENCES_ORGANIZER_CONFIDENTIALITY_CODE_LABEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				informationCriteriaReferencesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_CONFIDENTIALITY_CODE_LABEL,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"InformationCriteriaReferencesOrganizerInformationCriteriaReferencesOrganizerConfidentialityCodeLabel"),
						new Object[] { informationCriteriaReferencesOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInformationDefinitions(InformationCriteriaReferencesOrganizer) <em>Get Information Definitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationDefinitions(InformationCriteriaReferencesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFORMATION_DEFINITIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consentdirective::CriteriumInformationDefinition)).oclAsType(consentdirective::CriteriumInformationDefinition)";

	/**
	 * The cached OCL query for the '{@link #getInformationDefinitions(InformationCriteriaReferencesOrganizer) <em>Get Information Definitions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationDefinitions(InformationCriteriaReferencesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFORMATION_DEFINITIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<CriteriumInformationDefinition> getInformationDefinitions(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer) {

		if (GET_INFORMATION_DEFINITIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER,
				CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER.getEAllOperations().get(57));
			try {
				GET_INFORMATION_DEFINITIONS__EOCL_QRY = helper.createQuery(GET_INFORMATION_DEFINITIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INFORMATION_DEFINITIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CriteriumInformationDefinition> result = (Collection<CriteriumInformationDefinition>) query.evaluate(
			informationCriteriaReferencesOrganizer);
		return new BasicEList.UnmodifiableEList<CriteriumInformationDefinition>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedProtectedProblems(InformationCriteriaReferencesOrganizer) <em>Get Related Protected Problems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedProtectedProblems(InformationCriteriaReferencesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_PROTECTED_PROBLEMS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consentdirective::CriteriumRelatedProtectedProblem)).oclAsType(consentdirective::CriteriumRelatedProtectedProblem)";

	/**
	 * The cached OCL query for the '{@link #getRelatedProtectedProblems(InformationCriteriaReferencesOrganizer) <em>Get Related Protected Problems</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedProtectedProblems(InformationCriteriaReferencesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_PROTECTED_PROBLEMS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<CriteriumRelatedProtectedProblem> getRelatedProtectedProblems(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer) {

		if (GET_RELATED_PROTECTED_PROBLEMS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER,
				CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER.getEAllOperations().get(58));
			try {
				GET_RELATED_PROTECTED_PROBLEMS__EOCL_QRY = helper.createQuery(GET_RELATED_PROTECTED_PROBLEMS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_PROTECTED_PROBLEMS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CriteriumRelatedProtectedProblem> result = (Collection<CriteriumRelatedProtectedProblem>) query.evaluate(
			informationCriteriaReferencesOrganizer);
		return new BasicEList.UnmodifiableEList<CriteriumRelatedProtectedProblem>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConfidentialityCodeLabels(InformationCriteriaReferencesOrganizer) <em>Get Confidentiality Code Labels</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCodeLabels(InformationCriteriaReferencesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONFIDENTIALITY_CODE_LABELS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consentdirective::ConfidentialitySecurityObservation)).oclAsType(consentdirective::ConfidentialitySecurityObservation)";

	/**
	 * The cached OCL query for the '{@link #getConfidentialityCodeLabels(InformationCriteriaReferencesOrganizer) <em>Get Confidentiality Code Labels</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCodeLabels(InformationCriteriaReferencesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONFIDENTIALITY_CODE_LABELS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ConfidentialitySecurityObservation> getConfidentialityCodeLabels(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer) {

		if (GET_CONFIDENTIALITY_CODE_LABELS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER,
				CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER.getEAllOperations().get(59));
			try {
				GET_CONFIDENTIALITY_CODE_LABELS__EOCL_QRY = helper.createQuery(
					GET_CONFIDENTIALITY_CODE_LABELS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONFIDENTIALITY_CODE_LABELS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ConfidentialitySecurityObservation> result = (Collection<ConfidentialitySecurityObservation>) query.evaluate(
			informationCriteriaReferencesOrganizer);
		return new BasicEList.UnmodifiableEList<ConfidentialitySecurityObservation>(result.size(), result.toArray());
	}

} // InformationCriteriaReferencesOrganizerOperations
