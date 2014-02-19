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

import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Characteristics Of Home Environment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacteristicsOfHomeEnvironmentOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicsOfHomeEnvironmentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCharacteristicsOfHomeEnvironmentTemplateId(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentTemplateId(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.109')";

	/**
	 * The cached OCL invariant for the '{@link #validateCharacteristicsOfHomeEnvironmentTemplateId(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentTemplateId(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param characteristicsOfHomeEnvironment The receiving '<em><b>Characteristics Of Home Environment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCharacteristicsOfHomeEnvironmentTemplateId(
			CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT);
			try {
				VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			characteristicsOfHomeEnvironment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHARACTERISTICS_OF_HOME_ENVIRONMENT__CHARACTERISTICS_OF_HOME_ENVIRONMENT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CharacteristicsOfHomeEnvironmentTemplateId"),
					new Object[] { characteristicsOfHomeEnvironment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCharacteristicsOfHomeEnvironmentClassCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentClassCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateCharacteristicsOfHomeEnvironmentClassCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentClassCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param characteristicsOfHomeEnvironment The receiving '<em><b>Characteristics Of Home Environment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCharacteristicsOfHomeEnvironmentClassCode(
			CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT);
			try {
				VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			characteristicsOfHomeEnvironment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHARACTERISTICS_OF_HOME_ENVIRONMENT__CHARACTERISTICS_OF_HOME_ENVIRONMENT_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("CharacteristicsOfHomeEnvironmentClassCode"),
					new Object[] { characteristicsOfHomeEnvironment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCharacteristicsOfHomeEnvironmentMoodCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentMoodCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateCharacteristicsOfHomeEnvironmentMoodCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentMoodCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param characteristicsOfHomeEnvironment The receiving '<em><b>Characteristics Of Home Environment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCharacteristicsOfHomeEnvironmentMoodCode(
			CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT);
			try {
				VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			characteristicsOfHomeEnvironment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHARACTERISTICS_OF_HOME_ENVIRONMENT__CHARACTERISTICS_OF_HOME_ENVIRONMENT_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("CharacteristicsOfHomeEnvironmentMoodCode"),
					new Object[] { characteristicsOfHomeEnvironment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCharacteristicsOfHomeEnvironmentId(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentId(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCharacteristicsOfHomeEnvironmentId(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentId(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param characteristicsOfHomeEnvironment The receiving '<em><b>Characteristics Of Home Environment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCharacteristicsOfHomeEnvironmentId(
			CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT);
			try {
				VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			characteristicsOfHomeEnvironment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHARACTERISTICS_OF_HOME_ENVIRONMENT__CHARACTERISTICS_OF_HOME_ENVIRONMENT_ID,
					ConsolPlugin.INSTANCE.getString("CharacteristicsOfHomeEnvironmentId"),
					new Object[] { characteristicsOfHomeEnvironment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCharacteristicsOfHomeEnvironmentCodeP(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentCodeP(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCharacteristicsOfHomeEnvironmentCodeP(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentCodeP(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param characteristicsOfHomeEnvironment The receiving '<em><b>Characteristics Of Home Environment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCharacteristicsOfHomeEnvironmentCodeP(
			CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT);
			try {
				VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			characteristicsOfHomeEnvironment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHARACTERISTICS_OF_HOME_ENVIRONMENT__CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE_P,
					ConsolPlugin.INSTANCE.getString("CharacteristicsOfHomeEnvironmentCodeP"),
					new Object[] { characteristicsOfHomeEnvironment }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironmentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironmentCodeP", passToken);
				}
				passToken.add(characteristicsOfHomeEnvironment);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCharacteristicsOfHomeEnvironmentCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '224249004' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateCharacteristicsOfHomeEnvironmentCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param characteristicsOfHomeEnvironment The receiving '<em><b>Characteristics Of Home Environment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCharacteristicsOfHomeEnvironmentCode(
			CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironmentCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(characteristicsOfHomeEnvironment)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT);
			try {
				VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			characteristicsOfHomeEnvironment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHARACTERISTICS_OF_HOME_ENVIRONMENT__CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE,
					ConsolPlugin.INSTANCE.getString("CharacteristicsOfHomeEnvironmentCode"),
					new Object[] { characteristicsOfHomeEnvironment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCharacteristicsOfHomeEnvironmentStatusCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentStatusCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateCharacteristicsOfHomeEnvironmentStatusCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentStatusCode(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param characteristicsOfHomeEnvironment The receiving '<em><b>Characteristics Of Home Environment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCharacteristicsOfHomeEnvironmentStatusCode(
			CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT);
			try {
				VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			characteristicsOfHomeEnvironment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHARACTERISTICS_OF_HOME_ENVIRONMENT__CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("CharacteristicsOfHomeEnvironmentStatusCode"),
					new Object[] { characteristicsOfHomeEnvironment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCharacteristicsOfHomeEnvironmentStatusCodeP(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentStatusCodeP(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCharacteristicsOfHomeEnvironmentStatusCodeP(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentStatusCodeP(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param characteristicsOfHomeEnvironment The receiving '<em><b>Characteristics Of Home Environment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCharacteristicsOfHomeEnvironmentStatusCodeP(
			CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT);
			try {
				VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			characteristicsOfHomeEnvironment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHARACTERISTICS_OF_HOME_ENVIRONMENT__CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("CharacteristicsOfHomeEnvironmentStatusCodeP"),
					new Object[] { characteristicsOfHomeEnvironment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCharacteristicsOfHomeEnvironmentValue(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentValue(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateCharacteristicsOfHomeEnvironmentValue(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCharacteristicsOfHomeEnvironmentValue(CharacteristicsOfHomeEnvironment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param characteristicsOfHomeEnvironment The receiving '<em><b>Characteristics Of Home Environment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCharacteristicsOfHomeEnvironmentValue(
			CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT);
			try {
				VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			characteristicsOfHomeEnvironment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHARACTERISTICS_OF_HOME_ENVIRONMENT__CHARACTERISTICS_OF_HOME_ENVIRONMENT_VALUE,
					ConsolPlugin.INSTANCE.getString("CharacteristicsOfHomeEnvironmentValue"),
					new Object[] { characteristicsOfHomeEnvironment }));
			}

			return false;
		}
		return true;
	}

} // CharacteristicsOfHomeEnvironmentOperations
