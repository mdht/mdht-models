/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advanced Directive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvancedDirectiveObservationOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AdvancedDirectiveObservationOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdvancedDirectiveObservationTemplateId(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationTemplateId(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.98')";

	/**
	* The cached OCL invariant for the '{@link #validateAdvancedDirectiveObservationTemplateId(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationTemplateId(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param advancedDirectiveObservation The receiving '<em><b>Advanced Directive Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdvancedDirectiveObservationTemplateId(
			AdvancedDirectiveObservation advancedDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVANCED_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advancedDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADVANCED_DIRECTIVE_OBSERVATION__ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("AdvancedDirectiveObservationTemplateId"),
					new Object[] { advancedDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdvancedDirectiveObservationCode(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationCode(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67516-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateAdvancedDirectiveObservationCode(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationCode(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param advancedDirectiveObservation The receiving '<em><b>Advanced Directive Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdvancedDirectiveObservationCode(
			AdvancedDirectiveObservation advancedDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVANCED_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advancedDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADVANCED_DIRECTIVE_OBSERVATION__ADVANCED_DIRECTIVE_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("AdvancedDirectiveObservationCode"),
					new Object[] { advancedDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdvancedDirectiveObservationValue(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationValue(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA137-2' or value.code = 'LA17059-9' or value.code = 'LA17319-7' or value.code = 'LA17320-5' or value.code = 'LA17321-3' or value.code = 'LA17322-1')))";

	/**
	* The cached OCL invariant for the '{@link #validateAdvancedDirectiveObservationValue(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationValue(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param advancedDirectiveObservation The receiving '<em><b>Advanced Directive Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdvancedDirectiveObservationValue(
			AdvancedDirectiveObservation advancedDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVANCED_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advancedDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADVANCED_DIRECTIVE_OBSERVATION__ADVANCED_DIRECTIVE_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("AdvancedDirectiveObservationValue"),
					new Object[] { advancedDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdvancedDirectiveObservationValueP(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Value P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationValueP(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	* The cached OCL invariant for the '{@link #validateAdvancedDirectiveObservationValueP(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Value P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationValueP(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param advancedDirectiveObservation The receiving '<em><b>Advanced Directive Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdvancedDirectiveObservationValueP(
			AdvancedDirectiveObservation advancedDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVANCED_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advancedDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADVANCED_DIRECTIVE_OBSERVATION__ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("AdvancedDirectiveObservationValueP"),
					new Object[] { advancedDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdvancedDirectiveObservationMoodCode(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationMoodCode(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateAdvancedDirectiveObservationMoodCode(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdvancedDirectiveObservationMoodCode(AdvancedDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param advancedDirectiveObservation The receiving '<em><b>Advanced Directive Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdvancedDirectiveObservationMoodCode(
			AdvancedDirectiveObservation advancedDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVANCED_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advancedDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADVANCED_DIRECTIVE_OBSERVATION__ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("AdvancedDirectiveObservationMoodCode"),
					new Object[] { advancedDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

} // AdvancedDirectiveObservationOperations
