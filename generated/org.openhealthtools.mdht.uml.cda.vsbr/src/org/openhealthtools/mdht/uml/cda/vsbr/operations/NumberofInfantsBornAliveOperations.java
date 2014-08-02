/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numberof Infants Born Alive</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive#validateNumberofInfantsBornAliveTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive#validateNumberofInfantsBornAliveClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive#validateNumberofInfantsBornAliveMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive#validateNumberofInfantsBornAliveCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive#validateNumberofInfantsBornAliveCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive#validateNumberofInfantsBornAliveValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberofInfantsBornAliveOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberofInfantsBornAliveOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofInfantsBornAliveTemplateId(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveTemplateId(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.37')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofInfantsBornAliveTemplateId(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveTemplateId(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofInfantsBornAlive The receiving '<em><b>Numberof Infants Born Alive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofInfantsBornAliveTemplateId(NumberofInfantsBornAlive numberofInfantsBornAlive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_INFANTS_BORN_ALIVE);
			try {
				VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofInfantsBornAlive)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofInfantsBornAliveTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofInfantsBornAlive, context) }), new Object[] { numberofInfantsBornAlive }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofInfantsBornAliveClassCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveClassCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofInfantsBornAliveClassCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveClassCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofInfantsBornAlive The receiving '<em><b>Numberof Infants Born Alive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofInfantsBornAliveClassCode(NumberofInfantsBornAlive numberofInfantsBornAlive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_INFANTS_BORN_ALIVE);
			try {
				VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofInfantsBornAlive)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofInfantsBornAliveClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofInfantsBornAlive, context) }), new Object[] { numberofInfantsBornAlive }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofInfantsBornAliveMoodCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveMoodCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofInfantsBornAliveMoodCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveMoodCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofInfantsBornAlive The receiving '<em><b>Numberof Infants Born Alive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofInfantsBornAliveMoodCode(NumberofInfantsBornAlive numberofInfantsBornAlive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_INFANTS_BORN_ALIVE);
			try {
				VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofInfantsBornAlive)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofInfantsBornAliveMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofInfantsBornAlive, context) }), new Object[] { numberofInfantsBornAlive }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofInfantsBornAliveCodeP(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveCodeP(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofInfantsBornAliveCodeP(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveCodeP(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofInfantsBornAlive The receiving '<em><b>Numberof Infants Born Alive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofInfantsBornAliveCodeP(NumberofInfantsBornAlive numberofInfantsBornAlive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_INFANTS_BORN_ALIVE);
			try {
				VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofInfantsBornAlive)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofInfantsBornAliveCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofInfantsBornAlive, context) }), new Object[] { numberofInfantsBornAlive }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofInfantsBornAliveCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '73773-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofInfantsBornAliveCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveCode(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofInfantsBornAlive The receiving '<em><b>Numberof Infants Born Alive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofInfantsBornAliveCode(NumberofInfantsBornAlive numberofInfantsBornAlive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_INFANTS_BORN_ALIVE);
			try {
				VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofInfantsBornAlive)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofInfantsBornAliveCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofInfantsBornAlive, context) }), new Object[] { numberofInfantsBornAlive }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofInfantsBornAliveValue(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveValue(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofInfantsBornAliveValue(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Infants Born Alive Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofInfantsBornAliveValue(NumberofInfantsBornAlive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofInfantsBornAlive The receiving '<em><b>Numberof Infants Born Alive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofInfantsBornAliveValue(NumberofInfantsBornAlive numberofInfantsBornAlive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_INFANTS_BORN_ALIVE);
			try {
				VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_INFANTS_BORN_ALIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofInfantsBornAlive)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofInfantsBornAliveValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofInfantsBornAlive, context) }), new Object[] { numberofInfantsBornAlive }));
			}

			return false;
		}
		return true;
	}

} // NumberofInfantsBornAliveOperations
