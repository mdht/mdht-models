/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Level Of Service Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LevelOfServiceObservationOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected LevelOfServiceObservationOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateLevelOfServiceObservationTemplateId(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationTemplateId(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.92')";

	/**
	* The cached OCL invariant for the '{@link #validateLevelOfServiceObservationTemplateId(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationTemplateId(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param levelOfServiceObservation The receiving '<em><b>Level Of Service Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateLevelOfServiceObservationTemplateId(
			LevelOfServiceObservation levelOfServiceObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_SERVICE_OBSERVATION);
			try {
				VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfServiceObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_SERVICE_OBSERVATION__LEVEL_OF_SERVICE_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("LevelOfServiceObservationTemplateId"),
					new Object[] { levelOfServiceObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateLevelOfServiceObservationCodeP(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationCodeP(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateLevelOfServiceObservationCodeP(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationCodeP(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param levelOfServiceObservation The receiving '<em><b>Level Of Service Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateLevelOfServiceObservationCodeP(LevelOfServiceObservation levelOfServiceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_SERVICE_OBSERVATION);
			try {
				VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfServiceObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_SERVICE_OBSERVATION__LEVEL_OF_SERVICE_OBSERVATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("LevelOfServiceObservationCodeP"),
					new Object[] { levelOfServiceObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservationCodeP", passToken);
				}
				passToken.add(levelOfServiceObservation);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateLevelOfServiceObservationCode(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationCode(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '69464-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateLevelOfServiceObservationCode(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationCode(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param levelOfServiceObservation The receiving '<em><b>Level Of Service Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateLevelOfServiceObservationCode(LevelOfServiceObservation levelOfServiceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(levelOfServiceObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_SERVICE_OBSERVATION);
			try {
				VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfServiceObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_SERVICE_OBSERVATION__LEVEL_OF_SERVICE_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("LevelOfServiceObservationCode"),
					new Object[] { levelOfServiceObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateLevelOfServiceObservationValue(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationValue(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA18102-6' or value.code = 'LA18103-4' or value.code = 'LA18104-2' or value.code = 'LA18105-9' or value.code = 'LA18106-7' or value.code = 'LA18107-5' or value.code = 'LA18108-3' or value.code = 'LA18109-1' or value.code = 'LA18110-9')))";

	/**
	* The cached OCL invariant for the '{@link #validateLevelOfServiceObservationValue(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationValue(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param levelOfServiceObservation The receiving '<em><b>Level Of Service Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateLevelOfServiceObservationValue(LevelOfServiceObservation levelOfServiceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_SERVICE_OBSERVATION);
			try {
				VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfServiceObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_SERVICE_OBSERVATION__LEVEL_OF_SERVICE_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("LevelOfServiceObservationValue"),
					new Object[] { levelOfServiceObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateLevelOfServiceObservationValueP(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Value P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationValueP(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	* The cached OCL invariant for the '{@link #validateLevelOfServiceObservationValueP(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Value P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationValueP(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param levelOfServiceObservation The receiving '<em><b>Level Of Service Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateLevelOfServiceObservationValueP(LevelOfServiceObservation levelOfServiceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_SERVICE_OBSERVATION);
			try {
				VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfServiceObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_SERVICE_OBSERVATION__LEVEL_OF_SERVICE_OBSERVATION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("LevelOfServiceObservationValueP"),
					new Object[] { levelOfServiceObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateLevelOfServiceObservationMoodCode(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationMoodCode(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateLevelOfServiceObservationMoodCode(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateLevelOfServiceObservationMoodCode(LevelOfServiceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param levelOfServiceObservation The receiving '<em><b>Level Of Service Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateLevelOfServiceObservationMoodCode(
			LevelOfServiceObservation levelOfServiceObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_SERVICE_OBSERVATION);
			try {
				VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfServiceObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_SERVICE_OBSERVATION__LEVEL_OF_SERVICE_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("LevelOfServiceObservationMoodCode"),
					new Object[] { levelOfServiceObservation }));
			}

			return false;
		}
		return true;
	}

} // LevelOfServiceObservationOperations
