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

import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Maternal Morbidity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaternalMorbidityOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaternalMorbidityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalMorbidityTemplateId(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityTemplateId(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_MORBIDITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.34')";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalMorbidityTemplateId(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityTemplateId(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_MORBIDITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalMorbidity The receiving '<em><b>Maternal Morbidity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalMorbidityTemplateId(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_MORBIDITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITY);
			try {
				VALIDATE_MATERNAL_MORBIDITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalMorbidity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalMorbidityTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidity, context) }),
					new Object[] { maternalMorbidity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalMorbidityClassCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityClassCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_MORBIDITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalMorbidityClassCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityClassCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_MORBIDITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalMorbidity The receiving '<em><b>Maternal Morbidity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalMorbidityClassCode(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_MORBIDITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITY);
			try {
				VALIDATE_MATERNAL_MORBIDITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalMorbidity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalMorbidityClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidity, context) }),
					new Object[] { maternalMorbidity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalMorbidityMoodCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityMoodCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_MORBIDITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalMorbidityMoodCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityMoodCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_MORBIDITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalMorbidity The receiving '<em><b>Maternal Morbidity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalMorbidityMoodCode(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_MORBIDITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITY);
			try {
				VALIDATE_MATERNAL_MORBIDITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalMorbidity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalMorbidityMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidity, context) }),
					new Object[] { maternalMorbidity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalMorbidityCodeP(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityCodeP(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_MORBIDITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalMorbidityCodeP(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityCodeP(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_MORBIDITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalMorbidity The receiving '<em><b>Maternal Morbidity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalMorbidityCodeP(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_MORBIDITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITY);
			try {
				VALIDATE_MATERNAL_MORBIDITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalMorbidity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalMorbidityCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidity, context) }),
					new Object[] { maternalMorbidity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalMorbidityCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_MORBIDITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '73781-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalMorbidityCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityCode(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_MORBIDITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalMorbidity The receiving '<em><b>Maternal Morbidity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalMorbidityCode(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_MORBIDITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITY);
			try {
				VALIDATE_MATERNAL_MORBIDITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalMorbidity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalMorbidityCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidity, context) }),
					new Object[] { maternalMorbidity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalMorbidityCodeVS(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code VS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityCodeVS(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_MORBIDITY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '116859006' or value.code = '398019008' or value.code = '34430009' or value.code = '625654015' or value.code = '309904001' or value.code = '177217006' or value.code = '260413007'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalMorbidityCodeVS(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code VS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityCodeVS(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_MORBIDITY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalMorbidity The receiving '<em><b>Maternal Morbidity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalMorbidityCodeVS(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_MORBIDITY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITY);
			try {
				VALIDATE_MATERNAL_MORBIDITY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalMorbidity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_CODE_VS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalMorbidityCodeVS",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidity, context) }),
					new Object[] { maternalMorbidity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalMorbidityValue(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityValue(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_MORBIDITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '116859006' or value.code = '398019008' or value.code = '34430009' or value.code = '625654015' or value.code = '309904001' or value.code = '177217006' or value.code = '260413007')))";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalMorbidityValue(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityValue(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_MORBIDITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalMorbidity The receiving '<em><b>Maternal Morbidity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalMorbidityValue(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_MORBIDITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITY);
			try {
				VALIDATE_MATERNAL_MORBIDITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalMorbidity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalMorbidityValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidity, context) }),
					new Object[] { maternalMorbidity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalMorbidityValueP(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityValueP(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_MORBIDITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalMorbidityValueP(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalMorbidityValueP(MaternalMorbidity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_MORBIDITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalMorbidity The receiving '<em><b>Maternal Morbidity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalMorbidityValueP(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_MORBIDITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITY);
			try {
				VALIDATE_MATERNAL_MORBIDITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalMorbidity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_VALUE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalMorbidityValueP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidity, context) }),
					new Object[] { maternalMorbidity }));
			}

			return false;
		}
		return true;
	}

} // MaternalMorbidityOperations
