/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family Historyof Cancer None</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone#validateFamilyHistoryofCancerNoneTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone#validateFamilyHistoryofCancerNoneClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone#validateFamilyHistoryofCancerNoneCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone#validateFamilyHistoryofCancerNoneCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone#validateFamilyHistoryofCancerNoneNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone#validateFamilyHistoryofCancerNoneStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone#validateFamilyHistoryofCancerNoneStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone#validateFamilyHistoryofCancerNoneText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryofCancerNoneOperations extends ClinicalStatementOperations {
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
	protected FamilyHistoryofCancerNoneOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryofCancerNoneTemplateId(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneTemplateId(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryofCancerNoneTemplateId(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneTemplateId(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryofCancerNone The receiving '<em><b>Family Historyof Cancer None</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryofCancerNoneTemplateId(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryofCancerNone());
			try {
				VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryofCancerNone)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryofCancerNoneFamilyHistoryofCancerNoneTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryofCancerNone, context) }),
						new Object[] { familyHistoryofCancerNone }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryofCancerNoneClassCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneClassCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryofCancerNoneClassCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneClassCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryofCancerNone The receiving '<em><b>Family Historyof Cancer None</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryofCancerNoneClassCode(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryofCancerNone());
			try {
				VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryofCancerNone)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryofCancerNoneFamilyHistoryofCancerNoneClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryofCancerNone, context) }),
						new Object[] { familyHistoryofCancerNone }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryofCancerNoneCodeP(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneCodeP(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryofCancerNoneCodeP(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneCodeP(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryofCancerNone The receiving '<em><b>Family Historyof Cancer None</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryofCancerNoneCodeP(FamilyHistoryofCancerNone familyHistoryofCancerNone,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryofCancerNone());
			try {
				VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryofCancerNone)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryofCancerNoneFamilyHistoryofCancerNoneCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryofCancerNone, context) }),
						new Object[] { familyHistoryofCancerNone }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryofCancerNoneCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " + "value.code = 'ASSERTION')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryofCancerNoneCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryofCancerNone The receiving '<em><b>Family Historyof Cancer None</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryofCancerNoneCode(FamilyHistoryofCancerNone familyHistoryofCancerNone,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryofCancerNone());
			try {
				VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryofCancerNone)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryofCancerNoneFamilyHistoryofCancerNoneCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryofCancerNone, context) }),
						new Object[] { familyHistoryofCancerNone }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryofCancerNoneNegationInd(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneNegationInd(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined() and self.negationInd=true";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryofCancerNoneNegationInd(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneNegationInd(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryofCancerNone The receiving '<em><b>Family Historyof Cancer None</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryofCancerNoneNegationInd(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryofCancerNone());
			try {
				VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryofCancerNone)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_NEGATION_IND,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryofCancerNoneFamilyHistoryofCancerNoneNegationInd",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryofCancerNone, context) }),
						new Object[] { familyHistoryofCancerNone }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryofCancerNone The receiving '<em><b>Family Historyof Cancer None</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryofCancerNoneStatusCodeP(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryofCancerNone());
			try {
				VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryofCancerNone)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryofCancerNoneFamilyHistoryofCancerNoneStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryofCancerNone, context) }),
						new Object[] { familyHistoryofCancerNone }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryofCancerNoneStatusCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneStatusCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryofCancerNoneStatusCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneStatusCode(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryofCancerNoneStatusCodeP(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneStatusCodeP(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryofCancerNoneStatusCodeP(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneStatusCodeP(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryofCancerNone The receiving '<em><b>Family Historyof Cancer None</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryofCancerNoneStatusCode(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryofCancerNone());
			try {
				VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryofCancerNone)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryofCancerNoneFamilyHistoryofCancerNoneStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryofCancerNone, context) }),
						new Object[] { familyHistoryofCancerNone }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryofCancerNoneText(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneText(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined() and self.text.getText() = 'No family history of cancer')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryofCancerNoneText(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family Historyof Cancer None Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryofCancerNoneText(FamilyHistoryofCancerNone, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryofCancerNone The receiving '<em><b>Family Historyof Cancer None</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryofCancerNoneText(FamilyHistoryofCancerNone familyHistoryofCancerNone,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryofCancerNone());
			try {
				VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORYOF_CANCER_NONE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryofCancerNone)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_TEXT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryofCancerNoneFamilyHistoryofCancerNoneText",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryofCancerNone, context) }),
						new Object[] { familyHistoryofCancerNone }));
			}

			return false;
		}
		return true;
	}

} // FamilyHistoryofCancerNoneOperations
