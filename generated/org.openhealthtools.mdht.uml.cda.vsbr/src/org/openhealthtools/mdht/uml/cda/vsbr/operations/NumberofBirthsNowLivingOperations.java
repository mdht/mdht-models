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

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numberof Births Now Living</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberofBirthsNowLivingOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected NumberofBirthsNowLivingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofBirthsNowLivingTemplateId(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingTemplateId(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.36')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofBirthsNowLivingTemplateId(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingTemplateId(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofBirthsNowLiving The receiving '<em><b>Numberof Births Now Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofBirthsNowLivingTemplateId(NumberofBirthsNowLiving numberofBirthsNowLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_NOW_LIVING);
			try {
				VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofBirthsNowLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofBirthsNowLivingNumberofBirthsNowLivingTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofBirthsNowLiving, context) }),
						new Object[] { numberofBirthsNowLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofBirthsNowLivingClassCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingClassCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofBirthsNowLivingClassCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingClassCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofBirthsNowLiving The receiving '<em><b>Numberof Births Now Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofBirthsNowLivingClassCode(NumberofBirthsNowLiving numberofBirthsNowLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_NOW_LIVING);
			try {
				VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofBirthsNowLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofBirthsNowLivingNumberofBirthsNowLivingClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofBirthsNowLiving, context) }),
						new Object[] { numberofBirthsNowLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofBirthsNowLivingMoodCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingMoodCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofBirthsNowLivingMoodCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingMoodCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofBirthsNowLiving The receiving '<em><b>Numberof Births Now Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofBirthsNowLivingMoodCode(NumberofBirthsNowLiving numberofBirthsNowLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_NOW_LIVING);
			try {
				VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofBirthsNowLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofBirthsNowLivingNumberofBirthsNowLivingMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofBirthsNowLiving, context) }),
						new Object[] { numberofBirthsNowLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofBirthsNowLivingCodeP(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingCodeP(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofBirthsNowLivingCodeP(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingCodeP(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofBirthsNowLiving The receiving '<em><b>Numberof Births Now Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofBirthsNowLivingCodeP(NumberofBirthsNowLiving numberofBirthsNowLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_NOW_LIVING);
			try {
				VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofBirthsNowLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofBirthsNowLivingNumberofBirthsNowLivingCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofBirthsNowLiving, context) }),
						new Object[] { numberofBirthsNowLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofBirthsNowLivingCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '11638-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofBirthsNowLivingCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingCode(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofBirthsNowLiving The receiving '<em><b>Numberof Births Now Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofBirthsNowLivingCode(NumberofBirthsNowLiving numberofBirthsNowLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_NOW_LIVING);
			try {
				VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofBirthsNowLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofBirthsNowLivingNumberofBirthsNowLivingCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofBirthsNowLiving, context) }),
						new Object[] { numberofBirthsNowLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofBirthsNowLivingValue(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingValue(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofBirthsNowLivingValue(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofBirthsNowLivingValue(NumberofBirthsNowLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofBirthsNowLiving The receiving '<em><b>Numberof Births Now Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofBirthsNowLivingValue(NumberofBirthsNowLiving numberofBirthsNowLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_NOW_LIVING);
			try {
				VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofBirthsNowLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofBirthsNowLivingNumberofBirthsNowLivingValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofBirthsNowLiving, context) }),
						new Object[] { numberofBirthsNowLiving }));
			}

			return false;
		}
		return true;
	}

} // NumberofBirthsNowLivingOperations
