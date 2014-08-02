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

import org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infant Breastfed</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfantBreastfedOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfantBreastfedOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantBreastfedTemplateId(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedTemplateId(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_BREASTFED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.27')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantBreastfedTemplateId(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedTemplateId(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_BREASTFED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantBreastfed The receiving '<em><b>Infant Breastfed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantBreastfedTemplateId(InfantBreastfed infantBreastfed,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INFANT_BREASTFED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_BREASTFED);
			try {
				VALIDATE_INFANT_BREASTFED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_BREASTFED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_BREASTFED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infantBreastfed)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_BREASTFED__INFANT_BREASTFED_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfantBreastfedTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infantBreastfed, context) }),
					new Object[] { infantBreastfed }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantBreastfedClassCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedClassCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_BREASTFED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantBreastfedClassCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedClassCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_BREASTFED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantBreastfed The receiving '<em><b>Infant Breastfed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantBreastfedClassCode(InfantBreastfed infantBreastfed,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INFANT_BREASTFED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_BREASTFED);
			try {
				VALIDATE_INFANT_BREASTFED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_BREASTFED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_BREASTFED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infantBreastfed)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_BREASTFED__INFANT_BREASTFED_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfantBreastfedClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infantBreastfed, context) }),
					new Object[] { infantBreastfed }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantBreastfedMoodCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedMoodCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_BREASTFED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantBreastfedMoodCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedMoodCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_BREASTFED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantBreastfed The receiving '<em><b>Infant Breastfed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantBreastfedMoodCode(InfantBreastfed infantBreastfed, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_BREASTFED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_BREASTFED);
			try {
				VALIDATE_INFANT_BREASTFED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_BREASTFED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_BREASTFED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infantBreastfed)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_BREASTFED__INFANT_BREASTFED_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfantBreastfedMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infantBreastfed, context) }),
					new Object[] { infantBreastfed }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantBreastfedCodeP(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedCodeP(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_BREASTFED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantBreastfedCodeP(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedCodeP(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_BREASTFED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantBreastfed The receiving '<em><b>Infant Breastfed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantBreastfedCodeP(InfantBreastfed infantBreastfed, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_BREASTFED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_BREASTFED);
			try {
				VALIDATE_INFANT_BREASTFED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_BREASTFED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_BREASTFED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infantBreastfed)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_BREASTFED__INFANT_BREASTFED_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfantBreastfedCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infantBreastfed, context) }),
					new Object[] { infantBreastfed }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantBreastfedCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_BREASTFED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '73756-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantBreastfedCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedCode(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_BREASTFED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantBreastfed The receiving '<em><b>Infant Breastfed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantBreastfedCode(InfantBreastfed infantBreastfed, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_BREASTFED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_BREASTFED);
			try {
				VALIDATE_INFANT_BREASTFED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_BREASTFED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_BREASTFED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infantBreastfed)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_BREASTFED__INFANT_BREASTFED_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfantBreastfedCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infantBreastfed, context) }),
					new Object[] { infantBreastfed }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantBreastfedValue(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedValue(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_BREASTFED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantBreastfedValue(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantBreastfedValue(InfantBreastfed, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_BREASTFED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantBreastfed The receiving '<em><b>Infant Breastfed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantBreastfedValue(InfantBreastfed infantBreastfed, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_BREASTFED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_BREASTFED);
			try {
				VALIDATE_INFANT_BREASTFED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_BREASTFED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_BREASTFED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infantBreastfed)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_BREASTFED__INFANT_BREASTFED_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfantBreastfedValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infantBreastfed, context) }),
					new Object[] { infantBreastfed }));
			}

			return false;
		}
		return true;
	}

} // InfantBreastfedOperations
