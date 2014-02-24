/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCognitiveAbilitiesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Cognitive Abilities Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionMentalStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Mental Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getCognitiveAbilitiesObservations() <em>Get Cognitive Abilities Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getMentalStatusObservations() <em>Get Mental Status Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MentalStatusSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusSectionTemplateId(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionTemplateId(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.56')";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusSectionTemplateId(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionTemplateId(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusSection The receiving '<em><b>Mental Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusSectionTemplateId(MentalStatusSection mentalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_SECTION);
			try {
				VALIDATE_MENTAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_SECTION__MENTAL_STATUS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MentalStatusSectionTemplateId"),
					new Object[] { mentalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusSectionCode(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionCode(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '10190-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusSectionCode(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionCode(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusSection The receiving '<em><b>Mental Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusSectionCode(MentalStatusSection mentalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_SECTION);
			try {
				VALIDATE_MENTAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_SECTION__MENTAL_STATUS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("MentalStatusSectionCode"), new Object[] { mentalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusSectionCodeP(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionCodeP(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusSectionCodeP(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionCodeP(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusSection The receiving '<em><b>Mental Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusSectionCodeP(MentalStatusSection mentalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_SECTION);
			try {
				VALIDATE_MENTAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_SECTION__MENTAL_STATUS_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("MentalStatusSectionCodeP"), new Object[] { mentalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusSectionTitle(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionTitle(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusSectionTitle(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionTitle(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusSection The receiving '<em><b>Mental Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusSectionTitle(MentalStatusSection mentalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_SECTION);
			try {
				VALIDATE_MENTAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_SECTION__MENTAL_STATUS_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("MentalStatusSectionTitle"), new Object[] { mentalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusSectionText(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionText(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusSectionText(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionText(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusSection The receiving '<em><b>Mental Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusSectionText(MentalStatusSection mentalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_SECTION);
			try {
				VALIDATE_MENTAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_SECTION__MENTAL_STATUS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("MentalStatusSectionText"), new Object[] { mentalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusSectionCaregiverCharacteristics(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Caregiver Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionCaregiverCharacteristics(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CaregiverCharacteristics))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusSectionCaregiverCharacteristics(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Caregiver Characteristics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionCaregiverCharacteristics(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusSection The receiving '<em><b>Mental Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusSectionCaregiverCharacteristics(MentalStatusSection mentalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_SECTION);
			try {
				VALIDATE_MENTAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_SECTION__MENTAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS,
					ConsolPlugin.INSTANCE.getString("MentalStatusSectionCaregiverCharacteristics"),
					new Object[] { mentalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusSectionAssessmentScaleObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionAssessmentScaleObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::AssessmentScaleObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusSectionAssessmentScaleObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionAssessmentScaleObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusSection The receiving '<em><b>Mental Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusSectionAssessmentScaleObservation(
			MentalStatusSection mentalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_SECTION);
			try {
				VALIDATE_MENTAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_SECTION__MENTAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MentalStatusSectionAssessmentScaleObservation"),
					new Object[] { mentalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusSectionCognitiveAbilitiesObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Cognitive Abilities Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionCognitiveAbilitiesObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_SECTION_COGNITIVE_ABILITIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveAbilitiesObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusSectionCognitiveAbilitiesObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Cognitive Abilities Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionCognitiveAbilitiesObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_SECTION_COGNITIVE_ABILITIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusSection The receiving '<em><b>Mental Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusSectionCognitiveAbilitiesObservation(
			MentalStatusSection mentalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_SECTION_COGNITIVE_ABILITIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_SECTION);
			try {
				VALIDATE_MENTAL_STATUS_SECTION_COGNITIVE_ABILITIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_SECTION_COGNITIVE_ABILITIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_SECTION_COGNITIVE_ABILITIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_SECTION__MENTAL_STATUS_SECTION_COGNITIVE_ABILITIES_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MentalStatusSectionCognitiveAbilitiesObservation"),
					new Object[] { mentalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusSectionMentalStatusObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Mental Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionMentalStatusObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::MentalStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusSectionMentalStatusObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Mental Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusSectionMentalStatusObservation(MentalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusSection The receiving '<em><b>Mental Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusSectionMentalStatusObservation(MentalStatusSection mentalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_SECTION);
			try {
				VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_SECTION__MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MentalStatusSectionMentalStatusObservation"),
					new Object[] { mentalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCaregiverCharacteristicss(MentalStatusSection) <em>Get Caregiver Characteristicss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(MentalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)).oclAsType(consol::CaregiverCharacteristics)";

	/**
	 * The cached OCL query for the '{@link #getCaregiverCharacteristicss(MentalStatusSection) <em>Get Caregiver Characteristicss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(MentalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CaregiverCharacteristics> getCaregiverCharacteristicss(MentalStatusSection mentalStatusSection) {
		if (GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MENTAL_STATUS_SECTION,
				ConsolPackage.Literals.MENTAL_STATUS_SECTION.getEAllOperations().get(64));
			try {
				GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CaregiverCharacteristics> result = (Collection<CaregiverCharacteristics>) query.evaluate(mentalStatusSection);
		return new BasicEList.UnmodifiableEList<CaregiverCharacteristics>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(MentalStatusSection) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(MentalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(MentalStatusSection) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(MentalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AssessmentScaleObservation> getAssessmentScaleObservations(
			MentalStatusSection mentalStatusSection) {
		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MENTAL_STATUS_SECTION,
				ConsolPackage.Literals.MENTAL_STATUS_SECTION.getEAllOperations().get(65));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(mentalStatusSection);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCognitiveAbilitiesObservations(MentalStatusSection) <em>Get Cognitive Abilities Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveAbilitiesObservations(MentalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COGNITIVE_ABILITIES_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveAbilitiesObservation)).oclAsType(consol::CognitiveAbilitiesObservation)";

	/**
	 * The cached OCL query for the '{@link #getCognitiveAbilitiesObservations(MentalStatusSection) <em>Get Cognitive Abilities Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveAbilitiesObservations(MentalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COGNITIVE_ABILITIES_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CognitiveAbilitiesObservation> getCognitiveAbilitiesObservations(
			MentalStatusSection mentalStatusSection) {
		if (GET_COGNITIVE_ABILITIES_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MENTAL_STATUS_SECTION,
				ConsolPackage.Literals.MENTAL_STATUS_SECTION.getEAllOperations().get(66));
			try {
				GET_COGNITIVE_ABILITIES_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_COGNITIVE_ABILITIES_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COGNITIVE_ABILITIES_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveAbilitiesObservation> result = (Collection<CognitiveAbilitiesObservation>) query.evaluate(mentalStatusSection);
		return new BasicEList.UnmodifiableEList<CognitiveAbilitiesObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMentalStatusObservations(MentalStatusSection) <em>Get Mental Status Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservations(MentalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENTAL_STATUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation)).oclAsType(consol::MentalStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMentalStatusObservations(MentalStatusSection) <em>Get Mental Status Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservations(MentalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENTAL_STATUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MentalStatusObservation> getMentalStatusObservations(MentalStatusSection mentalStatusSection) {
		if (GET_MENTAL_STATUS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MENTAL_STATUS_SECTION,
				ConsolPackage.Literals.MENTAL_STATUS_SECTION.getEAllOperations().get(67));
			try {
				GET_MENTAL_STATUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MENTAL_STATUS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENTAL_STATUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MentalStatusObservation> result = (Collection<MentalStatusObservation>) query.evaluate(mentalStatusSection);
		return new BasicEList.UnmodifiableEList<MentalStatusObservation>(result.size(), result.toArray());
	}

} // MentalStatusSectionOperations
