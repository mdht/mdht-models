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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cultural And Religious Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CulturalAndReligiousObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CulturalAndReligiousObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCulturalAndReligiousObservationTemplateId(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationTemplateId(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.111')";

	/**
	 * The cached OCL invariant for the '{@link #validateCulturalAndReligiousObservationTemplateId(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationTemplateId(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param culturalAndReligiousObservation The receiving '<em><b>Cultural And Religious Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCulturalAndReligiousObservationTemplateId(
			CulturalAndReligiousObservation culturalAndReligiousObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION);
			try {
				VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			culturalAndReligiousObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CULTURAL_AND_RELIGIOUS_OBSERVATION__CULTURAL_AND_RELIGIOUS_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CulturalAndReligiousObservationTemplateId"),
					new Object[] { culturalAndReligiousObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCulturalAndReligiousObservationClassCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationClassCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateCulturalAndReligiousObservationClassCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationClassCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param culturalAndReligiousObservation The receiving '<em><b>Cultural And Religious Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCulturalAndReligiousObservationClassCode(
			CulturalAndReligiousObservation culturalAndReligiousObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION);
			try {
				VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			culturalAndReligiousObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CULTURAL_AND_RELIGIOUS_OBSERVATION__CULTURAL_AND_RELIGIOUS_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("CulturalAndReligiousObservationClassCode"),
					new Object[] { culturalAndReligiousObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCulturalAndReligiousObservationMoodCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationMoodCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateCulturalAndReligiousObservationMoodCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationMoodCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param culturalAndReligiousObservation The receiving '<em><b>Cultural And Religious Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCulturalAndReligiousObservationMoodCode(
			CulturalAndReligiousObservation culturalAndReligiousObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION);
			try {
				VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			culturalAndReligiousObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CULTURAL_AND_RELIGIOUS_OBSERVATION__CULTURAL_AND_RELIGIOUS_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("CulturalAndReligiousObservationMoodCode"),
					new Object[] { culturalAndReligiousObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCulturalAndReligiousObservationId(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationId(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCulturalAndReligiousObservationId(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationId(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param culturalAndReligiousObservation The receiving '<em><b>Cultural And Religious Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCulturalAndReligiousObservationId(
			CulturalAndReligiousObservation culturalAndReligiousObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION);
			try {
				VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			culturalAndReligiousObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CULTURAL_AND_RELIGIOUS_OBSERVATION__CULTURAL_AND_RELIGIOUS_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("CulturalAndReligiousObservationId"),
					new Object[] { culturalAndReligiousObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCulturalAndReligiousObservationCodeP(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationCodeP(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCulturalAndReligiousObservationCodeP(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationCodeP(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param culturalAndReligiousObservation The receiving '<em><b>Cultural And Religious Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCulturalAndReligiousObservationCodeP(
			CulturalAndReligiousObservation culturalAndReligiousObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION);
			try {
				VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			culturalAndReligiousObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CULTURAL_AND_RELIGIOUS_OBSERVATION__CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("CulturalAndReligiousObservationCodeP"),
					new Object[] { culturalAndReligiousObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservationCodeP", passToken);
				}
				passToken.add(culturalAndReligiousObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCulturalAndReligiousObservationCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '406198009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateCulturalAndReligiousObservationCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param culturalAndReligiousObservation The receiving '<em><b>Cultural And Religious Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCulturalAndReligiousObservationCode(
			CulturalAndReligiousObservation culturalAndReligiousObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(culturalAndReligiousObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION);
			try {
				VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			culturalAndReligiousObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CULTURAL_AND_RELIGIOUS_OBSERVATION__CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("CulturalAndReligiousObservationCode"),
					new Object[] { culturalAndReligiousObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCulturalAndReligiousObservationStatusCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationStatusCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateCulturalAndReligiousObservationStatusCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationStatusCode(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param culturalAndReligiousObservation The receiving '<em><b>Cultural And Religious Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCulturalAndReligiousObservationStatusCode(
			CulturalAndReligiousObservation culturalAndReligiousObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION);
			try {
				VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			culturalAndReligiousObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CULTURAL_AND_RELIGIOUS_OBSERVATION__CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("CulturalAndReligiousObservationStatusCode"),
					new Object[] { culturalAndReligiousObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCulturalAndReligiousObservationStatusCodeP(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationStatusCodeP(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCulturalAndReligiousObservationStatusCodeP(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationStatusCodeP(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param culturalAndReligiousObservation The receiving '<em><b>Cultural And Religious Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCulturalAndReligiousObservationStatusCodeP(
			CulturalAndReligiousObservation culturalAndReligiousObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION);
			try {
				VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			culturalAndReligiousObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CULTURAL_AND_RELIGIOUS_OBSERVATION__CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("CulturalAndReligiousObservationStatusCodeP"),
					new Object[] { culturalAndReligiousObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCulturalAndReligiousObservationValue(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationValue(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateCulturalAndReligiousObservationValue(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCulturalAndReligiousObservationValue(CulturalAndReligiousObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param culturalAndReligiousObservation The receiving '<em><b>Cultural And Religious Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCulturalAndReligiousObservationValue(
			CulturalAndReligiousObservation culturalAndReligiousObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION);
			try {
				VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			culturalAndReligiousObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CULTURAL_AND_RELIGIOUS_OBSERVATION__CULTURAL_AND_RELIGIOUS_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("CulturalAndReligiousObservationValue"),
					new Object[] { culturalAndReligiousObservation }));
			}

			return false;
		}
		return true;
	}

} // CulturalAndReligiousObservationOperations
