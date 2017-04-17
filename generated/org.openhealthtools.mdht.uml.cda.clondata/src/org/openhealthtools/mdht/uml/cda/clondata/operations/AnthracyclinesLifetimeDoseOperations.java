/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SubstanceAdministrationOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Anthracyclines Lifetime Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose#validateAnthracyclinesLifetimeDoseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose#validateAnthracyclinesLifetimeDoseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose#validateAnthracyclinesLifetimeDoseDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose#validateAnthracyclinesLifetimeDoseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose#validateAnthracyclinesLifetimeDoseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose#validateAnthracyclinesLifetimeDoseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose#validateAnthracyclinesLifetimeDoseConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Consumable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnthracyclinesLifetimeDoseOperations extends SubstanceAdministrationOperations {
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
	protected AnthracyclinesLifetimeDoseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthracyclinesLifetimeDoseTemplateId(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseTemplateId(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.24')";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthracyclinesLifetimeDoseTemplateId(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseTemplateId(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anthracyclinesLifetimeDose The receiving '<em><b>Anthracyclines Lifetime Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnthracyclinesLifetimeDoseTemplateId(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getAnthracyclinesLifetimeDose());
			try {
				VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				anthracyclinesLifetimeDose)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AnthracyclinesLifetimeDoseAnthracyclinesLifetimeDoseTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										anthracyclinesLifetimeDose, context) }),
						new Object[] { anthracyclinesLifetimeDose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthracyclinesLifetimeDoseClassCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseClassCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthracyclinesLifetimeDoseClassCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseClassCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anthracyclinesLifetimeDose The receiving '<em><b>Anthracyclines Lifetime Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnthracyclinesLifetimeDoseClassCode(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getAnthracyclinesLifetimeDose());
			try {
				VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				anthracyclinesLifetimeDose)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AnthracyclinesLifetimeDoseAnthracyclinesLifetimeDoseClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										anthracyclinesLifetimeDose, context) }),
						new Object[] { anthracyclinesLifetimeDose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthracyclinesLifetimeDoseDoseQuantity(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseDoseQuantity(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthracyclinesLifetimeDoseDoseQuantity(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseDoseQuantity(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anthracyclinesLifetimeDose The receiving '<em><b>Anthracyclines Lifetime Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnthracyclinesLifetimeDoseDoseQuantity(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getAnthracyclinesLifetimeDose());
			try {
				VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				anthracyclinesLifetimeDose)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_DOSE_QUANTITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AnthracyclinesLifetimeDoseAnthracyclinesLifetimeDoseDoseQuantity",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										anthracyclinesLifetimeDose, context) }),
						new Object[] { anthracyclinesLifetimeDose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthracyclinesLifetimeDoseEffectiveTime(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseEffectiveTime(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthracyclinesLifetimeDoseEffectiveTime(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseEffectiveTime(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anthracyclinesLifetimeDose The receiving '<em><b>Anthracyclines Lifetime Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnthracyclinesLifetimeDoseEffectiveTime(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getAnthracyclinesLifetimeDose());
			try {
				VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				anthracyclinesLifetimeDose)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AnthracyclinesLifetimeDoseAnthracyclinesLifetimeDoseEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										anthracyclinesLifetimeDose, context) }),
						new Object[] { anthracyclinesLifetimeDose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthracyclinesLifetimeDoseMoodCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseMoodCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthracyclinesLifetimeDoseMoodCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseMoodCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anthracyclinesLifetimeDose The receiving '<em><b>Anthracyclines Lifetime Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnthracyclinesLifetimeDoseMoodCode(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getAnthracyclinesLifetimeDose());
			try {
				VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				anthracyclinesLifetimeDose)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AnthracyclinesLifetimeDoseAnthracyclinesLifetimeDoseMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										anthracyclinesLifetimeDose, context) }),
						new Object[] { anthracyclinesLifetimeDose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthracyclinesLifetimeDoseStatusCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseStatusCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthracyclinesLifetimeDoseStatusCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseStatusCode(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anthracyclinesLifetimeDose The receiving '<em><b>Anthracyclines Lifetime Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnthracyclinesLifetimeDoseStatusCode(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getAnthracyclinesLifetimeDose());
			try {
				VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				anthracyclinesLifetimeDose)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AnthracyclinesLifetimeDoseAnthracyclinesLifetimeDoseStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										anthracyclinesLifetimeDose, context) }),
						new Object[] { anthracyclinesLifetimeDose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthracyclinesLifetimeDoseConsumable(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseConsumable(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthracyclinesLifetimeDoseConsumable(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthracyclines Lifetime Dose Consumable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthracyclinesLifetimeDoseConsumable(AnthracyclinesLifetimeDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anthracyclinesLifetimeDose The receiving '<em><b>Anthracyclines Lifetime Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnthracyclinesLifetimeDoseConsumable(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getAnthracyclinesLifetimeDose());
			try {
				VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ANTHRACYCLINES_LIFETIME_DOSE_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				anthracyclinesLifetimeDose)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_CONSUMABLE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AnthracyclinesLifetimeDoseAnthracyclinesLifetimeDoseConsumable",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										anthracyclinesLifetimeDose, context) }),
						new Object[] { anthracyclinesLifetimeDose }));
			}

			return false;
		}
		return true;
	}

} // AnthracyclinesLifetimeDoseOperations
