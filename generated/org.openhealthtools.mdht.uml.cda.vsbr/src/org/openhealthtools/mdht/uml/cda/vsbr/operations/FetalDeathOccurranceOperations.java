/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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

import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Death Occurrance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetalDeathOccurranceOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FetalDeathOccurranceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeathOccurranceTemplateId(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceTemplateId(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DEATH_OCCURRANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.22')";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeathOccurranceTemplateId(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceTemplateId(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DEATH_OCCURRANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeathOccurrance The receiving '<em><b>Fetal Death Occurrance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeathOccurranceTemplateId(FetalDeathOccurrance fetalDeathOccurrance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DEATH_OCCURRANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DEATH_OCCURRANCE);
			try {
				VALIDATE_FETAL_DEATH_OCCURRANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_OCCURRANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_OCCURRANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeathOccurrance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeathOccurranceTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									fetalDeathOccurrance, context) }), new Object[] { fetalDeathOccurrance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeathOccurranceClassCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceClassCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DEATH_OCCURRANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeathOccurranceClassCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceClassCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DEATH_OCCURRANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeathOccurrance The receiving '<em><b>Fetal Death Occurrance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeathOccurranceClassCode(FetalDeathOccurrance fetalDeathOccurrance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DEATH_OCCURRANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DEATH_OCCURRANCE);
			try {
				VALIDATE_FETAL_DEATH_OCCURRANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_OCCURRANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_OCCURRANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeathOccurrance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeathOccurranceClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									fetalDeathOccurrance, context) }), new Object[] { fetalDeathOccurrance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeathOccurranceMoodCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceMoodCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DEATH_OCCURRANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeathOccurranceMoodCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceMoodCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DEATH_OCCURRANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeathOccurrance The receiving '<em><b>Fetal Death Occurrance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeathOccurranceMoodCode(FetalDeathOccurrance fetalDeathOccurrance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DEATH_OCCURRANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DEATH_OCCURRANCE);
			try {
				VALIDATE_FETAL_DEATH_OCCURRANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_OCCURRANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_OCCURRANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeathOccurrance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeathOccurranceMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									fetalDeathOccurrance, context) }), new Object[] { fetalDeathOccurrance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeathOccurranceCodeP(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceCodeP(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DEATH_OCCURRANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeathOccurranceCodeP(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceCodeP(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DEATH_OCCURRANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeathOccurrance The receiving '<em><b>Fetal Death Occurrance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeathOccurranceCodeP(FetalDeathOccurrance fetalDeathOccurrance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DEATH_OCCURRANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DEATH_OCCURRANCE);
			try {
				VALIDATE_FETAL_DEATH_OCCURRANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_OCCURRANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_OCCURRANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeathOccurrance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeathOccurranceCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									fetalDeathOccurrance, context) }), new Object[] { fetalDeathOccurrance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeathOccurranceCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DEATH_OCCURRANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '73811-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeathOccurranceCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceCode(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DEATH_OCCURRANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeathOccurrance The receiving '<em><b>Fetal Death Occurrance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeathOccurranceCode(FetalDeathOccurrance fetalDeathOccurrance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DEATH_OCCURRANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DEATH_OCCURRANCE);
			try {
				VALIDATE_FETAL_DEATH_OCCURRANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_OCCURRANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_OCCURRANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeathOccurrance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeathOccurranceCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									fetalDeathOccurrance, context) }), new Object[] { fetalDeathOccurrance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeathOccurranceValue(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceValue(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '634751000124116' or value.code = '634741000124118' or value.code = '634661000124111' or value.code = '261665006')))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeathOccurranceValue(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceValue(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeathOccurrance The receiving '<em><b>Fetal Death Occurrance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeathOccurranceValue(FetalDeathOccurrance fetalDeathOccurrance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DEATH_OCCURRANCE);
			try {
				VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeathOccurrance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeathOccurranceValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									fetalDeathOccurrance, context) }), new Object[] { fetalDeathOccurrance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeathOccurranceValueP(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceValueP(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeathOccurranceValueP(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeathOccurranceValueP(FetalDeathOccurrance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeathOccurrance The receiving '<em><b>Fetal Death Occurrance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeathOccurranceValueP(FetalDeathOccurrance fetalDeathOccurrance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DEATH_OCCURRANCE);
			try {
				VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeathOccurrance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_VALUE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeathOccurranceValueP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									fetalDeathOccurrance, context) }), new Object[] { fetalDeathOccurrance }));
			}

			return false;
		}
		return true;
	}

} // FetalDeathOccurranceOperations
